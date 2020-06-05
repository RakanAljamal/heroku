package com.sajilni.sendgrid.dao;

import com.sajilni.sendgrid.entity.SendGrid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SendGridDAO extends JpaRepository<SendGrid,Long> {
}
