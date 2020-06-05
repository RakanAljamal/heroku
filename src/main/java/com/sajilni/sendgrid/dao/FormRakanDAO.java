//package com.sajilni.sendgrid.dao;
//
//import com.sajilni.sendgrid.entity.Forms;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface FormRakanDAO extends JpaRepository<Forms, Integer> {
//    @Query(value = "select * from Forms", nativeQuery = true)
//    List<Forms> queryByForms();
//}
