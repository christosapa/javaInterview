package com.javaInterview.javaInterview.services;

import com.javaInterview.javaInterview.domains.User;
import com.javaInterview.javaInterview.forms.UserForm;
import com.javaInterview.javaInterview.mappers.UserFormToUserMapper;
import com.javaInterview.javaInterview.mappers.UserToUserModelMapper;
import com.javaInterview.javaInterview.models.UserModel;
import com.javaInterview.javaInterview.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserModelMapper userToUserModel;

    @Autowired
    private UserFormToUserMapper userFormToUser;

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> userToUserModel.map(user))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel findUserByEmail(String email) {
        Optional<User> user = userRepository.findUserByEmail(email);
        return userToUserModel.map(user.get());
    }

    @Override
    public UserModel updateUser(UserModel userModel) {

        Optional<User> originalUser = userRepository.findById(userModel.getId());

        originalUser.get().setFirstName(userModel.getFirstName());
        originalUser.get().setLastName(userModel.getLastName());
        originalUser.get().setCompany(userModel.getCompany());
        originalUser.get().setEmail(userModel.getEmail());
        originalUser.get().setTelephoneNumber(userModel.getTelephoneNumber());

        User newUser = userRepository.save(originalUser.get());
        return userToUserModel.map(newUser);
    }

    @Override
    public UserModel createUser(UserForm userForm) {

        User user = userFormToUser.map(userForm);
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        User newUser = userRepository.save(user);
        return userToUserModel.map(newUser);
    }
}
