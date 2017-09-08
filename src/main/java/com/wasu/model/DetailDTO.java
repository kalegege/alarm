package com.wasu.model;

/**
 * Created by kale on 2017/9/4.
 */
public class DetailDTO {
    private double login_time;
    private int number;

    public DetailDTO(double login_time) {
        this.login_time = login_time;
    }

    public double getLogin_time() {
        return login_time;
    }

    public void setLogin_time(double login_time) {
        this.login_time = login_time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
