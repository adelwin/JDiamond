import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

import org.si.diamond.mail.authenticator.GoogleAuthenticator;
import org.si.diamond.mail.authenticator.SMTPAuthenticator;
import org.si.diamond.mail.exception.BaseMailException;
import org.si.diamond.mail.store.MailStore;

/**
 * File Name    : MailReaderTestNew.java
 * Author       : adelwin
 * Created Date : Feb 3, 2011 2:11:52 PM
 */

public class MailReaderTestNew {
	public static void main(String args[]) throws BaseMailException, MessagingException {
		Properties mailConfigurationProperties = new Properties();
		mailConfigurationProperties.put("mail.debug", "true");
		mailConfigurationProperties.put("mail.imap.host", "imap.gmail.com");
		mailConfigurationProperties.put("mail.imap.port", "993");
		mailConfigurationProperties.put("mail.imap.user", "adelwin.expense@gmail.com");
		
		SMTPAuthenticator smtpAuthenticator = new GoogleAuthenticator();
		MailStore mailStore = new MailStore("adelwin.expense", mailConfigurationProperties, smtpAuthenticator);
		FlagTerm term = new FlagTerm(new Flags(Flag.SEEN), false);
		Message[] messages = mailStore.getMessages(Folder.READ_WRITE, "Expense", term);
		System.out.println("adelwin" + messages.length);
//		messages[0].setFlag(Flag.SEEN, true);
		mailStore.disconnect();
		System.out.println("adelwin");
	}
}
