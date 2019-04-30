package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantRelationInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantRelationInfoQuery() {
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

        public Criteria andWebsiteNameIsNull() {
            addCriterion("WEBSITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIsNotNull() {
            addCriterion("WEBSITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameEqualTo(String value) {
            addCriterion("WEBSITE_NAME =", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotEqualTo(String value) {
            addCriterion("WEBSITE_NAME <>", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThan(String value) {
            addCriterion("WEBSITE_NAME >", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE_NAME >=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThan(String value) {
            addCriterion("WEBSITE_NAME <", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE_NAME <=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLike(String value) {
            addCriterion("WEBSITE_NAME like", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotLike(String value) {
            addCriterion("WEBSITE_NAME not like", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIn(List<String> values) {
            addCriterion("WEBSITE_NAME in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotIn(List<String> values) {
            addCriterion("WEBSITE_NAME not in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameBetween(String value1, String value2) {
            addCriterion("WEBSITE_NAME between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotBetween(String value1, String value2) {
            addCriterion("WEBSITE_NAME not between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("DOMAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("DOMAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("DOMAIN_NAME =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("DOMAIN_NAME <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("DOMAIN_NAME >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOMAIN_NAME >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("DOMAIN_NAME <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("DOMAIN_NAME <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("DOMAIN_NAME like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("DOMAIN_NAME not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("DOMAIN_NAME in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("DOMAIN_NAME not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("DOMAIN_NAME between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("DOMAIN_NAME not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceIsNull() {
            addCriterion("MERCHANT_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceIsNotNull() {
            addCriterion("MERCHANT_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceEqualTo(String value) {
            addCriterion("MERCHANT_PROVINCE =", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceNotEqualTo(String value) {
            addCriterion("MERCHANT_PROVINCE <>", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceGreaterThan(String value) {
            addCriterion("MERCHANT_PROVINCE >", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_PROVINCE >=", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceLessThan(String value) {
            addCriterion("MERCHANT_PROVINCE <", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_PROVINCE <=", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceLike(String value) {
            addCriterion("MERCHANT_PROVINCE like", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceNotLike(String value) {
            addCriterion("MERCHANT_PROVINCE not like", value, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceIn(List<String> values) {
            addCriterion("MERCHANT_PROVINCE in", values, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceNotIn(List<String> values) {
            addCriterion("MERCHANT_PROVINCE not in", values, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceBetween(String value1, String value2) {
            addCriterion("MERCHANT_PROVINCE between", value1, value2, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantProvinceNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_PROVINCE not between", value1, value2, "merchantProvince");
            return (Criteria) this;
        }

        public Criteria andMerchantCityIsNull() {
            addCriterion("MERCHANT_CITY is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCityIsNotNull() {
            addCriterion("MERCHANT_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCityEqualTo(String value) {
            addCriterion("MERCHANT_CITY =", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityNotEqualTo(String value) {
            addCriterion("MERCHANT_CITY <>", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityGreaterThan(String value) {
            addCriterion("MERCHANT_CITY >", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CITY >=", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityLessThan(String value) {
            addCriterion("MERCHANT_CITY <", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CITY <=", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityLike(String value) {
            addCriterion("MERCHANT_CITY like", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityNotLike(String value) {
            addCriterion("MERCHANT_CITY not like", value, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityIn(List<String> values) {
            addCriterion("MERCHANT_CITY in", values, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityNotIn(List<String> values) {
            addCriterion("MERCHANT_CITY not in", values, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityBetween(String value1, String value2) {
            addCriterion("MERCHANT_CITY between", value1, value2, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andMerchantCityNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_CITY not between", value1, value2, "merchantCity");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIsNull() {
            addCriterion("MERCHANT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIsNotNull() {
            addCriterion("MERCHANT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelEqualTo(Integer value) {
            addCriterion("MERCHANT_LEVEL =", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotEqualTo(Integer value) {
            addCriterion("MERCHANT_LEVEL <>", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelGreaterThan(Integer value) {
            addCriterion("MERCHANT_LEVEL >", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MERCHANT_LEVEL >=", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelLessThan(Integer value) {
            addCriterion("MERCHANT_LEVEL <", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelLessThanOrEqualTo(Integer value) {
            addCriterion("MERCHANT_LEVEL <=", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIn(List<Integer> values) {
            addCriterion("MERCHANT_LEVEL in", values, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotIn(List<Integer> values) {
            addCriterion("MERCHANT_LEVEL not in", values, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelBetween(Integer value1, Integer value2) {
            addCriterion("MERCHANT_LEVEL between", value1, value2, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("MERCHANT_LEVEL not between", value1, value2, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoIsNull() {
            addCriterion("LP_CREDENTIALS_NO is null");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoIsNotNull() {
            addCriterion("LP_CREDENTIALS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoEqualTo(String value) {
            addCriterion("LP_CREDENTIALS_NO =", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoNotEqualTo(String value) {
            addCriterion("LP_CREDENTIALS_NO <>", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoGreaterThan(String value) {
            addCriterion("LP_CREDENTIALS_NO >", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoGreaterThanOrEqualTo(String value) {
            addCriterion("LP_CREDENTIALS_NO >=", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoLessThan(String value) {
            addCriterion("LP_CREDENTIALS_NO <", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoLessThanOrEqualTo(String value) {
            addCriterion("LP_CREDENTIALS_NO <=", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoLike(String value) {
            addCriterion("LP_CREDENTIALS_NO like", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoNotLike(String value) {
            addCriterion("LP_CREDENTIALS_NO not like", value, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoIn(List<String> values) {
            addCriterion("LP_CREDENTIALS_NO in", values, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoNotIn(List<String> values) {
            addCriterion("LP_CREDENTIALS_NO not in", values, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoBetween(String value1, String value2) {
            addCriterion("LP_CREDENTIALS_NO between", value1, value2, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsNoNotBetween(String value1, String value2) {
            addCriterion("LP_CREDENTIALS_NO not between", value1, value2, "lpCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateIsNull() {
            addCriterion("LP_CREDENTIALS_EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateIsNotNull() {
            addCriterion("LP_CREDENTIALS_EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE =", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE <>", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE >", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE >=", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateLessThan(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE <", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE <=", value, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE in", values, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE not in", values, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE between", value1, value2, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLpCredentialsEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LP_CREDENTIALS_EFFECTIVE_DATE not between", value1, value2, "lpCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeIsNull() {
            addCriterion("LICENSE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeIsNotNull() {
            addCriterion("LICENSE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeEqualTo(String value) {
            addCriterion("LICENSE_SCOPE =", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeNotEqualTo(String value) {
            addCriterion("LICENSE_SCOPE <>", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeGreaterThan(String value) {
            addCriterion("LICENSE_SCOPE >", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_SCOPE >=", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeLessThan(String value) {
            addCriterion("LICENSE_SCOPE <", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_SCOPE <=", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeLike(String value) {
            addCriterion("LICENSE_SCOPE like", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeNotLike(String value) {
            addCriterion("LICENSE_SCOPE not like", value, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeIn(List<String> values) {
            addCriterion("LICENSE_SCOPE in", values, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeNotIn(List<String> values) {
            addCriterion("LICENSE_SCOPE not in", values, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeBetween(String value1, String value2) {
            addCriterion("LICENSE_SCOPE between", value1, value2, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseScopeNotBetween(String value1, String value2) {
            addCriterion("LICENSE_SCOPE not between", value1, value2, "licenseScope");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateIsNull() {
            addCriterion("LICENSE_EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateIsNotNull() {
            addCriterion("LICENSE_EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE =", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE <>", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE >", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE >=", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateLessThan(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE <", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE <=", value, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE in", values, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE not in", values, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE between", value1, value2, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andLicenseEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LICENSE_EFFECTIVE_DATE not between", value1, value2, "licenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIsNull() {
            addCriterion("ORGANIZATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIsNotNull() {
            addCriterion("ORGANIZATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoEqualTo(String value) {
            addCriterion("ORGANIZATION_NO =", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotEqualTo(String value) {
            addCriterion("ORGANIZATION_NO <>", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoGreaterThan(String value) {
            addCriterion("ORGANIZATION_NO >", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NO >=", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLessThan(String value) {
            addCriterion("ORGANIZATION_NO <", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NO <=", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLike(String value) {
            addCriterion("ORGANIZATION_NO like", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotLike(String value) {
            addCriterion("ORGANIZATION_NO not like", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIn(List<String> values) {
            addCriterion("ORGANIZATION_NO in", values, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotIn(List<String> values) {
            addCriterion("ORGANIZATION_NO not in", values, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NO between", value1, value2, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NO not between", value1, value2, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIsNull() {
            addCriterion("SHAREHOLDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIsNotNull() {
            addCriterion("SHAREHOLDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderNameEqualTo(String value) {
            addCriterion("SHAREHOLDER_NAME =", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotEqualTo(String value) {
            addCriterion("SHAREHOLDER_NAME <>", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameGreaterThan(String value) {
            addCriterion("SHAREHOLDER_NAME >", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER_NAME >=", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLessThan(String value) {
            addCriterion("SHAREHOLDER_NAME <", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLessThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER_NAME <=", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLike(String value) {
            addCriterion("SHAREHOLDER_NAME like", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotLike(String value) {
            addCriterion("SHAREHOLDER_NAME not like", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIn(List<String> values) {
            addCriterion("SHAREHOLDER_NAME in", values, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotIn(List<String> values) {
            addCriterion("SHAREHOLDER_NAME not in", values, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER_NAME between", value1, value2, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER_NAME not between", value1, value2, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoIsNull() {
            addCriterion("SH_CREDENTIALS_NO is null");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoIsNotNull() {
            addCriterion("SH_CREDENTIALS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoEqualTo(String value) {
            addCriterion("SH_CREDENTIALS_NO =", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoNotEqualTo(String value) {
            addCriterion("SH_CREDENTIALS_NO <>", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoGreaterThan(String value) {
            addCriterion("SH_CREDENTIALS_NO >", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoGreaterThanOrEqualTo(String value) {
            addCriterion("SH_CREDENTIALS_NO >=", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoLessThan(String value) {
            addCriterion("SH_CREDENTIALS_NO <", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoLessThanOrEqualTo(String value) {
            addCriterion("SH_CREDENTIALS_NO <=", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoLike(String value) {
            addCriterion("SH_CREDENTIALS_NO like", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoNotLike(String value) {
            addCriterion("SH_CREDENTIALS_NO not like", value, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoIn(List<String> values) {
            addCriterion("SH_CREDENTIALS_NO in", values, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoNotIn(List<String> values) {
            addCriterion("SH_CREDENTIALS_NO not in", values, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoBetween(String value1, String value2) {
            addCriterion("SH_CREDENTIALS_NO between", value1, value2, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsNoNotBetween(String value1, String value2) {
            addCriterion("SH_CREDENTIALS_NO not between", value1, value2, "shCredentialsNo");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateIsNull() {
            addCriterion("SH_CREDENTIALS_EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateIsNotNull() {
            addCriterion("SH_CREDENTIALS_EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE =", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE <>", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE >", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE >=", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateLessThan(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE <", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE <=", value, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE in", values, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE not in", values, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE between", value1, value2, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andShCredentialsEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SH_CREDENTIALS_EFFECTIVE_DATE not between", value1, value2, "shCredentialsEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonIsNull() {
            addCriterion("INVOICE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonIsNotNull() {
            addCriterion("INVOICE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEqualTo(String value) {
            addCriterion("INVOICE_PERSON =", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNotEqualTo(String value) {
            addCriterion("INVOICE_PERSON <>", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonGreaterThan(String value) {
            addCriterion("INVOICE_PERSON >", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_PERSON >=", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonLessThan(String value) {
            addCriterion("INVOICE_PERSON <", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_PERSON <=", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonLike(String value) {
            addCriterion("INVOICE_PERSON like", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNotLike(String value) {
            addCriterion("INVOICE_PERSON not like", value, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonIn(List<String> values) {
            addCriterion("INVOICE_PERSON in", values, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNotIn(List<String> values) {
            addCriterion("INVOICE_PERSON not in", values, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonBetween(String value1, String value2) {
            addCriterion("INVOICE_PERSON between", value1, value2, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNotBetween(String value1, String value2) {
            addCriterion("INVOICE_PERSON not between", value1, value2, "invoicePerson");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNull() {
            addCriterion("INVOICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNotNull() {
            addCriterion("INVOICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS =", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS <>", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThan(String value) {
            addCriterion("INVOICE_ADDRESS >", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS >=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThan(String value) {
            addCriterion("INVOICE_ADDRESS <", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS <=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLike(String value) {
            addCriterion("INVOICE_ADDRESS like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotLike(String value) {
            addCriterion("INVOICE_ADDRESS not like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIn(List<String> values) {
            addCriterion("INVOICE_ADDRESS in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotIn(List<String> values) {
            addCriterion("INVOICE_ADDRESS not in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDRESS between", value1, value2, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDRESS not between", value1, value2, "invoiceAddress");
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

        public Criteria andBankProvinceIsNull() {
            addCriterion("BANK_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("BANK_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("BANK_PROVINCE =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("BANK_PROVINCE <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("BANK_PROVINCE >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("BANK_PROVINCE <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("BANK_PROVINCE like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("BANK_PROVINCE not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("BANK_PROVINCE in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("BANK_PROVINCE not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("BANK_CITY is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("BANK_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("BANK_CITY =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("BANK_CITY <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("BANK_CITY >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CITY >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("BANK_CITY <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("BANK_CITY <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("BANK_CITY like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("BANK_CITY not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("BANK_CITY in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("BANK_CITY not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("BANK_CITY between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("BANK_CITY not between", value1, value2, "bankCity");
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

        public Criteria andBankAccountNameIsNull() {
            addCriterion("BANK_ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("BANK_ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("BANK_ACCOUNT_NAME =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT_NAME <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT_NAME >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT_NAME >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("BANK_ACCOUNT_NAME <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT_NAME <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("BANK_ACCOUNT_NAME like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("BANK_ACCOUNT_NAME not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("BANK_ACCOUNT_NAME in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT_NAME not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT_NAME between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT_NAME not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseIsNull() {
            addCriterion("ESTABLISH_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseIsNotNull() {
            addCriterion("ESTABLISH_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseEqualTo(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE =", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseNotEqualTo(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE <>", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseGreaterThan(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE >", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE >=", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseLessThan(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE <", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTABLISH_EXPENSE <=", value, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseIn(List<BigDecimal> values) {
            addCriterion("ESTABLISH_EXPENSE in", values, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseNotIn(List<BigDecimal> values) {
            addCriterion("ESTABLISH_EXPENSE not in", values, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTABLISH_EXPENSE between", value1, value2, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEstablishExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTABLISH_EXPENSE not between", value1, value2, "establishExpense");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNull() {
            addCriterion("EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNotNull() {
            addCriterion("EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <>", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE >", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE >=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThan(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECT_DATE in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECT_DATE not in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECT_DATE between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECT_DATE not between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateIsNull() {
            addCriterion("CLOSING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClosingDateIsNotNull() {
            addCriterion("CLOSING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosingDateEqualTo(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE =", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE <>", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE >", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE >=", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateLessThan(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE <", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLOSING_DATE <=", value, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateIn(List<Date> values) {
            addCriterionForJDBCDate("CLOSING_DATE in", values, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLOSING_DATE not in", values, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLOSING_DATE between", value1, value2, "closingDate");
            return (Criteria) this;
        }

        public Criteria andClosingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLOSING_DATE not between", value1, value2, "closingDate");
            return (Criteria) this;
        }

        public Criteria andSalesStaffIsNull() {
            addCriterion("SALES_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andSalesStaffIsNotNull() {
            addCriterion("SALES_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andSalesStaffEqualTo(String value) {
            addCriterion("SALES_STAFF =", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffNotEqualTo(String value) {
            addCriterion("SALES_STAFF <>", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffGreaterThan(String value) {
            addCriterion("SALES_STAFF >", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_STAFF >=", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffLessThan(String value) {
            addCriterion("SALES_STAFF <", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffLessThanOrEqualTo(String value) {
            addCriterion("SALES_STAFF <=", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffLike(String value) {
            addCriterion("SALES_STAFF like", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffNotLike(String value) {
            addCriterion("SALES_STAFF not like", value, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffIn(List<String> values) {
            addCriterion("SALES_STAFF in", values, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffNotIn(List<String> values) {
            addCriterion("SALES_STAFF not in", values, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffBetween(String value1, String value2) {
            addCriterion("SALES_STAFF between", value1, value2, "salesStaff");
            return (Criteria) this;
        }

        public Criteria andSalesStaffNotBetween(String value1, String value2) {
            addCriterion("SALES_STAFF not between", value1, value2, "salesStaff");
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

        public Criteria andInvoicePersonEmailIsNull() {
            addCriterion("INVOICE_PERSON_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailIsNotNull() {
            addCriterion("INVOICE_PERSON_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailEqualTo(String value) {
            addCriterion("INVOICE_PERSON_EMAIL =", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailNotEqualTo(String value) {
            addCriterion("INVOICE_PERSON_EMAIL <>", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailGreaterThan(String value) {
            addCriterion("INVOICE_PERSON_EMAIL >", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_PERSON_EMAIL >=", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailLessThan(String value) {
            addCriterion("INVOICE_PERSON_EMAIL <", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_PERSON_EMAIL <=", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailLike(String value) {
            addCriterion("INVOICE_PERSON_EMAIL like", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailNotLike(String value) {
            addCriterion("INVOICE_PERSON_EMAIL not like", value, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailIn(List<String> values) {
            addCriterion("INVOICE_PERSON_EMAIL in", values, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailNotIn(List<String> values) {
            addCriterion("INVOICE_PERSON_EMAIL not in", values, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailBetween(String value1, String value2) {
            addCriterion("INVOICE_PERSON_EMAIL between", value1, value2, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonEmailNotBetween(String value1, String value2) {
            addCriterion("INVOICE_PERSON_EMAIL not between", value1, value2, "invoicePersonEmail");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignIsNull() {
            addCriterion("EXPIRATION_WARNING_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignIsNotNull() {
            addCriterion("EXPIRATION_WARNING_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignEqualTo(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN =", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignNotEqualTo(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN <>", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignGreaterThan(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN >", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN >=", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignLessThan(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN <", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRATION_WARNING_SIGN <=", value, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignIn(List<Integer> values) {
            addCriterion("EXPIRATION_WARNING_SIGN in", values, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignNotIn(List<Integer> values) {
            addCriterion("EXPIRATION_WARNING_SIGN not in", values, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRATION_WARNING_SIGN between", value1, value2, "expirationWarningSign");
            return (Criteria) this;
        }

        public Criteria andExpirationWarningSignNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRATION_WARNING_SIGN not between", value1, value2, "expirationWarningSign");
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