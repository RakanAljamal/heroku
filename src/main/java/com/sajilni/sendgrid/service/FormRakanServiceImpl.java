//package com.sajilni.sendgrid.service;
//
//import com.sajilni.sendgrid.dao.FormRakanDAO;
//import com.sajilni.sendgrid.dao.PaymentTypeFormRakanDAO;
//import com.sajilni.sendgrid.entity.Forms;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository("FormRakanService")
//public class FormRakanServiceImpl implements FormRakanService {
//    @Autowired
//    private FormRakanDAO formRakanDAO;
//    @Autowired
//    private PaymentTypeFormRakanDAO paymentTypeFormRakanDAO;
//
//    @Override
//    public List<Forms> getAll() {
//        return formRakanDAO.findAll();
//    }
//
//    public List<Forms> getAllQuery() {
//        return formRakanDAO.queryByForms();
//    }
//
//    public Forms get(int id) {
//        return formRakanDAO.getOne(id);
//    }
//
//
//    @Override
//    public Forms add(Forms forms) {
//        return formRakanDAO.save(forms);
//    }
//
//    @Override
//    public Forms update(Forms forms) {
//        return formRakanDAO.save(forms);
//    }
//
//    @Override
//    public Forms delete(Forms forms) {
//        formRakanDAO.delete(forms);
//        return forms;
//    }
//}
