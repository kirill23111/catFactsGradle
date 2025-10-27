package ru.netology.cats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes; // важно: Integer, т.к. может быть null

    public String getId() { return id; }
    public String getText() { return text; }
    public String getType() { return type; }
    public String getUser() { return user; }
    public Integer getUpvotes() { return upvotes; }

    @Override
    public String toString() {
        return "CatFact{" +
                "text='" + text + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
