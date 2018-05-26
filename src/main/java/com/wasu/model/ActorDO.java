package com.wasu.model;

/**
 * Created by kale on 2017/8/11.
 */
public class ActorDO {
    private String name;
    private int id;
    private String source;
    private int num_base;
    private int status;
    private String area;
    private String ctime;

    public ActorDO(String name, int id, String source, int num_base, int status, String area, String ctime) {
        this.name = name;
        this.id = id;
        this.source = source;
        this.num_base = num_base;
        this.status = status;
        this.area = area;
        this.ctime = ctime;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getNum_base() {
        return num_base;
    }

    public void setNum_base(int num_base) {
        this.num_base = num_base;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
