package music.ipn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import music.business.IpnConfig;
import music.business.IpnHandler;

public class IpnListner extends HttpServlet {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	 {
		 String url =  "https://www.sandbox.paypal.com/cgi-bin/webscr";
		 String receiverEmail = "sofanib@gmail.com";
		 String paymentAmount= "1.0";
		 String paymentCurrency = "US";
		 IpnConfig  ipnConfig = new IpnConfig (url, receiverEmail, paymentAmount, paymentCurrency);
		 IpnHandler ipnHandler = new IpnHandler ();
		 ipnHandler.setIpnConfig(ipnConfig);
	 }
}
