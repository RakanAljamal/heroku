package com.sajilni.sendgrid.excpetion;

import com.sajilni.sendgrid.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SendGridExceptionHandler {
    @ExceptionHandler(SendGridException.class)
    public ResponseEntity<ErrorMessage> emailNotFound(SendGridException e) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_GATEWAY, e.getMessage(), "Page not found");
        return new ResponseEntity<>(errorMessage,errorMessage.getStatus());
    }
}
