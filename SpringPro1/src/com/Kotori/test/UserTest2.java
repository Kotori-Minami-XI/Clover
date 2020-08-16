package com.Kotori.test;

import com.Kotori.domain.User2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 测试属性注入
 */
public class UserTest2 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        User2 user = (User2)context.getBean("User2");
        System.out.println(user);
    }
}
