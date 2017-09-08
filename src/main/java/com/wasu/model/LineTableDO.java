package com.wasu.model;

import java.util.List;

/**
 * Created by kale on 2017/8/20.
 */
public class LineTableDO {
    private String country;

    private List<List<Integer>> gdp;

    public LineTableDO(String country, List<List<Integer>> gdp) {
        this.country = country;
        this.gdp = gdp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<List<Integer>> getGdp() {
        return gdp;
    }

    public void setGdp(List<List<Integer>> gdp) {
        this.gdp = gdp;
    }
}
