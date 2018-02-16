package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.mockito.Mockito;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class FirefoxDriverAspect {

    @Pointcut("call(org.openqa.selenium.firefox.FirefoxDriver.new())")
    public void firefoxDriver() {
    }

    @Around("firefoxDriver()")
    public Object aroundNewFirefoxDriver(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(FirefoxDriver.class);
    }


}
