package com.Kotori.demo4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private Integer age;
    private Dog dog;
    private String attr[];
    private List<String> myList;
    private Set<String> mySet;


    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    private Map<String, String> myMap;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAttr(String[] attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", attr=" + Arrays.toString(attr) +
                ", myList=" + myList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                '}';
    }
}
