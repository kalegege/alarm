package com.wasu.model;

import java.util.Date;

public class QunZhu {
    private Long id;

    private String userName;

    private Date createTime;

    private Integer cardNum;

    private Long 发展人id;

    private String 发展人姓名;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
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
}