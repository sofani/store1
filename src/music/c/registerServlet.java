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

public class registerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
       // System.out.println( firstName + lastName + emailAddress);
        User user = new User();        
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailAddress(emailAddress);
        
        if (UserDB.emailExists(emailAddress))
            UserDB.update(user);
        else
            UserDB.insert(user);

        session.setAttribute("user", user);
        
        Cookie emailCookie = new Cookie("emailCookie", emailAddress);
        emailCookie.setMaxAge(60*60*24*365*2);
        emailCookie.setPath("/");
        response.addCookie(emailCookie);
        
        String url = "/c/WritePath";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
	}
}
