package com.arena.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andToutidIsNull() {
            addCriterion("toutid is null");
            return (Criteria) this;
        }

        public Criteria andToutidIsNotNull() {
            addCriterion("toutid is not null");
            return (Criteria) this;
        }

        public Criteria andToutidEqualTo(String value) {
            addCriterion("toutid =", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidNotEqualTo(String value) {
            addCriterion("toutid <>", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidGreaterThan(String value) {
            addCriterion("toutid >", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidGreaterThanOrEqualTo(String value) {
            addCriterion("toutid >=", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidLessThan(String value) {
            addCriterion("toutid <", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidLessThanOrEqualTo(String value) {
            addCriterion("toutid <=", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidLike(String value) {
            addCriterion("toutid like", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidNotLike(String value) {
            addCriterion("toutid not like", value, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidIn(List<String> values) {
            addCriterion("toutid in", values, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidNotIn(List<String> values) {
            addCriterion("toutid not in", values, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidBetween(String value1, String value2) {
            addCriterion("toutid between", value1, value2, "toutid");
            return (Criteria) this;
        }

        public Criteria andToutidNotBetween(String value1, String value2) {
            addCriterion("toutid not between", value1, value2, "toutid");
            return (Criteria) this;
        }

        public Criteria andTinidIsNull() {
            addCriterion("tinid is null");
            return (Criteria) this;
        }

        public Criteria andTinidIsNotNull() {
            addCriterion("tinid is not null");
            return (Criteria) this;
        }

        public Criteria andTinidEqualTo(String value) {
            addCriterion("tinid =", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidNotEqualTo(String value) {
            addCriterion("tinid <>", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidGreaterThan(String value) {
            addCriterion("tinid >", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidGreaterThanOrEqualTo(String value) {
            addCriterion("tinid >=", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidLessThan(String value) {
            addCriterion("tinid <", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidLessThanOrEqualTo(String value) {
            addCriterion("tinid <=", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidLike(String value) {
            addCriterion("tinid like", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidNotLike(String value) {
            addCriterion("tinid not like", value, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidIn(List<String> values) {
            addCriterion("tinid in", values, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidNotIn(List<String> values) {
            addCriterion("tinid not in", values, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidBetween(String value1, String value2) {
            addCriterion("tinid between", value1, value2, "tinid");
            return (Criteria) this;
        }

        public Criteria andTinidNotBetween(String value1, String value2) {
            addCriterion("tinid not between", value1, value2, "tinid");
            return (Criteria) this;
        }

        public Criteria andTmoneyIsNull() {
            addCriterion("tmoney is null");
            return (Criteria) this;
        }

        public Criteria andTmoneyIsNotNull() {
            addCriterion("tmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTmoneyEqualTo(Integer value) {
            addCriterion("tmoney =", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotEqualTo(Integer value) {
            addCriterion("tmoney <>", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyGreaterThan(Integer value) {
            addCriterion("tmoney >", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmoney >=", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyLessThan(Integer value) {
            addCriterion("tmoney <", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("tmoney <=", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyIn(List<Integer> values) {
            addCriterion("tmoney in", values, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotIn(List<Integer> values) {
            addCriterion("tmoney not in", values, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyBetween(Integer value1, Integer value2) {
            addCriterion("tmoney between", value1, value2, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("tmoney not between", value1, value2, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTdateIsNull() {
            addCriterion("tdate is null");
            return (Criteria) this;
        }

        public Criteria andTdateIsNotNull() {
            addCriterion("tdate is not null");
            return (Criteria) this;
        }

        public Criteria andTdateEqualTo(Date value) {
            addCriterion("tdate =", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotEqualTo(Date value) {
            addCriterion("tdate <>", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThan(Date value) {
            addCriterion("tdate >", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThanOrEqualTo(Date value) {
            addCriterion("tdate >=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThan(Date value) {
            addCriterion("tdate <", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThanOrEqualTo(Date value) {
            addCriterion("tdate <=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateIn(List<Date> values) {
            addCriterion("tdate in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotIn(List<Date> values) {
            addCriterion("tdate not in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateBetween(Date value1, Date value2) {
            addCriterion("tdate between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotBetween(Date value1, Date value2) {
            addCriterion("tdate not between", value1, value2, "tdate");
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