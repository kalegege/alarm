package com.wasu.model;

import java.util.List;

/**
 * Created by kale on 2017/9/4.
 */
public class DetailDO {
    private String name;
    private List<DetailDTO> value;

    public DetailDO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DetailDTO> getValue() {
        return value;
    }

    public void setValue(List<DetailDTO> value) {
        this.value = value;
    }
}
