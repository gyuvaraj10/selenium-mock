package com.mock.selenium;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mockito.Mockito;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Yuvaraj on 07/02/2018.
 */
@Aspect
public class OptionsAspect {

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.addCookie(..))")
    public void addCookie() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.deleteCookieNamed(..))")
    public void deleteCookieNamed() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.deleteCookie(..))")
    public void deleteCookie() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.deleteAllCookies(..))")
    public void deleteAllCookies() {
        return;
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.getCookies(..))")
    public Set<Cookie> getCookies() {
        return  new LinkedHashSet<Cookie>(Arrays.asList(Mockito.mock(Cookie.class)));
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.getCookieNamed(..))")
    public Cookie getCookieNamed() {
        return  Mockito.mock(Cookie.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.timeouts())")
    public WebDriver.Timeouts timeouts() {
        return  Mockito.mock(WebDriver.Timeouts.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.ime())")
    public WebDriver.ImeHandler ime() {
        return  Mockito.mock(WebDriver.ImeHandler.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.window())")
    public WebDriver.Window window() {
        return  Mockito.mock(WebDriver.Window.class);
    }

    @Around("call(* org.openqa.selenium.WebDriver.Timeouts.logs())")
    public Logs logs() {
        return  Mockito.mock(Logs.class);
    }
}
