package com.moj.entity;

import java.util.Date;

public class Userheadpicture {
    private Integer id;

    private String headpicture;

    private Date modified;

    private Short allow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadpicture() {
        return headpicture;
    }

    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture == null ? null : headpicture.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Short getAllow() {
        return allow;
    }

    public void setAllow(Short allow) {
        this.allow = allow;
    }
}