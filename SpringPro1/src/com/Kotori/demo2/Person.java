package com.Kotori.demo2;

public class Person {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    private void init() {
        System.out.println("init");
    }

    private void destroy() {
        System.out.println("destroy");
    }
}
