package com.Kotori.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    public static User createUser() {
        return new User();
    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
