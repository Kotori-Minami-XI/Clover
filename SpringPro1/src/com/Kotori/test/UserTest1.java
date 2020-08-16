package com.Kotori.test;

import com.Kotori.domain.User1;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 测试属性注入
 */
public class UserTest1 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        User1 user = (User1)context.getBean("User1");
        System.out.println(user);
    }
}
