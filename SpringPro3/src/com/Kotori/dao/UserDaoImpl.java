package com.Kotori.dao;

import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void delete() {
        System.out.println("从数据库删除");
    }
}
