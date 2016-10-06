package dao.db.dao.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.db.dao.EmployeesDao;

import dao.db.dao.EmployeesDao;
import dao.db.entities.Employees;


public class MySqlEmployeesDao implements EmployeesDao {

    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employees";
    private static final String SELECT_EMPLOYEES_BY_F_NAME = "SELECT * FROM employees WHERE f_name = ?";

    @Override
    public Employees find(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Employees> findAll() {
        List<Employees> result = new ArrayList<>();
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(Statement query = connection.createStatement()){

            ResultSet rs = query.executeQuery(SELECT_ALL_EMPLOYEES);
            while( rs.next() ){
                result.add(getEmployeesFromResultSet(rs));
            }
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Employees getEmployeesFromResultSet(ResultSet resultSet)
            throws SQLException {
        Employees employees = new Employees();
        employees.setId_empls(resultSet.getInt("id_empls"));
        employees.setF_name(resultSet.getString("f_name"));
        employees.setL_name(resultSet.getString("l_name"));
        employees.setFk_id_sch(resultSet.getInt("fk_id_sch"));
        employees.setFk_id_position(resultSet.getInt("fk_id_position"));
        return employees;
    }

    @Override
    public void update(Employees entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(Employees entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public  List<Employees> findByF_Name(String name) {
        List<Employees> result = new ArrayList<>();
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(PreparedStatement query = connection
                .prepareStatement(SELECT_EMPLOYEES_BY_F_NAME)){
            query.setString(1, name);
            ResultSet rs = query.executeQuery();
            while( rs.next() ){
                Employees employees = getEmployeesFromResultSet(rs);
                result.add(employees);
            }
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

}







