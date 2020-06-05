package com.sajilni.sendgrid;

import com.sajilni.sendgrid.entity.SendGrid;
import com.sajilni.sendgrid.service.SendGridService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SendGridApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SendGridApiApplication.class, args);
    }

}
