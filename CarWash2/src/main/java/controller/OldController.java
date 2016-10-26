package controller;

import java.util.List;

import org.apache.log4j.Logger;

import entities.Orders;
import services.OrdersService;

public class OldController {

	OrdersService service = OrdersService.getInstance(); 
	static Logger logger = Logger.getLogger(OldController.class); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OldController().doOrdersDiscountCall("150","20");
	
	}
	public List<Orders>  doOrdersDiscountCall(String price , String discount){
		int priceVal = Integer.parseInt(price);
		int discountVal = Integer.parseInt(discount);
		if ( discountVal<0 || discountVal>=100 ){
			logger.error("invalid discount");
			throw new IllegalArgumentException();
		}
			
		List<Orders> orders = service.getOrdersWithDiscount(priceVal, discountVal);
		return orders;
		
	}
}
