/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.emailUtil;

import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.mail.Message;
//import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
//import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Jinadi
 */

public class EmailSender {

    public String sendMail(String email, String pasword, String toEmail, String subject, String text) {

        String msg;

        final String userName = email;
        final String password = pasword;

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
           
        });
        
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            msg="true";
            return msg;
            
        } catch (Exception ex) {
            return ex.toString();
        }
        

    }
}
