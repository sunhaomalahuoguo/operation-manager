package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActualSeparateAccountRecordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ActualSeparateAccountRecordQuery() {
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

        public Criteria andDebitedRoleTypeIsNull() {
            addCriterion("DEBITED_ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeIsNotNull() {
            addCriterion("DEBITED_ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE =", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeNotEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE <>", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeGreaterThan(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE >", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE >=", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeLessThan(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE <", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_TYPE <=", value, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeIn(List<Integer> values) {
            addCriterion("DEBITED_ROLE_TYPE in", values, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeNotIn(List<Integer> values) {
            addCriterion("DEBITED_ROLE_TYPE not in", values, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("DEBITED_ROLE_TYPE between", value1, value2, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEBITED_ROLE_TYPE not between", value1, value2, "debitedRoleType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeIsNull() {
            addCriterion("DEBITED_ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeIsNotNull() {
            addCriterion("DEBITED_ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeEqualTo(String value) {
            addCriterion("DEBITED_ROLE_CODE =", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeNotEqualTo(String value) {
            addCriterion("DEBITED_ROLE_CODE <>", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeGreaterThan(String value) {
            addCriterion("DEBITED_ROLE_CODE >", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEBITED_ROLE_CODE >=", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeLessThan(String value) {
            addCriterion("DEBITED_ROLE_CODE <", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("DEBITED_ROLE_CODE <=", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeLike(String value) {
            addCriterion("DEBITED_ROLE_CODE like", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeNotLike(String value) {
            addCriterion("DEBITED_ROLE_CODE not like", value, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeIn(List<String> values) {
            addCriterion("DEBITED_ROLE_CODE in", values, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeNotIn(List<String> values) {
            addCriterion("DEBITED_ROLE_CODE not in", values, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeBetween(String value1, String value2) {
            addCriterion("DEBITED_ROLE_CODE between", value1, value2, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleCodeNotBetween(String value1, String value2) {
            addCriterion("DEBITED_ROLE_CODE not between", value1, value2, "debitedRoleCode");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdIsNull() {
            addCriterion("DEBITED_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdIsNotNull() {
            addCriterion("DEBITED_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ID =", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdNotEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ID <>", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdGreaterThan(Long value) {
            addCriterion("DEBITED_ROLE_ID >", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ID >=", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdLessThan(Long value) {
            addCriterion("DEBITED_ROLE_ID <", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ID <=", value, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdIn(List<Long> values) {
            addCriterion("DEBITED_ROLE_ID in", values, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdNotIn(List<Long> values) {
            addCriterion("DEBITED_ROLE_ID not in", values, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdBetween(Long value1, Long value2) {
            addCriterion("DEBITED_ROLE_ID between", value1, value2, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("DEBITED_ROLE_ID not between", value1, value2, "debitedRoleId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeIsNull() {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeIsNotNull() {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE =", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeNotEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE <>", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeGreaterThan(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE >", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE >=", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeLessThan(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE <", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE <=", value, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeIn(List<Integer> values) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE in", values, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeNotIn(List<Integer> values) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE not in", values, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE between", value1, value2, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEBITED_ROLE_ACCOUNT_TYPE not between", value1, value2, "debitedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdIsNull() {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdIsNotNull() {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID =", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdNotEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID <>", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdGreaterThan(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID >", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID >=", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdLessThan(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID <", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID <=", value, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdIn(List<Long> values) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID in", values, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdNotIn(List<Long> values) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID not in", values, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdBetween(Long value1, Long value2) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID between", value1, value2, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andDebitedRoleAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("DEBITED_ROLE_ACCOUNT_ID not between", value1, value2, "debitedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeIsNull() {
            addCriterion("CREDITED_ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeIsNotNull() {
            addCriterion("CREDITED_ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE =", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeNotEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE <>", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeGreaterThan(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE >", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE >=", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeLessThan(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE <", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_TYPE <=", value, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeIn(List<Integer> values) {
            addCriterion("CREDITED_ROLE_TYPE in", values, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeNotIn(List<Integer> values) {
            addCriterion("CREDITED_ROLE_TYPE not in", values, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("CREDITED_ROLE_TYPE between", value1, value2, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDITED_ROLE_TYPE not between", value1, value2, "creditedRoleType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeIsNull() {
            addCriterion("CREDITED_ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeIsNotNull() {
            addCriterion("CREDITED_ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeEqualTo(String value) {
            addCriterion("CREDITED_ROLE_CODE =", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeNotEqualTo(String value) {
            addCriterion("CREDITED_ROLE_CODE <>", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeGreaterThan(String value) {
            addCriterion("CREDITED_ROLE_CODE >", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITED_ROLE_CODE >=", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeLessThan(String value) {
            addCriterion("CREDITED_ROLE_CODE <", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("CREDITED_ROLE_CODE <=", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeLike(String value) {
            addCriterion("CREDITED_ROLE_CODE like", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeNotLike(String value) {
            addCriterion("CREDITED_ROLE_CODE not like", value, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeIn(List<String> values) {
            addCriterion("CREDITED_ROLE_CODE in", values, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeNotIn(List<String> values) {
            addCriterion("CREDITED_ROLE_CODE not in", values, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeBetween(String value1, String value2) {
            addCriterion("CREDITED_ROLE_CODE between", value1, value2, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleCodeNotBetween(String value1, String value2) {
            addCriterion("CREDITED_ROLE_CODE not between", value1, value2, "creditedRoleCode");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdIsNull() {
            addCriterion("CREDITED_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdIsNotNull() {
            addCriterion("CREDITED_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ID =", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdNotEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ID <>", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdGreaterThan(Long value) {
            addCriterion("CREDITED_ROLE_ID >", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ID >=", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdLessThan(Long value) {
            addCriterion("CREDITED_ROLE_ID <", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ID <=", value, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdIn(List<Long> values) {
            addCriterion("CREDITED_ROLE_ID in", values, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdNotIn(List<Long> values) {
            addCriterion("CREDITED_ROLE_ID not in", values, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdBetween(Long value1, Long value2) {
            addCriterion("CREDITED_ROLE_ID between", value1, value2, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("CREDITED_ROLE_ID not between", value1, value2, "creditedRoleId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeIsNull() {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeIsNotNull() {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE =", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeNotEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE <>", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeGreaterThan(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE >", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE >=", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeLessThan(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE <", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE <=", value, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeIn(List<Integer> values) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE in", values, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeNotIn(List<Integer> values) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE not in", values, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE between", value1, value2, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDITED_ROLE_ACCOUNT_TYPE not between", value1, value2, "creditedRoleAccountType");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdIsNull() {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdIsNotNull() {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID =", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdNotEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID <>", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdGreaterThan(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID >", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID >=", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdLessThan(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID <", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID <=", value, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdIn(List<Long> values) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID in", values, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdNotIn(List<Long> values) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID not in", values, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdBetween(Long value1, Long value2) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID between", value1, value2, "creditedRoleAccountId");
            return (Criteria) this;
        }

        public Criteria andCreditedRoleAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("CREDITED_ROLE_ACCOUNT_ID not between", value1, value2, "creditedRoleAccountId");
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

        public Criteria andRequestDirectionIsNull() {
            addCriterion("REQUEST_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionIsNotNull() {
            addCriterion("REQUEST_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionEqualTo(Integer value) {
            addCriterion("REQUEST_DIRECTION =", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionNotEqualTo(Integer value) {
            addCriterion("REQUEST_DIRECTION <>", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionGreaterThan(Integer value) {
            addCriterion("REQUEST_DIRECTION >", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("REQUEST_DIRECTION >=", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionLessThan(Integer value) {
            addCriterion("REQUEST_DIRECTION <", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("REQUEST_DIRECTION <=", value, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionIn(List<Integer> values) {
            addCriterion("REQUEST_DIRECTION in", values, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionNotIn(List<Integer> values) {
            addCriterion("REQUEST_DIRECTION not in", values, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionBetween(Integer value1, Integer value2) {
            addCriterion("REQUEST_DIRECTION between", value1, value2, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("REQUEST_DIRECTION not between", value1, value2, "requestDirection");
            return (Criteria) this;
        }

        public Criteria andRequestFundIsNull() {
            addCriterion("REQUEST_FUND is null");
            return (Criteria) this;
        }

        public Criteria andRequestFundIsNotNull() {
            addCriterion("REQUEST_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andRequestFundEqualTo(BigDecimal value) {
            addCriterion("REQUEST_FUND =", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundNotEqualTo(BigDecimal value) {
            addCriterion("REQUEST_FUND <>", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundGreaterThan(BigDecimal value) {
            addCriterion("REQUEST_FUND >", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUEST_FUND >=", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundLessThan(BigDecimal value) {
            addCriterion("REQUEST_FUND <", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUEST_FUND <=", value, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundIn(List<BigDecimal> values) {
            addCriterion("REQUEST_FUND in", values, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundNotIn(List<BigDecimal> values) {
            addCriterion("REQUEST_FUND not in", values, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUEST_FUND between", value1, value2, "requestFund");
            return (Criteria) this;
        }

        public Criteria andRequestFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUEST_FUND not between", value1, value2, "requestFund");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagIsNull() {
            addCriterion("MAIN_ACCOUNT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagIsNotNull() {
            addCriterion("MAIN_ACCOUNT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagEqualTo(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG =", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagNotEqualTo(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG <>", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagGreaterThan(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG >", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG >=", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagLessThan(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG <", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagLessThanOrEqualTo(Integer value) {
            addCriterion("MAIN_ACCOUNT_FLAG <=", value, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagIn(List<Integer> values) {
            addCriterion("MAIN_ACCOUNT_FLAG in", values, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagNotIn(List<Integer> values) {
            addCriterion("MAIN_ACCOUNT_FLAG not in", values, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_ACCOUNT_FLAG between", value1, value2, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andMainAccountFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_ACCOUNT_FLAG not between", value1, value2, "mainAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNull() {
            addCriterion("LAST_EDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("LAST_EDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME =", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME <>", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME >", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME >=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThan(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME <", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_EDIT_TIME <=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_EDIT_TIME in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_EDIT_TIME not in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_EDIT_TIME between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_EDIT_TIME not between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andBizFlagIsNull() {
            addCriterion("BIZ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBizFlagIsNotNull() {
            addCriterion("BIZ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBizFlagEqualTo(Integer value) {
            addCriterion("BIZ_FLAG =", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagNotEqualTo(Integer value) {
            addCriterion("BIZ_FLAG <>", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagGreaterThan(Integer value) {
            addCriterion("BIZ_FLAG >", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIZ_FLAG >=", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagLessThan(Integer value) {
            addCriterion("BIZ_FLAG <", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagLessThanOrEqualTo(Integer value) {
            addCriterion("BIZ_FLAG <=", value, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagIn(List<Integer> values) {
            addCriterion("BIZ_FLAG in", values, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagNotIn(List<Integer> values) {
            addCriterion("BIZ_FLAG not in", values, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_FLAG between", value1, value2, "bizFlag");
            return (Criteria) this;
        }

        public Criteria andBizFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_FLAG not between", value1, value2, "bizFlag");
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