package com.learn.contactsAPIv1.service;

import com.learn.contactsAPIv1.dao.ContactDao;
import com.learn.contactsAPIv1.model.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService{

    private ContactDao dao;

    @Autowired
    public ContactServiceImpl(ContactDao dao) {
        this.dao = dao;
    }

    @Override
    public contact addContact(contact c) {
        c.setContactId(UUID.randomUUID().toString());
        dao.save(c);
        return c;
    }

    @Override
    public contact getContact(String contactId) {
        final Optional<contact> optionalContact= dao.findById(contactId);
        if(!optionalContact.isPresent()){
            return null;
        }
        return optionalContact.get();
    }

    @Override
    public List<contact> getAllContact() {
        List<contact> c = new ArrayList<>();
        dao.findAll().forEach(contact -> c.add(contact));
        return c;
    }

    @Override
    public void deleteContact(String contactId) {
        dao.deleteById(contactId);
    }
}
