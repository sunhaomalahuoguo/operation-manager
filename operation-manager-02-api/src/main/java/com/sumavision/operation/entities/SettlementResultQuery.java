package com.sumavision.operation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SettlementResultQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SettlementResultQuery() {
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

        public Criteria andBizTypeIsNull() {
            addCriterion("BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Integer value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Integer value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Integer value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Integer value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Integer> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Integer> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("SETTLEMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("SETTLEMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_TIME <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_TIME in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_TIME not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_TIME between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_TIME not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginIsNull() {
            addCriterion("SETTLEMENT_PERIOD_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginIsNotNull() {
            addCriterion("SETTLEMENT_PERIOD_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN =", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN <>", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN >", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN >=", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginLessThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN <", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN <=", value, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN in", values, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN not in", values, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN between", value1, value2, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_BEGIN not between", value1, value2, "settlementPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndIsNull() {
            addCriterion("SETTLEMENT_PERIOD_END is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndIsNotNull() {
            addCriterion("SETTLEMENT_PERIOD_END is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END =", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END <>", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndGreaterThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END >", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END >=", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndLessThan(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END <", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END <=", value, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END in", values, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END not in", values, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END between", value1, value2, "settlementPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLEMENT_PERIOD_END not between", value1, value2, "settlementPeriodEnd");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
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