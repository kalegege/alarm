package com.wasu.model;

import java.util.List;

/**
 * Created by kale on 2017/8/29.
 */
public class Menu {
    private int id;
    private String text;
    private String icon;
    private List<Item> children;

    public Menu(String text, String icon) {
        this.text = text;
        this.icon = icon;
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

    public List<Item> getChildren() {
        return children;
    }

    public void setChildren(List<Item> children) {
        this.children = children;
    }
}
