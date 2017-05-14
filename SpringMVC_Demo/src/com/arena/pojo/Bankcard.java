package com.arena.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bankcard {
    private String bcid;

    private String bcidcard;

    private BigDecimal bmoney;

    private Date bdate;

    public String getBcid() {
        return bcid;
    }

    public void setBcid(String bcid) {
        this.bcid = bcid == null ? null : bcid.trim();
    }

    public String getBcidcard() {
        return bcidcard;
    }

    public void setBcidcard(String bcidcard) {
        this.bcidcard = bcidcard == null ? null : bcidcard.trim();
    }

    public BigDecimal getBmoney() {
        return bmoney;
    }

    public void setBmoney(BigDecimal bmoney) {
        this.bmoney = bmoney;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }
}