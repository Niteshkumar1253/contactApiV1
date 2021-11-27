package com.learn.contactsAPIv1.jpaMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passport {

    @Id
    private String passportid;
    private String issuedAt;
}
