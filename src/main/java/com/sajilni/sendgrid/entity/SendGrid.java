package com.sajilni.sendgrid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class SendGrid {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private long id;
    @Column(length = 20)
    private String fromRakan;

    public SendGrid(String from) {
        this.fromRakan = from;
    }
}
