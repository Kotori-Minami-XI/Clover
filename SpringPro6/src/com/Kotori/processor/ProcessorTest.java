package com.Kotori.processor;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcessorTest {
    @Test
    public void testPostBeanProcessorBeforeInstantiation() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
    }
}
