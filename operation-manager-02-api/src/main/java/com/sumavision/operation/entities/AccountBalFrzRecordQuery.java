package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountBalFrzRecordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public AccountBalFrzRecordQuery() {
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

        public Criteria andAssociateIdIsNull() {
            addCriterion("ASSOCIATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAssociateIdIsNotNull() {
            addCriterion("ASSOCIATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateIdEqualTo(Long value) {
            addCriterion("ASSOCIATE_ID =", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdNotEqualTo(Long value) {
            addCriterion("ASSOCIATE_ID <>", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdGreaterThan(Long value) {
            addCriterion("ASSOCIATE_ID >", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSOCIATE_ID >=", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdLessThan(Long value) {
            addCriterion("ASSOCIATE_ID <", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdLessThanOrEqualTo(Long value) {
            addCriterion("ASSOCIATE_ID <=", value, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdIn(List<Long> values) {
            addCriterion("ASSOCIATE_ID in", values, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdNotIn(List<Long> values) {
            addCriterion("ASSOCIATE_ID not in", values, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdBetween(Long value1, Long value2) {
            addCriterion("ASSOCIATE_ID between", value1, value2, "associateId");
            return (Criteria) this;
        }

        public Criteria andAssociateIdNotBetween(Long value1, Long value2) {
            addCriterion("ASSOCIATE_ID not between", value1, value2, "associateId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("SUM is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(BigDecimal value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(BigDecimal value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(BigDecimal value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(BigDecimal value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<BigDecimal> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<BigDecimal> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(Integer value) {
            addCriterion("OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(Integer value) {
            addCriterion("OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(Integer value) {
            addCriterion("OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(Integer value) {
            addCriterion("OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<Integer> values) {
            addCriterion("OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<Integer> values) {
            addCriterion("OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(Integer value1, Integer value2) {
            addCriterion("OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OP_TYPE not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("OP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("OP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("OP_TIME =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OP_TIME <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OP_TIME >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OP_TIME >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterionForJDBCDate("OP_TIME <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OP_TIME <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("OP_TIME in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OP_TIME not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OP_TIME between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OP_TIME not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpLocIsNull() {
            addCriterion("OP_LOC is null");
            return (Criteria) this;
        }

        public Criteria andOpLocIsNotNull() {
            addCriterion("OP_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andOpLocEqualTo(String value) {
            addCriterion("OP_LOC =", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocNotEqualTo(String value) {
            addCriterion("OP_LOC <>", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocGreaterThan(String value) {
            addCriterion("OP_LOC >", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocGreaterThanOrEqualTo(String value) {
            addCriterion("OP_LOC >=", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocLessThan(String value) {
            addCriterion("OP_LOC <", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocLessThanOrEqualTo(String value) {
            addCriterion("OP_LOC <=", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocLike(String value) {
            addCriterion("OP_LOC like", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocNotLike(String value) {
            addCriterion("OP_LOC not like", value, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocIn(List<String> values) {
            addCriterion("OP_LOC in", values, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocNotIn(List<String> values) {
            addCriterion("OP_LOC not in", values, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocBetween(String value1, String value2) {
            addCriterion("OP_LOC between", value1, value2, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpLocNotBetween(String value1, String value2) {
            addCriterion("OP_LOC not between", value1, value2, "opLoc");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("OP_USER is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("OP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(String value) {
            addCriterion("OP_USER =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(String value) {
            addCriterion("OP_USER <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(String value) {
            addCriterion("OP_USER >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(String value) {
            addCriterion("OP_USER >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(String value) {
            addCriterion("OP_USER <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(String value) {
            addCriterion("OP_USER <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLike(String value) {
            addCriterion("OP_USER like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotLike(String value) {
            addCriterion("OP_USER not like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<String> values) {
            addCriterion("OP_USER in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<String> values) {
            addCriterion("OP_USER not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(String value1, String value2) {
            addCriterion("OP_USER between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(String value1, String value2) {
            addCriterion("OP_USER not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpProcessIsNull() {
            addCriterion("OP_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andOpProcessIsNotNull() {
            addCriterion("OP_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andOpProcessEqualTo(String value) {
            addCriterion("OP_PROCESS =", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessNotEqualTo(String value) {
            addCriterion("OP_PROCESS <>", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessGreaterThan(String value) {
            addCriterion("OP_PROCESS >", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessGreaterThanOrEqualTo(String value) {
            addCriterion("OP_PROCESS >=", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessLessThan(String value) {
            addCriterion("OP_PROCESS <", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessLessThanOrEqualTo(String value) {
            addCriterion("OP_PROCESS <=", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessLike(String value) {
            addCriterion("OP_PROCESS like", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessNotLike(String value) {
            addCriterion("OP_PROCESS not like", value, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessIn(List<String> values) {
            addCriterion("OP_PROCESS in", values, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessNotIn(List<String> values) {
            addCriterion("OP_PROCESS not in", values, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessBetween(String value1, String value2) {
            addCriterion("OP_PROCESS between", value1, value2, "opProcess");
            return (Criteria) this;
        }

        public Criteria andOpProcessNotBetween(String value1, String value2) {
            addCriterion("OP_PROCESS not between", value1, value2, "opProcess");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableKeyIsNull() {
            addCriterion("TABLE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andTableKeyIsNotNull() {
            addCriterion("TABLE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andTableKeyEqualTo(Long value) {
            addCriterion("TABLE_KEY =", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyNotEqualTo(Long value) {
            addCriterion("TABLE_KEY <>", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyGreaterThan(Long value) {
            addCriterion("TABLE_KEY >", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("TABLE_KEY >=", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyLessThan(Long value) {
            addCriterion("TABLE_KEY <", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyLessThanOrEqualTo(Long value) {
            addCriterion("TABLE_KEY <=", value, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyIn(List<Long> values) {
            addCriterion("TABLE_KEY in", values, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyNotIn(List<Long> values) {
            addCriterion("TABLE_KEY not in", values, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyBetween(Long value1, Long value2) {
            addCriterion("TABLE_KEY between", value1, value2, "tableKey");
            return (Criteria) this;
        }

        public Criteria andTableKeyNotBetween(Long value1, Long value2) {
            addCriterion("TABLE_KEY not between", value1, value2, "tableKey");
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