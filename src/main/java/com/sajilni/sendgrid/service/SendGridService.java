package com.sajilni.sendgrid.service;

import com.sajilni.sendgrid.entity.SendGrid;

import java.util.List;

public interface SendGridService {
    List<SendGrid> findAllEmails();

    SendGrid findEmailById(long emailId);

    public void saveSendGrid(SendGrid email);

    public void deleteSendGrid(long email);
}
