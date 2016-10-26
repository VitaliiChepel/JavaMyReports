package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Orders;
import services.OrdersService;



/**
 * Servlet implementation class GettingOrdersWithDiscount
 */
@WebServlet("/GettingOrdersWithDiscount")
public class GettingOrdersWithDiscount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GettingOrdersWithDiscount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		        try (PrintWriter out = response.getWriter()) {
	        	
	        	List<Orders> orders = new OldController().doOrdersDiscountCall("150", "20");
	        	
	        	System.out.println("<tr>"+
						"<th>Id</th>"+	
						"<th>Date</th>"+
						"<th>Total Price</th>"+
						"<th>Registration number</th>"+
					"</tr>");
		        	
	        	for(Orders o : orders ){
	        		System.out.println("<tr>"+
	    					"<th>"+o.getId_ord()+"</th>"+	
	    					"<th>"+o.getDate_info()+"</th>"+	
							"<th>"+o.getTotal_price()+"</th>"+
							"<th>"+o.getReg_number()+"</th>"+
	    				"</tr>");
	        		}
		       }
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
