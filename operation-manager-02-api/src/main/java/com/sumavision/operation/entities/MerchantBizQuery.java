package com.sumavision.operation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantBizQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantBizQuery() {
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

        public Criteria andBizTypeEqualTo(Long value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Long value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Long value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Long value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Long value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Long> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Long> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Long value1, Long value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Long value1, Long value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizCodeIsNull() {
            addCriterion("BIZ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBizCodeIsNotNull() {
            addCriterion("BIZ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBizCodeEqualTo(String value) {
            addCriterion("BIZ_CODE =", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotEqualTo(String value) {
            addCriterion("BIZ_CODE <>", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeGreaterThan(String value) {
            addCriterion("BIZ_CODE >", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_CODE >=", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLessThan(String value) {
            addCriterion("BIZ_CODE <", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_CODE <=", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLike(String value) {
            addCriterion("BIZ_CODE like", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotLike(String value) {
            addCriterion("BIZ_CODE not like", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeIn(List<String> values) {
            addCriterion("BIZ_CODE in", values, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotIn(List<String> values) {
            addCriterion("BIZ_CODE not in", values, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeBetween(String value1, String value2) {
            addCriterion("BIZ_CODE between", value1, value2, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotBetween(String value1, String value2) {
            addCriterion("BIZ_CODE not between", value1, value2, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNull() {
            addCriterion("BIZ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNotNull() {
            addCriterion("BIZ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBizNameEqualTo(String value) {
            addCriterion("BIZ_NAME =", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotEqualTo(String value) {
            addCriterion("BIZ_NAME <>", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThan(String value) {
            addCriterion("BIZ_NAME >", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_NAME >=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThan(String value) {
            addCriterion("BIZ_NAME <", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThanOrEqualTo(String value) {
            addCriterion("BIZ_NAME <=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLike(String value) {
            addCriterion("BIZ_NAME like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotLike(String value) {
            addCriterion("BIZ_NAME not like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameIn(List<String> values) {
            addCriterion("BIZ_NAME in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotIn(List<String> values) {
            addCriterion("BIZ_NAME not in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameBetween(String value1, String value2) {
            addCriterion("BIZ_NAME between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotBetween(String value1, String value2) {
            addCriterion("BIZ_NAME not between", value1, value2, "bizName");
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

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
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