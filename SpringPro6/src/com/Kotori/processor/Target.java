package com.Kotori.processor;

import org.springframework.stereotype.Component;

public class Target {
    private String TargetName;

    public Target() {
        System.out.println("Target构造函数");
    }

    public String getTargetName() {
        System.out.println("Target-getTargetName");
        return TargetName;
    }

    public void setTargetName(String targetName) {
        System.out.println("Target-setTargetName");
        TargetName = targetName;
    }

    public void f() {
        System.out.println("Target");
    }
}
