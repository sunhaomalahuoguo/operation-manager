package com.sumavision.operation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BizTypeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BizTypeQuery() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andClass1NameIsNull() {
            addCriterion("CLASS_1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClass1NameIsNotNull() {
            addCriterion("CLASS_1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClass1NameEqualTo(String value) {
            addCriterion("CLASS_1_NAME =", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameNotEqualTo(String value) {
            addCriterion("CLASS_1_NAME <>", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameGreaterThan(String value) {
            addCriterion("CLASS_1_NAME >", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_1_NAME >=", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameLessThan(String value) {
            addCriterion("CLASS_1_NAME <", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_1_NAME <=", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameLike(String value) {
            addCriterion("CLASS_1_NAME like", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameNotLike(String value) {
            addCriterion("CLASS_1_NAME not like", value, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameIn(List<String> values) {
            addCriterion("CLASS_1_NAME in", values, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameNotIn(List<String> values) {
            addCriterion("CLASS_1_NAME not in", values, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameBetween(String value1, String value2) {
            addCriterion("CLASS_1_NAME between", value1, value2, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass1NameNotBetween(String value1, String value2) {
            addCriterion("CLASS_1_NAME not between", value1, value2, "class1Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameIsNull() {
            addCriterion("CLASS_2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClass2NameIsNotNull() {
            addCriterion("CLASS_2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClass2NameEqualTo(String value) {
            addCriterion("CLASS_2_NAME =", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotEqualTo(String value) {
            addCriterion("CLASS_2_NAME <>", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameGreaterThan(String value) {
            addCriterion("CLASS_2_NAME >", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_2_NAME >=", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLessThan(String value) {
            addCriterion("CLASS_2_NAME <", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_2_NAME <=", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameLike(String value) {
            addCriterion("CLASS_2_NAME like", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotLike(String value) {
            addCriterion("CLASS_2_NAME not like", value, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameIn(List<String> values) {
            addCriterion("CLASS_2_NAME in", values, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotIn(List<String> values) {
            addCriterion("CLASS_2_NAME not in", values, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameBetween(String value1, String value2) {
            addCriterion("CLASS_2_NAME between", value1, value2, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass2NameNotBetween(String value1, String value2) {
            addCriterion("CLASS_2_NAME not between", value1, value2, "class2Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameIsNull() {
            addCriterion("CLASS_3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClass3NameIsNotNull() {
            addCriterion("CLASS_3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClass3NameEqualTo(String value) {
            addCriterion("CLASS_3_NAME =", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameNotEqualTo(String value) {
            addCriterion("CLASS_3_NAME <>", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameGreaterThan(String value) {
            addCriterion("CLASS_3_NAME >", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_3_NAME >=", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameLessThan(String value) {
            addCriterion("CLASS_3_NAME <", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_3_NAME <=", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameLike(String value) {
            addCriterion("CLASS_3_NAME like", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameNotLike(String value) {
            addCriterion("CLASS_3_NAME not like", value, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameIn(List<String> values) {
            addCriterion("CLASS_3_NAME in", values, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameNotIn(List<String> values) {
            addCriterion("CLASS_3_NAME not in", values, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameBetween(String value1, String value2) {
            addCriterion("CLASS_3_NAME between", value1, value2, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass3NameNotBetween(String value1, String value2) {
            addCriterion("CLASS_3_NAME not between", value1, value2, "class3Name");
            return (Criteria) this;
        }

        public Criteria andClass1CodeIsNull() {
            addCriterion("CLASS_1_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClass1CodeIsNotNull() {
            addCriterion("CLASS_1_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClass1CodeEqualTo(String value) {
            addCriterion("CLASS_1_CODE =", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeNotEqualTo(String value) {
            addCriterion("CLASS_1_CODE <>", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeGreaterThan(String value) {
            addCriterion("CLASS_1_CODE >", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_1_CODE >=", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeLessThan(String value) {
            addCriterion("CLASS_1_CODE <", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_1_CODE <=", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeLike(String value) {
            addCriterion("CLASS_1_CODE like", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeNotLike(String value) {
            addCriterion("CLASS_1_CODE not like", value, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeIn(List<String> values) {
            addCriterion("CLASS_1_CODE in", values, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeNotIn(List<String> values) {
            addCriterion("CLASS_1_CODE not in", values, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeBetween(String value1, String value2) {
            addCriterion("CLASS_1_CODE between", value1, value2, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass1CodeNotBetween(String value1, String value2) {
            addCriterion("CLASS_1_CODE not between", value1, value2, "class1Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeIsNull() {
            addCriterion("CLASS_2_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClass2CodeIsNotNull() {
            addCriterion("CLASS_2_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClass2CodeEqualTo(String value) {
            addCriterion("CLASS_2_CODE =", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeNotEqualTo(String value) {
            addCriterion("CLASS_2_CODE <>", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeGreaterThan(String value) {
            addCriterion("CLASS_2_CODE >", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_2_CODE >=", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeLessThan(String value) {
            addCriterion("CLASS_2_CODE <", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_2_CODE <=", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeLike(String value) {
            addCriterion("CLASS_2_CODE like", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeNotLike(String value) {
            addCriterion("CLASS_2_CODE not like", value, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeIn(List<String> values) {
            addCriterion("CLASS_2_CODE in", values, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeNotIn(List<String> values) {
            addCriterion("CLASS_2_CODE not in", values, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeBetween(String value1, String value2) {
            addCriterion("CLASS_2_CODE between", value1, value2, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass2CodeNotBetween(String value1, String value2) {
            addCriterion("CLASS_2_CODE not between", value1, value2, "class2Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeIsNull() {
            addCriterion("CLASS_3_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClass3CodeIsNotNull() {
            addCriterion("CLASS_3_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClass3CodeEqualTo(String value) {
            addCriterion("CLASS_3_CODE =", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeNotEqualTo(String value) {
            addCriterion("CLASS_3_CODE <>", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeGreaterThan(String value) {
            addCriterion("CLASS_3_CODE >", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_3_CODE >=", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeLessThan(String value) {
            addCriterion("CLASS_3_CODE <", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_3_CODE <=", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeLike(String value) {
            addCriterion("CLASS_3_CODE like", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeNotLike(String value) {
            addCriterion("CLASS_3_CODE not like", value, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeIn(List<String> values) {
            addCriterion("CLASS_3_CODE in", values, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeNotIn(List<String> values) {
            addCriterion("CLASS_3_CODE not in", values, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeBetween(String value1, String value2) {
            addCriterion("CLASS_3_CODE between", value1, value2, "class3Code");
            return (Criteria) this;
        }

        public Criteria andClass3CodeNotBetween(String value1, String value2) {
            addCriterion("CLASS_3_CODE not between", value1, value2, "class3Code");
            return (Criteria) this;
        }

        public Criteria andInnerCodeIsNull() {
            addCriterion("INNER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInnerCodeIsNotNull() {
            addCriterion("INNER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInnerCodeEqualTo(String value) {
            addCriterion("INNER_CODE =", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeNotEqualTo(String value) {
            addCriterion("INNER_CODE <>", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeGreaterThan(String value) {
            addCriterion("INNER_CODE >", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INNER_CODE >=", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeLessThan(String value) {
            addCriterion("INNER_CODE <", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeLessThanOrEqualTo(String value) {
            addCriterion("INNER_CODE <=", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeLike(String value) {
            addCriterion("INNER_CODE like", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeNotLike(String value) {
            addCriterion("INNER_CODE not like", value, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeIn(List<String> values) {
            addCriterion("INNER_CODE in", values, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeNotIn(List<String> values) {
            addCriterion("INNER_CODE not in", values, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeBetween(String value1, String value2) {
            addCriterion("INNER_CODE between", value1, value2, "innerCode");
            return (Criteria) this;
        }

        public Criteria andInnerCodeNotBetween(String value1, String value2) {
            addCriterion("INNER_CODE not between", value1, value2, "innerCode");
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

        public Criteria andFeeRuleIdIsNull() {
            addCriterion("FEE_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdIsNotNull() {
            addCriterion("FEE_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdEqualTo(Long value) {
            addCriterion("FEE_RULE_ID =", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdNotEqualTo(Long value) {
            addCriterion("FEE_RULE_ID <>", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdGreaterThan(Long value) {
            addCriterion("FEE_RULE_ID >", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEE_RULE_ID >=", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdLessThan(Long value) {
            addCriterion("FEE_RULE_ID <", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("FEE_RULE_ID <=", value, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdIn(List<Long> values) {
            addCriterion("FEE_RULE_ID in", values, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdNotIn(List<Long> values) {
            addCriterion("FEE_RULE_ID not in", values, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdBetween(Long value1, Long value2) {
            addCriterion("FEE_RULE_ID between", value1, value2, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("FEE_RULE_ID not between", value1, value2, "feeRuleId");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeIsNull() {
            addCriterion("FEE_GROUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeIsNotNull() {
            addCriterion("FEE_GROUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeEqualTo(String value) {
            addCriterion("FEE_GROUP_CODE =", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeNotEqualTo(String value) {
            addCriterion("FEE_GROUP_CODE <>", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeGreaterThan(String value) {
            addCriterion("FEE_GROUP_CODE >", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_GROUP_CODE >=", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeLessThan(String value) {
            addCriterion("FEE_GROUP_CODE <", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("FEE_GROUP_CODE <=", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeLike(String value) {
            addCriterion("FEE_GROUP_CODE like", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeNotLike(String value) {
            addCriterion("FEE_GROUP_CODE not like", value, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeIn(List<String> values) {
            addCriterion("FEE_GROUP_CODE in", values, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeNotIn(List<String> values) {
            addCriterion("FEE_GROUP_CODE not in", values, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeBetween(String value1, String value2) {
            addCriterion("FEE_GROUP_CODE between", value1, value2, "feeGroupCode");
            return (Criteria) this;
        }

        public Criteria andFeeGroupCodeNotBetween(String value1, String value2) {
            addCriterion("FEE_GROUP_CODE not between", value1, value2, "feeGroupCode");
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