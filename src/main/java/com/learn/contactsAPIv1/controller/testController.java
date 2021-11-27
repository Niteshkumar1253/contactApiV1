package com.learn.contactsAPIv1.controller;

import com.learn.contactsAPIv1.dao.employeeDao;
import com.learn.contactsAPIv1.jpaMapping.Employee;
import com.learn.contactsAPIv1.jpaMapping.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relations")
public class testController {

    @Autowired
    private employeeDao dao;

    @GetMapping("/test")
    public void test(){
        Passport passport = new Passport("12","jammu");
        Employee emp = new Employee("2","ranjan",passport);
        dao.save(emp);
    }
}
