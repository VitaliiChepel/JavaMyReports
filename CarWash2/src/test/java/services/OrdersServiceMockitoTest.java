package services;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import dao.OrdersDao;
import entities.Orders;

public class OrdersServiceMockitoTest {
	
	@Test
	public void testOrdersListWithDiscount(){
		OrdersService service = new OrdersService();
		OrdersDao dao = mock(OrdersDao.class);
		service.setDao(dao);
		when(dao.findByPrice(385)).thenReturn(
				Arrays.asList( new Orders (6, "2016-06-13", 410, "AA1040MN", 12, 1) , 
						       new Orders(26, "2016-06-15", 390, "AA7496SC", 13, 3)));
		List<Orders> actual = service.getOrdersWithDiscount(150, 20);
		assertEquals( Arrays.asList( new Orders(6, "2016-06-13", 390, "AA1040MN", 12, 1) , 
			       new Orders(26, "2016-06-15", 370, "AA7496SC", 13, 3))
				, actual);	
	}
}
