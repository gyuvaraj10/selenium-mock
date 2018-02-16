package com.mock.selenium;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class WindowAspect {

    @Around("call(* org.openqa.selenium.WebDriver.Window.setSize(..))")
    public void setSize() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Window.setPosition(..))")
    public void setPosition() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Window.maximize(..))")
    public void maximize() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Window.fullscreen(..))")
    public void fullscreen() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Window.getSize(..))")
    public Dimension getSize() {
        return Mockito.mock(Dimension.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Window.getPosition(..))")
    public Point getPosition() {
        return Mockito.mock(Point.class);
    }
}
