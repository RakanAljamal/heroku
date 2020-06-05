package com.sajilni.sendgrid.mailer;

import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Attachments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Attachment {

    public static void addAttachment(Mail mail, String path) throws IOException {
        Attachments attachment = new Attachments();
        attachment.setContent(convertFileToBase64(Files.readAllBytes(Paths.get(path))));
        attachment.setFilename("foo.pdf");
        attachment.setType("application/pdf");
        mail.addAttachments(attachment);
    }
    private static String convertFileToBase64(byte[] input) {
        return Base64.getEncoder().encodeToString(input);
    }
}
