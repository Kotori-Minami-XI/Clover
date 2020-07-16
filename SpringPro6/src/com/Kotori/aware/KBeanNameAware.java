package com.Kotori.aware;

import org.springframework.beans.factory.BeanNameAware;

public class KBeanNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String beanName) {
        System.out.println("此处可以获取正在初始化的bean的beanName");
        System.out.println();
    }
}
