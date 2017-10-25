package music.c;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import music.business.Product;
import music.data.ProductDB;

public class displayServlet extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	 {
	        // get request parameters
	        String productCode = request.getParameter("productCode");
	       
	        Product product = ProductDB.selectProduct(productCode);
	        HttpSession session = request.getSession();
	        session.setAttribute("product", product);

	        // forward to the View
	       String url = "/c/" + productCode + "/index.jsp";
	       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
	       dispatcher.forward(request, response);
	        
	 }

	

}
