package com.mock.selenium;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Yuvaraj on 16/02/2018.
 */
@Aspect
public class JUnitAssertAspect {

//    @Pointcut("call(* org.junit.Assert.assert*(..))")
//    public void assertMethods(ProceedingJoinPoint joinPoint) {
//        return;
//    }

//    @Pointcut("call(* org.junit.Assert.fail(..))")
//    public void fail(ProceedingJoinPoint joinPoint) throws Throwable {
//        joinPoint.proceed();
//    }
}
