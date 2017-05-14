package com.arena.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Transfer {
    private Integer tid;

    private String toutid;

    private String tinid;

    private BigDecimal tmoney;

    private Date tdate;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getToutid() {
        return toutid;
    }

    public void setToutid(String toutid) {
        this.toutid = toutid == null ? null : toutid.trim();
    }

    public String getTinid() {
        return tinid;
    }

    public void setTinid(String tinid) {
        this.tinid = tinid == null ? null : tinid.trim();
    }

    public BigDecimal getTmoney() {
        return tmoney;
    }

    public void setTmoney(BigDecimal tmoney) {
        this.tmoney = tmoney;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }
}