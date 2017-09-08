package com.wasu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DiTuiyjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiTuiyjExample() {
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

        public Criteria and发展人姓名IsNull() {
            addCriterion("发展人姓名 is null");
            return (Criteria) this;
        }

        public Criteria and发展人姓名IsNotNull() {
            addCriterion("发展人姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and发展人姓名EqualTo(String value) {
            addCriterion("发展人姓名 =", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名NotEqualTo(String value) {
            addCriterion("发展人姓名 <>", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名GreaterThan(String value) {
            addCriterion("发展人姓名 >", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名GreaterThanOrEqualTo(String value) {
            addCriterion("发展人姓名 >=", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名LessThan(String value) {
            addCriterion("发展人姓名 <", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名LessThanOrEqualTo(String value) {
            addCriterion("发展人姓名 <=", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名Like(String value) {
            addCriterion("发展人姓名 like", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名NotLike(String value) {
            addCriterion("发展人姓名 not like", value, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名In(List<String> values) {
            addCriterion("发展人姓名 in", values, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名NotIn(List<String> values) {
            addCriterion("发展人姓名 not in", values, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名Between(String value1, String value2) {
            addCriterion("发展人姓名 between", value1, value2, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人姓名NotBetween(String value1, String value2) {
            addCriterion("发展人姓名 not between", value1, value2, "发展人姓名");
            return (Criteria) this;
        }

        public Criteria and发展人idIsNull() {
            addCriterion("发展人id is null");
            return (Criteria) this;
        }

        public Criteria and发展人idIsNotNull() {
            addCriterion("发展人id is not null");
            return (Criteria) this;
        }

        public Criteria and发展人idEqualTo(Long value) {
            addCriterion("发展人id =", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idNotEqualTo(Long value) {
            addCriterion("发展人id <>", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idGreaterThan(Long value) {
            addCriterion("发展人id >", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idGreaterThanOrEqualTo(Long value) {
            addCriterion("发展人id >=", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idLessThan(Long value) {
            addCriterion("发展人id <", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idLessThanOrEqualTo(Long value) {
            addCriterion("发展人id <=", value, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idIn(List<Long> values) {
            addCriterion("发展人id in", values, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idNotIn(List<Long> values) {
            addCriterion("发展人id not in", values, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idBetween(Long value1, Long value2) {
            addCriterion("发展人id between", value1, value2, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展人idNotBetween(Long value1, Long value2) {
            addCriterion("发展人id not between", value1, value2, "发展人id");
            return (Criteria) this;
        }

        public Criteria and发展群主数量IsNull() {
            addCriterion("发展群主数量 is null");
            return (Criteria) this;
        }

        public Criteria and发展群主数量IsNotNull() {
            addCriterion("发展群主数量 is not null");
            return (Criteria) this;
        }

        public Criteria and发展群主数量EqualTo(Long value) {
            addCriterion("发展群主数量 =", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量NotEqualTo(Long value) {
            addCriterion("发展群主数量 <>", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量GreaterThan(Long value) {
            addCriterion("发展群主数量 >", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量GreaterThanOrEqualTo(Long value) {
            addCriterion("发展群主数量 >=", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量LessThan(Long value) {
            addCriterion("发展群主数量 <", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量LessThanOrEqualTo(Long value) {
            addCriterion("发展群主数量 <=", value, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量In(List<Long> values) {
            addCriterion("发展群主数量 in", values, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量NotIn(List<Long> values) {
            addCriterion("发展群主数量 not in", values, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量Between(Long value1, Long value2) {
            addCriterion("发展群主数量 between", value1, value2, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and发展群主数量NotBetween(Long value1, Long value2) {
            addCriterion("发展群主数量 not between", value1, value2, "发展群主数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量IsNull() {
            addCriterion("群主购钻数量 is null");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量IsNotNull() {
            addCriterion("群主购钻数量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量EqualTo(BigDecimal value) {
            addCriterion("群主购钻数量 =", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量NotEqualTo(BigDecimal value) {
            addCriterion("群主购钻数量 <>", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量GreaterThan(BigDecimal value) {
            addCriterion("群主购钻数量 >", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主购钻数量 >=", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量LessThan(BigDecimal value) {
            addCriterion("群主购钻数量 <", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主购钻数量 <=", value, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量In(List<BigDecimal> values) {
            addCriterion("群主购钻数量 in", values, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量NotIn(List<BigDecimal> values) {
            addCriterion("群主购钻数量 not in", values, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主购钻数量 between", value1, value2, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主购钻数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主购钻数量 not between", value1, value2, "群主购钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量IsNull() {
            addCriterion("群主被赠钻数量 is null");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量IsNotNull() {
            addCriterion("群主被赠钻数量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量EqualTo(BigDecimal value) {
            addCriterion("群主被赠钻数量 =", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量NotEqualTo(BigDecimal value) {
            addCriterion("群主被赠钻数量 <>", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量GreaterThan(BigDecimal value) {
            addCriterion("群主被赠钻数量 >", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主被赠钻数量 >=", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量LessThan(BigDecimal value) {
            addCriterion("群主被赠钻数量 <", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主被赠钻数量 <=", value, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量In(List<BigDecimal> values) {
            addCriterion("群主被赠钻数量 in", values, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量NotIn(List<BigDecimal> values) {
            addCriterion("群主被赠钻数量 not in", values, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主被赠钻数量 between", value1, value2, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被赠钻数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主被赠钻数量 not between", value1, value2, "群主被赠钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量IsNull() {
            addCriterion("群主被调钻数量 is null");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量IsNotNull() {
            addCriterion("群主被调钻数量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量EqualTo(BigDecimal value) {
            addCriterion("群主被调钻数量 =", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量NotEqualTo(BigDecimal value) {
            addCriterion("群主被调钻数量 <>", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量GreaterThan(BigDecimal value) {
            addCriterion("群主被调钻数量 >", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主被调钻数量 >=", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量LessThan(BigDecimal value) {
            addCriterion("群主被调钻数量 <", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主被调钻数量 <=", value, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量In(List<BigDecimal> values) {
            addCriterion("群主被调钻数量 in", values, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量NotIn(List<BigDecimal> values) {
            addCriterion("群主被调钻数量 not in", values, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主被调钻数量 between", value1, value2, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主被调钻数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主被调钻数量 not between", value1, value2, "群主被调钻数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量IsNull() {
            addCriterion("群主划拨钻石数量 is null");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量IsNotNull() {
            addCriterion("群主划拨钻石数量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量EqualTo(BigDecimal value) {
            addCriterion("群主划拨钻石数量 =", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量NotEqualTo(BigDecimal value) {
            addCriterion("群主划拨钻石数量 <>", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量GreaterThan(BigDecimal value) {
            addCriterion("群主划拨钻石数量 >", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主划拨钻石数量 >=", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量LessThan(BigDecimal value) {
            addCriterion("群主划拨钻石数量 <", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主划拨钻石数量 <=", value, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量In(List<BigDecimal> values) {
            addCriterion("群主划拨钻石数量 in", values, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量NotIn(List<BigDecimal> values) {
            addCriterion("群主划拨钻石数量 not in", values, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主划拨钻石数量 between", value1, value2, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主划拨钻石数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主划拨钻石数量 not between", value1, value2, "群主划拨钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量IsNull() {
            addCriterion("群主代开房消耗钻石数量 is null");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量IsNotNull() {
            addCriterion("群主代开房消耗钻石数量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量EqualTo(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 =", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量NotEqualTo(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 <>", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量GreaterThan(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 >", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 >=", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量LessThan(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 <", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主代开房消耗钻石数量 <=", value, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量In(List<BigDecimal> values) {
            addCriterion("群主代开房消耗钻石数量 in", values, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量NotIn(List<BigDecimal> values) {
            addCriterion("群主代开房消耗钻石数量 not in", values, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主代开房消耗钻石数量 between", value1, value2, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主代开房消耗钻石数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主代开房消耗钻石数量 not between", value1, value2, "群主代开房消耗钻石数量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量IsNull() {
            addCriterion("群主当前钻石余量 is null");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量IsNotNull() {
            addCriterion("群主当前钻石余量 is not null");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量EqualTo(BigDecimal value) {
            addCriterion("群主当前钻石余量 =", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量NotEqualTo(BigDecimal value) {
            addCriterion("群主当前钻石余量 <>", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量GreaterThan(BigDecimal value) {
            addCriterion("群主当前钻石余量 >", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("群主当前钻石余量 >=", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量LessThan(BigDecimal value) {
            addCriterion("群主当前钻石余量 <", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("群主当前钻石余量 <=", value, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量In(List<BigDecimal> values) {
            addCriterion("群主当前钻石余量 in", values, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量NotIn(List<BigDecimal> values) {
            addCriterion("群主当前钻石余量 not in", values, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主当前钻石余量 between", value1, value2, "群主当前钻石余量");
            return (Criteria) this;
        }

        public Criteria and群主当前钻石余量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("群主当前钻石余量 not between", value1, value2, "群主当前钻石余量");
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