package com.javaInterview.javaInterview.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER", uniqueConstraints = {@UniqueConstraint(columnNames = "telephone")})

public class User {

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String telephoneNumber;

    @Column(name = "company")
    private String company;
}
