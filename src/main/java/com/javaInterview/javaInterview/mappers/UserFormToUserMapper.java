package com.javaInterview.javaInterview.mappers;

import com.javaInterview.javaInterview.domains.User;
import com.javaInterview.javaInterview.forms.UserForm;
import org.springframework.stereotype.Component;

@Component
public class UserFormToUserMapper {

    public User map(UserForm userForm) {
        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setCompany(userForm.getCompany());
        user.setTelephoneNumber(userForm.getTelephoneNumber());
        user.setEmail(userForm.getEmail());
        user.setPassword(String.valueOf(userForm.getPassword()));

        return user;
    }

}
