package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupplyTradeRecordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SupplyTradeRecordQuery() {
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

        public Criteria andTradeCodeIsNull() {
            addCriterion("TRADE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNotNull() {
            addCriterion("TRADE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeEqualTo(String value) {
            addCriterion("TRADE_CODE =", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotEqualTo(String value) {
            addCriterion("TRADE_CODE <>", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThan(String value) {
            addCriterion("TRADE_CODE >", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_CODE >=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThan(String value) {
            addCriterion("TRADE_CODE <", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_CODE <=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLike(String value) {
            addCriterion("TRADE_CODE like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotLike(String value) {
            addCriterion("TRADE_CODE not like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIn(List<String> values) {
            addCriterion("TRADE_CODE in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotIn(List<String> values) {
            addCriterion("TRADE_CODE not in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeBetween(String value1, String value2) {
            addCriterion("TRADE_CODE between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotBetween(String value1, String value2) {
            addCriterion("TRADE_CODE not between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdIsNull() {
            addCriterion("ORIGINAL_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdIsNotNull() {
            addCriterion("ORIGINAL_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdEqualTo(Long value) {
            addCriterion("ORIGINAL_TRADE_ID =", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdNotEqualTo(Long value) {
            addCriterion("ORIGINAL_TRADE_ID <>", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdGreaterThan(Long value) {
            addCriterion("ORIGINAL_TRADE_ID >", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_TRADE_ID >=", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdLessThan(Long value) {
            addCriterion("ORIGINAL_TRADE_ID <", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_TRADE_ID <=", value, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdIn(List<Long> values) {
            addCriterion("ORIGINAL_TRADE_ID in", values, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdNotIn(List<Long> values) {
            addCriterion("ORIGINAL_TRADE_ID not in", values, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_TRADE_ID between", value1, value2, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_TRADE_ID not between", value1, value2, "originalTradeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeIsNull() {
            addCriterion("ORIGINAL_TRADE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeIsNotNull() {
            addCriterion("ORIGINAL_TRADE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeEqualTo(String value) {
            addCriterion("ORIGINAL_TRADE_CODE =", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeNotEqualTo(String value) {
            addCriterion("ORIGINAL_TRADE_CODE <>", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeGreaterThan(String value) {
            addCriterion("ORIGINAL_TRADE_CODE >", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_TRADE_CODE >=", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeLessThan(String value) {
            addCriterion("ORIGINAL_TRADE_CODE <", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_TRADE_CODE <=", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeLike(String value) {
            addCriterion("ORIGINAL_TRADE_CODE like", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeNotLike(String value) {
            addCriterion("ORIGINAL_TRADE_CODE not like", value, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeIn(List<String> values) {
            addCriterion("ORIGINAL_TRADE_CODE in", values, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeNotIn(List<String> values) {
            addCriterion("ORIGINAL_TRADE_CODE not in", values, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeBetween(String value1, String value2) {
            addCriterion("ORIGINAL_TRADE_CODE between", value1, value2, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andOriginalTradeCodeNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_TRADE_CODE not between", value1, value2, "originalTradeCode");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorIsNull() {
            addCriterion("SUPPLY_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorIsNotNull() {
            addCriterion("SUPPLY_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorEqualTo(String value) {
            addCriterion("SUPPLY_OPERATOR =", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorNotEqualTo(String value) {
            addCriterion("SUPPLY_OPERATOR <>", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorGreaterThan(String value) {
            addCriterion("SUPPLY_OPERATOR >", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_OPERATOR >=", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorLessThan(String value) {
            addCriterion("SUPPLY_OPERATOR <", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_OPERATOR <=", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorLike(String value) {
            addCriterion("SUPPLY_OPERATOR like", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorNotLike(String value) {
            addCriterion("SUPPLY_OPERATOR not like", value, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorIn(List<String> values) {
            addCriterion("SUPPLY_OPERATOR in", values, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorNotIn(List<String> values) {
            addCriterion("SUPPLY_OPERATOR not in", values, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorBetween(String value1, String value2) {
            addCriterion("SUPPLY_OPERATOR between", value1, value2, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyOperatorNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_OPERATOR not between", value1, value2, "supplyOperator");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIsNull() {
            addCriterion("SUPPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIsNotNull() {
            addCriterion("SUPPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME =", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME <>", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME >", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME >=", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeLessThan(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME <", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SUPPLY_TIME <=", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SUPPLY_TIME in", values, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SUPPLY_TIME not in", values, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SUPPLY_TIME between", value1, value2, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SUPPLY_TIME not between", value1, value2, "supplyTime");
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

        public Criteria andTradeUserIsNull() {
            addCriterion("TRADE_USER is null");
            return (Criteria) this;
        }

        public Criteria andTradeUserIsNotNull() {
            addCriterion("TRADE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUserEqualTo(String value) {
            addCriterion("TRADE_USER =", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserNotEqualTo(String value) {
            addCriterion("TRADE_USER <>", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserGreaterThan(String value) {
            addCriterion("TRADE_USER >", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_USER >=", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserLessThan(String value) {
            addCriterion("TRADE_USER <", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserLessThanOrEqualTo(String value) {
            addCriterion("TRADE_USER <=", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserLike(String value) {
            addCriterion("TRADE_USER like", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserNotLike(String value) {
            addCriterion("TRADE_USER not like", value, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserIn(List<String> values) {
            addCriterion("TRADE_USER in", values, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserNotIn(List<String> values) {
            addCriterion("TRADE_USER not in", values, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserBetween(String value1, String value2) {
            addCriterion("TRADE_USER between", value1, value2, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeUserNotBetween(String value1, String value2) {
            addCriterion("TRADE_USER not between", value1, value2, "tradeUser");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeIsNull() {
            addCriterion("TRADE_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeIsNotNull() {
            addCriterion("TRADE_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME =", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME <>", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME >", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME >=", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME <", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_START_TIME <=", value, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TRADE_START_TIME in", values, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRADE_START_TIME not in", values, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRADE_START_TIME between", value1, value2, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRADE_START_TIME not between", value1, value2, "tradeStartTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeIsNull() {
            addCriterion("TRADE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeIsNotNull() {
            addCriterion("TRADE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME =", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME <>", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME >", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME >=", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME <", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRADE_END_TIME <=", value, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TRADE_END_TIME in", values, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRADE_END_TIME not in", values, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRADE_END_TIME between", value1, value2, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andTradeEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRADE_END_TIME not between", value1, value2, "tradeEndTime");
            return (Criteria) this;
        }

        public Criteria andFiscalDateIsNull() {
            addCriterion("FISCAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFiscalDateIsNotNull() {
            addCriterion("FISCAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFiscalDateEqualTo(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE =", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE <>", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE >", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE >=", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateLessThan(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE <", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FISCAL_DATE <=", value, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateIn(List<Date> values) {
            addCriterionForJDBCDate("FISCAL_DATE in", values, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FISCAL_DATE not in", values, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FISCAL_DATE between", value1, value2, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andFiscalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FISCAL_DATE not between", value1, value2, "fiscalDate");
            return (Criteria) this;
        }

        public Criteria andTradeSumIsNull() {
            addCriterion("TRADE_SUM is null");
            return (Criteria) this;
        }

        public Criteria andTradeSumIsNotNull() {
            addCriterion("TRADE_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSumEqualTo(BigDecimal value) {
            addCriterion("TRADE_SUM =", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_SUM <>", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumGreaterThan(BigDecimal value) {
            addCriterion("TRADE_SUM >", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_SUM >=", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumLessThan(BigDecimal value) {
            addCriterion("TRADE_SUM <", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_SUM <=", value, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumIn(List<BigDecimal> values) {
            addCriterion("TRADE_SUM in", values, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_SUM not in", values, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_SUM between", value1, value2, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_SUM not between", value1, value2, "tradeSum");
            return (Criteria) this;
        }

        public Criteria andTradeLocIsNull() {
            addCriterion("TRADE_LOC is null");
            return (Criteria) this;
        }

        public Criteria andTradeLocIsNotNull() {
            addCriterion("TRADE_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeLocEqualTo(String value) {
            addCriterion("TRADE_LOC =", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocNotEqualTo(String value) {
            addCriterion("TRADE_LOC <>", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocGreaterThan(String value) {
            addCriterion("TRADE_LOC >", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_LOC >=", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocLessThan(String value) {
            addCriterion("TRADE_LOC <", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocLessThanOrEqualTo(String value) {
            addCriterion("TRADE_LOC <=", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocLike(String value) {
            addCriterion("TRADE_LOC like", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocNotLike(String value) {
            addCriterion("TRADE_LOC not like", value, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocIn(List<String> values) {
            addCriterion("TRADE_LOC in", values, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocNotIn(List<String> values) {
            addCriterion("TRADE_LOC not in", values, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocBetween(String value1, String value2) {
            addCriterion("TRADE_LOC between", value1, value2, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeLocNotBetween(String value1, String value2) {
            addCriterion("TRADE_LOC not between", value1, value2, "tradeLoc");
            return (Criteria) this;
        }

        public Criteria andTradeProcessIsNull() {
            addCriterion("TRADE_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andTradeProcessIsNotNull() {
            addCriterion("TRADE_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andTradeProcessEqualTo(String value) {
            addCriterion("TRADE_PROCESS =", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessNotEqualTo(String value) {
            addCriterion("TRADE_PROCESS <>", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessGreaterThan(String value) {
            addCriterion("TRADE_PROCESS >", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_PROCESS >=", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessLessThan(String value) {
            addCriterion("TRADE_PROCESS <", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessLessThanOrEqualTo(String value) {
            addCriterion("TRADE_PROCESS <=", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessLike(String value) {
            addCriterion("TRADE_PROCESS like", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessNotLike(String value) {
            addCriterion("TRADE_PROCESS not like", value, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessIn(List<String> values) {
            addCriterion("TRADE_PROCESS in", values, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessNotIn(List<String> values) {
            addCriterion("TRADE_PROCESS not in", values, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessBetween(String value1, String value2) {
            addCriterion("TRADE_PROCESS between", value1, value2, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andTradeProcessNotBetween(String value1, String value2) {
            addCriterion("TRADE_PROCESS not between", value1, value2, "tradeProcess");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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

        public Criteria andFiscalStatusIsNull() {
            addCriterion("FISCAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusIsNotNull() {
            addCriterion("FISCAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusEqualTo(Integer value) {
            addCriterion("FISCAL_STATUS =", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusNotEqualTo(Integer value) {
            addCriterion("FISCAL_STATUS <>", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusGreaterThan(Integer value) {
            addCriterion("FISCAL_STATUS >", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("FISCAL_STATUS >=", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusLessThan(Integer value) {
            addCriterion("FISCAL_STATUS <", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("FISCAL_STATUS <=", value, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusIn(List<Integer> values) {
            addCriterion("FISCAL_STATUS in", values, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusNotIn(List<Integer> values) {
            addCriterion("FISCAL_STATUS not in", values, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusBetween(Integer value1, Integer value2) {
            addCriterion("FISCAL_STATUS between", value1, value2, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andFiscalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("FISCAL_STATUS not between", value1, value2, "fiscalStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusIsNull() {
            addCriterion("MANUAL_ADJUST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusIsNotNull() {
            addCriterion("MANUAL_ADJUST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusEqualTo(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS =", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusNotEqualTo(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS <>", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusGreaterThan(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS >", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS >=", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusLessThan(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS <", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusLessThanOrEqualTo(Integer value) {
            addCriterion("MANUAL_ADJUST_STATUS <=", value, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusIn(List<Integer> values) {
            addCriterion("MANUAL_ADJUST_STATUS in", values, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusNotIn(List<Integer> values) {
            addCriterion("MANUAL_ADJUST_STATUS not in", values, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusBetween(Integer value1, Integer value2) {
            addCriterion("MANUAL_ADJUST_STATUS between", value1, value2, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("MANUAL_ADJUST_STATUS not between", value1, value2, "manualAdjustStatus");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeIsNull() {
            addCriterion("MANUAL_ADJUST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeIsNotNull() {
            addCriterion("MANUAL_ADJUST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME =", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME <>", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME >", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME >=", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeLessThan(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME <", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME <=", value, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeIn(List<Date> values) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME in", values, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME not in", values, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME between", value1, value2, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANUAL_ADJUST_TIME not between", value1, value2, "manualAdjustTime");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateIsNull() {
            addCriterion("MANUAL_ADJUST_FISCAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateIsNotNull() {
            addCriterion("MANUAL_ADJUST_FISCAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE =", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE <>", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE >", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE >=", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateLessThan(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE <", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE <=", value, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateIn(List<Date> values) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE in", values, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE not in", values, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE between", value1, value2, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andManualAdjustFiscalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MANUAL_ADJUST_FISCAL_DATE not between", value1, value2, "manualAdjustFiscalDate");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdIsNull() {
            addCriterion("ADJUST_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdIsNotNull() {
            addCriterion("ADJUST_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdEqualTo(Long value) {
            addCriterion("ADJUST_LOG_ID =", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdNotEqualTo(Long value) {
            addCriterion("ADJUST_LOG_ID <>", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdGreaterThan(Long value) {
            addCriterion("ADJUST_LOG_ID >", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ADJUST_LOG_ID >=", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdLessThan(Long value) {
            addCriterion("ADJUST_LOG_ID <", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdLessThanOrEqualTo(Long value) {
            addCriterion("ADJUST_LOG_ID <=", value, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdIn(List<Long> values) {
            addCriterion("ADJUST_LOG_ID in", values, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdNotIn(List<Long> values) {
            addCriterion("ADJUST_LOG_ID not in", values, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdBetween(Long value1, Long value2) {
            addCriterion("ADJUST_LOG_ID between", value1, value2, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andAdjustLogIdNotBetween(Long value1, Long value2) {
            addCriterion("ADJUST_LOG_ID not between", value1, value2, "adjustLogId");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIsNull() {
            addCriterion("OPERATOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIsNotNull() {
            addCriterion("OPERATOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeEqualTo(String value) {
            addCriterion("OPERATOR_CODE =", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotEqualTo(String value) {
            addCriterion("OPERATOR_CODE <>", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeGreaterThan(String value) {
            addCriterion("OPERATOR_CODE >", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_CODE >=", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLessThan(String value) {
            addCriterion("OPERATOR_CODE <", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_CODE <=", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLike(String value) {
            addCriterion("OPERATOR_CODE like", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotLike(String value) {
            addCriterion("OPERATOR_CODE not like", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIn(List<String> values) {
            addCriterion("OPERATOR_CODE in", values, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotIn(List<String> values) {
            addCriterion("OPERATOR_CODE not in", values, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeBetween(String value1, String value2) {
            addCriterion("OPERATOR_CODE between", value1, value2, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_CODE not between", value1, value2, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andExceptionRecIsNull() {
            addCriterion("EXCEPTION_REC is null");
            return (Criteria) this;
        }

        public Criteria andExceptionRecIsNotNull() {
            addCriterion("EXCEPTION_REC is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionRecEqualTo(String value) {
            addCriterion("EXCEPTION_REC =", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecNotEqualTo(String value) {
            addCriterion("EXCEPTION_REC <>", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecGreaterThan(String value) {
            addCriterion("EXCEPTION_REC >", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_REC >=", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecLessThan(String value) {
            addCriterion("EXCEPTION_REC <", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_REC <=", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecLike(String value) {
            addCriterion("EXCEPTION_REC like", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecNotLike(String value) {
            addCriterion("EXCEPTION_REC not like", value, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecIn(List<String> values) {
            addCriterion("EXCEPTION_REC in", values, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecNotIn(List<String> values) {
            addCriterion("EXCEPTION_REC not in", values, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecBetween(String value1, String value2) {
            addCriterion("EXCEPTION_REC between", value1, value2, "exceptionRec");
            return (Criteria) this;
        }

        public Criteria andExceptionRecNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_REC not between", value1, value2, "exceptionRec");
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

        public Criteria andLastEditorIsNull() {
            addCriterion("LAST_EDITOR is null");
            return (Criteria) this;
        }

        public Criteria andLastEditorIsNotNull() {
            addCriterion("LAST_EDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditorEqualTo(String value) {
            addCriterion("LAST_EDITOR =", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorNotEqualTo(String value) {
            addCriterion("LAST_EDITOR <>", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorGreaterThan(String value) {
            addCriterion("LAST_EDITOR >", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_EDITOR >=", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorLessThan(String value) {
            addCriterion("LAST_EDITOR <", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorLessThanOrEqualTo(String value) {
            addCriterion("LAST_EDITOR <=", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorLike(String value) {
            addCriterion("LAST_EDITOR like", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorNotLike(String value) {
            addCriterion("LAST_EDITOR not like", value, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorIn(List<String> values) {
            addCriterion("LAST_EDITOR in", values, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorNotIn(List<String> values) {
            addCriterion("LAST_EDITOR not in", values, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorBetween(String value1, String value2) {
            addCriterion("LAST_EDITOR between", value1, value2, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditorNotBetween(String value1, String value2) {
            addCriterion("LAST_EDITOR not between", value1, value2, "lastEditor");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessIsNull() {
            addCriterion("LAST_EDIT_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessIsNotNull() {
            addCriterion("LAST_EDIT_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessEqualTo(String value) {
            addCriterion("LAST_EDIT_PROCESS =", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessNotEqualTo(String value) {
            addCriterion("LAST_EDIT_PROCESS <>", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessGreaterThan(String value) {
            addCriterion("LAST_EDIT_PROCESS >", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_EDIT_PROCESS >=", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessLessThan(String value) {
            addCriterion("LAST_EDIT_PROCESS <", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessLessThanOrEqualTo(String value) {
            addCriterion("LAST_EDIT_PROCESS <=", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessLike(String value) {
            addCriterion("LAST_EDIT_PROCESS like", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessNotLike(String value) {
            addCriterion("LAST_EDIT_PROCESS not like", value, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessIn(List<String> values) {
            addCriterion("LAST_EDIT_PROCESS in", values, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessNotIn(List<String> values) {
            addCriterion("LAST_EDIT_PROCESS not in", values, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessBetween(String value1, String value2) {
            addCriterion("LAST_EDIT_PROCESS between", value1, value2, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andLastEditProcessNotBetween(String value1, String value2) {
            addCriterion("LAST_EDIT_PROCESS not between", value1, value2, "lastEditProcess");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("VERIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("VERIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("VERIFY_CODE =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("VERIFY_CODE <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("VERIFY_CODE >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("VERIFY_CODE <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("VERIFY_CODE like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("VERIFY_CODE not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("VERIFY_CODE in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("VERIFY_CODE not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE not between", value1, value2, "verifyCode");
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

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("ACCOUNT_ID like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("ACCOUNT_ID not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("PROVIDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("PROVIDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(String value) {
            addCriterion("PROVIDER_ID =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(String value) {
            addCriterion("PROVIDER_ID <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(String value) {
            addCriterion("PROVIDER_ID >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_ID >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(String value) {
            addCriterion("PROVIDER_ID <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_ID <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLike(String value) {
            addCriterion("PROVIDER_ID like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotLike(String value) {
            addCriterion("PROVIDER_ID not like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<String> values) {
            addCriterion("PROVIDER_ID in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<String> values) {
            addCriterion("PROVIDER_ID not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(String value1, String value2) {
            addCriterion("PROVIDER_ID between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_ID not between", value1, value2, "providerId");
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

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNull() {
            addCriterion("BANK_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNotNull() {
            addCriterion("BANK_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeEqualTo(Integer value) {
            addCriterion("BANK_CARD_TYPE =", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotEqualTo(Integer value) {
            addCriterion("BANK_CARD_TYPE <>", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThan(Integer value) {
            addCriterion("BANK_CARD_TYPE >", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANK_CARD_TYPE >=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThan(Integer value) {
            addCriterion("BANK_CARD_TYPE <", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BANK_CARD_TYPE <=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIn(List<Integer> values) {
            addCriterion("BANK_CARD_TYPE in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotIn(List<Integer> values) {
            addCriterion("BANK_CARD_TYPE not in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("BANK_CARD_TYPE between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BANK_CARD_TYPE not between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankSnIsNull() {
            addCriterion("BANK_SN is null");
            return (Criteria) this;
        }

        public Criteria andBankSnIsNotNull() {
            addCriterion("BANK_SN is not null");
            return (Criteria) this;
        }

        public Criteria andBankSnEqualTo(String value) {
            addCriterion("BANK_SN =", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnNotEqualTo(String value) {
            addCriterion("BANK_SN <>", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnGreaterThan(String value) {
            addCriterion("BANK_SN >", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_SN >=", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnLessThan(String value) {
            addCriterion("BANK_SN <", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnLessThanOrEqualTo(String value) {
            addCriterion("BANK_SN <=", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnLike(String value) {
            addCriterion("BANK_SN like", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnNotLike(String value) {
            addCriterion("BANK_SN not like", value, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnIn(List<String> values) {
            addCriterion("BANK_SN in", values, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnNotIn(List<String> values) {
            addCriterion("BANK_SN not in", values, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnBetween(String value1, String value2) {
            addCriterion("BANK_SN between", value1, value2, "bankSn");
            return (Criteria) this;
        }

        public Criteria andBankSnNotBetween(String value1, String value2) {
            addCriterion("BANK_SN not between", value1, value2, "bankSn");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdIsNull() {
            addCriterion("DEST_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDestUserIdIsNotNull() {
            addCriterion("DEST_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDestUserIdEqualTo(Long value) {
            addCriterion("DEST_USER_ID =", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdNotEqualTo(Long value) {
            addCriterion("DEST_USER_ID <>", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdGreaterThan(Long value) {
            addCriterion("DEST_USER_ID >", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEST_USER_ID >=", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdLessThan(Long value) {
            addCriterion("DEST_USER_ID <", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdLessThanOrEqualTo(Long value) {
            addCriterion("DEST_USER_ID <=", value, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdIn(List<Long> values) {
            addCriterion("DEST_USER_ID in", values, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdNotIn(List<Long> values) {
            addCriterion("DEST_USER_ID not in", values, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdBetween(Long value1, Long value2) {
            addCriterion("DEST_USER_ID between", value1, value2, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestUserIdNotBetween(Long value1, Long value2) {
            addCriterion("DEST_USER_ID not between", value1, value2, "destUserId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdIsNull() {
            addCriterion("DEST_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdIsNotNull() {
            addCriterion("DEST_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdEqualTo(Long value) {
            addCriterion("DEST_ACCOUNT_ID =", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdNotEqualTo(Long value) {
            addCriterion("DEST_ACCOUNT_ID <>", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdGreaterThan(Long value) {
            addCriterion("DEST_ACCOUNT_ID >", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEST_ACCOUNT_ID >=", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdLessThan(Long value) {
            addCriterion("DEST_ACCOUNT_ID <", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("DEST_ACCOUNT_ID <=", value, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdIn(List<Long> values) {
            addCriterion("DEST_ACCOUNT_ID in", values, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdNotIn(List<Long> values) {
            addCriterion("DEST_ACCOUNT_ID not in", values, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdBetween(Long value1, Long value2) {
            addCriterion("DEST_ACCOUNT_ID between", value1, value2, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andDestAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("DEST_ACCOUNT_ID not between", value1, value2, "destAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountPayIsNull() {
            addCriterion("ACCOUNT_PAY is null");
            return (Criteria) this;
        }

        public Criteria andAccountPayIsNotNull() {
            addCriterion("ACCOUNT_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPayEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_PAY =", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_PAY <>", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNT_PAY >", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_PAY >=", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayLessThan(BigDecimal value) {
            addCriterion("ACCOUNT_PAY <", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_PAY <=", value, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_PAY in", values, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_PAY not in", values, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_PAY between", value1, value2, "accountPay");
            return (Criteria) this;
        }

        public Criteria andAccountPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_PAY not between", value1, value2, "accountPay");
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

        public Criteria andTradeDescIsNull() {
            addCriterion("TRADE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTradeDescIsNotNull() {
            addCriterion("TRADE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDescEqualTo(String value) {
            addCriterion("TRADE_DESC =", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotEqualTo(String value) {
            addCriterion("TRADE_DESC <>", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThan(String value) {
            addCriterion("TRADE_DESC >", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC >=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThan(String value) {
            addCriterion("TRADE_DESC <", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC <=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLike(String value) {
            addCriterion("TRADE_DESC like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotLike(String value) {
            addCriterion("TRADE_DESC not like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescIn(List<String> values) {
            addCriterion("TRADE_DESC in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotIn(List<String> values) {
            addCriterion("TRADE_DESC not in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescBetween(String value1, String value2) {
            addCriterion("TRADE_DESC between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotBetween(String value1, String value2) {
            addCriterion("TRADE_DESC not between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgIsNull() {
            addCriterion("TIMEOUT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgIsNotNull() {
            addCriterion("TIMEOUT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgEqualTo(Integer value) {
            addCriterion("TIMEOUT_FLG =", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgNotEqualTo(Integer value) {
            addCriterion("TIMEOUT_FLG <>", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgGreaterThan(Integer value) {
            addCriterion("TIMEOUT_FLG >", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIMEOUT_FLG >=", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgLessThan(Integer value) {
            addCriterion("TIMEOUT_FLG <", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgLessThanOrEqualTo(Integer value) {
            addCriterion("TIMEOUT_FLG <=", value, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgIn(List<Integer> values) {
            addCriterion("TIMEOUT_FLG in", values, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgNotIn(List<Integer> values) {
            addCriterion("TIMEOUT_FLG not in", values, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgBetween(Integer value1, Integer value2) {
            addCriterion("TIMEOUT_FLG between", value1, value2, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andTimeoutFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("TIMEOUT_FLG not between", value1, value2, "timeoutFlg");
            return (Criteria) this;
        }

        public Criteria andPassThroughIsNull() {
            addCriterion("PASS_THROUGH is null");
            return (Criteria) this;
        }

        public Criteria andPassThroughIsNotNull() {
            addCriterion("PASS_THROUGH is not null");
            return (Criteria) this;
        }

        public Criteria andPassThroughEqualTo(String value) {
            addCriterion("PASS_THROUGH =", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughNotEqualTo(String value) {
            addCriterion("PASS_THROUGH <>", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughGreaterThan(String value) {
            addCriterion("PASS_THROUGH >", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_THROUGH >=", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughLessThan(String value) {
            addCriterion("PASS_THROUGH <", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughLessThanOrEqualTo(String value) {
            addCriterion("PASS_THROUGH <=", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughLike(String value) {
            addCriterion("PASS_THROUGH like", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughNotLike(String value) {
            addCriterion("PASS_THROUGH not like", value, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughIn(List<String> values) {
            addCriterion("PASS_THROUGH in", values, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughNotIn(List<String> values) {
            addCriterion("PASS_THROUGH not in", values, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughBetween(String value1, String value2) {
            addCriterion("PASS_THROUGH between", value1, value2, "passThrough");
            return (Criteria) this;
        }

        public Criteria andPassThroughNotBetween(String value1, String value2) {
            addCriterion("PASS_THROUGH not between", value1, value2, "passThrough");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgIsNull() {
            addCriterion("IS_REPAY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgIsNotNull() {
            addCriterion("IS_REPAY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgEqualTo(Integer value) {
            addCriterion("IS_REPAY_FLG =", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgNotEqualTo(Integer value) {
            addCriterion("IS_REPAY_FLG <>", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgGreaterThan(Integer value) {
            addCriterion("IS_REPAY_FLG >", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_REPAY_FLG >=", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgLessThan(Integer value) {
            addCriterion("IS_REPAY_FLG <", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgLessThanOrEqualTo(Integer value) {
            addCriterion("IS_REPAY_FLG <=", value, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgIn(List<Integer> values) {
            addCriterion("IS_REPAY_FLG in", values, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgNotIn(List<Integer> values) {
            addCriterion("IS_REPAY_FLG not in", values, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgBetween(Integer value1, Integer value2) {
            addCriterion("IS_REPAY_FLG between", value1, value2, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andIsRepayFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_REPAY_FLG not between", value1, value2, "isRepayFlg");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("SETTLEMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("SETTLEMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Integer value) {
            addCriterion("SETTLEMENT_STATUS =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Integer value) {
            addCriterion("SETTLEMENT_STATUS <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Integer value) {
            addCriterion("SETTLEMENT_STATUS >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_STATUS >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Integer value) {
            addCriterion("SETTLEMENT_STATUS <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_STATUS <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Integer> values) {
            addCriterion("SETTLEMENT_STATUS in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Integer> values) {
            addCriterion("SETTLEMENT_STATUS not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_STATUS between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_STATUS not between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("REFUND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("REFUND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("REFUND_STATUS =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("REFUND_STATUS <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("REFUND_STATUS >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFUND_STATUS >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("REFUND_STATUS <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REFUND_STATUS <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("REFUND_STATUS in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("REFUND_STATUS not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_STATUS between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_STATUS not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andMerBizFldIsNull() {
            addCriterion("MER_BIZ_FLD is null");
            return (Criteria) this;
        }

        public Criteria andMerBizFldIsNotNull() {
            addCriterion("MER_BIZ_FLD is not null");
            return (Criteria) this;
        }

        public Criteria andMerBizFldEqualTo(String value) {
            addCriterion("MER_BIZ_FLD =", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldNotEqualTo(String value) {
            addCriterion("MER_BIZ_FLD <>", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldGreaterThan(String value) {
            addCriterion("MER_BIZ_FLD >", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldGreaterThanOrEqualTo(String value) {
            addCriterion("MER_BIZ_FLD >=", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldLessThan(String value) {
            addCriterion("MER_BIZ_FLD <", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldLessThanOrEqualTo(String value) {
            addCriterion("MER_BIZ_FLD <=", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldLike(String value) {
            addCriterion("MER_BIZ_FLD like", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldNotLike(String value) {
            addCriterion("MER_BIZ_FLD not like", value, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldIn(List<String> values) {
            addCriterion("MER_BIZ_FLD in", values, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldNotIn(List<String> values) {
            addCriterion("MER_BIZ_FLD not in", values, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldBetween(String value1, String value2) {
            addCriterion("MER_BIZ_FLD between", value1, value2, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerBizFldNotBetween(String value1, String value2) {
            addCriterion("MER_BIZ_FLD not between", value1, value2, "merBizFld");
            return (Criteria) this;
        }

        public Criteria andMerFundIsNull() {
            addCriterion("MER_FUND is null");
            return (Criteria) this;
        }

        public Criteria andMerFundIsNotNull() {
            addCriterion("MER_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andMerFundEqualTo(BigDecimal value) {
            addCriterion("MER_FUND =", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundNotEqualTo(BigDecimal value) {
            addCriterion("MER_FUND <>", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundGreaterThan(BigDecimal value) {
            addCriterion("MER_FUND >", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MER_FUND >=", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundLessThan(BigDecimal value) {
            addCriterion("MER_FUND <", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MER_FUND <=", value, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundIn(List<BigDecimal> values) {
            addCriterion("MER_FUND in", values, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundNotIn(List<BigDecimal> values) {
            addCriterion("MER_FUND not in", values, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MER_FUND between", value1, value2, "merFund");
            return (Criteria) this;
        }

        public Criteria andMerFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MER_FUND not between", value1, value2, "merFund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundIsNull() {
            addCriterion("IS_REALTIME_REFUND is null");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundIsNotNull() {
            addCriterion("IS_REALTIME_REFUND is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundEqualTo(Integer value) {
            addCriterion("IS_REALTIME_REFUND =", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundNotEqualTo(Integer value) {
            addCriterion("IS_REALTIME_REFUND <>", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundGreaterThan(Integer value) {
            addCriterion("IS_REALTIME_REFUND >", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_REALTIME_REFUND >=", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundLessThan(Integer value) {
            addCriterion("IS_REALTIME_REFUND <", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundLessThanOrEqualTo(Integer value) {
            addCriterion("IS_REALTIME_REFUND <=", value, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundIn(List<Integer> values) {
            addCriterion("IS_REALTIME_REFUND in", values, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundNotIn(List<Integer> values) {
            addCriterion("IS_REALTIME_REFUND not in", values, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundBetween(Integer value1, Integer value2) {
            addCriterion("IS_REALTIME_REFUND between", value1, value2, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andIsRealtimeRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_REALTIME_REFUND not between", value1, value2, "isRealtimeRefund");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdIsNull() {
            addCriterion("SETTLEMENT_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdIsNotNull() {
            addCriterion("SETTLEMENT_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdEqualTo(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID =", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdNotEqualTo(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID <>", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdGreaterThan(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID >", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID >=", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdLessThan(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID <", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_TRADE_ID <=", value, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdIn(List<Long> values) {
            addCriterion("SETTLEMENT_TRADE_ID in", values, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdNotIn(List<Long> values) {
            addCriterion("SETTLEMENT_TRADE_ID not in", values, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_TRADE_ID between", value1, value2, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andSettlementTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_TRADE_ID not between", value1, value2, "settlementTradeId");
            return (Criteria) this;
        }

        public Criteria andMerSignatureIsNull() {
            addCriterion("MER_SIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andMerSignatureIsNotNull() {
            addCriterion("MER_SIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andMerSignatureEqualTo(String value) {
            addCriterion("MER_SIGNATURE =", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureNotEqualTo(String value) {
            addCriterion("MER_SIGNATURE <>", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureGreaterThan(String value) {
            addCriterion("MER_SIGNATURE >", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("MER_SIGNATURE >=", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureLessThan(String value) {
            addCriterion("MER_SIGNATURE <", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureLessThanOrEqualTo(String value) {
            addCriterion("MER_SIGNATURE <=", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureLike(String value) {
            addCriterion("MER_SIGNATURE like", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureNotLike(String value) {
            addCriterion("MER_SIGNATURE not like", value, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureIn(List<String> values) {
            addCriterion("MER_SIGNATURE in", values, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureNotIn(List<String> values) {
            addCriterion("MER_SIGNATURE not in", values, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureBetween(String value1, String value2) {
            addCriterion("MER_SIGNATURE between", value1, value2, "merSignature");
            return (Criteria) this;
        }

        public Criteria andMerSignatureNotBetween(String value1, String value2) {
            addCriterion("MER_SIGNATURE not between", value1, value2, "merSignature");
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

        public Criteria andFld6IsNull() {
            addCriterion("FLD6 is null");
            return (Criteria) this;
        }

        public Criteria andFld6IsNotNull() {
            addCriterion("FLD6 is not null");
            return (Criteria) this;
        }

        public Criteria andFld6EqualTo(String value) {
            addCriterion("FLD6 =", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6NotEqualTo(String value) {
            addCriterion("FLD6 <>", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6GreaterThan(String value) {
            addCriterion("FLD6 >", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6GreaterThanOrEqualTo(String value) {
            addCriterion("FLD6 >=", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6LessThan(String value) {
            addCriterion("FLD6 <", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6LessThanOrEqualTo(String value) {
            addCriterion("FLD6 <=", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6Like(String value) {
            addCriterion("FLD6 like", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6NotLike(String value) {
            addCriterion("FLD6 not like", value, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6In(List<String> values) {
            addCriterion("FLD6 in", values, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6NotIn(List<String> values) {
            addCriterion("FLD6 not in", values, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6Between(String value1, String value2) {
            addCriterion("FLD6 between", value1, value2, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld6NotBetween(String value1, String value2) {
            addCriterion("FLD6 not between", value1, value2, "fld6");
            return (Criteria) this;
        }

        public Criteria andFld7IsNull() {
            addCriterion("FLD7 is null");
            return (Criteria) this;
        }

        public Criteria andFld7IsNotNull() {
            addCriterion("FLD7 is not null");
            return (Criteria) this;
        }

        public Criteria andFld7EqualTo(String value) {
            addCriterion("FLD7 =", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7NotEqualTo(String value) {
            addCriterion("FLD7 <>", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7GreaterThan(String value) {
            addCriterion("FLD7 >", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7GreaterThanOrEqualTo(String value) {
            addCriterion("FLD7 >=", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7LessThan(String value) {
            addCriterion("FLD7 <", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7LessThanOrEqualTo(String value) {
            addCriterion("FLD7 <=", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7Like(String value) {
            addCriterion("FLD7 like", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7NotLike(String value) {
            addCriterion("FLD7 not like", value, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7In(List<String> values) {
            addCriterion("FLD7 in", values, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7NotIn(List<String> values) {
            addCriterion("FLD7 not in", values, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7Between(String value1, String value2) {
            addCriterion("FLD7 between", value1, value2, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld7NotBetween(String value1, String value2) {
            addCriterion("FLD7 not between", value1, value2, "fld7");
            return (Criteria) this;
        }

        public Criteria andFld8IsNull() {
            addCriterion("FLD8 is null");
            return (Criteria) this;
        }

        public Criteria andFld8IsNotNull() {
            addCriterion("FLD8 is not null");
            return (Criteria) this;
        }

        public Criteria andFld8EqualTo(String value) {
            addCriterion("FLD8 =", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8NotEqualTo(String value) {
            addCriterion("FLD8 <>", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8GreaterThan(String value) {
            addCriterion("FLD8 >", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8GreaterThanOrEqualTo(String value) {
            addCriterion("FLD8 >=", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8LessThan(String value) {
            addCriterion("FLD8 <", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8LessThanOrEqualTo(String value) {
            addCriterion("FLD8 <=", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8Like(String value) {
            addCriterion("FLD8 like", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8NotLike(String value) {
            addCriterion("FLD8 not like", value, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8In(List<String> values) {
            addCriterion("FLD8 in", values, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8NotIn(List<String> values) {
            addCriterion("FLD8 not in", values, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8Between(String value1, String value2) {
            addCriterion("FLD8 between", value1, value2, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld8NotBetween(String value1, String value2) {
            addCriterion("FLD8 not between", value1, value2, "fld8");
            return (Criteria) this;
        }

        public Criteria andFld9IsNull() {
            addCriterion("FLD9 is null");
            return (Criteria) this;
        }

        public Criteria andFld9IsNotNull() {
            addCriterion("FLD9 is not null");
            return (Criteria) this;
        }

        public Criteria andFld9EqualTo(String value) {
            addCriterion("FLD9 =", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9NotEqualTo(String value) {
            addCriterion("FLD9 <>", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9GreaterThan(String value) {
            addCriterion("FLD9 >", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9GreaterThanOrEqualTo(String value) {
            addCriterion("FLD9 >=", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9LessThan(String value) {
            addCriterion("FLD9 <", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9LessThanOrEqualTo(String value) {
            addCriterion("FLD9 <=", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9Like(String value) {
            addCriterion("FLD9 like", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9NotLike(String value) {
            addCriterion("FLD9 not like", value, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9In(List<String> values) {
            addCriterion("FLD9 in", values, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9NotIn(List<String> values) {
            addCriterion("FLD9 not in", values, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9Between(String value1, String value2) {
            addCriterion("FLD9 between", value1, value2, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld9NotBetween(String value1, String value2) {
            addCriterion("FLD9 not between", value1, value2, "fld9");
            return (Criteria) this;
        }

        public Criteria andFld10IsNull() {
            addCriterion("FLD10 is null");
            return (Criteria) this;
        }

        public Criteria andFld10IsNotNull() {
            addCriterion("FLD10 is not null");
            return (Criteria) this;
        }

        public Criteria andFld10EqualTo(String value) {
            addCriterion("FLD10 =", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10NotEqualTo(String value) {
            addCriterion("FLD10 <>", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10GreaterThan(String value) {
            addCriterion("FLD10 >", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10GreaterThanOrEqualTo(String value) {
            addCriterion("FLD10 >=", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10LessThan(String value) {
            addCriterion("FLD10 <", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10LessThanOrEqualTo(String value) {
            addCriterion("FLD10 <=", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10Like(String value) {
            addCriterion("FLD10 like", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10NotLike(String value) {
            addCriterion("FLD10 not like", value, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10In(List<String> values) {
            addCriterion("FLD10 in", values, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10NotIn(List<String> values) {
            addCriterion("FLD10 not in", values, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10Between(String value1, String value2) {
            addCriterion("FLD10 between", value1, value2, "fld10");
            return (Criteria) this;
        }

        public Criteria andFld10NotBetween(String value1, String value2) {
            addCriterion("FLD10 not between", value1, value2, "fld10");
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

        public Criteria andPayTypeEqualTo(Long value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Long value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Long value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Long value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Long> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Long> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
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

        public Criteria andTradeFeeIsNull() {
            addCriterion("TRADE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIsNotNull() {
            addCriterion("TRADE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeEqualTo(BigDecimal value) {
            addCriterion("TRADE_FEE =", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_FEE <>", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThan(BigDecimal value) {
            addCriterion("TRADE_FEE >", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_FEE >=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThan(BigDecimal value) {
            addCriterion("TRADE_FEE <", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_FEE <=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIn(List<BigDecimal> values) {
            addCriterion("TRADE_FEE in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_FEE not in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_FEE between", value1, value2, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_FEE not between", value1, value2, "tradeFee");
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