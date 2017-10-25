package music.cart;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import music.business.*;
import music.data.*;


public class displayImageServlet extends HttpServlet  {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          // HttpSession session = request.getSession();
         // if list of products doesn't exist, initialize it, 
         // and store it for the remainder of the session
    	
           String  productID = request.getParameter("productCode");
            System.out.println(productID);
       // if (session.getAttribute("products") == null) {
            Product product = ProductDB.selectProduct(productID);
            //session.setAttribute("product", product);
            byte [] image =  product.getImageBytes();
           
            System.out.print(image.length);
            response.setContentType("image/jpg");
	        response.getOutputStream().write(image);;
	        response.getOutputStream().flush();
	        response.getOutputStream().close();
            
        //}
        // forward to the Quick Order page
        String url = "/cart/quick_order.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        //dispatcher.forward(request, response);
     }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request, response);
     }

}