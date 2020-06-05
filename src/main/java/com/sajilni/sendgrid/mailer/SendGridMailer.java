package com.sajilni.sendgrid.mailer;

//import com.sajilni.sendgrid.service.SendGridService;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class SendGridMailer {

    private final SendGridAPI sendGridAPI;


    public SendGridMailer(SendGridAPI sendGridAPI) {
        this.sendGridAPI = sendGridAPI;
    }


    public void sendMail() {
        Email from = new Email("from@example.com", "Foo Bar");
        String subject = "Test email with SendGrid";
        Email to = new Email("to@example.com");
        Content content = new Content("text/plain", "Test email with Spring");
        Mail mail = new Mail(from, subject, to, content);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGridAPI.api(request);
            System.out.println(response.getBody());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}