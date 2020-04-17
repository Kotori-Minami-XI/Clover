package com.Kotori.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4Test {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)ApplicationContext.getBean("Student");
        System.out.println(student);
    }
}
