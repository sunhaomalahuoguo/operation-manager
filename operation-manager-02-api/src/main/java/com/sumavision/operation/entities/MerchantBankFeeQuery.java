package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerchantBankFeeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantBankFeeQuery() {
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

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIsNull() {
            addCriterion("PAY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIsNotNull() {
            addCriterion("PAY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdEqualTo(Long value) {
            addCriterion("PAY_TYPE_ID =", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotEqualTo(Long value) {
            addCriterion("PAY_TYPE_ID <>", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThan(Long value) {
            addCriterion("PAY_TYPE_ID >", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE_ID >=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThan(Long value) {
            addCriterion("PAY_TYPE_ID <", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE_ID <=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIn(List<Long> values) {
            addCriterion("PAY_TYPE_ID in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotIn(List<Long> values) {
            addCriterion("PAY_TYPE_ID not in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE_ID between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE_ID not between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("METHOD is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(Integer value) {
            addCriterion("METHOD =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(Integer value) {
            addCriterion("METHOD <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(Integer value) {
            addCriterion("METHOD >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("METHOD >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(Integer value) {
            addCriterion("METHOD <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(Integer value) {
            addCriterion("METHOD <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<Integer> values) {
            addCriterion("METHOD in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<Integer> values) {
            addCriterion("METHOD not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(Integer value1, Integer value2) {
            addCriterion("METHOD between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("METHOD not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andFixFeeIsNull() {
            addCriterion("FIX_FEE is null");
            return (Criteria) this;
        }

        public Criteria andFixFeeIsNotNull() {
            addCriterion("FIX_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFixFeeEqualTo(BigDecimal value) {
            addCriterion("FIX_FEE =", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeNotEqualTo(BigDecimal value) {
            addCriterion("FIX_FEE <>", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeGreaterThan(BigDecimal value) {
            addCriterion("FIX_FEE >", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIX_FEE >=", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeLessThan(BigDecimal value) {
            addCriterion("FIX_FEE <", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIX_FEE <=", value, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeIn(List<BigDecimal> values) {
            addCriterion("FIX_FEE in", values, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeNotIn(List<BigDecimal> values) {
            addCriterion("FIX_FEE not in", values, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIX_FEE between", value1, value2, "fixFee");
            return (Criteria) this;
        }

        public Criteria andFixFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIX_FEE not between", value1, value2, "fixFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeIsNull() {
            addCriterion("MIN_FEE is null");
            return (Criteria) this;
        }

        public Criteria andMinFeeIsNotNull() {
            addCriterion("MIN_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andMinFeeEqualTo(BigDecimal value) {
            addCriterion("MIN_FEE =", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeNotEqualTo(BigDecimal value) {
            addCriterion("MIN_FEE <>", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeGreaterThan(BigDecimal value) {
            addCriterion("MIN_FEE >", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_FEE >=", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeLessThan(BigDecimal value) {
            addCriterion("MIN_FEE <", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_FEE <=", value, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeIn(List<BigDecimal> values) {
            addCriterion("MIN_FEE in", values, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeNotIn(List<BigDecimal> values) {
            addCriterion("MIN_FEE not in", values, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_FEE between", value1, value2, "minFee");
            return (Criteria) this;
        }

        public Criteria andMinFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_FEE not between", value1, value2, "minFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIsNull() {
            addCriterion("MAX_FEE is null");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIsNotNull() {
            addCriterion("MAX_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFeeEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE =", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE <>", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeGreaterThan(BigDecimal value) {
            addCriterion("MAX_FEE >", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE >=", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeLessThan(BigDecimal value) {
            addCriterion("MAX_FEE <", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE <=", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIn(List<BigDecimal> values) {
            addCriterion("MAX_FEE in", values, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotIn(List<BigDecimal> values) {
            addCriterion("MAX_FEE not in", values, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_FEE between", value1, value2, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_FEE not between", value1, value2, "maxFee");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundIsNull() {
            addCriterion("LIMIT_FIX_RATE_FUND is null");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundIsNotNull() {
            addCriterion("LIMIT_FIX_RATE_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundEqualTo(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND =", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundNotEqualTo(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND <>", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundGreaterThan(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND >", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND >=", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundLessThan(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND <", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMIT_FIX_RATE_FUND <=", value, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundIn(List<BigDecimal> values) {
            addCriterion("LIMIT_FIX_RATE_FUND in", values, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundNotIn(List<BigDecimal> values) {
            addCriterion("LIMIT_FIX_RATE_FUND not in", values, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMIT_FIX_RATE_FUND between", value1, value2, "limitFixRateFund");
            return (Criteria) this;
        }

        public Criteria andLimitFixRateFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMIT_FIX_RATE_FUND not between", value1, value2, "limitFixRateFund");
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

        public Criteria andFld4IsNull() {
            addCriterion("FLD4 is null");
            return (Criteria) this;
        }

        public Criteria andFld4IsNotNull() {
            addCriterion("FLD4 is not null");
            return (Criteria) this;
        }

        public Criteria andFld4EqualTo(String value) {
            addCriterion("FLD4 =", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4NotEqualTo(String value) {
            addCriterion("FLD4 <>", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4GreaterThan(String value) {
            addCriterion("FLD4 >", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4GreaterThanOrEqualTo(String value) {
            addCriterion("FLD4 >=", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4LessThan(String value) {
            addCriterion("FLD4 <", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4LessThanOrEqualTo(String value) {
            addCriterion("FLD4 <=", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4Like(String value) {
            addCriterion("FLD4 like", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4NotLike(String value) {
            addCriterion("FLD4 not like", value, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4In(List<String> values) {
            addCriterion("FLD4 in", values, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4NotIn(List<String> values) {
            addCriterion("FLD4 not in", values, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4Between(String value1, String value2) {
            addCriterion("FLD4 between", value1, value2, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld4NotBetween(String value1, String value2) {
            addCriterion("FLD4 not between", value1, value2, "fld4");
            return (Criteria) this;
        }

        public Criteria andFld5IsNull() {
            addCriterion("FLD5 is null");
            return (Criteria) this;
        }

        public Criteria andFld5IsNotNull() {
            addCriterion("FLD5 is not null");
            return (Criteria) this;
        }

        public Criteria andFld5EqualTo(String value) {
            addCriterion("FLD5 =", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5NotEqualTo(String value) {
            addCriterion("FLD5 <>", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5GreaterThan(String value) {
            addCriterion("FLD5 >", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5GreaterThanOrEqualTo(String value) {
            addCriterion("FLD5 >=", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5LessThan(String value) {
            addCriterion("FLD5 <", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5LessThanOrEqualTo(String value) {
            addCriterion("FLD5 <=", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5Like(String value) {
            addCriterion("FLD5 like", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5NotLike(String value) {
            addCriterion("FLD5 not like", value, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5In(List<String> values) {
            addCriterion("FLD5 in", values, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5NotIn(List<String> values) {
            addCriterion("FLD5 not in", values, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5Between(String value1, String value2) {
            addCriterion("FLD5 between", value1, value2, "fld5");
            return (Criteria) this;
        }

        public Criteria andFld5NotBetween(String value1, String value2) {
            addCriterion("FLD5 not between", value1, value2, "fld5");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNull() {
            addCriterion("LOWER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNotNull() {
            addCriterion("LOWER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitEqualTo(BigDecimal value) {
            addCriterion("LOWER_LIMIT =", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotEqualTo(BigDecimal value) {
            addCriterion("LOWER_LIMIT <>", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThan(BigDecimal value) {
            addCriterion("LOWER_LIMIT >", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOWER_LIMIT >=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThan(BigDecimal value) {
            addCriterion("LOWER_LIMIT <", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOWER_LIMIT <=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIn(List<BigDecimal> values) {
            addCriterion("LOWER_LIMIT in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotIn(List<BigDecimal> values) {
            addCriterion("LOWER_LIMIT not in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOWER_LIMIT between", value1, value2, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOWER_LIMIT not between", value1, value2, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("UPPER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("UPPER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(BigDecimal value) {
            addCriterion("UPPER_LIMIT =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(BigDecimal value) {
            addCriterion("UPPER_LIMIT <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(BigDecimal value) {
            addCriterion("UPPER_LIMIT >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPPER_LIMIT >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(BigDecimal value) {
            addCriterion("UPPER_LIMIT <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPPER_LIMIT <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<BigDecimal> values) {
            addCriterion("UPPER_LIMIT in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<BigDecimal> values) {
            addCriterion("UPPER_LIMIT not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPPER_LIMIT between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPPER_LIMIT not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andLimitLayerIsNull() {
            addCriterion("LIMIT_LAYER is null");
            return (Criteria) this;
        }

        public Criteria andLimitLayerIsNotNull() {
            addCriterion("LIMIT_LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andLimitLayerEqualTo(Integer value) {
            addCriterion("LIMIT_LAYER =", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerNotEqualTo(Integer value) {
            addCriterion("LIMIT_LAYER <>", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerGreaterThan(Integer value) {
            addCriterion("LIMIT_LAYER >", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_LAYER >=", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerLessThan(Integer value) {
            addCriterion("LIMIT_LAYER <", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_LAYER <=", value, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerIn(List<Integer> values) {
            addCriterion("LIMIT_LAYER in", values, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerNotIn(List<Integer> values) {
            addCriterion("LIMIT_LAYER not in", values, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_LAYER between", value1, value2, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLimitLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_LAYER not between", value1, value2, "limitLayer");
            return (Criteria) this;
        }

        public Criteria andLayerMethodIsNull() {
            addCriterion("LAYER_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andLayerMethodIsNotNull() {
            addCriterion("LAYER_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andLayerMethodEqualTo(Integer value) {
            addCriterion("LAYER_METHOD =", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodNotEqualTo(Integer value) {
            addCriterion("LAYER_METHOD <>", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodGreaterThan(Integer value) {
            addCriterion("LAYER_METHOD >", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAYER_METHOD >=", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodLessThan(Integer value) {
            addCriterion("LAYER_METHOD <", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodLessThanOrEqualTo(Integer value) {
            addCriterion("LAYER_METHOD <=", value, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodIn(List<Integer> values) {
            addCriterion("LAYER_METHOD in", values, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodNotIn(List<Integer> values) {
            addCriterion("LAYER_METHOD not in", values, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodBetween(Integer value1, Integer value2) {
            addCriterion("LAYER_METHOD between", value1, value2, "layerMethod");
            return (Criteria) this;
        }

        public Criteria andLayerMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("LAYER_METHOD not between", value1, value2, "layerMethod");
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