package services;

import java.util.List;

import dao.DaoFactory;
import dao.OrdersDao;
import entities.Orders;


public class OrdersService {
    private static OrdersService instance;

    private OrdersDao dao = DaoFactory.getInstance().createOrdersDao();
    
    void setDao(OrdersDao dao) {
		this.dao = dao;
	}
    
    public static OrdersService getInstance(){
		if( instance == null ){
			instance = new OrdersService();
		}
		return instance;
	}
    
    public List<Orders> findAll(){
		return dao.findAll();
	}
    
    public List<Orders>  getFindByPrice(int id) {
       return dao.findByPrice(id);
  }
    
//	public List<Orders> getSubjectsByParameters(String substringOfSubjectName, int minCredits, int maxCredits) {
//		return dao.findByParameters(substringOfSubjectName, minCredits, maxCredits);
//	}

//	public List<Subject> getSubjectsWithReducedCredits(int credits, int reducer) {
//    	List<Subject> subjectList = dao.findByParameters("", credits, 150);
//    	for(Subject sub : subjectList){
//			sub.setCredits(sub.getCredits() - reducer);
//		}
//		return subjectList;
//    }
	
	public List <Orders> getOrdersWithDiscount( int minValue, int discount){
		List<Orders> list = dao.findByPrice(minValue);
	for(Orders o : list ){
		o.setTotal_price(o.getTotal_price()-discount);
		}
	return list;
	}
}
