package music.c;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import music.business.User;
import music.data.UserDB;
import music.util.CookieUtil;

public class checkUser extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	 {               
	        HttpSession session = request.getSession();
	        User user = (User) session.getAttribute("user");
	        String url = " ";

	        // if the User object doesn't exist, check for the email cookie
	        if (user == null)
	        {
	            Cookie[] cookies = request.getCookies();
	            String emailAddress = CookieUtil.getCookieValue(cookies, "emailCookie");
	            
	            // if the email cookie doesn't exist, go to the registration page
	            if (emailAddress == null || emailAddress.equals(" "))
	            {
	                url = "/c/register.jsp";
	            }  else {
	            
	            // if the email cookie does exist, create the User object
	            // from the email cookie and skip the registration page
	           
	            
	                user = UserDB.selectUser(emailAddress);
	                session.setAttribute("user", user);
	                url = "/c/WritePath";
	            }
	        }  else {
	        
	        
	        // if the User object exists, skip the registration page
	       
	            url = "/c/WritePath";
	        }

	        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
	        dispatcher.forward(request, response);
	    }

}
