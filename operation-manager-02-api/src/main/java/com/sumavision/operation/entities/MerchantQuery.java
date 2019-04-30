package com.sumavision.operation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MerchantQuery() {
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

        public Criteria andMerchantNameIsNull() {
            addCriterion("MERCHANT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("MERCHANT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("MERCHANT_NAME =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("MERCHANT_NAME <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("MERCHANT_NAME >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("MERCHANT_NAME <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("MERCHANT_NAME like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("MERCHANT_NAME not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("MERCHANT_NAME in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("MERCHANT_NAME not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("BUSINESS_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("BUSINESS_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("BUSINESS_LICENSE <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("BUSINESS_LICENSE like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("BUSINESS_LICENSE not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("CONTACT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("CONTACT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("CONTACT_PERSON =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("CONTACT_PERSON <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("CONTACT_PERSON >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PERSON >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("CONTACT_PERSON <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PERSON <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("CONTACT_PERSON like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("CONTACT_PERSON not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("CONTACT_PERSON in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("CONTACT_PERSON not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("CONTACT_PERSON between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PERSON not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneIsNull() {
            addCriterion("CONTACT_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneIsNotNull() {
            addCriterion("CONTACT_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneEqualTo(String value) {
            addCriterion("CONTACT_TELEPHONE =", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneNotEqualTo(String value) {
            addCriterion("CONTACT_TELEPHONE <>", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneGreaterThan(String value) {
            addCriterion("CONTACT_TELEPHONE >", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TELEPHONE >=", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneLessThan(String value) {
            addCriterion("CONTACT_TELEPHONE <", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TELEPHONE <=", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneLike(String value) {
            addCriterion("CONTACT_TELEPHONE like", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneNotLike(String value) {
            addCriterion("CONTACT_TELEPHONE not like", value, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneIn(List<String> values) {
            addCriterion("CONTACT_TELEPHONE in", values, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneNotIn(List<String> values) {
            addCriterion("CONTACT_TELEPHONE not in", values, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneBetween(String value1, String value2) {
            addCriterion("CONTACT_TELEPHONE between", value1, value2, "contactTelephone");
            return (Criteria) this;
        }

        public Criteria andContactTelephoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TELEPHONE not between", value1, value2, "contactTelephone");
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

        public Criteria andSignKeyIsNull() {
            addCriterion("SIGN_KEY is null");
            return (Criteria) this;
        }

        public Criteria andSignKeyIsNotNull() {
            addCriterion("SIGN_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andSignKeyEqualTo(String value) {
            addCriterion("SIGN_KEY =", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyNotEqualTo(String value) {
            addCriterion("SIGN_KEY <>", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyGreaterThan(String value) {
            addCriterion("SIGN_KEY >", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_KEY >=", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyLessThan(String value) {
            addCriterion("SIGN_KEY <", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyLessThanOrEqualTo(String value) {
            addCriterion("SIGN_KEY <=", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyLike(String value) {
            addCriterion("SIGN_KEY like", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyNotLike(String value) {
            addCriterion("SIGN_KEY not like", value, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyIn(List<String> values) {
            addCriterion("SIGN_KEY in", values, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyNotIn(List<String> values) {
            addCriterion("SIGN_KEY not in", values, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyBetween(String value1, String value2) {
            addCriterion("SIGN_KEY between", value1, value2, "signKey");
            return (Criteria) this;
        }

        public Criteria andSignKeyNotBetween(String value1, String value2) {
            addCriterion("SIGN_KEY not between", value1, value2, "signKey");
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFld11IsNull() {
            addCriterion("FLD11 is null");
            return (Criteria) this;
        }

        public Criteria andFld11IsNotNull() {
            addCriterion("FLD11 is not null");
            return (Criteria) this;
        }

        public Criteria andFld11EqualTo(String value) {
            addCriterion("FLD11 =", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11NotEqualTo(String value) {
            addCriterion("FLD11 <>", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11GreaterThan(String value) {
            addCriterion("FLD11 >", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11GreaterThanOrEqualTo(String value) {
            addCriterion("FLD11 >=", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11LessThan(String value) {
            addCriterion("FLD11 <", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11LessThanOrEqualTo(String value) {
            addCriterion("FLD11 <=", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11Like(String value) {
            addCriterion("FLD11 like", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11NotLike(String value) {
            addCriterion("FLD11 not like", value, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11In(List<String> values) {
            addCriterion("FLD11 in", values, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11NotIn(List<String> values) {
            addCriterion("FLD11 not in", values, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11Between(String value1, String value2) {
            addCriterion("FLD11 between", value1, value2, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld11NotBetween(String value1, String value2) {
            addCriterion("FLD11 not between", value1, value2, "fld11");
            return (Criteria) this;
        }

        public Criteria andFld12IsNull() {
            addCriterion("FLD12 is null");
            return (Criteria) this;
        }

        public Criteria andFld12IsNotNull() {
            addCriterion("FLD12 is not null");
            return (Criteria) this;
        }

        public Criteria andFld12EqualTo(String value) {
            addCriterion("FLD12 =", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12NotEqualTo(String value) {
            addCriterion("FLD12 <>", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12GreaterThan(String value) {
            addCriterion("FLD12 >", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12GreaterThanOrEqualTo(String value) {
            addCriterion("FLD12 >=", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12LessThan(String value) {
            addCriterion("FLD12 <", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12LessThanOrEqualTo(String value) {
            addCriterion("FLD12 <=", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12Like(String value) {
            addCriterion("FLD12 like", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12NotLike(String value) {
            addCriterion("FLD12 not like", value, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12In(List<String> values) {
            addCriterion("FLD12 in", values, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12NotIn(List<String> values) {
            addCriterion("FLD12 not in", values, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12Between(String value1, String value2) {
            addCriterion("FLD12 between", value1, value2, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld12NotBetween(String value1, String value2) {
            addCriterion("FLD12 not between", value1, value2, "fld12");
            return (Criteria) this;
        }

        public Criteria andFld13IsNull() {
            addCriterion("FLD13 is null");
            return (Criteria) this;
        }

        public Criteria andFld13IsNotNull() {
            addCriterion("FLD13 is not null");
            return (Criteria) this;
        }

        public Criteria andFld13EqualTo(String value) {
            addCriterion("FLD13 =", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13NotEqualTo(String value) {
            addCriterion("FLD13 <>", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13GreaterThan(String value) {
            addCriterion("FLD13 >", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13GreaterThanOrEqualTo(String value) {
            addCriterion("FLD13 >=", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13LessThan(String value) {
            addCriterion("FLD13 <", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13LessThanOrEqualTo(String value) {
            addCriterion("FLD13 <=", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13Like(String value) {
            addCriterion("FLD13 like", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13NotLike(String value) {
            addCriterion("FLD13 not like", value, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13In(List<String> values) {
            addCriterion("FLD13 in", values, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13NotIn(List<String> values) {
            addCriterion("FLD13 not in", values, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13Between(String value1, String value2) {
            addCriterion("FLD13 between", value1, value2, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld13NotBetween(String value1, String value2) {
            addCriterion("FLD13 not between", value1, value2, "fld13");
            return (Criteria) this;
        }

        public Criteria andFld14IsNull() {
            addCriterion("FLD14 is null");
            return (Criteria) this;
        }

        public Criteria andFld14IsNotNull() {
            addCriterion("FLD14 is not null");
            return (Criteria) this;
        }

        public Criteria andFld14EqualTo(String value) {
            addCriterion("FLD14 =", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14NotEqualTo(String value) {
            addCriterion("FLD14 <>", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14GreaterThan(String value) {
            addCriterion("FLD14 >", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14GreaterThanOrEqualTo(String value) {
            addCriterion("FLD14 >=", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14LessThan(String value) {
            addCriterion("FLD14 <", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14LessThanOrEqualTo(String value) {
            addCriterion("FLD14 <=", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14Like(String value) {
            addCriterion("FLD14 like", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14NotLike(String value) {
            addCriterion("FLD14 not like", value, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14In(List<String> values) {
            addCriterion("FLD14 in", values, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14NotIn(List<String> values) {
            addCriterion("FLD14 not in", values, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14Between(String value1, String value2) {
            addCriterion("FLD14 between", value1, value2, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld14NotBetween(String value1, String value2) {
            addCriterion("FLD14 not between", value1, value2, "fld14");
            return (Criteria) this;
        }

        public Criteria andFld15IsNull() {
            addCriterion("FLD15 is null");
            return (Criteria) this;
        }

        public Criteria andFld15IsNotNull() {
            addCriterion("FLD15 is not null");
            return (Criteria) this;
        }

        public Criteria andFld15EqualTo(String value) {
            addCriterion("FLD15 =", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15NotEqualTo(String value) {
            addCriterion("FLD15 <>", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15GreaterThan(String value) {
            addCriterion("FLD15 >", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15GreaterThanOrEqualTo(String value) {
            addCriterion("FLD15 >=", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15LessThan(String value) {
            addCriterion("FLD15 <", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15LessThanOrEqualTo(String value) {
            addCriterion("FLD15 <=", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15Like(String value) {
            addCriterion("FLD15 like", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15NotLike(String value) {
            addCriterion("FLD15 not like", value, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15In(List<String> values) {
            addCriterion("FLD15 in", values, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15NotIn(List<String> values) {
            addCriterion("FLD15 not in", values, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15Between(String value1, String value2) {
            addCriterion("FLD15 between", value1, value2, "fld15");
            return (Criteria) this;
        }

        public Criteria andFld15NotBetween(String value1, String value2) {
            addCriterion("FLD15 not between", value1, value2, "fld15");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Integer value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Integer value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Integer value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Integer value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Integer> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Integer> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andFld16IsNull() {
            addCriterion("FLD16 is null");
            return (Criteria) this;
        }

        public Criteria andFld16IsNotNull() {
            addCriterion("FLD16 is not null");
            return (Criteria) this;
        }

        public Criteria andFld16EqualTo(String value) {
            addCriterion("FLD16 =", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16NotEqualTo(String value) {
            addCriterion("FLD16 <>", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16GreaterThan(String value) {
            addCriterion("FLD16 >", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16GreaterThanOrEqualTo(String value) {
            addCriterion("FLD16 >=", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16LessThan(String value) {
            addCriterion("FLD16 <", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16LessThanOrEqualTo(String value) {
            addCriterion("FLD16 <=", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16Like(String value) {
            addCriterion("FLD16 like", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16NotLike(String value) {
            addCriterion("FLD16 not like", value, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16In(List<String> values) {
            addCriterion("FLD16 in", values, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16NotIn(List<String> values) {
            addCriterion("FLD16 not in", values, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16Between(String value1, String value2) {
            addCriterion("FLD16 between", value1, value2, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld16NotBetween(String value1, String value2) {
            addCriterion("FLD16 not between", value1, value2, "fld16");
            return (Criteria) this;
        }

        public Criteria andFld17IsNull() {
            addCriterion("FLD17 is null");
            return (Criteria) this;
        }

        public Criteria andFld17IsNotNull() {
            addCriterion("FLD17 is not null");
            return (Criteria) this;
        }

        public Criteria andFld17EqualTo(String value) {
            addCriterion("FLD17 =", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17NotEqualTo(String value) {
            addCriterion("FLD17 <>", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17GreaterThan(String value) {
            addCriterion("FLD17 >", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17GreaterThanOrEqualTo(String value) {
            addCriterion("FLD17 >=", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17LessThan(String value) {
            addCriterion("FLD17 <", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17LessThanOrEqualTo(String value) {
            addCriterion("FLD17 <=", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17Like(String value) {
            addCriterion("FLD17 like", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17NotLike(String value) {
            addCriterion("FLD17 not like", value, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17In(List<String> values) {
            addCriterion("FLD17 in", values, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17NotIn(List<String> values) {
            addCriterion("FLD17 not in", values, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17Between(String value1, String value2) {
            addCriterion("FLD17 between", value1, value2, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld17NotBetween(String value1, String value2) {
            addCriterion("FLD17 not between", value1, value2, "fld17");
            return (Criteria) this;
        }

        public Criteria andFld18IsNull() {
            addCriterion("FLD18 is null");
            return (Criteria) this;
        }

        public Criteria andFld18IsNotNull() {
            addCriterion("FLD18 is not null");
            return (Criteria) this;
        }

        public Criteria andFld18EqualTo(String value) {
            addCriterion("FLD18 =", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18NotEqualTo(String value) {
            addCriterion("FLD18 <>", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18GreaterThan(String value) {
            addCriterion("FLD18 >", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18GreaterThanOrEqualTo(String value) {
            addCriterion("FLD18 >=", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18LessThan(String value) {
            addCriterion("FLD18 <", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18LessThanOrEqualTo(String value) {
            addCriterion("FLD18 <=", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18Like(String value) {
            addCriterion("FLD18 like", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18NotLike(String value) {
            addCriterion("FLD18 not like", value, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18In(List<String> values) {
            addCriterion("FLD18 in", values, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18NotIn(List<String> values) {
            addCriterion("FLD18 not in", values, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18Between(String value1, String value2) {
            addCriterion("FLD18 between", value1, value2, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld18NotBetween(String value1, String value2) {
            addCriterion("FLD18 not between", value1, value2, "fld18");
            return (Criteria) this;
        }

        public Criteria andFld19IsNull() {
            addCriterion("FLD19 is null");
            return (Criteria) this;
        }

        public Criteria andFld19IsNotNull() {
            addCriterion("FLD19 is not null");
            return (Criteria) this;
        }

        public Criteria andFld19EqualTo(String value) {
            addCriterion("FLD19 =", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19NotEqualTo(String value) {
            addCriterion("FLD19 <>", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19GreaterThan(String value) {
            addCriterion("FLD19 >", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19GreaterThanOrEqualTo(String value) {
            addCriterion("FLD19 >=", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19LessThan(String value) {
            addCriterion("FLD19 <", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19LessThanOrEqualTo(String value) {
            addCriterion("FLD19 <=", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19Like(String value) {
            addCriterion("FLD19 like", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19NotLike(String value) {
            addCriterion("FLD19 not like", value, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19In(List<String> values) {
            addCriterion("FLD19 in", values, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19NotIn(List<String> values) {
            addCriterion("FLD19 not in", values, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19Between(String value1, String value2) {
            addCriterion("FLD19 between", value1, value2, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld19NotBetween(String value1, String value2) {
            addCriterion("FLD19 not between", value1, value2, "fld19");
            return (Criteria) this;
        }

        public Criteria andFld20IsNull() {
            addCriterion("FLD20 is null");
            return (Criteria) this;
        }

        public Criteria andFld20IsNotNull() {
            addCriterion("FLD20 is not null");
            return (Criteria) this;
        }

        public Criteria andFld20EqualTo(String value) {
            addCriterion("FLD20 =", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20NotEqualTo(String value) {
            addCriterion("FLD20 <>", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20GreaterThan(String value) {
            addCriterion("FLD20 >", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20GreaterThanOrEqualTo(String value) {
            addCriterion("FLD20 >=", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20LessThan(String value) {
            addCriterion("FLD20 <", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20LessThanOrEqualTo(String value) {
            addCriterion("FLD20 <=", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20Like(String value) {
            addCriterion("FLD20 like", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20NotLike(String value) {
            addCriterion("FLD20 not like", value, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20In(List<String> values) {
            addCriterion("FLD20 in", values, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20NotIn(List<String> values) {
            addCriterion("FLD20 not in", values, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20Between(String value1, String value2) {
            addCriterion("FLD20 between", value1, value2, "fld20");
            return (Criteria) this;
        }

        public Criteria andFld20NotBetween(String value1, String value2) {
            addCriterion("FLD20 not between", value1, value2, "fld20");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNull() {
            addCriterion("IS_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNotNull() {
            addCriterion("IS_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentEqualTo(String value) {
            addCriterion("IS_AGENT =", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotEqualTo(String value) {
            addCriterion("IS_AGENT <>", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThan(String value) {
            addCriterion("IS_AGENT >", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AGENT >=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThan(String value) {
            addCriterion("IS_AGENT <", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThanOrEqualTo(String value) {
            addCriterion("IS_AGENT <=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLike(String value) {
            addCriterion("IS_AGENT like", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotLike(String value) {
            addCriterion("IS_AGENT not like", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentIn(List<String> values) {
            addCriterion("IS_AGENT in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotIn(List<String> values) {
            addCriterion("IS_AGENT not in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentBetween(String value1, String value2) {
            addCriterion("IS_AGENT between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotBetween(String value1, String value2) {
            addCriterion("IS_AGENT not between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
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