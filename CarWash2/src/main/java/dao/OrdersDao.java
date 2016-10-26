package dao;

import java.util.List;

import  entities.Orders;

public interface OrdersDao extends GenericDao<Orders> {
	
	List<Orders> findByPrice  (int minValue);

}
