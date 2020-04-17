package com.Kotori.demo1;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("ORACLE-SAVE");
    }

    @Override
    public void delete() {
        System.out.println("ORACLE-DELETE");
    }
}
