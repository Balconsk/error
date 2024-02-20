package ru.balcon.MyProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Note {
    @JsonProperty("noteName")
    private String noteName = "Some name";
    @JsonProperty("editorJsData")
    private EditorJsData editorJsData;

    @Override
    public String toString() {
        return "Note{" +
                "noteName='" + noteName + '\'' +
                ", editorJsData=" + editorJsData +
                '}';
    }
}

class EditorJsData{
    @JsonProperty("blocks")
    private List<Block> blocks;
    @JsonProperty("time")
    private long time;
    @JsonProperty("version")
    private String version;
}

class Block {
    @JsonProperty("data")
    private Map<String, Object> data;
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;

}
