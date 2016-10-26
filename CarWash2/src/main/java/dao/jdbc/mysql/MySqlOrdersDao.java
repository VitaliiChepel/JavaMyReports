package dao.jdbc.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import dao.OrdersDao;
import entities.Orders;


public class MySqlOrdersDao implements OrdersDao {
	private static final String SELECT_ALL_ORDERS = "SELECT * FROM orders";
	private static final String SELECT_ORDERS_GREATER = "SELECT * FROM orders WHERE total_price >= ?";
    private static final String SELECT_ORDERS_BY_ID = "SELECT * FROM orders WHERE id_ord >= ?";
    private static final String UPDATE_ORDERS ="UPDATE orders SET date_info = ?, total_price = ?, reg_number = ? WHERE id = ?";
    private static final String DELETE_ORDERS_BY_ID = "DELETE FROM orders WHERE id = ?";
    private static final String INSERT_ORDERS ="INSERT INTO orders(date_info, total_price, reg_number) VALUES(?,?,?)";
    

    static Logger logger = Logger.getLogger(MySqlOrdersDao.class); 

    @Override
   public Orders find(int id) {
    	return null;
    }
    
  	 

    private Orders getOrdersFromResultSet(ResultSet resultSet) throws SQLException {
		Orders orders = new Orders();
		orders.setId_ord(resultSet.getInt("id_ord"));
		orders.setDate_info(resultSet.getString("date_info"));
		orders.setTotal_price(resultSet.getInt("total_price"));
		orders.setReg_number(resultSet.getString("reg_number"));
		orders.setFk_id_custs(resultSet.getInt("fk_id_custs"));
		orders.setFk_id_empls(resultSet.getInt("fk_id_empls"));
		return orders;
	}

    @Override
    public List<Orders> findAll() {
        List<Orders> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        logger.info("Connection installed corectly");
        try(Statement query = connection.createStatement()){

            ResultSet rs = query.executeQuery(SELECT_ALL_ORDERS);
            while( rs.next() ){
                result.add(getOrdersFromResultSet(rs));
            }
            logger.trace("Query add in result list correctly in findAll method.");
        }catch(Exception ex){
            logger.error("SQL exception in findAll method.");
            throw new RuntimeException(ex);
        }
        return result;
    }
    

    
    @Override
	public List<Orders> findByPrice(int minValue) {
		List<Orders> result = new ArrayList<>();
	Connection connection =  MySqlJdbcDaoFactory.getConnection();
   	try(PreparedStatement query = connection
   			.prepareStatement(SELECT_ORDERS_GREATER)){
 		query.setInt(1, minValue);
 		ResultSet rs = query.executeQuery();
    		while( rs.next() ){
  			Orders orders = getOrdersFromResultSet(rs);
  			result.add(orders);
    		}
    		 logger.info("Query add in result list correctly in findByPrice method.");
	} catch (Exception ex) {
        logger.error("SQL exception in findByPrice method.");
		throw new RuntimeException(ex);
	}
	return result;
}


    
    @Override
	public void update(Orders entity) {
		        try{
		            Connection connection =  MySqlJdbcDaoFactory.getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ORDERS);
		            preparedStatement.setInt(1, entity.getId_ord());
		            preparedStatement.executeUpdate();
		        }catch(Exception ex){
		            //log
		            throw new RuntimeException(ex);
		        }
		    }


	@Override
	public void delete(int id) {
		 try{
	            Connection connection =  MySqlJdbcDaoFactory.getConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ORDERS_BY_ID);
	            preparedStatement.setInt(1, id);
	            preparedStatement.executeUpdate();
	        }catch(Exception ex){
	            //log
	            throw new RuntimeException(ex);
	        }
	    }
		

	@Override
	public void insert(Orders entity) {
		
		try {
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ORDERS);
            preparedStatement.setString(1,  entity.getDate_info());
            preparedStatement.setInt(2, entity.getTotal_price());
            preparedStatement.setString(3, entity.getReg_number());
            preparedStatement.setInt(4, entity.getFk_id_custs());
            preparedStatement.setInt(5, entity.getFk_id_empls());  
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}