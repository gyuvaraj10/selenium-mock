package com.mock.selenium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuvaraj on 18/02/2018.
 */
public class SeleniumElementState {

    private String name;

    private Map<String,String> attributes;

    public SeleniumElementState() {
        attributes = new HashMap<String, String>();
    }
}
