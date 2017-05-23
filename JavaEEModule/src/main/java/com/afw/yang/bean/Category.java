package com.afw.yang.bean;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/5/23.
 */
public class Category implements Serializable {

    private String cid;
    private String cname;

    public Category() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
