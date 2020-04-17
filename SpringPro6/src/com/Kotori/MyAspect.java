package com.Kotori;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {


    @Before(value = "execution(* com.Kotori.GoodsDao.save(..))")
    public void log() {
        System.out.println("日志");
    }
}


