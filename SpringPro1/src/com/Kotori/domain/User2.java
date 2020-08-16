package com.Kotori.domain;

public class User2 {
    private String username;
    private Integer age;

    public User2(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
