package music.util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MailUtil
{    
	public static void sendMail(String username, String password, String to, String from, String subject, String body, boolean bodyIsHTML) throws MessagingException {
		//get a mail session
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtps");
		props.put("mail.smtps.host", "smtp.mail.yahoo.com");
		props.put("mail.smtps.port ", 465);
		props.put("mail.smtps.auth", "true");  
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);
		//Creating a message
		Message message = new MimeMessage(session);
		message.setSubject(subject);
		if (bodyIsHTML) 
			message.setContent(body, "text/html");
		 else 
			message.setText("text");
		
		//Address the message
		Address fromAddress = new InternetAddress(from);
		Address toAddress = new InternetAddress(to);
		message.setFrom(fromAddress);
		message.setRecipient(Message.RecipientType.TO, toAddress);
		//send the message
		Transport transport = session.getTransport();
		transport.connect(username, password);
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
}