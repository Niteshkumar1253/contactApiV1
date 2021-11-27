package com.learn.contactsAPIv1.dao;

import com.learn.contactsAPIv1.jpaMapping.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeDao extends CrudRepository<Employee,String> {
}
