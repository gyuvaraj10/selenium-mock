package com.mock.selenium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuvaraj on 18/02/2018.
 */
public class SeleniumElementState {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    private String name;

    private Map<String,String> attributes;
}
