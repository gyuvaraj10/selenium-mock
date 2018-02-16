package com.mock.selenium;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class TimeoutsAspect {

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.implicitlyWait(..))")
    public WebDriver.Timeouts implicitlyWait() {
        return Mockito.mock(WebDriver.Timeouts.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.setScriptTimeout(..))")
    public WebDriver.Timeouts setScriptTimeout() {
        return Mockito.mock(WebDriver.Timeouts.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.pageLoadTimeout(..))")
    public WebDriver.Timeouts pageLoadTimeout() {
        return Mockito.mock(WebDriver.Timeouts.class);
    }
}
