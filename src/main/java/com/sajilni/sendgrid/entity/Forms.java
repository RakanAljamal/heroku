//package com.sajilni.sendgrid.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table
//public class Forms {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column
//    private int id;
//
//    @OneToMany(mappedBy = "form", cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
//    private List<PaymentTypeForms> paymentTypeForms = new ArrayList<>();
//}
