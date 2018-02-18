package com.mock.selenium;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.Annotations;

import java.lang.reflect.Field;

/**
 * Created by Yuvaraj on 18/02/2018.
 */
@Aspect
public class PageAspect {

    @Around("call(* org.openqa.selenium.support.PageFactory.initElements(..))")
    public Object initElement(ProceedingJoinPoint joinPoint) {
        try {
            Object[] args = joinPoint.getArgs();
            Field[] fields = ClassLoader.getSystemClassLoader().loadClass(((Class)args[1]).getName()).getDeclaredFields();
            for(Field f: fields) {
                if(f.getType().isAssignableFrom(WebElement.class)) {
                    f.setAccessible(true);
                    Annotations annotations = new Annotations(f);
                    System.out.println(String.format("%s,%s",f.getName(),annotations.buildBy().toString()));
                }
            }
            System.out.println("Page Class:"+ ((Class)args[1]).getName());
            System.out.println("Test Class: "+ joinPoint.getThis().getClass().getName());
            return joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
