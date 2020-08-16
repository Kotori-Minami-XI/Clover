package com.Kotori.test;

import com.Kotori.domain.User2;
import com.Kotori.domain.User3;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 测试实例工厂注入
 */
public class UserTest3 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        User3 user = (User3)context.getBean("User3");
        System.out.println(user);
    }
}
