package javaMail;

import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Cristo
 */
public class mailSend implements Serializable {

   
    public void sendEmail(String username, String password, String fromEmail,  String userName, String msm) throws AddressException, MessagingException {

         
        
        Properties propierties = System.getProperties();
        propierties.put("mail.smpt.host", "smtp.gmail.com");
        propierties.put("mail.smpt.auth", "true");
        propierties.put("mail.smpt.port", "465");
        propierties.put("mail.smpt.auth", "true");
        propierties.put("mail.smpt.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        propierties.put("mail.smpt.socketFactory.port", "465");
        propierties.put("mail.smpt.socketFactory.fallback", "false");
        
        
        Session mailSession = Session.getDefaultInstance(propierties, null);
        mailSession.setDebug(true);
        
        Message mailMessage = new MimeMessage(mailSession);
        
        mailMessage.setFrom(new InternetAddress(fromEmail));
        mailMessage.setContent(msm, "text/html");
        
        
        Transport transport = mailSession.getTransport("smtp");
        transport.connect("smtp.gmail.com", username, password);
        transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
    }

}
