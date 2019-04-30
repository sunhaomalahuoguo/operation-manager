package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pProjectRecordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public P2pProjectRecordQuery() {
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

        public Criteria andP2pMerchantIdIsNull() {
            addCriterion("P2P_MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdIsNotNull() {
            addCriterion("P2P_MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdEqualTo(Long value) {
            addCriterion("P2P_MERCHANT_ID =", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdNotEqualTo(Long value) {
            addCriterion("P2P_MERCHANT_ID <>", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdGreaterThan(Long value) {
            addCriterion("P2P_MERCHANT_ID >", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("P2P_MERCHANT_ID >=", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdLessThan(Long value) {
            addCriterion("P2P_MERCHANT_ID <", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("P2P_MERCHANT_ID <=", value, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdIn(List<Long> values) {
            addCriterion("P2P_MERCHANT_ID in", values, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdNotIn(List<Long> values) {
            addCriterion("P2P_MERCHANT_ID not in", values, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdBetween(Long value1, Long value2) {
            addCriterion("P2P_MERCHANT_ID between", value1, value2, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andP2pMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("P2P_MERCHANT_ID not between", value1, value2, "p2pMerchantId");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNull() {
            addCriterion("PROJECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("PROJECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("PROJECT_NO =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("PROJECT_NO <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("PROJECT_NO >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NO >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("PROJECT_NO <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NO <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("PROJECT_NO like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("PROJECT_NO not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("PROJECT_NO in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("PROJECT_NO not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("PROJECT_NO between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NO not between", value1, value2, "projectNo");
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

        public Criteria andInvestmentSumIsNull() {
            addCriterion("INVESTMENT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumIsNotNull() {
            addCriterion("INVESTMENT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT_SUM =", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumNotEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT_SUM <>", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumGreaterThan(BigDecimal value) {
            addCriterion("INVESTMENT_SUM >", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT_SUM >=", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumLessThan(BigDecimal value) {
            addCriterion("INVESTMENT_SUM <", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT_SUM <=", value, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumIn(List<BigDecimal> values) {
            addCriterion("INVESTMENT_SUM in", values, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumNotIn(List<BigDecimal> values) {
            addCriterion("INVESTMENT_SUM not in", values, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENT_SUM between", value1, value2, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andInvestmentSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENT_SUM not between", value1, value2, "investmentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumIsNull() {
            addCriterion("REPAYMENT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumIsNotNull() {
            addCriterion("REPAYMENT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_SUM =", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_SUM <>", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENT_SUM >", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_SUM >=", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumLessThan(BigDecimal value) {
            addCriterion("REPAYMENT_SUM <", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_SUM <=", value, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_SUM in", values, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_SUM not in", values, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_SUM between", value1, value2, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andRepaymentSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_SUM not between", value1, value2, "repaymentSum");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdIsNull() {
            addCriterion("PROJECT_OUT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdIsNotNull() {
            addCriterion("PROJECT_OUT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdEqualTo(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID =", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdNotEqualTo(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID <>", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdGreaterThan(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID >", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID >=", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdLessThan(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID <", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID <=", value, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdIn(List<Long> values) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID in", values, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdNotIn(List<Long> values) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID not in", values, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdBetween(Long value1, Long value2) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID between", value1, value2, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectOutAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("PROJECT_OUT_ACCOUNT_ID not between", value1, value2, "projectOutAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdIsNull() {
            addCriterion("PROJECT_IN_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdIsNotNull() {
            addCriterion("PROJECT_IN_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdEqualTo(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID =", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdNotEqualTo(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID <>", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdGreaterThan(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID >", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID >=", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdLessThan(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID <", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("PROJECT_IN_ACCOUNT_ID <=", value, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdIn(List<Long> values) {
            addCriterion("PROJECT_IN_ACCOUNT_ID in", values, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdNotIn(List<Long> values) {
            addCriterion("PROJECT_IN_ACCOUNT_ID not in", values, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdBetween(Long value1, Long value2) {
            addCriterion("PROJECT_IN_ACCOUNT_ID between", value1, value2, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andProjectInAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("PROJECT_IN_ACCOUNT_ID not between", value1, value2, "projectInAccountId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIsNull() {
            addCriterion("OUT_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIsNotNull() {
            addCriterion("OUT_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdEqualTo(Long value) {
            addCriterion("OUT_TRADE_ID =", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotEqualTo(Long value) {
            addCriterion("OUT_TRADE_ID <>", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdGreaterThan(Long value) {
            addCriterion("OUT_TRADE_ID >", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OUT_TRADE_ID >=", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdLessThan(Long value) {
            addCriterion("OUT_TRADE_ID <", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("OUT_TRADE_ID <=", value, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdIn(List<Long> values) {
            addCriterion("OUT_TRADE_ID in", values, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotIn(List<Long> values) {
            addCriterion("OUT_TRADE_ID not in", values, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdBetween(Long value1, Long value2) {
            addCriterion("OUT_TRADE_ID between", value1, value2, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andOutTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("OUT_TRADE_ID not between", value1, value2, "outTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdIsNull() {
            addCriterion("IN_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInTradeIdIsNotNull() {
            addCriterion("IN_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInTradeIdEqualTo(Long value) {
            addCriterion("IN_TRADE_ID =", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdNotEqualTo(Long value) {
            addCriterion("IN_TRADE_ID <>", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdGreaterThan(Long value) {
            addCriterion("IN_TRADE_ID >", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("IN_TRADE_ID >=", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdLessThan(Long value) {
            addCriterion("IN_TRADE_ID <", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("IN_TRADE_ID <=", value, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdIn(List<Long> values) {
            addCriterion("IN_TRADE_ID in", values, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdNotIn(List<Long> values) {
            addCriterion("IN_TRADE_ID not in", values, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdBetween(Long value1, Long value2) {
            addCriterion("IN_TRADE_ID between", value1, value2, "inTradeId");
            return (Criteria) this;
        }

        public Criteria andInTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("IN_TRADE_ID not between", value1, value2, "inTradeId");
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

        public Criteria andProjectSumIsNull() {
            addCriterion("PROJECT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andProjectSumIsNotNull() {
            addCriterion("PROJECT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSumEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SUM =", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SUM <>", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_SUM >", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SUM >=", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumLessThan(BigDecimal value) {
            addCriterion("PROJECT_SUM <", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SUM <=", value, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumIn(List<BigDecimal> values) {
            addCriterion("PROJECT_SUM in", values, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_SUM not in", values, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_SUM between", value1, value2, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_SUM not between", value1, value2, "projectSum");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("PROJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("PROJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Integer value) {
            addCriterion("PROJECT_TYPE >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Integer value) {
            addCriterion("PROJECT_TYPE <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Integer> values) {
            addCriterion("PROJECT_TYPE in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Integer> values) {
            addCriterion("PROJECT_TYPE not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_TYPE between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_TYPE not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("PROJECT_NAME =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("PROJECT_NAME <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("PROJECT_NAME >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("PROJECT_NAME <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("PROJECT_NAME like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("PROJECT_NAME not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("PROJECT_NAME in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("PROJECT_NAME not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andAnnualRateIsNull() {
            addCriterion("ANNUAL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andAnnualRateIsNotNull() {
            addCriterion("ANNUAL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualRateEqualTo(String value) {
            addCriterion("ANNUAL_RATE =", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateNotEqualTo(String value) {
            addCriterion("ANNUAL_RATE <>", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateGreaterThan(String value) {
            addCriterion("ANNUAL_RATE >", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_RATE >=", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateLessThan(String value) {
            addCriterion("ANNUAL_RATE <", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_RATE <=", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateLike(String value) {
            addCriterion("ANNUAL_RATE like", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateNotLike(String value) {
            addCriterion("ANNUAL_RATE not like", value, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateIn(List<String> values) {
            addCriterion("ANNUAL_RATE in", values, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateNotIn(List<String> values) {
            addCriterion("ANNUAL_RATE not in", values, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateBetween(String value1, String value2) {
            addCriterion("ANNUAL_RATE between", value1, value2, "annualRate");
            return (Criteria) this;
        }

        public Criteria andAnnualRateNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_RATE not between", value1, value2, "annualRate");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeIsNull() {
            addCriterion("BORROWER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeIsNotNull() {
            addCriterion("BORROWER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeEqualTo(Integer value) {
            addCriterion("BORROWER_TYPE =", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeNotEqualTo(Integer value) {
            addCriterion("BORROWER_TYPE <>", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeGreaterThan(Integer value) {
            addCriterion("BORROWER_TYPE >", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BORROWER_TYPE >=", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeLessThan(Integer value) {
            addCriterion("BORROWER_TYPE <", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BORROWER_TYPE <=", value, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeIn(List<Integer> values) {
            addCriterion("BORROWER_TYPE in", values, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeNotIn(List<Integer> values) {
            addCriterion("BORROWER_TYPE not in", values, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeBetween(Integer value1, Integer value2) {
            addCriterion("BORROWER_TYPE between", value1, value2, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BORROWER_TYPE not between", value1, value2, "borrowerType");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityIsNull() {
            addCriterion("BORROWER_USER_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityIsNotNull() {
            addCriterion("BORROWER_USER_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityEqualTo(String value) {
            addCriterion("BORROWER_USER_IDENTITY =", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityNotEqualTo(String value) {
            addCriterion("BORROWER_USER_IDENTITY <>", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityGreaterThan(String value) {
            addCriterion("BORROWER_USER_IDENTITY >", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWER_USER_IDENTITY >=", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityLessThan(String value) {
            addCriterion("BORROWER_USER_IDENTITY <", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityLessThanOrEqualTo(String value) {
            addCriterion("BORROWER_USER_IDENTITY <=", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityLike(String value) {
            addCriterion("BORROWER_USER_IDENTITY like", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityNotLike(String value) {
            addCriterion("BORROWER_USER_IDENTITY not like", value, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityIn(List<String> values) {
            addCriterion("BORROWER_USER_IDENTITY in", values, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityNotIn(List<String> values) {
            addCriterion("BORROWER_USER_IDENTITY not in", values, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityBetween(String value1, String value2) {
            addCriterion("BORROWER_USER_IDENTITY between", value1, value2, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdentityNotBetween(String value1, String value2) {
            addCriterion("BORROWER_USER_IDENTITY not between", value1, value2, "borrowerUserIdentity");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdIsNull() {
            addCriterion("BORROWER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdIsNotNull() {
            addCriterion("BORROWER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdEqualTo(Long value) {
            addCriterion("BORROWER_USER_ID =", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdNotEqualTo(Long value) {
            addCriterion("BORROWER_USER_ID <>", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdGreaterThan(Long value) {
            addCriterion("BORROWER_USER_ID >", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BORROWER_USER_ID >=", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdLessThan(Long value) {
            addCriterion("BORROWER_USER_ID <", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("BORROWER_USER_ID <=", value, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdIn(List<Long> values) {
            addCriterion("BORROWER_USER_ID in", values, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdNotIn(List<Long> values) {
            addCriterion("BORROWER_USER_ID not in", values, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdBetween(Long value1, Long value2) {
            addCriterion("BORROWER_USER_ID between", value1, value2, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("BORROWER_USER_ID not between", value1, value2, "borrowerUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeIsNull() {
            addCriterion("BORROWER_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeIsNotNull() {
            addCriterion("BORROWER_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeEqualTo(Integer value) {
            addCriterion("BORROWER_ID_TYPE =", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeNotEqualTo(Integer value) {
            addCriterion("BORROWER_ID_TYPE <>", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeGreaterThan(Integer value) {
            addCriterion("BORROWER_ID_TYPE >", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BORROWER_ID_TYPE >=", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeLessThan(Integer value) {
            addCriterion("BORROWER_ID_TYPE <", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BORROWER_ID_TYPE <=", value, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeIn(List<Integer> values) {
            addCriterion("BORROWER_ID_TYPE in", values, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeNotIn(List<Integer> values) {
            addCriterion("BORROWER_ID_TYPE not in", values, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("BORROWER_ID_TYPE between", value1, value2, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BORROWER_ID_TYPE not between", value1, value2, "borrowerIdType");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberIsNull() {
            addCriterion("BORROWER_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberIsNotNull() {
            addCriterion("BORROWER_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberEqualTo(String value) {
            addCriterion("BORROWER_ID_NUMBER =", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberNotEqualTo(String value) {
            addCriterion("BORROWER_ID_NUMBER <>", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberGreaterThan(String value) {
            addCriterion("BORROWER_ID_NUMBER >", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWER_ID_NUMBER >=", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberLessThan(String value) {
            addCriterion("BORROWER_ID_NUMBER <", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberLessThanOrEqualTo(String value) {
            addCriterion("BORROWER_ID_NUMBER <=", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberLike(String value) {
            addCriterion("BORROWER_ID_NUMBER like", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberNotLike(String value) {
            addCriterion("BORROWER_ID_NUMBER not like", value, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberIn(List<String> values) {
            addCriterion("BORROWER_ID_NUMBER in", values, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberNotIn(List<String> values) {
            addCriterion("BORROWER_ID_NUMBER not in", values, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberBetween(String value1, String value2) {
            addCriterion("BORROWER_ID_NUMBER between", value1, value2, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNumberNotBetween(String value1, String value2) {
            addCriterion("BORROWER_ID_NUMBER not between", value1, value2, "borrowerIdNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIsNull() {
            addCriterion("BORROWER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIsNotNull() {
            addCriterion("BORROWER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameEqualTo(String value) {
            addCriterion("BORROWER_NAME =", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotEqualTo(String value) {
            addCriterion("BORROWER_NAME <>", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThan(String value) {
            addCriterion("BORROWER_NAME >", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWER_NAME >=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThan(String value) {
            addCriterion("BORROWER_NAME <", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThanOrEqualTo(String value) {
            addCriterion("BORROWER_NAME <=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLike(String value) {
            addCriterion("BORROWER_NAME like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotLike(String value) {
            addCriterion("BORROWER_NAME not like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIn(List<String> values) {
            addCriterion("BORROWER_NAME in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotIn(List<String> values) {
            addCriterion("BORROWER_NAME not in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameBetween(String value1, String value2) {
            addCriterion("BORROWER_NAME between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotBetween(String value1, String value2) {
            addCriterion("BORROWER_NAME not between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameIsNull() {
            addCriterion("BORROWER_ENTERPRISE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameIsNotNull() {
            addCriterion("BORROWER_ENTERPRISE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameEqualTo(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME =", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameNotEqualTo(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME <>", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameGreaterThan(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME >", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME >=", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameLessThan(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME <", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME <=", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameLike(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME like", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameNotLike(String value) {
            addCriterion("BORROWER_ENTERPRISE_NAME not like", value, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameIn(List<String> values) {
            addCriterion("BORROWER_ENTERPRISE_NAME in", values, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameNotIn(List<String> values) {
            addCriterion("BORROWER_ENTERPRISE_NAME not in", values, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameBetween(String value1, String value2) {
            addCriterion("BORROWER_ENTERPRISE_NAME between", value1, value2, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("BORROWER_ENTERPRISE_NAME not between", value1, value2, "borrowerEnterpriseName");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoIsNull() {
            addCriterion("BORROWER_BIZ_LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoIsNotNull() {
            addCriterion("BORROWER_BIZ_LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoEqualTo(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO =", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoNotEqualTo(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO <>", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoGreaterThan(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO >", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO >=", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoLessThan(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO <", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO <=", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoLike(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO like", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoNotLike(String value) {
            addCriterion("BORROWER_BIZ_LICENSE_NO not like", value, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoIn(List<String> values) {
            addCriterion("BORROWER_BIZ_LICENSE_NO in", values, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoNotIn(List<String> values) {
            addCriterion("BORROWER_BIZ_LICENSE_NO not in", values, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoBetween(String value1, String value2) {
            addCriterion("BORROWER_BIZ_LICENSE_NO between", value1, value2, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBorrowerBizLicenseNoNotBetween(String value1, String value2) {
            addCriterion("BORROWER_BIZ_LICENSE_NO not between", value1, value2, "borrowerBizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignIsNull() {
            addCriterion("OVERDUE_SUBROGATION_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignIsNotNull() {
            addCriterion("OVERDUE_SUBROGATION_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignEqualTo(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN =", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignNotEqualTo(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN <>", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignGreaterThan(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN >", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN >=", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignLessThan(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN <", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignLessThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_SUBROGATION_SIGN <=", value, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignIn(List<Integer> values) {
            addCriterion("OVERDUE_SUBROGATION_SIGN in", values, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignNotIn(List<Integer> values) {
            addCriterion("OVERDUE_SUBROGATION_SIGN not in", values, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_SUBROGATION_SIGN between", value1, value2, "overdueSubrogationSign");
            return (Criteria) this;
        }

        public Criteria andOverdueSubrogationSignNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_SUBROGATION_SIGN not between", value1, value2, "overdueSubrogationSign");
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