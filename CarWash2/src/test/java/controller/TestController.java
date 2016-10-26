package controller;

import org.junit.Before;
import org.junit.Test;

import entities.Orders;
import services.OrdersService;

import static org.mockito.Mockito.*;

import java.util.Arrays;


public class TestController {

	private OldController controller;
	private OrdersService service;
	
	
	@Before
	public void init(){
		service = mock( OrdersService.class);
		controller = new OldController();
		controller.service = service;
	}
	
	@Test
	public void testController(){
		when(service.getOrdersWithDiscount(150, 20)).thenReturn(
				Arrays.asList(new Orders()));
		controller.doOrdersDiscountCall("150", "20");
		verify(service).getOrdersWithDiscount(150, 20);
	}
	
	
	@Test
	public void testControllerInvalidDiscount(){
		try{
			controller.doOrdersDiscountCall("150", "-20");
		}catch(RuntimeException ex){
			
		}
		verify(service , never()).getOrdersWithDiscount(anyInt(),
				                                        anyInt());
	}
	
	@Test
	public void testControllerInvalidDataPrice(){
		try{
			controller.doOrdersDiscountCall("-150", "20");
		}catch(RuntimeException ex){
			
		}
		verify(service , never()).getOrdersWithDiscount(anyInt(),
				                                        anyInt());
	}
}
	