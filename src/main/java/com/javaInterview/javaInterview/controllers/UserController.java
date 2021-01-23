package com.javaInterview.javaInterview.controllers;

import com.javaInterview.javaInterview.models.UserModel;
import com.javaInterview.javaInterview.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private static final String USER_FORM = "userForm";

    @Autowired
    private UserService userService;

    @GetMapping("/user/home")
    public String userHomePageView(Model model) {
        String mail = SecurityContextHolder.getContext().getAuthentication().getName();
        UserModel user = userService.findUserByEmail(mail);

        model.addAttribute("userDetails", user);
        return "pages/userHomePage";
    }

}
