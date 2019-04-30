package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantCapitalAlloRecordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantCapitalAlloRecordQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlloNoIsNull() {
            addCriterion("ALLO_NO is null");
            return (Criteria) this;
        }

        public Criteria andAlloNoIsNotNull() {
            addCriterion("ALLO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAlloNoEqualTo(String value) {
            addCriterion("ALLO_NO =", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoNotEqualTo(String value) {
            addCriterion("ALLO_NO <>", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoGreaterThan(String value) {
            addCriterion("ALLO_NO >", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoGreaterThanOrEqualTo(String value) {
            addCriterion("ALLO_NO >=", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoLessThan(String value) {
            addCriterion("ALLO_NO <", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoLessThanOrEqualTo(String value) {
            addCriterion("ALLO_NO <=", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoLike(String value) {
            addCriterion("ALLO_NO like", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoNotLike(String value) {
            addCriterion("ALLO_NO not like", value, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoIn(List<String> values) {
            addCriterion("ALLO_NO in", values, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoNotIn(List<String> values) {
            addCriterion("ALLO_NO not in", values, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoBetween(String value1, String value2) {
            addCriterion("ALLO_NO between", value1, value2, "alloNo");
            return (Criteria) this;
        }

        public Criteria andAlloNoNotBetween(String value1, String value2) {
            addCriterion("ALLO_NO not between", value1, value2, "alloNo");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Long value) {
            addCriterion("MERCHANT_ID =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Long value) {
            addCriterion("MERCHANT_ID <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Long value) {
            addCriterion("MERCHANT_ID >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MERCHANT_ID >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Long value) {
            addCriterion("MERCHANT_ID <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("MERCHANT_ID <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Long> values) {
            addCriterion("MERCHANT_ID in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Long> values) {
            addCriterion("MERCHANT_ID not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Long value1, Long value2) {
            addCriterion("MERCHANT_ID between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("MERCHANT_ID not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorIsNull() {
            addCriterion("REQUEST_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorIsNotNull() {
            addCriterion("REQUEST_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorEqualTo(String value) {
            addCriterion("REQUEST_OPERATOR =", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorNotEqualTo(String value) {
            addCriterion("REQUEST_OPERATOR <>", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorGreaterThan(String value) {
            addCriterion("REQUEST_OPERATOR >", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_OPERATOR >=", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorLessThan(String value) {
            addCriterion("REQUEST_OPERATOR <", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_OPERATOR <=", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorLike(String value) {
            addCriterion("REQUEST_OPERATOR like", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorNotLike(String value) {
            addCriterion("REQUEST_OPERATOR not like", value, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorIn(List<String> values) {
            addCriterion("REQUEST_OPERATOR in", values, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorNotIn(List<String> values) {
            addCriterion("REQUEST_OPERATOR not in", values, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorBetween(String value1, String value2) {
            addCriterion("REQUEST_OPERATOR between", value1, value2, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestOperatorNotBetween(String value1, String value2) {
            addCriterion("REQUEST_OPERATOR not between", value1, value2, "requestOperator");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNull() {
            addCriterion("REQUEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNotNull() {
            addCriterion("REQUEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeEqualTo(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME =", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME <>", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME >", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME >=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThan(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME <", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REQUEST_TIME <=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIn(List<Date> values) {
            addCriterionForJDBCDate("REQUEST_TIME in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REQUEST_TIME not in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REQUEST_TIME between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REQUEST_TIME not between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorIsNull() {
            addCriterion("CONFIRM_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorIsNotNull() {
            addCriterion("CONFIRM_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorEqualTo(String value) {
            addCriterion("CONFIRM_OPERATOR =", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorNotEqualTo(String value) {
            addCriterion("CONFIRM_OPERATOR <>", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorGreaterThan(String value) {
            addCriterion("CONFIRM_OPERATOR >", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_OPERATOR >=", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorLessThan(String value) {
            addCriterion("CONFIRM_OPERATOR <", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_OPERATOR <=", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorLike(String value) {
            addCriterion("CONFIRM_OPERATOR like", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorNotLike(String value) {
            addCriterion("CONFIRM_OPERATOR not like", value, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorIn(List<String> values) {
            addCriterion("CONFIRM_OPERATOR in", values, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorNotIn(List<String> values) {
            addCriterion("CONFIRM_OPERATOR not in", values, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorBetween(String value1, String value2) {
            addCriterion("CONFIRM_OPERATOR between", value1, value2, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmOperatorNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_OPERATOR not between", value1, value2, "confirmOperator");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEAL_TIME >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_TIME in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_TIME not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_TIME between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_TIME not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNull() {
            addCriterion("TOTAL_SUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNotNull() {
            addCriterion("TOTAL_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSumEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUM =", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUM <>", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_SUM >", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUM >=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThan(BigDecimal value) {
            addCriterion("TOTAL_SUM <", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUM <=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SUM in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SUM not in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SUM between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SUM not between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andValidCountIsNull() {
            addCriterion("VALID_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andValidCountIsNotNull() {
            addCriterion("VALID_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andValidCountEqualTo(Integer value) {
            addCriterion("VALID_COUNT =", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotEqualTo(Integer value) {
            addCriterion("VALID_COUNT <>", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountGreaterThan(Integer value) {
            addCriterion("VALID_COUNT >", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("VALID_COUNT >=", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountLessThan(Integer value) {
            addCriterion("VALID_COUNT <", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountLessThanOrEqualTo(Integer value) {
            addCriterion("VALID_COUNT <=", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountIn(List<Integer> values) {
            addCriterion("VALID_COUNT in", values, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotIn(List<Integer> values) {
            addCriterion("VALID_COUNT not in", values, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountBetween(Integer value1, Integer value2) {
            addCriterion("VALID_COUNT between", value1, value2, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("VALID_COUNT not between", value1, value2, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidSumIsNull() {
            addCriterion("VALID_SUM is null");
            return (Criteria) this;
        }

        public Criteria andValidSumIsNotNull() {
            addCriterion("VALID_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andValidSumEqualTo(BigDecimal value) {
            addCriterion("VALID_SUM =", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumNotEqualTo(BigDecimal value) {
            addCriterion("VALID_SUM <>", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumGreaterThan(BigDecimal value) {
            addCriterion("VALID_SUM >", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_SUM >=", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumLessThan(BigDecimal value) {
            addCriterion("VALID_SUM <", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_SUM <=", value, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumIn(List<BigDecimal> values) {
            addCriterion("VALID_SUM in", values, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumNotIn(List<BigDecimal> values) {
            addCriterion("VALID_SUM not in", values, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_SUM between", value1, value2, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_SUM not between", value1, value2, "validSum");
            return (Criteria) this;
        }

        public Criteria andValidFeeIsNull() {
            addCriterion("VALID_FEE is null");
            return (Criteria) this;
        }

        public Criteria andValidFeeIsNotNull() {
            addCriterion("VALID_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andValidFeeEqualTo(BigDecimal value) {
            addCriterion("VALID_FEE =", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeNotEqualTo(BigDecimal value) {
            addCriterion("VALID_FEE <>", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeGreaterThan(BigDecimal value) {
            addCriterion("VALID_FEE >", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_FEE >=", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeLessThan(BigDecimal value) {
            addCriterion("VALID_FEE <", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_FEE <=", value, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeIn(List<BigDecimal> values) {
            addCriterion("VALID_FEE in", values, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeNotIn(List<BigDecimal> values) {
            addCriterion("VALID_FEE not in", values, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_FEE between", value1, value2, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_FEE not between", value1, value2, "validFee");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumIsNull() {
            addCriterion("VALID_DEDUCT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumIsNotNull() {
            addCriterion("VALID_DEDUCT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumEqualTo(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM =", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumNotEqualTo(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM <>", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumGreaterThan(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM >", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM >=", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumLessThan(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM <", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_DEDUCT_SUM <=", value, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumIn(List<BigDecimal> values) {
            addCriterion("VALID_DEDUCT_SUM in", values, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumNotIn(List<BigDecimal> values) {
            addCriterion("VALID_DEDUCT_SUM not in", values, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_DEDUCT_SUM between", value1, value2, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andValidDeductSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_DEDUCT_SUM not between", value1, value2, "validDeductSum");
            return (Criteria) this;
        }

        public Criteria andSecceedCountIsNull() {
            addCriterion("SECCEED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSecceedCountIsNotNull() {
            addCriterion("SECCEED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSecceedCountEqualTo(Integer value) {
            addCriterion("SECCEED_COUNT =", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountNotEqualTo(Integer value) {
            addCriterion("SECCEED_COUNT <>", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountGreaterThan(Integer value) {
            addCriterion("SECCEED_COUNT >", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECCEED_COUNT >=", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountLessThan(Integer value) {
            addCriterion("SECCEED_COUNT <", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountLessThanOrEqualTo(Integer value) {
            addCriterion("SECCEED_COUNT <=", value, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountIn(List<Integer> values) {
            addCriterion("SECCEED_COUNT in", values, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountNotIn(List<Integer> values) {
            addCriterion("SECCEED_COUNT not in", values, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountBetween(Integer value1, Integer value2) {
            addCriterion("SECCEED_COUNT between", value1, value2, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SECCEED_COUNT not between", value1, value2, "secceedCount");
            return (Criteria) this;
        }

        public Criteria andSecceedSumIsNull() {
            addCriterion("SECCEED_SUM is null");
            return (Criteria) this;
        }

        public Criteria andSecceedSumIsNotNull() {
            addCriterion("SECCEED_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSecceedSumEqualTo(BigDecimal value) {
            addCriterion("SECCEED_SUM =", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumNotEqualTo(BigDecimal value) {
            addCriterion("SECCEED_SUM <>", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumGreaterThan(BigDecimal value) {
            addCriterion("SECCEED_SUM >", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECCEED_SUM >=", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumLessThan(BigDecimal value) {
            addCriterion("SECCEED_SUM <", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECCEED_SUM <=", value, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumIn(List<BigDecimal> values) {
            addCriterion("SECCEED_SUM in", values, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumNotIn(List<BigDecimal> values) {
            addCriterion("SECCEED_SUM not in", values, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECCEED_SUM between", value1, value2, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECCEED_SUM not between", value1, value2, "secceedSum");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeIsNull() {
            addCriterion("SECCEED_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeIsNotNull() {
            addCriterion("SECCEED_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeEqualTo(BigDecimal value) {
            addCriterion("SECCEED_FEE =", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeNotEqualTo(BigDecimal value) {
            addCriterion("SECCEED_FEE <>", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeGreaterThan(BigDecimal value) {
            addCriterion("SECCEED_FEE >", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECCEED_FEE >=", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeLessThan(BigDecimal value) {
            addCriterion("SECCEED_FEE <", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECCEED_FEE <=", value, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeIn(List<BigDecimal> values) {
            addCriterion("SECCEED_FEE in", values, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeNotIn(List<BigDecimal> values) {
            addCriterion("SECCEED_FEE not in", values, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECCEED_FEE between", value1, value2, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andSecceedFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECCEED_FEE not between", value1, value2, "secceedFee");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("CHARGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("CHARGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(Integer value) {
            addCriterion("CHARGE_TYPE =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(Integer value) {
            addCriterion("CHARGE_TYPE <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(Integer value) {
            addCriterion("CHARGE_TYPE >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_TYPE >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(Integer value) {
            addCriterion("CHARGE_TYPE <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_TYPE <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<Integer> values) {
            addCriterion("CHARGE_TYPE in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<Integer> values) {
            addCriterion("CHARGE_TYPE not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_TYPE between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_TYPE not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeIsNull() {
            addCriterion("ALLO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlloTypeIsNotNull() {
            addCriterion("ALLO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlloTypeEqualTo(Integer value) {
            addCriterion("ALLO_TYPE =", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeNotEqualTo(Integer value) {
            addCriterion("ALLO_TYPE <>", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeGreaterThan(Integer value) {
            addCriterion("ALLO_TYPE >", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALLO_TYPE >=", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeLessThan(Integer value) {
            addCriterion("ALLO_TYPE <", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ALLO_TYPE <=", value, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeIn(List<Integer> values) {
            addCriterion("ALLO_TYPE in", values, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeNotIn(List<Integer> values) {
            addCriterion("ALLO_TYPE not in", values, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeBetween(Integer value1, Integer value2) {
            addCriterion("ALLO_TYPE between", value1, value2, "alloType");
            return (Criteria) this;
        }

        public Criteria andAlloTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ALLO_TYPE not between", value1, value2, "alloType");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNull() {
            addCriterion("FAIL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNotNull() {
            addCriterion("FAIL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonEqualTo(String value) {
            addCriterion("FAIL_REASON =", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotEqualTo(String value) {
            addCriterion("FAIL_REASON <>", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThan(String value) {
            addCriterion("FAIL_REASON >", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FAIL_REASON >=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThan(String value) {
            addCriterion("FAIL_REASON <", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThanOrEqualTo(String value) {
            addCriterion("FAIL_REASON <=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLike(String value) {
            addCriterion("FAIL_REASON like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotLike(String value) {
            addCriterion("FAIL_REASON not like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonIn(List<String> values) {
            addCriterion("FAIL_REASON in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotIn(List<String> values) {
            addCriterion("FAIL_REASON not in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonBetween(String value1, String value2) {
            addCriterion("FAIL_REASON between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotBetween(String value1, String value2) {
            addCriterion("FAIL_REASON not between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFld1IsNull() {
            addCriterion("FLD1 is null");
            return (Criteria) this;
        }

        public Criteria andFld1IsNotNull() {
            addCriterion("FLD1 is not null");
            return (Criteria) this;
        }

        public Criteria andFld1EqualTo(String value) {
            addCriterion("FLD1 =", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1NotEqualTo(String value) {
            addCriterion("FLD1 <>", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1GreaterThan(String value) {
            addCriterion("FLD1 >", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1GreaterThanOrEqualTo(String value) {
            addCriterion("FLD1 >=", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1LessThan(String value) {
            addCriterion("FLD1 <", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1LessThanOrEqualTo(String value) {
            addCriterion("FLD1 <=", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1Like(String value) {
            addCriterion("FLD1 like", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1NotLike(String value) {
            addCriterion("FLD1 not like", value, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1In(List<String> values) {
            addCriterion("FLD1 in", values, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1NotIn(List<String> values) {
            addCriterion("FLD1 not in", values, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1Between(String value1, String value2) {
            addCriterion("FLD1 between", value1, value2, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld1NotBetween(String value1, String value2) {
            addCriterion("FLD1 not between", value1, value2, "fld1");
            return (Criteria) this;
        }

        public Criteria andFld2IsNull() {
            addCriterion("FLD2 is null");
            return (Criteria) this;
        }

        public Criteria andFld2IsNotNull() {
            addCriterion("FLD2 is not null");
            return (Criteria) this;
        }

        public Criteria andFld2EqualTo(String value) {
            addCriterion("FLD2 =", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2NotEqualTo(String value) {
            addCriterion("FLD2 <>", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2GreaterThan(String value) {
            addCriterion("FLD2 >", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2GreaterThanOrEqualTo(String value) {
            addCriterion("FLD2 >=", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2LessThan(String value) {
            addCriterion("FLD2 <", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2LessThanOrEqualTo(String value) {
            addCriterion("FLD2 <=", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2Like(String value) {
            addCriterion("FLD2 like", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2NotLike(String value) {
            addCriterion("FLD2 not like", value, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2In(List<String> values) {
            addCriterion("FLD2 in", values, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2NotIn(List<String> values) {
            addCriterion("FLD2 not in", values, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2Between(String value1, String value2) {
            addCriterion("FLD2 between", value1, value2, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld2NotBetween(String value1, String value2) {
            addCriterion("FLD2 not between", value1, value2, "fld2");
            return (Criteria) this;
        }

        public Criteria andFld3IsNull() {
            addCriterion("FLD3 is null");
            return (Criteria) this;
        }

        public Criteria andFld3IsNotNull() {
            addCriterion("FLD3 is not null");
            return (Criteria) this;
        }

        public Criteria andFld3EqualTo(String value) {
            addCriterion("FLD3 =", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3NotEqualTo(String value) {
            addCriterion("FLD3 <>", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3GreaterThan(String value) {
            addCriterion("FLD3 >", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3GreaterThanOrEqualTo(String value) {
            addCriterion("FLD3 >=", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3LessThan(String value) {
            addCriterion("FLD3 <", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3LessThanOrEqualTo(String value) {
            addCriterion("FLD3 <=", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3Like(String value) {
            addCriterion("FLD3 like", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3NotLike(String value) {
            addCriterion("FLD3 not like", value, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3In(List<String> values) {
            addCriterion("FLD3 in", values, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3NotIn(List<String> values) {
            addCriterion("FLD3 not in", values, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3Between(String value1, String value2) {
            addCriterion("FLD3 between", value1, value2, "fld3");
            return (Criteria) this;
        }

        public Criteria andFld3NotBetween(String value1, String value2) {
            addCriterion("FLD3 not between", value1, value2, "fld3");
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