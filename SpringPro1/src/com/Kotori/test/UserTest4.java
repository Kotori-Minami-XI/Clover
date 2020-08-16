package com.Kotori.test;

import com.Kotori.domain.User4;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 测试静态工厂注入
 */
public class UserTest4 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        User4 userA = (User4)context.getBean("User4");
        User4 userB = (User4)context.getBean("User4");
        System.out.println(userA);
        System.out.println(userA == userB);
    }
}
