package com.Kotori.service;

import com.Kotori.dao.UserDao;
import com.Kotori.dao.UserDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource(name = "UserDao")
    private UserDao dao = new UserDaoImpl();

    @Override
    public void delete() {
        dao.delete();
    }
}
