package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class TargetLocatorAspect {

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.frame(..))")
    public WebDriver aroundFrame(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.parentFrame())")
    public WebDriver aroundParentFrame(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.window())")
    public WebDriver aroundWindow(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.defaultContent())")
    public WebDriver aroundDefaultContent(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.activeElement())")
    public WebElement aroundActiveElement(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebElement.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.TargetLocator.alert())")
    public Alert aroundAlert(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(Alert.class);
    }


}
