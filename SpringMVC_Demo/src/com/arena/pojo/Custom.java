package com.arena.pojo;

public class Custom {
    private String cname;

    private String cidcard;

    private String cpwd;

    private String csex;

    private String ctel;

    private String cstatus;

    private Integer mark;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCidcard() {
        return cidcard;
    }

    public void setCidcard(String cidcard) {
        this.cidcard = cidcard == null ? null : cidcard.trim();
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd == null ? null : cpwd.trim();
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel == null ? null : ctel.trim();
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus == null ? null : cstatus.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}