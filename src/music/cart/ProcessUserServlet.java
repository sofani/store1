package music.cart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import music.business.User;

public class ProcessUserServlet extends HttpServlet {
	 public void doGet(HttpServletRequest request,
	            HttpServletResponse response)
	            throws IOException, ServletException
	    {        
	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String companyName = request.getParameter("companyName");
	        String emailAddress = request.getParameter("emailAddress");
	        String address1 = request.getParameter("address1");
	        String address2 = request.getParameter("address2");
	        String city = request.getParameter("city");
	        String state = request.getParameter("state");
	        String zip = request.getParameter("zip");
	        String country = request.getParameter("country");

	        HttpSession session = request.getSession();
	        User user = (User) session.getAttribute("user");
	        if (user == null)
	            user = new User();
	        
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setEmailAddress(emailAddress);
	        user.setCompanyName(companyName);
	        user.setAddress1(address1);
	        user.setAddress2(address2);
	        user.setCity(city);
	        user.setState(state);
	        user.setZip(zip);
	        user.setCountry(country);

	        session.setAttribute("user", user);
	            
	      String url = "/cart/displayInvoice";
	      RequestDispatcher dispatcher =
	              getServletContext().getRequestDispatcher(url);
	      dispatcher.forward(request, response);
	    }
	    
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException
	    {
	        doGet(request, response);
	    }

}
