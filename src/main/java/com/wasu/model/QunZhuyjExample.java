package com.wasu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QunZhuyjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QunZhuyjExample() {
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

        public Criteria and群主idIsNull() {
            addCriterion("群主id is null");
            return (Criteria) this;
        }

        public Criteria and群主idIsNotNull() {
            addCriterion("群主id is not null");
            return (Criteria) this;
        }

        public Criteria and群主idEqualTo(Long value) {
            addCriterion("群主id =", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idNotEqualTo(Long value) {
            addCriterion("群主id <>", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idGreaterThan(Long value) {
            addCriterion("群主id >", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idGreaterThanOrEqualTo(Long value) {
            addCriterion("群主id >=", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idLessThan(Long value) {
            addCriterion("群主id <", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idLessThanOrEqualTo(Long value) {
            addCriterion("群主id <=", value, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idIn(List<Long> values) {
            addCriterion("群主id in", values, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idNotIn(List<Long> values) {
            addCriterion("群主id not in", values, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idBetween(Long value1, Long value2) {
            addCriterion("群主id between", value1, value2, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主idNotBetween(Long value1, Long value2) {
            addCriterion("群主id not between", value1, value2, "群主id");
            return (Criteria) this;
        }

        public Criteria and群主姓名IsNull() {
            addCriterion("群主姓名 is null");
            return (Criteria) this;
        }

        public Criteria and群主姓名IsNotNull() {
            addCriterion("群主姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and群主姓名EqualTo(String value) {
            addCriterion("群主姓名 =", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名NotEqualTo(String value) {
            addCriterion("群主姓名 <>", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名GreaterThan(String value) {
            addCriterion("群主姓名 >", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名GreaterThanOrEqualTo(String value) {
            addCriterion("群主姓名 >=", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名LessThan(String value) {
            addCriterion("群主姓名 <", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名LessThanOrEqualTo(String value) {
            addCriterion("群主姓名 <=", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名Like(String value) {
            addCriterion("群主姓名 like", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名NotLike(String value) {
            addCriterion("群主姓名 not like", value, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名In(List<String> values) {
            addCriterion("群主姓名 in", values, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名NotIn(List<String> values) {
            addCriterion("群主姓名 not in", values, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名Between(String value1, String value2) {
            addCriterion("群主姓名 between", value1, value2, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and群主姓名NotBetween(String value1, String value2) {
            addCriterion("群主姓名 not between", value1, value2, "群主姓名");
            return (Criteria) this;
        }

        public Criteria and注册时间IsNull() {
            addCriterion("注册时间 is null");
            return (Criteria) this;
        }

        public Criteria and注册时间IsNotNull() {
            addCriterion("注册时间 is not null");
            return (Criteria) this;
        }

        public Criteria and注册时间EqualTo(Date value) {
            addCriterion("注册时间 =", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间NotEqualTo(Date value) {
            addCriterion("注册时间 <>", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间GreaterThan(Date value) {
            addCriterion("注册时间 >", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间GreaterThanOrEqualTo(Date value) {
            addCriterion("注册时间 >=", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间LessThan(Date value) {
            addCriterion("注册时间 <", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间LessThanOrEqualTo(Date value) {
            addCriterion("注册时间 <=", value, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间In(List<Date> values) {
            addCriterion("注册时间 in", values, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间NotIn(List<Date> values) {
            addCriterion("注册时间 not in", values, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间Between(Date value1, Date value2) {
            addCriterion("注册时间 between", value1, value2, "注册时间");
            return (Criteria) this;
        }

        public Criteria and注册时间NotBetween(Date value1, Date value2) {
            addCriterion("注册时间 not between", value1, value2, "注册时间");
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

        public Criteria and充值数量IsNull() {
            addCriterion("充值数量 is null");
            return (Criteria) this;
        }

        public Criteria and充值数量IsNotNull() {
            addCriterion("充值数量 is not null");
            return (Criteria) this;
        }

        public Criteria and充值数量EqualTo(BigDecimal value) {
            addCriterion("充值数量 =", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量NotEqualTo(BigDecimal value) {
            addCriterion("充值数量 <>", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量GreaterThan(BigDecimal value) {
            addCriterion("充值数量 >", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("充值数量 >=", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量LessThan(BigDecimal value) {
            addCriterion("充值数量 <", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("充值数量 <=", value, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量In(List<BigDecimal> values) {
            addCriterion("充值数量 in", values, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量NotIn(List<BigDecimal> values) {
            addCriterion("充值数量 not in", values, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("充值数量 between", value1, value2, "充值数量");
            return (Criteria) this;
        }

        public Criteria and充值数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("充值数量 not between", value1, value2, "充值数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量IsNull() {
            addCriterion("被赠送数量 is null");
            return (Criteria) this;
        }

        public Criteria and被赠送数量IsNotNull() {
            addCriterion("被赠送数量 is not null");
            return (Criteria) this;
        }

        public Criteria and被赠送数量EqualTo(BigDecimal value) {
            addCriterion("被赠送数量 =", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量NotEqualTo(BigDecimal value) {
            addCriterion("被赠送数量 <>", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量GreaterThan(BigDecimal value) {
            addCriterion("被赠送数量 >", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("被赠送数量 >=", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量LessThan(BigDecimal value) {
            addCriterion("被赠送数量 <", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("被赠送数量 <=", value, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量In(List<BigDecimal> values) {
            addCriterion("被赠送数量 in", values, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量NotIn(List<BigDecimal> values) {
            addCriterion("被赠送数量 not in", values, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("被赠送数量 between", value1, value2, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and被赠送数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("被赠送数量 not between", value1, value2, "被赠送数量");
            return (Criteria) this;
        }

        public Criteria and调整数量IsNull() {
            addCriterion("调整数量 is null");
            return (Criteria) this;
        }

        public Criteria and调整数量IsNotNull() {
            addCriterion("调整数量 is not null");
            return (Criteria) this;
        }

        public Criteria and调整数量EqualTo(BigDecimal value) {
            addCriterion("调整数量 =", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量NotEqualTo(BigDecimal value) {
            addCriterion("调整数量 <>", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量GreaterThan(BigDecimal value) {
            addCriterion("调整数量 >", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("调整数量 >=", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量LessThan(BigDecimal value) {
            addCriterion("调整数量 <", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("调整数量 <=", value, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量In(List<BigDecimal> values) {
            addCriterion("调整数量 in", values, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量NotIn(List<BigDecimal> values) {
            addCriterion("调整数量 not in", values, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("调整数量 between", value1, value2, "调整数量");
            return (Criteria) this;
        }

        public Criteria and调整数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("调整数量 not between", value1, value2, "调整数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量IsNull() {
            addCriterion("划拨数量 is null");
            return (Criteria) this;
        }

        public Criteria and划拨数量IsNotNull() {
            addCriterion("划拨数量 is not null");
            return (Criteria) this;
        }

        public Criteria and划拨数量EqualTo(BigDecimal value) {
            addCriterion("划拨数量 =", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量NotEqualTo(BigDecimal value) {
            addCriterion("划拨数量 <>", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量GreaterThan(BigDecimal value) {
            addCriterion("划拨数量 >", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("划拨数量 >=", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量LessThan(BigDecimal value) {
            addCriterion("划拨数量 <", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("划拨数量 <=", value, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量In(List<BigDecimal> values) {
            addCriterion("划拨数量 in", values, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量NotIn(List<BigDecimal> values) {
            addCriterion("划拨数量 not in", values, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("划拨数量 between", value1, value2, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and划拨数量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("划拨数量 not between", value1, value2, "划拨数量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量IsNull() {
            addCriterion("代开房消耗量 is null");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量IsNotNull() {
            addCriterion("代开房消耗量 is not null");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量EqualTo(BigDecimal value) {
            addCriterion("代开房消耗量 =", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量NotEqualTo(BigDecimal value) {
            addCriterion("代开房消耗量 <>", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量GreaterThan(BigDecimal value) {
            addCriterion("代开房消耗量 >", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("代开房消耗量 >=", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量LessThan(BigDecimal value) {
            addCriterion("代开房消耗量 <", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量LessThanOrEqualTo(BigDecimal value) {
            addCriterion("代开房消耗量 <=", value, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量In(List<BigDecimal> values) {
            addCriterion("代开房消耗量 in", values, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量NotIn(List<BigDecimal> values) {
            addCriterion("代开房消耗量 not in", values, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("代开房消耗量 between", value1, value2, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and代开房消耗量NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("代开房消耗量 not between", value1, value2, "代开房消耗量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量IsNull() {
            addCriterion("当前剩余数量 is null");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量IsNotNull() {
            addCriterion("当前剩余数量 is not null");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量EqualTo(Integer value) {
            addCriterion("当前剩余数量 =", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量NotEqualTo(Integer value) {
            addCriterion("当前剩余数量 <>", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量GreaterThan(Integer value) {
            addCriterion("当前剩余数量 >", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量GreaterThanOrEqualTo(Integer value) {
            addCriterion("当前剩余数量 >=", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量LessThan(Integer value) {
            addCriterion("当前剩余数量 <", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量LessThanOrEqualTo(Integer value) {
            addCriterion("当前剩余数量 <=", value, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量In(List<Integer> values) {
            addCriterion("当前剩余数量 in", values, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量NotIn(List<Integer> values) {
            addCriterion("当前剩余数量 not in", values, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量Between(Integer value1, Integer value2) {
            addCriterion("当前剩余数量 between", value1, value2, "当前剩余数量");
            return (Criteria) this;
        }

        public Criteria and当前剩余数量NotBetween(Integer value1, Integer value2) {
            addCriterion("当前剩余数量 not between", value1, value2, "当前剩余数量");
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