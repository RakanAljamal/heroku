//package com.sajilni.sendgrid.rest;
//
//import com.sajilni.sendgrid.entity.SendGrid;
//import com.sajilni.sendgrid.service.SendGridService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/showEmails")
//public class EmailSenderRest {
//    final SendGridService sendGridService;
//
//    public EmailSenderRest(SendGridService sendGridService) {
//        this.sendGridService = sendGridService;
//    }
//
//    @GetMapping
//    public List<SendGrid> showAllEmails() {
//        return sendGridService.findAllEmails();
//    }
//
//    @GetMapping("/{emailId}")
//    public SendGrid showEmail(@PathVariable long emailId) {
//        return sendGridService.findEmailById(emailId);
//    }
//}