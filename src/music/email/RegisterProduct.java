package music.email;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import music.business.Product;
import music.data.ProductDB;
@MultipartConfig(maxFileSize = 16177215)
public class RegisterProduct extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 HttpSession session = request.getSession();
		 InputStream inputStream = null;
		 
	     String code = request.getParameter("code");
	     String description = request.getParameter("description");
	     double price =  Double.valueOf(request.getParameter("price"));
	     Part filePart = request.getPart("photo");
	     byte [] bytes = new byte[(int) filePart.getSize()];
	     inputStream = filePart.getInputStream();
	     inputStream.read(bytes);
	     inputStream.close();
	     Product prod = new Product();
	     prod.setCode(code);
	     prod.setDescription(description);
	     prod.setPrice(price);
	     prod.setImageBytes(bytes);
	    
	    ProductDB.insert(prod);
	    
	}
}
