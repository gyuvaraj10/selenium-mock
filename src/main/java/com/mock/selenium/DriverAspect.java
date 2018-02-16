package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class DriverAspect {

    @Around("call(* org.openqa.selenium.WebDriver.get(..))")
    public void aroundGet(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.getCurrentUrl())")
    public String aroundGetCurrentUrl(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebDriver.getTitle())")
    public String aroundGetTitle(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebDriver.getPageSource())")
    public String aroundGetPageSource(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebDriver.close())")
    public void aroundClose(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.quit())")
    public void aroundQuit(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.getWindowHandles())")
    public Set<String> aroundGetWindowHandles(ProceedingJoinPoint joinPoint) {
        String handle = "";
        return new LinkedHashSet(Arrays.asList(handle));
    }

    @Around("call(* org.openqa.selenium.WebDriver.getWindowHandle())")
    public String aroundGetWindowHandle(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebDriver.switchTo())")
    public WebDriver.TargetLocator aroundSwitchTo(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.TargetLocator.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.navigate())")
    public WebDriver.Navigation aroundNavigate(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.Navigation.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.manage())")
    public WebDriver.Options aroundManage(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebDriver.Options.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.findElement(..))")
    public Object aroundFindElement(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebElement.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.findElements(..))")
    public List<WebElement> aroundFindElements(ProceedingJoinPoint joinPoint) {
        System.out.println("returning mocked element");
        WebElement element = Mockito.mock(WebElement.class);
        return Arrays.asList(element);
    }
}
