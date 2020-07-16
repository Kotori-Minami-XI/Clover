package com.Kotori.processor;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcessorTest {
    @Test
    public void testPostBeanProcessorBeforeInstantiation() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Target bean = (Target)applicationContext.getBean(Target.class);
        bean.f();
        System.out.println(bean);
    }
}
