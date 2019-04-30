package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerAccountTransferRequestQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerAccountTransferRequestQuery() {
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

        public Criteria andOutAccountTypeIsNull() {
            addCriterion("OUT_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeIsNotNull() {
            addCriterion("OUT_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeEqualTo(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE =", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeNotEqualTo(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE <>", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeGreaterThan(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE >", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE >=", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeLessThan(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE <", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_ACCOUNT_TYPE <=", value, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeIn(List<Integer> values) {
            addCriterion("OUT_ACCOUNT_TYPE in", values, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeNotIn(List<Integer> values) {
            addCriterion("OUT_ACCOUNT_TYPE not in", values, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("OUT_ACCOUNT_TYPE between", value1, value2, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andOutAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_ACCOUNT_TYPE not between", value1, value2, "outAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeIsNull() {
            addCriterion("IN_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeIsNotNull() {
            addCriterion("IN_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeEqualTo(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE =", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeNotEqualTo(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE <>", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeGreaterThan(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE >", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE >=", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeLessThan(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE <", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("IN_ACCOUNT_TYPE <=", value, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeIn(List<Integer> values) {
            addCriterion("IN_ACCOUNT_TYPE in", values, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeNotIn(List<Integer> values) {
            addCriterion("IN_ACCOUNT_TYPE not in", values, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("IN_ACCOUNT_TYPE between", value1, value2, "inAccountType");
            return (Criteria) this;
        }

        public Criteria andInAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("IN_ACCOUNT_TYPE not between", value1, value2, "inAccountType");
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

        public Criteria andRequestOpratorIsNull() {
            addCriterion("REQUEST_OPRATOR is null");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorIsNotNull() {
            addCriterion("REQUEST_OPRATOR is not null");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorEqualTo(String value) {
            addCriterion("REQUEST_OPRATOR =", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorNotEqualTo(String value) {
            addCriterion("REQUEST_OPRATOR <>", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorGreaterThan(String value) {
            addCriterion("REQUEST_OPRATOR >", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_OPRATOR >=", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorLessThan(String value) {
            addCriterion("REQUEST_OPRATOR <", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_OPRATOR <=", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorLike(String value) {
            addCriterion("REQUEST_OPRATOR like", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorNotLike(String value) {
            addCriterion("REQUEST_OPRATOR not like", value, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorIn(List<String> values) {
            addCriterion("REQUEST_OPRATOR in", values, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorNotIn(List<String> values) {
            addCriterion("REQUEST_OPRATOR not in", values, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorBetween(String value1, String value2) {
            addCriterion("REQUEST_OPRATOR between", value1, value2, "requestOprator");
            return (Criteria) this;
        }

        public Criteria andRequestOpratorNotBetween(String value1, String value2) {
            addCriterion("REQUEST_OPRATOR not between", value1, value2, "requestOprator");
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

        public Criteria andDealOpeatorIsNull() {
            addCriterion("DEAL_OPEATOR is null");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorIsNotNull() {
            addCriterion("DEAL_OPEATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorEqualTo(String value) {
            addCriterion("DEAL_OPEATOR =", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorNotEqualTo(String value) {
            addCriterion("DEAL_OPEATOR <>", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorGreaterThan(String value) {
            addCriterion("DEAL_OPEATOR >", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_OPEATOR >=", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorLessThan(String value) {
            addCriterion("DEAL_OPEATOR <", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorLessThanOrEqualTo(String value) {
            addCriterion("DEAL_OPEATOR <=", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorLike(String value) {
            addCriterion("DEAL_OPEATOR like", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorNotLike(String value) {
            addCriterion("DEAL_OPEATOR not like", value, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorIn(List<String> values) {
            addCriterion("DEAL_OPEATOR in", values, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorNotIn(List<String> values) {
            addCriterion("DEAL_OPEATOR not in", values, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorBetween(String value1, String value2) {
            addCriterion("DEAL_OPEATOR between", value1, value2, "dealOpeator");
            return (Criteria) this;
        }

        public Criteria andDealOpeatorNotBetween(String value1, String value2) {
            addCriterion("DEAL_OPEATOR not between", value1, value2, "dealOpeator");
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

        public Criteria andFailureInfoIsNull() {
            addCriterion("FAILURE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andFailureInfoIsNotNull() {
            addCriterion("FAILURE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andFailureInfoEqualTo(String value) {
            addCriterion("FAILURE_INFO =", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoNotEqualTo(String value) {
            addCriterion("FAILURE_INFO <>", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoGreaterThan(String value) {
            addCriterion("FAILURE_INFO >", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoGreaterThanOrEqualTo(String value) {
            addCriterion("FAILURE_INFO >=", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoLessThan(String value) {
            addCriterion("FAILURE_INFO <", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoLessThanOrEqualTo(String value) {
            addCriterion("FAILURE_INFO <=", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoLike(String value) {
            addCriterion("FAILURE_INFO like", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoNotLike(String value) {
            addCriterion("FAILURE_INFO not like", value, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoIn(List<String> values) {
            addCriterion("FAILURE_INFO in", values, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoNotIn(List<String> values) {
            addCriterion("FAILURE_INFO not in", values, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoBetween(String value1, String value2) {
            addCriterion("FAILURE_INFO between", value1, value2, "failureInfo");
            return (Criteria) this;
        }

        public Criteria andFailureInfoNotBetween(String value1, String value2) {
            addCriterion("FAILURE_INFO not between", value1, value2, "failureInfo");
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

        public Criteria andMerInfoIsNull() {
            addCriterion("MER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andMerInfoIsNotNull() {
            addCriterion("MER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andMerInfoEqualTo(String value) {
            addCriterion("MER_INFO =", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotEqualTo(String value) {
            addCriterion("MER_INFO <>", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoGreaterThan(String value) {
            addCriterion("MER_INFO >", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("MER_INFO >=", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLessThan(String value) {
            addCriterion("MER_INFO <", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLessThanOrEqualTo(String value) {
            addCriterion("MER_INFO <=", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLike(String value) {
            addCriterion("MER_INFO like", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotLike(String value) {
            addCriterion("MER_INFO not like", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoIn(List<String> values) {
            addCriterion("MER_INFO in", values, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotIn(List<String> values) {
            addCriterion("MER_INFO not in", values, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoBetween(String value1, String value2) {
            addCriterion("MER_INFO between", value1, value2, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotBetween(String value1, String value2) {
            addCriterion("MER_INFO not between", value1, value2, "merInfo");
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