package com.Kotori.dao;

import org.springframework.stereotype.Component;

@Component("UserDao")
public class UserDao {
    public void delete() {
        System.out.println("delete");
    }
}
