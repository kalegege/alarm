package com.wasu.model;

import java.util.Date;

public class Summary {
    private Integer id;

    private String name;

    private String pId;

    private Date gmtModified;

    private Date gmtCreate;

    private Integer numDevelop;

    private Integer numBuy;

    private Integer numSend;

    private Integer numArrange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getNumDevelop() {
        return numDevelop;
    }

    public void setNumDevelop(Integer numDevelop) {
        this.numDevelop = numDevelop;
    }

    public Integer getNumBuy() {
        return numBuy;
    }

    public void setNumBuy(Integer numBuy) {
        this.numBuy = numBuy;
    }

    public Integer getNumSend() {
        return numSend;
    }

    public void setNumSend(Integer numSend) {
        this.numSend = numSend;
    }

    public Integer getNumArrange() {
        return numArrange;
    }

    public void setNumArrange(Integer numArrange) {
        this.numArrange = numArrange;
    }
}