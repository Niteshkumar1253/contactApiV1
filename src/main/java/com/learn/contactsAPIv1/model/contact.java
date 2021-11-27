package com.learn.contactsAPIv1.model;

import javax.persistence.*;

@Entity
@Table(name = "MY_CONTACTS")
public class contact {

    @Id
    @Column(name = "CONTACT_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will generate auto ID
    private String ContactId;
    private String name;
    private String email;
    private String category;



    public contact(){}

    public contact(String contactId, String name, String email, String category) {
        ContactId = contactId;
        this.name = name;
        this.email = email;
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContactId() {
        return ContactId;
    }

    public void setContactId(String contactId) {
        ContactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
