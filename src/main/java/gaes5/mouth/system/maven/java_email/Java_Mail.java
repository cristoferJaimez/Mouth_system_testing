package gaes5.mouth.system.maven.java_email;

import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Cristo
 */
@RequestScoped
@Named
public class Java_Mail {

    private static String email;
    private static String userName;
    private static String msm;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println(email);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println(userName);
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
        System.out.println(msm);
    }

    // enviar un mensaje 
    public static void sendMail(String recipienteMsm) throws MessagingException {

        try {
            System.out.println("Iniciando envio de mensaje");

            Properties properties = new Properties();

            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true"); //TLS

            String myEmail = "jaimez07788@gmail.com";
            String myPassword = "rmatxomqcqgbiuws";

            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(myEmail, myPassword);
                }
            });

            Message message = prepareMessage(session, myEmail, recipienteMsm);

            Transport.send(message);
            System.out.println("Mensaje enviado con exito!!!");
        } catch (MessagingException e) {
                System.out.println("Error en internet");
        }

    }

    private static Message prepareMessage(Session session, String myEmail, String recipienteMsm) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(myEmail));
            message.setSubject(userName);   //Titulo del msm
            message.setText(msm); // texto del msm
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(Java_Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
