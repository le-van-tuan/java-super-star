package vn.sps.design_pattern.behavior.observer.subcribe;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;

public class SmsListener implements EventListener {

    private String phoneNumber;

    public SmsListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void onUpdate(String eventType, File file) {
        System.out.println(String.format("Sms to [%s] - Some one has perform action [%s] on file [%s]", this.phoneNumber, eventType, file.getName()));
    }

    public static void sendPlainTextEmail(final String userName, String toAddress, String subject, String message) throws
            MessagingException, UnsupportedEncodingException {

        Properties properties = new Properties();
        properties.put("smtp.server.host", "localhost");
        properties.put("mail.smtp.port", 2500);

        Session session = Session.getInstance(properties);

        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName, "RobinLee"));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress), new InternetAddress("test@gmail.com")};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(message);

        Transport.send(msg);
    }

    @Override
    public String subscriberInfo() {
        return this.phoneNumber;
    }

    public static void main(String[] args) throws ParseException, MessagingException, UnsupportedEncodingException {
//        for (int i = 0; i < 12; i++) {
//            int finalI = i + 1;
//            new Thread(() -> {
//                try {
//                    sendPlainTextEmail("tuan@gmail.com", "test@gmail.com", "This message has id = " + finalI, "Test");
//                } catch (MessagingException | UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
        sendPlainTextEmail("tuan@gmail.com", "test@gmail.com", "Bringing Good News at the End of the Year, Thank you for Your Support in 2021\n", "Wrapping up 2021 with GetLinks!\n" +
                "Not much left until the new year. Despite the difficult year, we thank everyone for the support you have given us. With your support, we were able to hold many events and collaborations through out the year. Let's take a look at what GetLinks have achieved in 2021! And Stay Tuned for 2022!");
        System.out.println("message send...");
    }

}
