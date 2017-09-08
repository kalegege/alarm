package com.wasu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QunZhuyjDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QunZhuyjDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNull() {
            addCriterion("op_date is null");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNotNull() {
            addCriterion("op_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpDateEqualTo(Date value) {
            addCriterionForJDBCDate("op_date =", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("op_date <>", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("op_date >", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("op_date >=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThan(Date value) {
            addCriterionForJDBCDate("op_date <", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("op_date <=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateIn(List<Date> values) {
            addCriterionForJDBCDate("op_date in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("op_date not in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("op_date between", value1, value2, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("op_date not between", value1, value2, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Integer value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Integer value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Integer value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Integer value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Integer> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Integer> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Integer value1, Integer value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_id not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNull() {
            addCriterion("op_name is null");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNotNull() {
            addCriterion("op_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpNameEqualTo(String value) {
            addCriterion("op_name =", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotEqualTo(String value) {
            addCriterion("op_name <>", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThan(String value) {
            addCriterion("op_name >", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("op_name >=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThan(String value) {
            addCriterion("op_name <", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThanOrEqualTo(String value) {
            addCriterion("op_name <=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLike(String value) {
            addCriterion("op_name like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotLike(String value) {
            addCriterion("op_name not like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameIn(List<String> values) {
            addCriterion("op_name in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotIn(List<String> values) {
            addCriterion("op_name not in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameBetween(String value1, String value2) {
            addCriterion("op_name between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotBetween(String value1, String value2) {
            addCriterion("op_name not between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNull() {
            addCriterion("trade_num is null");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNotNull() {
            addCriterion("trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNumEqualTo(Integer value) {
            addCriterion("trade_num =", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotEqualTo(Integer value) {
            addCriterion("trade_num <>", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThan(Integer value) {
            addCriterion("trade_num >", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_num >=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThan(Integer value) {
            addCriterion("trade_num <", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThanOrEqualTo(Integer value) {
            addCriterion("trade_num <=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumIn(List<Integer> values) {
            addCriterion("trade_num in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotIn(List<Integer> values) {
            addCriterion("trade_num not in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumBetween(Integer value1, Integer value2) {
            addCriterion("trade_num between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_num not between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIsNull() {
            addCriterion("discount_num is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIsNotNull() {
            addCriterion("discount_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNumEqualTo(Integer value) {
            addCriterion("discount_num =", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotEqualTo(Integer value) {
            addCriterion("discount_num <>", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumGreaterThan(Integer value) {
            addCriterion("discount_num >", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_num >=", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumLessThan(Integer value) {
            addCriterion("discount_num <", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumLessThanOrEqualTo(Integer value) {
            addCriterion("discount_num <=", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIn(List<Integer> values) {
            addCriterion("discount_num in", values, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotIn(List<Integer> values) {
            addCriterion("discount_num not in", values, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumBetween(Integer value1, Integer value2) {
            addCriterion("discount_num between", value1, value2, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_num not between", value1, value2, "discountNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIsNull() {
            addCriterion("adjustment_num is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIsNotNull() {
            addCriterion("adjustment_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumEqualTo(Integer value) {
            addCriterion("adjustment_num =", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotEqualTo(Integer value) {
            addCriterion("adjustment_num <>", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumGreaterThan(Integer value) {
            addCriterion("adjustment_num >", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjustment_num >=", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumLessThan(Integer value) {
            addCriterion("adjustment_num <", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumLessThanOrEqualTo(Integer value) {
            addCriterion("adjustment_num <=", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIn(List<Integer> values) {
            addCriterion("adjustment_num in", values, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotIn(List<Integer> values) {
            addCriterion("adjustment_num not in", values, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumBetween(Integer value1, Integer value2) {
            addCriterion("adjustment_num between", value1, value2, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("adjustment_num not between", value1, value2, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumIsNull() {
            addCriterion("transfer_num is null");
            return (Criteria) this;
        }

        public Criteria andTransferNumIsNotNull() {
            addCriterion("transfer_num is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNumEqualTo(Integer value) {
            addCriterion("transfer_num =", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumNotEqualTo(Integer value) {
            addCriterion("transfer_num <>", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumGreaterThan(Integer value) {
            addCriterion("transfer_num >", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_num >=", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumLessThan(Integer value) {
            addCriterion("transfer_num <", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_num <=", value, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumIn(List<Integer> values) {
            addCriterion("transfer_num in", values, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumNotIn(List<Integer> values) {
            addCriterion("transfer_num not in", values, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumBetween(Integer value1, Integer value2) {
            addCriterion("transfer_num between", value1, value2, "transferNum");
            return (Criteria) this;
        }

        public Criteria andTransferNumNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_num not between", value1, value2, "transferNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumIsNull() {
            addCriterion("openroo_num is null");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumIsNotNull() {
            addCriterion("openroo_num is not null");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumEqualTo(Integer value) {
            addCriterion("openroo_num =", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumNotEqualTo(Integer value) {
            addCriterion("openroo_num <>", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumGreaterThan(Integer value) {
            addCriterion("openroo_num >", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("openroo_num >=", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumLessThan(Integer value) {
            addCriterion("openroo_num <", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumLessThanOrEqualTo(Integer value) {
            addCriterion("openroo_num <=", value, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumIn(List<Integer> values) {
            addCriterion("openroo_num in", values, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumNotIn(List<Integer> values) {
            addCriterion("openroo_num not in", values, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumBetween(Integer value1, Integer value2) {
            addCriterion("openroo_num between", value1, value2, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andOpenrooNumNotBetween(Integer value1, Integer value2) {
            addCriterion("openroo_num not between", value1, value2, "openrooNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumIsNull() {
            addCriterion("remaining_num is null");
            return (Criteria) this;
        }

        public Criteria andRemainingNumIsNotNull() {
            addCriterion("remaining_num is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingNumEqualTo(Integer value) {
            addCriterion("remaining_num =", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumNotEqualTo(Integer value) {
            addCriterion("remaining_num <>", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumGreaterThan(Integer value) {
            addCriterion("remaining_num >", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_num >=", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumLessThan(Integer value) {
            addCriterion("remaining_num <", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_num <=", value, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumIn(List<Integer> values) {
            addCriterion("remaining_num in", values, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumNotIn(List<Integer> values) {
            addCriterion("remaining_num not in", values, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumBetween(Integer value1, Integer value2) {
            addCriterion("remaining_num between", value1, value2, "remainingNum");
            return (Criteria) this;
        }

        public Criteria andRemainingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_num not between", value1, value2, "remainingNum");
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