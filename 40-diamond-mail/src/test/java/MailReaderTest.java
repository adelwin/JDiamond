import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.si.diamond.mail.authenticator.SMTPAuthenticator;

/**
 * File Name    : MailReaderTest.java
 * Author       : adelwin
 * Created Date : Feb 2, 2011 7:57:49 PM
 */

public class MailReaderTest {
	public static void main(String args[]) throws MessagingException {
		Properties mailConfigurationProperties = new Properties();
//		mailConfigurationProperties.put("mail.smtp.host", "smtp.gmail.com");
//		mailConfigurationProperties.put("mail.smtp.starttls.enable", "true");
		mailConfigurationProperties.put("mail.debug", "true");
//		mailConfigurationProperties.put("mail.smtp.auth", "true");
//		mailConfigurationProperties.put("mail.smtp.port", "25");
		mailConfigurationProperties.put("mail.imap.host", "imap.gmail.com");
		mailConfigurationProperties.put("mail.imap.port", "993");
		mailConfigurationProperties.put("mail.imap.user", "adelwin.expense");
		mailConfigurationProperties.put("mail.store.protocol", "imap");
		mailConfigurationProperties.put("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		mailConfigurationProperties.put("mail.imap.socketFactory.fallback", "false");
//		mailConfigurationProperties.put("mail.imap.socketFactory.port", "993");
		
		Authenticator smtpAuthenticator = new SMTPAuthenticator("adelwin.expense@gmail.com", "234164197231245");
		
		Session session = Session.getDefaultInstance(mailConfigurationProperties, smtpAuthenticator);
		Store store = session.getStore();
		store.connect();
//		store.connect("imap.gmail.com", "adelwin.expense", "234164197231245");
		
		Folder folder = store.getFolder("Expense");
		folder.open(Folder.READ_WRITE);
		Message messages[] = folder.getMessages();
		for (Message message : messages) {
			System.out.println(message.getSubject());
		}
		store.close();
	}
}
