package com.Kotori.aware;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest {

    @Test
    public void testBeanNameAware() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        KBeanNameAware bean1 = applicationContext.getBean(KBeanNameAware.class);
        System.out.println("-----------------------------------------");
        System.out.println(bean1);

        KBeanNameAware bean2 = (KBeanNameAware)applicationContext.getBean("KBeanNameAware");
        System.out.println(bean2);
    }

    @Test
    public void testApplicationContextAware() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        KApplicationContextAware bean = applicationContext.getBean(KApplicationContextAware.class);
        System.out.println("-----------------------------------------");
        System.out.println(bean);
    }

    @Test
    public void testBeanFactoryAware() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        KBeanFactoryAware bean = applicationContext.getBean(KBeanFactoryAware.class);

        System.out.println("-----------------------------------------");
        System.out.println(bean);
    }
}
