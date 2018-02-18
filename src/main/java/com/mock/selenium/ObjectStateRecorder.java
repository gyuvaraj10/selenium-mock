package com.mock.selenium;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Yuvaraj on 18/02/2018.
 */
public class ObjectStateRecorder {


    void generateState(String identifier, SeleniumElementState state) throws Exception {
        if(getPlayerProperty().equalsIgnoreCase("record")) {
            File tempFile = File.createTempFile(identifier+"/"+state.getName(),
                    String.valueOf(System.currentTimeMillis()));
            FileUtils.write(tempFile,  new Gson().toJson(state), Charset.defaultCharset(), true);
            return;
        }
        throw new Exception("Cann't create the state for identifier");
    }

    SeleniumElementState getState(String identifier, String fieldName, String stateLocationFolderPath) throws Exception {
        if(getPlayerProperty().equalsIgnoreCase("playback")) {
            String state = FileUtils.readFileToString(Paths.get(stateLocationFolderPath, identifier, fieldName).toFile(),
                    Charset.defaultCharset());
            return new Gson().fromJson(state, SeleniumElementState.class);
        }
        throw new Exception("Cann't find the state for identifier");
    }

    private String getPlayerProperty() throws Exception {
        String value = System.getProperty("object.state.recorder");
        if(value == null) {
            throw new Exception("You must set the property object.state.recorder to record/playback");
        }
        return value;
    }
}
