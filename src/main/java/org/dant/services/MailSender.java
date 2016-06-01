package org.dant.services;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailSender {

	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;

	public static void sendEmail(String email, String token) {

		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");

		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		try {
			generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			generateMailMessage.setSubject("NEVERLOST LIVE!!!!!!!");
			String emailBody = "Vous venez de creer le compte sur Neverlost App.<br>"
					+ "Clickez <a href=\"http://localhost:8080/NeverLost/rest/services/confirmemail?email=" + email
					+ "&token=" + token + "\">ICI</a> pour confirmer votre email.";
			generateMailMessage.setContent(emailBody, "text/html");

			Transport transport = getMailSession.getTransport("smtp");

			transport.connect("smtp.gmail.com", "neverlostappli@gmail.com", "neverlost8");
			transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
			transport.close();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}