package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantCapitalPaidRequestQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantCapitalPaidRequestQuery() {
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

        public Criteria andRequestIdIsNull() {
            addCriterion("REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("REQUEST_ID =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("REQUEST_ID <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("REQUEST_ID >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("REQUEST_ID <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("REQUEST_ID like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("REQUEST_ID not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("REQUEST_ID in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("REQUEST_ID not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("REQUEST_ID between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("REQUEST_ID not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNull() {
            addCriterion("MERCHANT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNotNull() {
            addCriterion("MERCHANT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeEqualTo(String value) {
            addCriterion("MERCHANT_CODE =", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotEqualTo(String value) {
            addCriterion("MERCHANT_CODE <>", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThan(String value) {
            addCriterion("MERCHANT_CODE >", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CODE >=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThan(String value) {
            addCriterion("MERCHANT_CODE <", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CODE <=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLike(String value) {
            addCriterion("MERCHANT_CODE like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotLike(String value) {
            addCriterion("MERCHANT_CODE not like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIn(List<String> values) {
            addCriterion("MERCHANT_CODE in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotIn(List<String> values) {
            addCriterion("MERCHANT_CODE not in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeBetween(String value1, String value2) {
            addCriterion("MERCHANT_CODE between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_CODE not between", value1, value2, "merchantCode");
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

        public Criteria andParentMerchantIdIsNull() {
            addCriterion("PARENT_MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdIsNotNull() {
            addCriterion("PARENT_MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdEqualTo(Long value) {
            addCriterion("PARENT_MERCHANT_ID =", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdNotEqualTo(Long value) {
            addCriterion("PARENT_MERCHANT_ID <>", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdGreaterThan(Long value) {
            addCriterion("PARENT_MERCHANT_ID >", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_MERCHANT_ID >=", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdLessThan(Long value) {
            addCriterion("PARENT_MERCHANT_ID <", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_MERCHANT_ID <=", value, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdIn(List<Long> values) {
            addCriterion("PARENT_MERCHANT_ID in", values, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdNotIn(List<Long> values) {
            addCriterion("PARENT_MERCHANT_ID not in", values, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_MERCHANT_ID between", value1, value2, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_MERCHANT_ID not between", value1, value2, "parentMerchantId");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeIsNull() {
            addCriterion("PARENT_MERCHANT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeIsNotNull() {
            addCriterion("PARENT_MERCHANT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeEqualTo(String value) {
            addCriterion("PARENT_MERCHANT_CODE =", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeNotEqualTo(String value) {
            addCriterion("PARENT_MERCHANT_CODE <>", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeGreaterThan(String value) {
            addCriterion("PARENT_MERCHANT_CODE >", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_MERCHANT_CODE >=", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeLessThan(String value) {
            addCriterion("PARENT_MERCHANT_CODE <", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_MERCHANT_CODE <=", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeLike(String value) {
            addCriterion("PARENT_MERCHANT_CODE like", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeNotLike(String value) {
            addCriterion("PARENT_MERCHANT_CODE not like", value, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeIn(List<String> values) {
            addCriterion("PARENT_MERCHANT_CODE in", values, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeNotIn(List<String> values) {
            addCriterion("PARENT_MERCHANT_CODE not in", values, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeBetween(String value1, String value2) {
            addCriterion("PARENT_MERCHANT_CODE between", value1, value2, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andParentMerchantCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_MERCHANT_CODE not between", value1, value2, "parentMerchantCode");
            return (Criteria) this;
        }

        public Criteria andFundIsNull() {
            addCriterion("FUND is null");
            return (Criteria) this;
        }

        public Criteria andFundIsNotNull() {
            addCriterion("FUND is not null");
            return (Criteria) this;
        }

        public Criteria andFundEqualTo(BigDecimal value) {
            addCriterion("FUND =", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotEqualTo(BigDecimal value) {
            addCriterion("FUND <>", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThan(BigDecimal value) {
            addCriterion("FUND >", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND >=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThan(BigDecimal value) {
            addCriterion("FUND <", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND <=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundIn(List<BigDecimal> values) {
            addCriterion("FUND in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotIn(List<BigDecimal> values) {
            addCriterion("FUND not in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND not between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andDeductFundIsNull() {
            addCriterion("DEDUCT_FUND is null");
            return (Criteria) this;
        }

        public Criteria andDeductFundIsNotNull() {
            addCriterion("DEDUCT_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andDeductFundEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_FUND =", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_FUND <>", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundGreaterThan(BigDecimal value) {
            addCriterion("DEDUCT_FUND >", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_FUND >=", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundLessThan(BigDecimal value) {
            addCriterion("DEDUCT_FUND <", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_FUND <=", value, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_FUND in", values, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_FUND not in", values, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_FUND between", value1, value2, "deductFund");
            return (Criteria) this;
        }

        public Criteria andDeductFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_FUND not between", value1, value2, "deductFund");
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

        public Criteria andIsRealtimeIsNull() {
            addCriterion("IS_REALTIME is null");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeIsNotNull() {
            addCriterion("IS_REALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeEqualTo(Integer value) {
            addCriterion("IS_REALTIME =", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeNotEqualTo(Integer value) {
            addCriterion("IS_REALTIME <>", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeGreaterThan(Integer value) {
            addCriterion("IS_REALTIME >", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_REALTIME >=", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeLessThan(Integer value) {
            addCriterion("IS_REALTIME <", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeLessThanOrEqualTo(Integer value) {
            addCriterion("IS_REALTIME <=", value, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeIn(List<Integer> values) {
            addCriterion("IS_REALTIME in", values, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeNotIn(List<Integer> values) {
            addCriterion("IS_REALTIME not in", values, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeBetween(Integer value1, Integer value2) {
            addCriterion("IS_REALTIME between", value1, value2, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_REALTIME not between", value1, value2, "isRealtime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("PAID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("PAID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PAID_TIME =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PAID_TIME <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PAID_TIME >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAID_TIME >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(Date value) {
            addCriterionForJDBCDate("PAID_TIME <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAID_TIME <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PAID_TIME in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PAID_TIME not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAID_TIME between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAID_TIME not between", value1, value2, "paidTime");
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

        public Criteria andAuditingOperatorIsNull() {
            addCriterion("AUDITING_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorIsNotNull() {
            addCriterion("AUDITING_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorEqualTo(String value) {
            addCriterion("AUDITING_OPERATOR =", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorNotEqualTo(String value) {
            addCriterion("AUDITING_OPERATOR <>", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorGreaterThan(String value) {
            addCriterion("AUDITING_OPERATOR >", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITING_OPERATOR >=", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorLessThan(String value) {
            addCriterion("AUDITING_OPERATOR <", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorLessThanOrEqualTo(String value) {
            addCriterion("AUDITING_OPERATOR <=", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorLike(String value) {
            addCriterion("AUDITING_OPERATOR like", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorNotLike(String value) {
            addCriterion("AUDITING_OPERATOR not like", value, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorIn(List<String> values) {
            addCriterion("AUDITING_OPERATOR in", values, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorNotIn(List<String> values) {
            addCriterion("AUDITING_OPERATOR not in", values, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorBetween(String value1, String value2) {
            addCriterion("AUDITING_OPERATOR between", value1, value2, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingOperatorNotBetween(String value1, String value2) {
            addCriterion("AUDITING_OPERATOR not between", value1, value2, "auditingOperator");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeIsNull() {
            addCriterion("AUDITING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeIsNotNull() {
            addCriterion("AUDITING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME =", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME <>", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME >", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME >=", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeLessThan(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME <", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AUDITING_TIME <=", value, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeIn(List<Date> values) {
            addCriterionForJDBCDate("AUDITING_TIME in", values, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("AUDITING_TIME not in", values, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AUDITING_TIME between", value1, value2, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AUDITING_TIME not between", value1, value2, "auditingTime");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIsNull() {
            addCriterion("AUDITING_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIsNotNull() {
            addCriterion("AUDITING_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkEqualTo(String value) {
            addCriterion("AUDITING_REMARK =", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotEqualTo(String value) {
            addCriterion("AUDITING_REMARK <>", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkGreaterThan(String value) {
            addCriterion("AUDITING_REMARK >", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITING_REMARK >=", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLessThan(String value) {
            addCriterion("AUDITING_REMARK <", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLessThanOrEqualTo(String value) {
            addCriterion("AUDITING_REMARK <=", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLike(String value) {
            addCriterion("AUDITING_REMARK like", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotLike(String value) {
            addCriterion("AUDITING_REMARK not like", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIn(List<String> values) {
            addCriterion("AUDITING_REMARK in", values, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotIn(List<String> values) {
            addCriterion("AUDITING_REMARK not in", values, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkBetween(String value1, String value2) {
            addCriterion("AUDITING_REMARK between", value1, value2, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotBetween(String value1, String value2) {
            addCriterion("AUDITING_REMARK not between", value1, value2, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorIsNull() {
            addCriterion("PARENT_AUDITING_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorIsNotNull() {
            addCriterion("PARENT_AUDITING_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorEqualTo(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR =", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorNotEqualTo(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR <>", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorGreaterThan(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR >", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR >=", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorLessThan(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR <", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorLessThanOrEqualTo(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR <=", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorLike(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR like", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorNotLike(String value) {
            addCriterion("PARENT_AUDITING_OPERATOR not like", value, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorIn(List<String> values) {
            addCriterion("PARENT_AUDITING_OPERATOR in", values, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorNotIn(List<String> values) {
            addCriterion("PARENT_AUDITING_OPERATOR not in", values, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorBetween(String value1, String value2) {
            addCriterion("PARENT_AUDITING_OPERATOR between", value1, value2, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingOperatorNotBetween(String value1, String value2) {
            addCriterion("PARENT_AUDITING_OPERATOR not between", value1, value2, "parentAuditingOperator");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeIsNull() {
            addCriterion("PARENT_AUDITING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeIsNotNull() {
            addCriterion("PARENT_AUDITING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME =", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME <>", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME >", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME >=", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeLessThan(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME <", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME <=", value, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME in", values, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME not in", values, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME between", value1, value2, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PARENT_AUDITING_TIME not between", value1, value2, "parentAuditingTime");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkIsNull() {
            addCriterion("PARENT_AUDITING_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkIsNotNull() {
            addCriterion("PARENT_AUDITING_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkEqualTo(String value) {
            addCriterion("PARENT_AUDITING_REMARK =", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkNotEqualTo(String value) {
            addCriterion("PARENT_AUDITING_REMARK <>", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkGreaterThan(String value) {
            addCriterion("PARENT_AUDITING_REMARK >", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_AUDITING_REMARK >=", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkLessThan(String value) {
            addCriterion("PARENT_AUDITING_REMARK <", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkLessThanOrEqualTo(String value) {
            addCriterion("PARENT_AUDITING_REMARK <=", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkLike(String value) {
            addCriterion("PARENT_AUDITING_REMARK like", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkNotLike(String value) {
            addCriterion("PARENT_AUDITING_REMARK not like", value, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkIn(List<String> values) {
            addCriterion("PARENT_AUDITING_REMARK in", values, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkNotIn(List<String> values) {
            addCriterion("PARENT_AUDITING_REMARK not in", values, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkBetween(String value1, String value2) {
            addCriterion("PARENT_AUDITING_REMARK between", value1, value2, "parentAuditingRemark");
            return (Criteria) this;
        }

        public Criteria andParentAuditingRemarkNotBetween(String value1, String value2) {
            addCriterion("PARENT_AUDITING_REMARK not between", value1, value2, "parentAuditingRemark");
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

        public Criteria andTradeIdIsNull() {
            addCriterion("TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(Long value) {
            addCriterion("TRADE_ID =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(Long value) {
            addCriterion("TRADE_ID <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(Long value) {
            addCriterion("TRADE_ID >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRADE_ID >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(Long value) {
            addCriterion("TRADE_ID <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("TRADE_ID <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<Long> values) {
            addCriterion("TRADE_ID in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<Long> values) {
            addCriterion("TRADE_ID not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(Long value1, Long value2) {
            addCriterion("TRADE_ID between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("TRADE_ID not between", value1, value2, "tradeId");
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