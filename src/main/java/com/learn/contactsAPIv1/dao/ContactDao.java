package com.learn.contactsAPIv1.dao;

import com.learn.contactsAPIv1.model.contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends CrudRepository<contact, String> {
}
