package com.wasu.model;

import java.util.Date;

public class QunZhuyjDetail {
    private Integer id;

    private Date opDate;

    private Integer opId;

    private String opName;

    private Date regTime;

    private Integer parentId;

    private String parentName;

    private Integer tradeNum;

    private Integer discountNum;

    private Integer adjustmentNum;

    private Integer transferNum;

    private Integer openrooNum;

    private Integer remainingNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public Integer getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    public Integer getDiscountNum() {
        return discountNum;
    }

    public void setDiscountNum(Integer discountNum) {
        this.discountNum = discountNum;
    }

    public Integer getAdjustmentNum() {
        return adjustmentNum;
    }

    public void setAdjustmentNum(Integer adjustmentNum) {
        this.adjustmentNum = adjustmentNum;
    }

    public Integer getTransferNum() {
        return transferNum;
    }

    public void setTransferNum(Integer transferNum) {
        this.transferNum = transferNum;
    }

    public Integer getOpenrooNum() {
        return openrooNum;
    }

    public void setOpenrooNum(Integer openrooNum) {
        this.openrooNum = openrooNum;
    }

    public Integer getRemainingNum() {
        return remainingNum;
    }

    public void setRemainingNum(Integer remainingNum) {
        this.remainingNum = remainingNum;
    }
}