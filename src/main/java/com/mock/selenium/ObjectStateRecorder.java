package com.mock.selenium;

/**
 * Created by Yuvaraj on 18/02/2018.
 */
public class ObjectStateRecorder {

    String getPlayerProperty() throws Exception {
        String value = System.getProperty("object.state.recorder");
        if(value == null) {
            throw new Exception("You must set the property object.state.recorder to record/playback");
        }
        return value;
    }

    void generateState(String seleniumFieldName, )
}
