package com.javaInterview.javaInterview.services;

import com.javaInterview.javaInterview.forms.UserForm;
import com.javaInterview.javaInterview.models.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> getAllUsers();
    void deleteUserById(Long id);
    UserModel findUserByEmail(String email);
    UserModel updateUser(UserModel userModel);
    UserModel createUser(UserForm userForm);
}
