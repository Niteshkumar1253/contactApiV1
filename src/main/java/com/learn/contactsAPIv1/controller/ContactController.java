package com.learn.contactsAPIv1.controller;

import com.learn.contactsAPIv1.model.contact;
import com.learn.contactsAPIv1.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContactController {

    private ContactService service;

    @Autowired
    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping("/info")
    public String apiInfo(){
        return "Api is up and running!";
    }

    @GetMapping("/contact")
    public List<contact> getAllContact(){
        return service.getAllContact();
    }

    @GetMapping("/contact/{contactID}")
    public contact getContactByID(@PathVariable String contactID){
        return service.getContact(contactID);
    }

    @PostMapping("/contact")
    public ResponseEntity<?> addContact(@RequestBody contact obj){
        System.out.println(obj.getName());
        contact newContact = service.addContact(obj);
        return new ResponseEntity<>(newContact, HttpStatus.CREATED);
    }

    @DeleteMapping("/contact/{id}")
    public void deleteContact(@PathVariable String id){
        service.deleteContact(id);
    }
}
