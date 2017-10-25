package music.c;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import music.business.Download;
import music.business.Product;
import music.business.User;
import music.data.DownloadDB;

public class WriteDown extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
     {
	 HttpSession session = request.getSession();
     
     User user = (User) session.getAttribute("user");
     Product product = (Product) session.getAttribute("product");
     Download download = new Download();
     download.setUser(user);
     download.setProductCode(product.getCode());
     
     DownloadDB.insert(download);
     
     String url = "/c/" + product.getCode() + "/sound.jsp";
     RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
     dispatcher.forward(request, response);
 }    
 
 public void doGet(HttpServletRequest request,
         HttpServletResponse response)
         throws IOException, ServletException
 {
     doPost(request, response);
 }

}
