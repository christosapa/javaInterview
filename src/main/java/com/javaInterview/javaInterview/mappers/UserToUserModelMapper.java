package com.javaInterview.javaInterview.mappers;

import com.javaInterview.javaInterview.domains.User;
import com.javaInterview.javaInterview.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserToUserModelMapper {

    public UserModel map(User user) {
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setEmail(user.getEmail());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setCompany(user.getCompany());
        userModel.setTelephoneNumber(user.getTelephoneNumber());

        return userModel;
    }

}
