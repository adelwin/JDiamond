import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.si.diamond.mail.authenticator.SMTPAuthenticator;
import org.si.diamond.mail.exception.BaseMailException;
import org.si.diamond.mail.session.MailSession;


/**
 * File Name    : MailSenderTest.java
 * Author       : adelwin
 * Created Date : Feb 2, 2011 7:34:43 PM
 */

public class MailSenderTest {
	public static void main(String atgs[]) throws BaseMailException, MessagingException {
		Properties mailConfigurationProperties = new Properties();
		mailConfigurationProperties.put("mail.smtp.host", "smtp.gmail.com");
		mailConfigurationProperties.put("mail.smtp.starttls.enable", "true");
		mailConfigurationProperties.put("mail.debug", "true");
		mailConfigurationProperties.put("mail.smtp.auth", "true");
		mailConfigurationProperties.put("mail.smtp.port", "25");
		
		Authenticator smtpAuthenticator = new SMTPAuthenticator("adelwin", "234164197231245");
		MailSession mailSession = new MailSession("gmail.expenses", mailConfigurationProperties, smtpAuthenticator);
		mailSession.setTransportStaticType("true");
		mailSession.connect();
		
		MimeMessage message = new MimeMessage(mailSession.getMailSession());
		message.setSubject("Test Mail" + new Date());
		message.setFrom(new InternetAddress("adelwin@testmail.com"));
		message.addRecipient(RecipientType.TO, new InternetAddress("adelwin.expense@gmail.com"));
		message.setText("this is the content of the message\n" + new Date() + "\n\nRegards,\nAdelwin");
		
		mailSession.send(message);
		
		mailSession.disconnect();
		
	}
}
