package com.live.springmvc.entity;

import com.live.springmvc.contronller.ioc.StudentController;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class Student {

    @Autowired
    StudentController studentEntityStudentController;

    String name = "live";
    int age = 30;

}
