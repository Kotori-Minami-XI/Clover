package com.Kotori;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void check(){
        System.out.println("MyAspect-check");
    }

    public void log(String res){
        System.out.println(res);
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyAspect-StartTransaction");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("MyAspect-CommitTransaction");
        return obj;
    }

    public void exceptionM(Throwable ex) throws Throwable {
        System.out.println("find-error" + ex.getMessage());
    }

    public void after() {
        System.out.println("MyAspect-after");
    }
}
