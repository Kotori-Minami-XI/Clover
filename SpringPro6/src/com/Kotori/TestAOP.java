package com.Kotori;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAOP {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        GoodsDao dao = (GoodsDao)applicationContext.getBean("GoodsDao");

        dao.save();
    }
}
