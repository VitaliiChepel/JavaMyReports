package dao.db.dao.jdbc.mysql;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import dao.db.dao.DaoFactory;
import dao.db.dao.CustomersDao;
import dao.db.dao.EmployeesDao;
import dao.db.dao.OrdersDao;
import dao.db.dao.ServicesDao;
import dao.db.entities.Employees;

public class MySqlJdbcDaoFactory extends DaoFactory {

    private static final String DB_CONFIG_FILE_NAME = "/db.properties";
    private static final String DB_USER = "db.user";
    private static final String DB_PASS = "db.pass";
    private static final String DB_URL = "db.url";

    private static Connection connection ;

    static Connection getConnection(){
        try{
            if( connection == null ){
                InputStream in = MySqlJdbcDaoFactory
                        .class.getResourceAsStream(DB_CONFIG_FILE_NAME);
                Properties props = new Properties();
                props.load(in);
                connection =  DriverManager
                        .getConnection( props.getProperty(DB_URL) ,
                                props.getProperty(DB_USER),
                                props.getProperty(DB_PASS));
            }
            return connection;
        }catch(Exception ex){
            // add logging
            throw new RuntimeException( ex );
        }

    }

    @Override
    public CustomersDao createCustomersDao() {
        return null;
    }

    @Override
    public OrdersDao createOrdersDao() {
        return null;
    }

    @Override
    public EmployeesDao createEmployeesDao() {
        return new MySqlEmployeesDao();
    }

    @Override
    public ServicesDao createServicesDao() {
        return null;
    }
}