package com.mock.selenium;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class ImeHandlerAspect {

    @Around("call(* org.openqa.selenium.WebDriver.ImeHandler.deactivate())")
    public void deactivate() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.ImeHandler.activateEngine(..))")
    public void activateEngine() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.ImeHandler.isActivated())")
    public boolean isActivated() {
        return true;
    }

    @Around("call(* org.openqa.selenium.WebDriver.ImeHandler.getActiveEngine())")
    public String getActiveEngine() {
        return "";
    }

    @Around("call(* org.openqa.selenium.WebDriver.ImeHandler.getAvailableEngines())")
    public List<String> getAvailableEngines() {
        return Arrays.asList("");
    }
}
