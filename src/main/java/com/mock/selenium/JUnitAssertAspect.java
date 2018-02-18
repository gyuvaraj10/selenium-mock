package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Yuvaraj on 16/02/2018.
 */
@Aspect
public class JUnitAssertAspect {

    @Around("call(* org.junit.Assert.assertEquals(..))")
    public void assertMethods(ProceedingJoinPoint jp) {
        System.out.println("calling assert equals");
    }
}
