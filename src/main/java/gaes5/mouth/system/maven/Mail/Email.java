/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Josarta
 */
public abstract class Email {

    public static String sms = "Mouth Recovery Password";

    public static void recuperarClaves(String correoIn, String nuevaClave, String Usuario) {
        final String usuario = "jaimez07788@gmail.com";
        final String clave = "rmatxomqcqgbiuws";

        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com"); // envia 
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "25");
        props.setProperty("mail.smtp.starttls.required", "false");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, clave);
            }
        });

        try {
            System.out.println("Enviar correo");
            MimeMessage mensage = new MimeMessage(session);
            mensage.setFrom(new InternetAddress(usuario));
            mensage.addRecipient(Message.RecipientType.TO, new InternetAddress(correoIn));
            mensage.setSubject(sms);
            mensage.setContent("<center> <img src='https://www.uala.com.mx/assets/images/gif/security.gif' width='200px' high='200px' ></center>"
                    + "<center>Apreciado Paciente: <h1> " + Usuario + " </h1></center>"
                    + "<center>Tus credenciales de acceso a nuestra plataforma <h4>Mouth System </h4></center>"
                    + "Usuario : " + correoIn
                    + "<p></p>"
                    + "Clave : "  + nuevaClave
                    + "<p></p>"
                    + "Gracias por confiar tu salud bucal"
                    + "<p></p>"
                    + "<center>No responder este mensaje    <center>"
                    + "<p></p>"
                    + "<center>Sistema de Información <h3>Mouth System</h3><center>"
                    + "<p></p>"
                    + "<center> <img src='https://2.bp.blogspot.com/-2m9lvLWhmNU/WdnMLhF_e5I/AAAAAAAAYXA/cLNKHDbRZ0U8N6Q7k8PDqhRTYRyiLiW-ACLcBGAs/s1600/418991-clinica-dental-horta-nord-dr-santamaria-diente-.gif' width='50px' high='50px' ></center>",
                    "text/html");
            Transport.send(mensage);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
