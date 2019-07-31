package VariablesAndParameters;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;




public class EmailReport {
		
	public void EmailReportTest(){

	{

    final String username = "juliuscolladoortiz@gmail.com";
    final String password = "dice205201996";

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

        Message message = new MimeMessage(session);
        String to = "paola.soriano@dice205.com , jay.ortiz@dice205.com";
        message.setFrom(new InternetAddress("juliuscolladoortiz@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to , true));
        message.setSubject("PBAL Automated test results");
        message.setText("Pilmico Brand Asset Library");

        MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        messageBodyPart = new MimeBodyPart();
        String file = "C:\\Users\\dice205\\eclipse-workspace\\PBAL-Automation-Framework\\test-output\\emailable-report.html";
        String fileName = "emailable-report";
        DataSource source = new FileDataSource(file);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        System.out.println("Sending");

        Transport.send(message);

        System.out.println("Done");

    } catch (MessagingException e) {
        e.printStackTrace();
    }
  
}
	}
}