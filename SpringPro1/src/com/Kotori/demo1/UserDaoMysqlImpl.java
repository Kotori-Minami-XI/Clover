package com.Kotori.demo1;

public class UserDaoMysqlImpl implements UserDao{
    String name;
    @Override
    public void save() {
        System.out.println("MYSQL-SAVE");
    }

    @Override
    public void delete() {
        System.out.println("MYSQL-DELETE");
    }

    public void setName(String name) {
        this.name = name;
    }
}
