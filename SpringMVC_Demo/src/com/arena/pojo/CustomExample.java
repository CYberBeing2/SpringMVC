package com.arena.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCidcardIsNull() {
            addCriterion("cidcard is null");
            return (Criteria) this;
        }

        public Criteria andCidcardIsNotNull() {
            addCriterion("cidcard is not null");
            return (Criteria) this;
        }

        public Criteria andCidcardEqualTo(String value) {
            addCriterion("cidcard =", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardNotEqualTo(String value) {
            addCriterion("cidcard <>", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardGreaterThan(String value) {
            addCriterion("cidcard >", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardGreaterThanOrEqualTo(String value) {
            addCriterion("cidcard >=", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardLessThan(String value) {
            addCriterion("cidcard <", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardLessThanOrEqualTo(String value) {
            addCriterion("cidcard <=", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardLike(String value) {
            addCriterion("cidcard like", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardNotLike(String value) {
            addCriterion("cidcard not like", value, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardIn(List<String> values) {
            addCriterion("cidcard in", values, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardNotIn(List<String> values) {
            addCriterion("cidcard not in", values, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardBetween(String value1, String value2) {
            addCriterion("cidcard between", value1, value2, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCidcardNotBetween(String value1, String value2) {
            addCriterion("cidcard not between", value1, value2, "cidcard");
            return (Criteria) this;
        }

        public Criteria andCpwdIsNull() {
            addCriterion("cpwd is null");
            return (Criteria) this;
        }

        public Criteria andCpwdIsNotNull() {
            addCriterion("cpwd is not null");
            return (Criteria) this;
        }

        public Criteria andCpwdEqualTo(String value) {
            addCriterion("cpwd =", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotEqualTo(String value) {
            addCriterion("cpwd <>", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdGreaterThan(String value) {
            addCriterion("cpwd >", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdGreaterThanOrEqualTo(String value) {
            addCriterion("cpwd >=", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLessThan(String value) {
            addCriterion("cpwd <", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLessThanOrEqualTo(String value) {
            addCriterion("cpwd <=", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLike(String value) {
            addCriterion("cpwd like", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotLike(String value) {
            addCriterion("cpwd not like", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdIn(List<String> values) {
            addCriterion("cpwd in", values, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotIn(List<String> values) {
            addCriterion("cpwd not in", values, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdBetween(String value1, String value2) {
            addCriterion("cpwd between", value1, value2, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotBetween(String value1, String value2) {
            addCriterion("cpwd not between", value1, value2, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(String value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(String value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(String value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(String value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(String value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(String value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLike(String value) {
            addCriterion("csex like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotLike(String value) {
            addCriterion("csex not like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<String> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<String> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(String value1, String value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(String value1, String value2) {
            addCriterion("csex not between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCtelIsNull() {
            addCriterion("ctel is null");
            return (Criteria) this;
        }

        public Criteria andCtelIsNotNull() {
            addCriterion("ctel is not null");
            return (Criteria) this;
        }

        public Criteria andCtelEqualTo(String value) {
            addCriterion("ctel =", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotEqualTo(String value) {
            addCriterion("ctel <>", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelGreaterThan(String value) {
            addCriterion("ctel >", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelGreaterThanOrEqualTo(String value) {
            addCriterion("ctel >=", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLessThan(String value) {
            addCriterion("ctel <", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLessThanOrEqualTo(String value) {
            addCriterion("ctel <=", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLike(String value) {
            addCriterion("ctel like", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotLike(String value) {
            addCriterion("ctel not like", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelIn(List<String> values) {
            addCriterion("ctel in", values, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotIn(List<String> values) {
            addCriterion("ctel not in", values, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelBetween(String value1, String value2) {
            addCriterion("ctel between", value1, value2, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotBetween(String value1, String value2) {
            addCriterion("ctel not between", value1, value2, "ctel");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cstatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(String value) {
            addCriterion("cstatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(String value) {
            addCriterion("cstatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(String value) {
            addCriterion("cstatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cstatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(String value) {
            addCriterion("cstatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(String value) {
            addCriterion("cstatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLike(String value) {
            addCriterion("cstatus like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotLike(String value) {
            addCriterion("cstatus not like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<String> values) {
            addCriterion("cstatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<String> values) {
            addCriterion("cstatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(String value1, String value2) {
            addCriterion("cstatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(String value1, String value2) {
            addCriterion("cstatus not between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}