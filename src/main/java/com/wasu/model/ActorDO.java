package com.wasu.model;

/**
 * Created by kale on 2017/8/11.
 */
public class ActorDO {
    private String name;
    private int id;
    private int num_develop;
    private int num_buy;
    private int num_send;
    private int num_arrange;

    public ActorDO(String name, int id, int num_develop, int num_buy, int num_send, int num_arrange) {
        this.name = name;
        this.id = id;
        this.num_develop = num_develop;
        this.num_buy = num_buy;
        this.num_send = num_send;
        this.num_arrange = num_arrange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_develop() {
        return num_develop;
    }

    public void setNum_develop(int num_develop) {
        this.num_develop = num_develop;
    }

    public int getNum_buy() {
        return num_buy;
    }

    public void setNum_buy(int num_buy) {
        this.num_buy = num_buy;
    }

    public int getNum_send() {
        return num_send;
    }

    public void setNum_send(int num_send) {
        this.num_send = num_send;
    }

    public int getNum_arrange() {
        return num_arrange;
    }

    public void setNum_arrange(int num_arrange) {
        this.num_arrange = num_arrange;
    }
}
