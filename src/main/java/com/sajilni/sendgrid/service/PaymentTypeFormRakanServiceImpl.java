package com.sajilni.sendgrid.service;

import com.sajilni.sendgrid.dao.PaymentTypeFormRakanDAO;
import com.sajilni.sendgrid.entity.PaymentTypeForms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PaymentTypeFormRakanService")
public class PaymentTypeFormRakanServiceImpl implements PaymentTypeFormRakanService {
    @Autowired
    private PaymentTypeFormRakanDAO paymentTypeFormRakanDAO;


    @Override
    public List<PaymentTypeForms> getAll() {
        return paymentTypeFormRakanDAO.findAll();
    }

    @Override
    public PaymentTypeForms get(int id) {
        return paymentTypeFormRakanDAO.getOne(id);
    }

    @Override
    public PaymentTypeForms add(PaymentTypeForms t) {
        return paymentTypeFormRakanDAO.save(t);
    }

    @Override
    public PaymentTypeForms update(PaymentTypeForms t) {
        return paymentTypeFormRakanDAO.save(t);
    }

    @Override
    public PaymentTypeForms delete(PaymentTypeForms t) {
        paymentTypeFormRakanDAO.delete(t);
        return t;
    }
}
