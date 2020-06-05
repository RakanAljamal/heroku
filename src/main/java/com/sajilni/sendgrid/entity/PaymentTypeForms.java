package com.sajilni.sendgrid.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PaymentTypeForms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private int owner;

    @Column
    private String lang;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    private Forms form;
}
