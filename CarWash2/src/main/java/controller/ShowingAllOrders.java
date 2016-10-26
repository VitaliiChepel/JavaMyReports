package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Orders;
import services.OrdersService;



/**
 * Servlet implementation class ShowAllOrders
 */
public class ShowingAllOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text / html;charset=UTF-8");
			
        try (PrintWriter out = response.getWriter()) {
        	
        	
        	List<Orders> orders = OrdersService.getInstance().findAll();
        	
			request.setAttribute("All", orders);
			getServletContext().getRequestDispatcher("/ShowAll.jsp").forward(request, response);
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



