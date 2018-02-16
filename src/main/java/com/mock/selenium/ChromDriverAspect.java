package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.mockito.Mockito;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class ChromDriverAspect {

    @Pointcut("call(org.openqa.selenium.chrome.ChromeDriver.new())")
    public void chromeDriver() {
    }

    @Around("chromeDriver()")
    public Object aroundNewChromeDriver(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(ChromeDriver.class);
    }
}
