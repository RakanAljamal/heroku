//package com.sajilni.sendgrid.service;
//
//import com.sajilni.sendgrid.dao.SendGridDAO;
//import com.sajilni.sendgrid.entity.SendGrid;
//import com.sajilni.sendgrid.excpetion.SendGridException;
//import org.springframework.stereotype.Repository;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Repository("SendGridService")
//public class SendGridServiceImpl implements SendGridService {
//    private final SendGridDAO sendGridDAO;
//
//    public SendGridServiceImpl(SendGridDAO sendGridDAO) {
//        this.sendGridDAO = sendGridDAO;
//    }
//
//    @Override
//    @Transactional
//    public List<SendGrid> findAllEmails() {
//        return sendGridDAO.findAll();
//    }
//
//    @Override
//    @Transactional
//    public SendGrid findEmailById(long emailId) {
//        if (sendGridDAO.findById(emailId).isPresent())
//            return sendGridDAO.findById(emailId).get();
//        throw new SendGridException("Email Not Found");
//    }
//
//    @Override
//    @Transactional
//    public void saveSendGrid(SendGrid email) {
//        sendGridDAO.save(email);
//    }
//
//    @Override
//    @Transactional
//    public void deleteSendGrid(long emailId) {
//        sendGridDAO.delete(findEmailById(emailId));
//    }
//
//
//}
