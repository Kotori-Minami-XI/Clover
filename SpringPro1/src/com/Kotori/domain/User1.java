package com.Kotori.domain;

public class User1 {
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
