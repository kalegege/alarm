package com.wasu.model;

/**
 * Created by kale on 2017/8/29.
 */
public class Item {
    private int id;
    private String text;
    private String icon;
    private String url;

    public Item(int id, String text, String icon, String url) {
        this.id = id;
        this.text = text;
        this.icon = icon;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
