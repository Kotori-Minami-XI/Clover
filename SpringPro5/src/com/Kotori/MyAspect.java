package com.Kotori;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("MyAspect-before");
    }

    public void afterReturning(String res){
        System.out.println("MyAspect-afterReturning---" + res);
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyAspect-around-before");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("MyAspect-around-after");
        return obj;
    }

    public void exceptionM(Throwable ex) throws Throwable {
        System.out.println("MyAspect-after-throwing---" + ex.getMessage());
    }

    public void after() {
        System.out.println("MyAspect-after");
    }
}
