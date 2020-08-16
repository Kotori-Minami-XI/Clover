package com.Kotori.service;

import com.Kotori.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void delete() {
        System.out.println("UserServiceImpl1");
        userDao.delete();
    }
}
