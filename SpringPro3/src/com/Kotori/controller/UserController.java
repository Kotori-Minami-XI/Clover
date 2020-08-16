package com.Kotori.controller;

import com.Kotori.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller ("userController")
public class UserController {
    @Resource (name = "userServiceImpl2")
    private UserService userService;

    public void deleteUser() {
        userService.delete();
    }
}
