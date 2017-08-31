package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExtendExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserInfoExtendExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelIsNull() {
            addCriterion("max_vip_level is null");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelIsNotNull() {
            addCriterion("max_vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelEqualTo(Integer value) {
            addCriterion("max_vip_level =", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelNotEqualTo(Integer value) {
            addCriterion("max_vip_level <>", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelGreaterThan(Integer value) {
            addCriterion("max_vip_level >", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_vip_level >=", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelLessThan(Integer value) {
            addCriterion("max_vip_level <", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("max_vip_level <=", value, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelIn(List<Integer> values) {
            addCriterion("max_vip_level in", values, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelNotIn(List<Integer> values) {
            addCriterion("max_vip_level not in", values, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("max_vip_level between", value1, value2, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andMaxVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("max_vip_level not between", value1, value2, "maxVipLevel");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerIsNull() {
            addCriterion("is_big_customer is null");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerIsNotNull() {
            addCriterion("is_big_customer is not null");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerEqualTo(Integer value) {
            addCriterion("is_big_customer =", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerNotEqualTo(Integer value) {
            addCriterion("is_big_customer <>", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerGreaterThan(Integer value) {
            addCriterion("is_big_customer >", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_big_customer >=", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerLessThan(Integer value) {
            addCriterion("is_big_customer <", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerLessThanOrEqualTo(Integer value) {
            addCriterion("is_big_customer <=", value, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerIn(List<Integer> values) {
            addCriterion("is_big_customer in", values, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerNotIn(List<Integer> values) {
            addCriterion("is_big_customer not in", values, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerBetween(Integer value1, Integer value2) {
            addCriterion("is_big_customer between", value1, value2, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andIsBigCustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_big_customer not between", value1, value2, "isBigCustomer");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelIsNull() {
            addCriterion("financial_planner_level is null");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelIsNotNull() {
            addCriterion("financial_planner_level is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelEqualTo(Integer value) {
            addCriterion("financial_planner_level =", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotEqualTo(Integer value) {
            addCriterion("financial_planner_level <>", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelGreaterThan(Integer value) {
            addCriterion("financial_planner_level >", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("financial_planner_level >=", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelLessThan(Integer value) {
            addCriterion("financial_planner_level <", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("financial_planner_level <=", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelIn(List<Integer> values) {
            addCriterion("financial_planner_level in", values, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotIn(List<Integer> values) {
            addCriterion("financial_planner_level not in", values, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelBetween(Integer value1, Integer value2) {
            addCriterion("financial_planner_level between", value1, value2, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("financial_planner_level not between", value1, value2, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesIsNull() {
            addCriterion("vip_withdraw_times is null");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesIsNotNull() {
            addCriterion("vip_withdraw_times is not null");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesEqualTo(Integer value) {
            addCriterion("vip_withdraw_times =", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesNotEqualTo(Integer value) {
            addCriterion("vip_withdraw_times <>", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesGreaterThan(Integer value) {
            addCriterion("vip_withdraw_times >", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_withdraw_times >=", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesLessThan(Integer value) {
            addCriterion("vip_withdraw_times <", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesLessThanOrEqualTo(Integer value) {
            addCriterion("vip_withdraw_times <=", value, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesIn(List<Integer> values) {
            addCriterion("vip_withdraw_times in", values, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesNotIn(List<Integer> values) {
            addCriterion("vip_withdraw_times not in", values, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesBetween(Integer value1, Integer value2) {
            addCriterion("vip_withdraw_times between", value1, value2, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andVipWithdrawTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_withdraw_times not between", value1, value2, "vipWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesIsNull() {
            addCriterion("exchange_withdraw_times is null");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesIsNotNull() {
            addCriterion("exchange_withdraw_times is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesEqualTo(Integer value) {
            addCriterion("exchange_withdraw_times =", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesNotEqualTo(Integer value) {
            addCriterion("exchange_withdraw_times <>", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesGreaterThan(Integer value) {
            addCriterion("exchange_withdraw_times >", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_withdraw_times >=", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesLessThan(Integer value) {
            addCriterion("exchange_withdraw_times <", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_withdraw_times <=", value, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesIn(List<Integer> values) {
            addCriterion("exchange_withdraw_times in", values, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesNotIn(List<Integer> values) {
            addCriterion("exchange_withdraw_times not in", values, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesBetween(Integer value1, Integer value2) {
            addCriterion("exchange_withdraw_times between", value1, value2, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andExchangeWithdrawTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_withdraw_times not between", value1, value2, "exchangeWithdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIsNull() {
            addCriterion("withdraw_times is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIsNotNull() {
            addCriterion("withdraw_times is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesEqualTo(Integer value) {
            addCriterion("withdraw_times =", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotEqualTo(Integer value) {
            addCriterion("withdraw_times <>", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesGreaterThan(Integer value) {
            addCriterion("withdraw_times >", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_times >=", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesLessThan(Integer value) {
            addCriterion("withdraw_times <", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_times <=", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIn(List<Integer> values) {
            addCriterion("withdraw_times in", values, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotIn(List<Integer> values) {
            addCriterion("withdraw_times not in", values, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_times between", value1, value2, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_times not between", value1, value2, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysIsNull() {
            addCriterion("check_in_days is null");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysIsNotNull() {
            addCriterion("check_in_days is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysEqualTo(Integer value) {
            addCriterion("check_in_days =", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysNotEqualTo(Integer value) {
            addCriterion("check_in_days <>", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysGreaterThan(Integer value) {
            addCriterion("check_in_days >", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_days >=", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysLessThan(Integer value) {
            addCriterion("check_in_days <", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_days <=", value, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysIn(List<Integer> values) {
            addCriterion("check_in_days in", values, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysNotIn(List<Integer> values) {
            addCriterion("check_in_days not in", values, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysBetween(Integer value1, Integer value2) {
            addCriterion("check_in_days between", value1, value2, "checkInDays");
            return (Criteria) this;
        }

        public Criteria andCheckInDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_days not between", value1, value2, "checkInDays");
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

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIsNull() {
            addCriterion("gmt_creator is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIsNotNull() {
            addCriterion("gmt_creator is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorEqualTo(String value) {
            addCriterion("gmt_creator =", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotEqualTo(String value) {
            addCriterion("gmt_creator <>", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorGreaterThan(String value) {
            addCriterion("gmt_creator >", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_creator >=", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLessThan(String value) {
            addCriterion("gmt_creator <", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLessThanOrEqualTo(String value) {
            addCriterion("gmt_creator <=", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLike(String value) {
            addCriterion("gmt_creator like", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotLike(String value) {
            addCriterion("gmt_creator not like", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIn(List<String> values) {
            addCriterion("gmt_creator in", values, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotIn(List<String> values) {
            addCriterion("gmt_creator not in", values, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorBetween(String value1, String value2) {
            addCriterion("gmt_creator between", value1, value2, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotBetween(String value1, String value2) {
            addCriterion("gmt_creator not between", value1, value2, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIsNull() {
            addCriterion("gmt_modifier is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIsNotNull() {
            addCriterion("gmt_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifierEqualTo(String value) {
            addCriterion("gmt_modifier =", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotEqualTo(String value) {
            addCriterion("gmt_modifier <>", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierGreaterThan(String value) {
            addCriterion("gmt_modifier >", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modifier >=", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLessThan(String value) {
            addCriterion("gmt_modifier <", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLessThanOrEqualTo(String value) {
            addCriterion("gmt_modifier <=", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLike(String value) {
            addCriterion("gmt_modifier like", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotLike(String value) {
            addCriterion("gmt_modifier not like", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIn(List<String> values) {
            addCriterion("gmt_modifier in", values, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotIn(List<String> values) {
            addCriterion("gmt_modifier not in", values, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierBetween(String value1, String value2) {
            addCriterion("gmt_modifier between", value1, value2, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotBetween(String value1, String value2) {
            addCriterion("gmt_modifier not between", value1, value2, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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