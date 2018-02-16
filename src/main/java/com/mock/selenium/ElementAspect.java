package com.mock.selenium;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class ElementAspect {

    @Around("call(* org.openqa.selenium.WebElement.click())")
    public void aroundElementClick(ProceedingJoinPoint joinPoint) {
        System.out.println("Not Clicking any element");
        return;
    }

    @Around("call(* org.openqa.selenium.WebElement.submit())")
    public void aroundElementSubmit(ProceedingJoinPoint joinPoint) {
        System.out.println("Not submitting any element");
        return;
    }

    @Around("call(* org.openqa.selenium.WebElement.sendKeys(..))")
    public void aroundElementSendKeys(ProceedingJoinPoint joinPoint) {
        System.out.println("Not sending any element");
        return;
    }

    @Around("call(* org.openqa.selenium.WebElement.clear())")
    public void aroundElementClear(ProceedingJoinPoint joinPoint) {
        System.out.println("Not sending any element");
        return;
    }

    @Around("call(* org.openqa.selenium.WebElement.findElement(..))")
    public Object aroundFindElement(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(WebElement.class);
    }

    @Around("call(* org.openqa.selenium.WebElement.getTagName())")
    public Object aroundElementGetTagName(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebElement.getAttribute())")
    public Object aroundElementGetAttribute(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebElement.isSelected())")
    public Object aroundElementIsSelected(ProceedingJoinPoint joinPoint) {
        return true;
    }

    @Around("call(* org.openqa.selenium.WebElement.isEnabled())")
    public Object aroundElementIsEnabled(ProceedingJoinPoint joinPoint) {
        return true;
    }

    @Around("call(* org.openqa.selenium.WebElement.getText())")
    public String aroundElementGetText(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebElement.isDisplayed())")
    public Object aroundElementIsDisplayed(ProceedingJoinPoint joinPoint) {
        return true;
    }

    @Around("call(* org.openqa.selenium.WebElement.getLocation())")
    public Object aroundElementGetLocation(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(Point.class);
    }

    @Around("call(* org.openqa.selenium.WebElement.getSize())")
    public Object aroundElementGetSize(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(Dimension.class);
    }

    @Around("call(* org.openqa.selenium.WebElement.getRect())")
    public Object aroundElementGetRect(ProceedingJoinPoint joinPoint) {
        return Mockito.mock(Rectangle.class);
    }

    @Around("call(* org.openqa.selenium.WebElement.getCssValue(..))")
    public String aroundElementGetCssValue(ProceedingJoinPoint joinPoint) {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebElement.findElements(..))")
    public List<WebElement> aroundFindElements(ProceedingJoinPoint joinPoint) {
        WebElement element = Mockito.mock(WebElement.class);
        return Arrays.asList(element);
    }


}
