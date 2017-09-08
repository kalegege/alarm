package com.wasu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andBankerIsNull() {
            addCriterion("banker is null");
            return (Criteria) this;
        }

        public Criteria andBankerIsNotNull() {
            addCriterion("banker is not null");
            return (Criteria) this;
        }

        public Criteria andBankerEqualTo(Integer value) {
            addCriterion("banker =", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerNotEqualTo(Integer value) {
            addCriterion("banker <>", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerGreaterThan(Integer value) {
            addCriterion("banker >", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerGreaterThanOrEqualTo(Integer value) {
            addCriterion("banker >=", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerLessThan(Integer value) {
            addCriterion("banker <", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerLessThanOrEqualTo(Integer value) {
            addCriterion("banker <=", value, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerIn(List<Integer> values) {
            addCriterion("banker in", values, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerNotIn(List<Integer> values) {
            addCriterion("banker not in", values, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerBetween(Integer value1, Integer value2) {
            addCriterion("banker between", value1, value2, "banker");
            return (Criteria) this;
        }

        public Criteria andBankerNotBetween(Integer value1, Integer value2) {
            addCriterion("banker not between", value1, value2, "banker");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIsNull() {
            addCriterion("current_round is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIsNotNull() {
            addCriterion("current_round is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundEqualTo(Integer value) {
            addCriterion("current_round =", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundNotEqualTo(Integer value) {
            addCriterion("current_round <>", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundGreaterThan(Integer value) {
            addCriterion("current_round >", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_round >=", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundLessThan(Integer value) {
            addCriterion("current_round <", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundLessThanOrEqualTo(Integer value) {
            addCriterion("current_round <=", value, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundIn(List<Integer> values) {
            addCriterion("current_round in", values, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundNotIn(List<Integer> values) {
            addCriterion("current_round not in", values, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundBetween(Integer value1, Integer value2) {
            addCriterion("current_round between", value1, value2, "currentRound");
            return (Criteria) this;
        }

        public Criteria andCurrentRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("current_round not between", value1, value2, "currentRound");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeIsNull() {
            addCriterion("destroy_time is null");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeIsNotNull() {
            addCriterion("destroy_time is not null");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeEqualTo(Date value) {
            addCriterion("destroy_time =", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeNotEqualTo(Date value) {
            addCriterion("destroy_time <>", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeGreaterThan(Date value) {
            addCriterion("destroy_time >", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("destroy_time >=", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeLessThan(Date value) {
            addCriterion("destroy_time <", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeLessThanOrEqualTo(Date value) {
            addCriterion("destroy_time <=", value, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeIn(List<Date> values) {
            addCriterion("destroy_time in", values, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeNotIn(List<Date> values) {
            addCriterion("destroy_time not in", values, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeBetween(Date value1, Date value2) {
            addCriterion("destroy_time between", value1, value2, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andDestroyTimeNotBetween(Date value1, Date value2) {
            addCriterion("destroy_time not between", value1, value2, "destroyTime");
            return (Criteria) this;
        }

        public Criteria andEndPointIsNull() {
            addCriterion("end_point is null");
            return (Criteria) this;
        }

        public Criteria andEndPointIsNotNull() {
            addCriterion("end_point is not null");
            return (Criteria) this;
        }

        public Criteria andEndPointEqualTo(Integer value) {
            addCriterion("end_point =", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotEqualTo(Integer value) {
            addCriterion("end_point <>", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointGreaterThan(Integer value) {
            addCriterion("end_point >", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_point >=", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointLessThan(Integer value) {
            addCriterion("end_point <", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointLessThanOrEqualTo(Integer value) {
            addCriterion("end_point <=", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointIn(List<Integer> values) {
            addCriterion("end_point in", values, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotIn(List<Integer> values) {
            addCriterion("end_point not in", values, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointBetween(Integer value1, Integer value2) {
            addCriterion("end_point between", value1, value2, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotBetween(Integer value1, Integer value2) {
            addCriterion("end_point not between", value1, value2, "endPoint");
            return (Criteria) this;
        }

        public Criteria andOpenCountIsNull() {
            addCriterion("open_count is null");
            return (Criteria) this;
        }

        public Criteria andOpenCountIsNotNull() {
            addCriterion("open_count is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCountEqualTo(Integer value) {
            addCriterion("open_count =", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountNotEqualTo(Integer value) {
            addCriterion("open_count <>", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountGreaterThan(Integer value) {
            addCriterion("open_count >", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_count >=", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountLessThan(Integer value) {
            addCriterion("open_count <", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountLessThanOrEqualTo(Integer value) {
            addCriterion("open_count <=", value, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountIn(List<Integer> values) {
            addCriterion("open_count in", values, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountNotIn(List<Integer> values) {
            addCriterion("open_count not in", values, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountBetween(Integer value1, Integer value2) {
            addCriterion("open_count between", value1, value2, "openCount");
            return (Criteria) this;
        }

        public Criteria andOpenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("open_count not between", value1, value2, "openCount");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPlayerNumIsNull() {
            addCriterion("player_num is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNumIsNotNull() {
            addCriterion("player_num is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNumEqualTo(Integer value) {
            addCriterion("player_num =", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumNotEqualTo(Integer value) {
            addCriterion("player_num <>", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumGreaterThan(Integer value) {
            addCriterion("player_num >", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_num >=", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumLessThan(Integer value) {
            addCriterion("player_num <", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumLessThanOrEqualTo(Integer value) {
            addCriterion("player_num <=", value, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumIn(List<Integer> values) {
            addCriterion("player_num in", values, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumNotIn(List<Integer> values) {
            addCriterion("player_num not in", values, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumBetween(Integer value1, Integer value2) {
            addCriterion("player_num between", value1, value2, "playerNum");
            return (Criteria) this;
        }

        public Criteria andPlayerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("player_num not between", value1, value2, "playerNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoundIsNull() {
            addCriterion("round is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("round is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(Integer value) {
            addCriterion("round =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(Integer value) {
            addCriterion("round <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(Integer value) {
            addCriterion("round >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("round >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(Integer value) {
            addCriterion("round <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(Integer value) {
            addCriterion("round <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<Integer> values) {
            addCriterion("round in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<Integer> values) {
            addCriterion("round not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(Integer value1, Integer value2) {
            addCriterion("round between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("round not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRuleIsNull() {
            addCriterion("rule is null");
            return (Criteria) this;
        }

        public Criteria andRuleIsNotNull() {
            addCriterion("rule is not null");
            return (Criteria) this;
        }

        public Criteria andRuleEqualTo(String value) {
            addCriterion("rule =", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(String value) {
            addCriterion("rule <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(String value) {
            addCriterion("rule >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(String value) {
            addCriterion("rule >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(String value) {
            addCriterion("rule <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(String value) {
            addCriterion("rule <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLike(String value) {
            addCriterion("rule like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotLike(String value) {
            addCriterion("rule not like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleIn(List<String> values) {
            addCriterion("rule in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotIn(List<String> values) {
            addCriterion("rule not in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleBetween(String value1, String value2) {
            addCriterion("rule between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotBetween(String value1, String value2) {
            addCriterion("rule not between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdIsNull() {
            addCriterion("destroy_id is null");
            return (Criteria) this;
        }

        public Criteria andDestroyIdIsNotNull() {
            addCriterion("destroy_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestroyIdEqualTo(Long value) {
            addCriterion("destroy_id =", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdNotEqualTo(Long value) {
            addCriterion("destroy_id <>", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdGreaterThan(Long value) {
            addCriterion("destroy_id >", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("destroy_id >=", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdLessThan(Long value) {
            addCriterion("destroy_id <", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdLessThanOrEqualTo(Long value) {
            addCriterion("destroy_id <=", value, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdIn(List<Long> values) {
            addCriterion("destroy_id in", values, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdNotIn(List<Long> values) {
            addCriterion("destroy_id not in", values, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdBetween(Long value1, Long value2) {
            addCriterion("destroy_id between", value1, value2, "destroyId");
            return (Criteria) this;
        }

        public Criteria andDestroyIdNotBetween(Long value1, Long value2) {
            addCriterion("destroy_id not between", value1, value2, "destroyId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
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