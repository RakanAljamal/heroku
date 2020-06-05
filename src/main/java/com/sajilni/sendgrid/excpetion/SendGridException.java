package com.sajilni.sendgrid.excpetion;

public class SendGridException extends RuntimeException{
    public SendGridException(String message) {
        super(message);
    }
}
