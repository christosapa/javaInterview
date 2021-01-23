package com.javaInterview.javaInterview.forms;

import javax.validation.constraints.Pattern;

public class UserForm {

    private static final String TELEPHONE_PATTERN = "^(\\+\\d{2})?[0-9]{10}";

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @Pattern(regexp = TELEPHONE_PATTERN, message = "{createOwner.telephone.pattern.invalid}")
    private String telephoneNumber;
    private String company;

    public static String getTelephonePattern() {
        return TELEPHONE_PATTERN;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
