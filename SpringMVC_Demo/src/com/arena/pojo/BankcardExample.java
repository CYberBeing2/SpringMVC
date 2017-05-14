package com.arena.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankcardExample() {
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

        public Criteria andBcidIsNull() {
            addCriterion("bcid is null");
            return (Criteria) this;
        }

        public Criteria andBcidIsNotNull() {
            addCriterion("bcid is not null");
            return (Criteria) this;
        }

        public Criteria andBcidEqualTo(String value) {
            addCriterion("bcid =", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotEqualTo(String value) {
            addCriterion("bcid <>", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThan(String value) {
            addCriterion("bcid >", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThanOrEqualTo(String value) {
            addCriterion("bcid >=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThan(String value) {
            addCriterion("bcid <", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThanOrEqualTo(String value) {
            addCriterion("bcid <=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLike(String value) {
            addCriterion("bcid like", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotLike(String value) {
            addCriterion("bcid not like", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidIn(List<String> values) {
            addCriterion("bcid in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotIn(List<String> values) {
            addCriterion("bcid not in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidBetween(String value1, String value2) {
            addCriterion("bcid between", value1, value2, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotBetween(String value1, String value2) {
            addCriterion("bcid not between", value1, value2, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidcardIsNull() {
            addCriterion("bcidcard is null");
            return (Criteria) this;
        }

        public Criteria andBcidcardIsNotNull() {
            addCriterion("bcidcard is not null");
            return (Criteria) this;
        }

        public Criteria andBcidcardEqualTo(String value) {
            addCriterion("bcidcard =", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardNotEqualTo(String value) {
            addCriterion("bcidcard <>", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardGreaterThan(String value) {
            addCriterion("bcidcard >", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardGreaterThanOrEqualTo(String value) {
            addCriterion("bcidcard >=", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardLessThan(String value) {
            addCriterion("bcidcard <", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardLessThanOrEqualTo(String value) {
            addCriterion("bcidcard <=", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardLike(String value) {
            addCriterion("bcidcard like", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardNotLike(String value) {
            addCriterion("bcidcard not like", value, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardIn(List<String> values) {
            addCriterion("bcidcard in", values, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardNotIn(List<String> values) {
            addCriterion("bcidcard not in", values, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardBetween(String value1, String value2) {
            addCriterion("bcidcard between", value1, value2, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBcidcardNotBetween(String value1, String value2) {
            addCriterion("bcidcard not between", value1, value2, "bcidcard");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNull() {
            addCriterion("bmoney is null");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNotNull() {
            addCriterion("bmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBmoneyEqualTo(BigDecimal value) {
            addCriterion("bmoney =", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotEqualTo(BigDecimal value) {
            addCriterion("bmoney <>", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThan(BigDecimal value) {
            addCriterion("bmoney >", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bmoney >=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThan(BigDecimal value) {
            addCriterion("bmoney <", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bmoney <=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyIn(List<BigDecimal> values) {
            addCriterion("bmoney in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotIn(List<BigDecimal> values) {
            addCriterion("bmoney not in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bmoney between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bmoney not between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterion("bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterion("bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterion("bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterion("bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterion("bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterion("bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterion("bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterion("bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterion("bdate not between", value1, value2, "bdate");
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