package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class NavigationAspect {

    @Around("call(* org.openqa.selenium.WebDriver.Navigation.back())")
    public void aroundBack(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Navigation.forward())")
    public void aroundForward(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Navigation.to(..))")
    public void aroundTo(ProceedingJoinPoint joinPoint) {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Navigation.refresh(..))")
    public void aroundRefresh(ProceedingJoinPoint joinPoint) {
        return;
    }

}
