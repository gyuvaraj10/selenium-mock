package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.mockito.Mockito;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class InternetExplorerDriverAspect {

    @Pointcut("call(org.openqa.selenium.ie.InternetExplorerDriver.new())")
    public void ieDriver() {
    }

    @Around("ieDriver()")
    public Object aroundNewIEDriver(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(InternetExplorerDriver.class);
    }

}
