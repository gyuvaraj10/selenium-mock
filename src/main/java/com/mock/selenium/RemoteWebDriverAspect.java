package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.mockito.Mockito;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class RemoteWebDriverAspect {

    @Pointcut("call(org.openqa.selenium.remote.RemoteWebDriver.new(..))")
    public void remoteDriver() {
    }

    @Around("remoteDriver()")
    public Object aroundNewRemoteDriver(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(RemoteWebDriver.class);
    }

}
