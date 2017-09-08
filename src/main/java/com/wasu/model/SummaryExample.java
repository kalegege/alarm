package com.wasu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SummaryExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andNumDevelopIsNull() {
            addCriterion("num_develop is null");
            return (Criteria) this;
        }

        public Criteria andNumDevelopIsNotNull() {
            addCriterion("num_develop is not null");
            return (Criteria) this;
        }

        public Criteria andNumDevelopEqualTo(Integer value) {
            addCriterion("num_develop =", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopNotEqualTo(Integer value) {
            addCriterion("num_develop <>", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopGreaterThan(Integer value) {
            addCriterion("num_develop >", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_develop >=", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopLessThan(Integer value) {
            addCriterion("num_develop <", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopLessThanOrEqualTo(Integer value) {
            addCriterion("num_develop <=", value, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopIn(List<Integer> values) {
            addCriterion("num_develop in", values, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopNotIn(List<Integer> values) {
            addCriterion("num_develop not in", values, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopBetween(Integer value1, Integer value2) {
            addCriterion("num_develop between", value1, value2, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumDevelopNotBetween(Integer value1, Integer value2) {
            addCriterion("num_develop not between", value1, value2, "numDevelop");
            return (Criteria) this;
        }

        public Criteria andNumBuyIsNull() {
            addCriterion("num_buy is null");
            return (Criteria) this;
        }

        public Criteria andNumBuyIsNotNull() {
            addCriterion("num_buy is not null");
            return (Criteria) this;
        }

        public Criteria andNumBuyEqualTo(Integer value) {
            addCriterion("num_buy =", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyNotEqualTo(Integer value) {
            addCriterion("num_buy <>", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyGreaterThan(Integer value) {
            addCriterion("num_buy >", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_buy >=", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyLessThan(Integer value) {
            addCriterion("num_buy <", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyLessThanOrEqualTo(Integer value) {
            addCriterion("num_buy <=", value, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyIn(List<Integer> values) {
            addCriterion("num_buy in", values, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyNotIn(List<Integer> values) {
            addCriterion("num_buy not in", values, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyBetween(Integer value1, Integer value2) {
            addCriterion("num_buy between", value1, value2, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("num_buy not between", value1, value2, "numBuy");
            return (Criteria) this;
        }

        public Criteria andNumSendIsNull() {
            addCriterion("num_send is null");
            return (Criteria) this;
        }

        public Criteria andNumSendIsNotNull() {
            addCriterion("num_send is not null");
            return (Criteria) this;
        }

        public Criteria andNumSendEqualTo(Integer value) {
            addCriterion("num_send =", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendNotEqualTo(Integer value) {
            addCriterion("num_send <>", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendGreaterThan(Integer value) {
            addCriterion("num_send >", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_send >=", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendLessThan(Integer value) {
            addCriterion("num_send <", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendLessThanOrEqualTo(Integer value) {
            addCriterion("num_send <=", value, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendIn(List<Integer> values) {
            addCriterion("num_send in", values, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendNotIn(List<Integer> values) {
            addCriterion("num_send not in", values, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendBetween(Integer value1, Integer value2) {
            addCriterion("num_send between", value1, value2, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumSendNotBetween(Integer value1, Integer value2) {
            addCriterion("num_send not between", value1, value2, "numSend");
            return (Criteria) this;
        }

        public Criteria andNumArrangeIsNull() {
            addCriterion("num_arrange is null");
            return (Criteria) this;
        }

        public Criteria andNumArrangeIsNotNull() {
            addCriterion("num_arrange is not null");
            return (Criteria) this;
        }

        public Criteria andNumArrangeEqualTo(Integer value) {
            addCriterion("num_arrange =", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeNotEqualTo(Integer value) {
            addCriterion("num_arrange <>", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeGreaterThan(Integer value) {
            addCriterion("num_arrange >", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_arrange >=", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeLessThan(Integer value) {
            addCriterion("num_arrange <", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeLessThanOrEqualTo(Integer value) {
            addCriterion("num_arrange <=", value, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeIn(List<Integer> values) {
            addCriterion("num_arrange in", values, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeNotIn(List<Integer> values) {
            addCriterion("num_arrange not in", values, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeBetween(Integer value1, Integer value2) {
            addCriterion("num_arrange between", value1, value2, "numArrange");
            return (Criteria) this;
        }

        public Criteria andNumArrangeNotBetween(Integer value1, Integer value2) {
            addCriterion("num_arrange not between", value1, value2, "numArrange");
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