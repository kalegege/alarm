package com.wasu.model;

import java.math.BigDecimal;
import java.util.Date;

public class QunZhuyj {
    private Long 群主id;

    private String 群主姓名;

    private Date 注册时间;

    private Long 发展人id;

    private String 发展人姓名;

    private BigDecimal 充值数量;

    private BigDecimal 被赠送数量;

    private BigDecimal 调整数量;

    private BigDecimal 划拨数量;

    private BigDecimal 代开房消耗量;

    private Integer 当前剩余数量;

    public Long get群主id() {
        return 群主id;
    }

    public void set群主id(Long 群主id) {
        this.群主id = 群主id;
    }

    public String get群主姓名() {
        return 群主姓名;
    }

    public void set群主姓名(String 群主姓名) {
        this.群主姓名 = 群主姓名 == null ? null : 群主姓名.trim();
    }

    public Date get注册时间() {
        return 注册时间;
    }

    public void set注册时间(Date 注册时间) {
        this.注册时间 = 注册时间;
    }

    public Long get发展人id() {
        return 发展人id;
    }

    public void set发展人id(Long 发展人id) {
        this.发展人id = 发展人id;
    }

    public String get发展人姓名() {
        return 发展人姓名;
    }

    public void set发展人姓名(String 发展人姓名) {
        this.发展人姓名 = 发展人姓名 == null ? null : 发展人姓名.trim();
    }

    public BigDecimal get充值数量() {
        return 充值数量;
    }

    public void set充值数量(BigDecimal 充值数量) {
        this.充值数量 = 充值数量;
    }

    public BigDecimal get被赠送数量() {
        return 被赠送数量;
    }

    public void set被赠送数量(BigDecimal 被赠送数量) {
        this.被赠送数量 = 被赠送数量;
    }

    public BigDecimal get调整数量() {
        return 调整数量;
    }

    public void set调整数量(BigDecimal 调整数量) {
        this.调整数量 = 调整数量;
    }

    public BigDecimal get划拨数量() {
        return 划拨数量;
    }

    public void set划拨数量(BigDecimal 划拨数量) {
        this.划拨数量 = 划拨数量;
    }

    public BigDecimal get代开房消耗量() {
        return 代开房消耗量;
    }

    public void set代开房消耗量(BigDecimal 代开房消耗量) {
        this.代开房消耗量 = 代开房消耗量;
    }

    public Integer get当前剩余数量() {
        return 当前剩余数量;
    }

    public void set当前剩余数量(Integer 当前剩余数量) {
        this.当前剩余数量 = 当前剩余数量;
    }
}