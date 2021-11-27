package com.learn.contactsAPIv1.service;

import com.learn.contactsAPIv1.model.contact;

import java.util.List;

public interface ContactService {

    public contact addContact(contact c);
    contact getContact(String contactId);
    List<contact> getAllContact();
    void deleteContact(String contactId);
}
