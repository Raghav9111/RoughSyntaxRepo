package com.syntaxSavants.security;

import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class MailService 
{
	private JavaMailSenderImpl mailSender;
	private Properties props;
	
	public MailService() 
	{
		mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);	    
	    mailSender.setUsername("justsample4mail@gmail.com");
	    mailSender.setPassword("nnmohhfiokrcapqf");
	    
	    props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	}
	
	public void verificationMail(String mail,String name) throws Exception 
	{
			MimeMessage mimeMessage = mailSender.createMimeMessage();
		
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
			
			String htmlMsg = "<html>"
					+ "<body>"
					+ "<h1 style='color:red'>Welcome"
					+ "<hr>"
					+ "<p>"
					+ "&nbsp;&nbsp; "+name+" created account on your Website SyntaxSavants. Verify their account <br>"
					+ "</p>"
					+ "</body>"
					+ "</html>";
			
			mimeMessage.setContent(htmlMsg, "text/html"); 
			helper.setText(htmlMsg, true); 
			helper.setTo("raghavprajapat777@gmail.com");
			helper.setSubject("Verification Mail Via SyntaxSavants");
			helper.setFrom("justsample4mail@gmail.com");
			mailSender.send(mimeMessage);
	}

}
