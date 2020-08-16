package com.Kotori;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 测试AOP
 */
public class TestAOP {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        GoodsDao dao = (GoodsDao)applicationContext.getBean("GoodsDao");
        //dao.save();
        dao.update();
        //dao.delete();
        //dao.find();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        GoodsDao dao = (GoodsDao)applicationContext.getBean("GoodsDao");
        dao.update();
    }
}
