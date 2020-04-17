package com.Kotori.test;

import com.Kotori.service.UserService;
import com.Kotori.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    /***
     * 传统的dao方法
     */
    @Test
    public void test1(){
        UserService service = new UserServiceImpl();
        service.delete();
    }

    /***
     * 通过spring
     */
    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService)applicationContext.getBean("UserService");
        service.delete();
    }



}
