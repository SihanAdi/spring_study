package com.adsh.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解实现
@Aspect//标注这个类是一个切面
public class AnnotationPointcut {
    @Before("execution(* com.adsh.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========before========");
    }
    @After("execution(* com.adsh.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=========after========");
    }
    @Around("execution(* com.adsh.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("around_before");
        pj.proceed();
        System.out.println("around_after");

    }

}
