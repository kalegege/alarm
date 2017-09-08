package com.wasu.model;

import java.math.BigDecimal;

public class DiTuiyj {
    private String 发展人姓名;

    private Long 发展人id;

    private Long 发展群主数量;

    private BigDecimal 群主购钻数量;

    private BigDecimal 群主被赠钻数量;

    private BigDecimal 群主被调钻数量;

    private BigDecimal 群主划拨钻石数量;

    private BigDecimal 群主代开房消耗钻石数量;

    private BigDecimal 群主当前钻石余量;

    public String get发展人姓名() {
        return 发展人姓名;
    }

    public void set发展人姓名(String 发展人姓名) {
        this.发展人姓名 = 发展人姓名 == null ? null : 发展人姓名.trim();
    }

    public Long get发展人id() {
        return 发展人id;
    }

    public void set发展人id(Long 发展人id) {
        this.发展人id = 发展人id;
    }

    public Long get发展群主数量() {
        return 发展群主数量;
    }

    public void set发展群主数量(Long 发展群主数量) {
        this.发展群主数量 = 发展群主数量;
    }

    public BigDecimal get群主购钻数量() {
        return 群主购钻数量;
    }

    public void set群主购钻数量(BigDecimal 群主购钻数量) {
        this.群主购钻数量 = 群主购钻数量;
    }

    public BigDecimal get群主被赠钻数量() {
        return 群主被赠钻数量;
    }

    public void set群主被赠钻数量(BigDecimal 群主被赠钻数量) {
        this.群主被赠钻数量 = 群主被赠钻数量;
    }

    public BigDecimal get群主被调钻数量() {
        return 群主被调钻数量;
    }

    public void set群主被调钻数量(BigDecimal 群主被调钻数量) {
        this.群主被调钻数量 = 群主被调钻数量;
    }

    public BigDecimal get群主划拨钻石数量() {
        return 群主划拨钻石数量;
    }

    public void set群主划拨钻石数量(BigDecimal 群主划拨钻石数量) {
        this.群主划拨钻石数量 = 群主划拨钻石数量;
    }

    public BigDecimal get群主代开房消耗钻石数量() {
        return 群主代开房消耗钻石数量;
    }

    public void set群主代开房消耗钻石数量(BigDecimal 群主代开房消耗钻石数量) {
        this.群主代开房消耗钻石数量 = 群主代开房消耗钻石数量;
    }

    public BigDecimal get群主当前钻石余量() {
        return 群主当前钻石余量;
    }

    public void set群主当前钻石余量(BigDecimal 群主当前钻石余量) {
        this.群主当前钻石余量 = 群主当前钻石余量;
    }
}