package com.sumavision.operation.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MailRequestQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public MailRequestQuery() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMailToIsNull() {
            addCriterion("MAIL_TO is null");
            return (Criteria) this;
        }

        public Criteria andMailToIsNotNull() {
            addCriterion("MAIL_TO is not null");
            return (Criteria) this;
        }

        public Criteria andMailToEqualTo(String value) {
            addCriterion("MAIL_TO =", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToNotEqualTo(String value) {
            addCriterion("MAIL_TO <>", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToGreaterThan(String value) {
            addCriterion("MAIL_TO >", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_TO >=", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToLessThan(String value) {
            addCriterion("MAIL_TO <", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToLessThanOrEqualTo(String value) {
            addCriterion("MAIL_TO <=", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToLike(String value) {
            addCriterion("MAIL_TO like", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToNotLike(String value) {
            addCriterion("MAIL_TO not like", value, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToIn(List<String> values) {
            addCriterion("MAIL_TO in", values, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToNotIn(List<String> values) {
            addCriterion("MAIL_TO not in", values, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToBetween(String value1, String value2) {
            addCriterion("MAIL_TO between", value1, value2, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailToNotBetween(String value1, String value2) {
            addCriterion("MAIL_TO not between", value1, value2, "mailTo");
            return (Criteria) this;
        }

        public Criteria andMailFromIsNull() {
            addCriterion("MAIL_FROM is null");
            return (Criteria) this;
        }

        public Criteria andMailFromIsNotNull() {
            addCriterion("MAIL_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andMailFromEqualTo(String value) {
            addCriterion("MAIL_FROM =", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromNotEqualTo(String value) {
            addCriterion("MAIL_FROM <>", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromGreaterThan(String value) {
            addCriterion("MAIL_FROM >", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_FROM >=", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromLessThan(String value) {
            addCriterion("MAIL_FROM <", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromLessThanOrEqualTo(String value) {
            addCriterion("MAIL_FROM <=", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromLike(String value) {
            addCriterion("MAIL_FROM like", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromNotLike(String value) {
            addCriterion("MAIL_FROM not like", value, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromIn(List<String> values) {
            addCriterion("MAIL_FROM in", values, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromNotIn(List<String> values) {
            addCriterion("MAIL_FROM not in", values, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromBetween(String value1, String value2) {
            addCriterion("MAIL_FROM between", value1, value2, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andMailFromNotBetween(String value1, String value2) {
            addCriterion("MAIL_FROM not between", value1, value2, "mailFrom");
            return (Criteria) this;
        }

        public Criteria andIsRetryIsNull() {
            addCriterion("IS_RETRY is null");
            return (Criteria) this;
        }

        public Criteria andIsRetryIsNotNull() {
            addCriterion("IS_RETRY is not null");
            return (Criteria) this;
        }

        public Criteria andIsRetryEqualTo(Integer value) {
            addCriterion("IS_RETRY =", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryNotEqualTo(Integer value) {
            addCriterion("IS_RETRY <>", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryGreaterThan(Integer value) {
            addCriterion("IS_RETRY >", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RETRY >=", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryLessThan(Integer value) {
            addCriterion("IS_RETRY <", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RETRY <=", value, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryIn(List<Integer> values) {
            addCriterion("IS_RETRY in", values, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryNotIn(List<Integer> values) {
            addCriterion("IS_RETRY not in", values, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryBetween(Integer value1, Integer value2) {
            addCriterion("IS_RETRY between", value1, value2, "isRetry");
            return (Criteria) this;
        }

        public Criteria andIsRetryNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RETRY not between", value1, value2, "isRetry");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIsNull() {
            addCriterion("RETRY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIsNotNull() {
            addCriterion("RETRY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRetryTimesEqualTo(Integer value) {
            addCriterion("RETRY_TIMES =", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotEqualTo(Integer value) {
            addCriterion("RETRY_TIMES <>", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesGreaterThan(Integer value) {
            addCriterion("RETRY_TIMES >", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRY_TIMES >=", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesLessThan(Integer value) {
            addCriterion("RETRY_TIMES <", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesLessThanOrEqualTo(Integer value) {
            addCriterion("RETRY_TIMES <=", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIn(List<Integer> values) {
            addCriterion("RETRY_TIMES in", values, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotIn(List<Integer> values) {
            addCriterion("RETRY_TIMES not in", values, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_TIMES between", value1, value2, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_TIMES not between", value1, value2, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodIsNull() {
            addCriterion("RETRY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodIsNotNull() {
            addCriterion("RETRY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodEqualTo(BigDecimal value) {
            addCriterion("RETRY_PERIOD =", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodNotEqualTo(BigDecimal value) {
            addCriterion("RETRY_PERIOD <>", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodGreaterThan(BigDecimal value) {
            addCriterion("RETRY_PERIOD >", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRY_PERIOD >=", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodLessThan(BigDecimal value) {
            addCriterion("RETRY_PERIOD <", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRY_PERIOD <=", value, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodIn(List<BigDecimal> values) {
            addCriterion("RETRY_PERIOD in", values, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodNotIn(List<BigDecimal> values) {
            addCriterion("RETRY_PERIOD not in", values, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRY_PERIOD between", value1, value2, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andRetryPeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRY_PERIOD not between", value1, value2, "retryPeriod");
            return (Criteria) this;
        }

        public Criteria andMailContentIsNull() {
            addCriterion("MAIL_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMailContentIsNotNull() {
            addCriterion("MAIL_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMailContentEqualTo(String value) {
            addCriterion("MAIL_CONTENT =", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotEqualTo(String value) {
            addCriterion("MAIL_CONTENT <>", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentGreaterThan(String value) {
            addCriterion("MAIL_CONTENT >", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_CONTENT >=", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLessThan(String value) {
            addCriterion("MAIL_CONTENT <", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLessThanOrEqualTo(String value) {
            addCriterion("MAIL_CONTENT <=", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLike(String value) {
            addCriterion("MAIL_CONTENT like", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotLike(String value) {
            addCriterion("MAIL_CONTENT not like", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentIn(List<String> values) {
            addCriterion("MAIL_CONTENT in", values, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotIn(List<String> values) {
            addCriterion("MAIL_CONTENT not in", values, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentBetween(String value1, String value2) {
            addCriterion("MAIL_CONTENT between", value1, value2, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotBetween(String value1, String value2) {
            addCriterion("MAIL_CONTENT not between", value1, value2, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNull() {
            addCriterion("MAIL_SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNotNull() {
            addCriterion("MAIL_SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectEqualTo(String value) {
            addCriterion("MAIL_SUBJECT =", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotEqualTo(String value) {
            addCriterion("MAIL_SUBJECT <>", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThan(String value) {
            addCriterion("MAIL_SUBJECT >", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_SUBJECT >=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThan(String value) {
            addCriterion("MAIL_SUBJECT <", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThanOrEqualTo(String value) {
            addCriterion("MAIL_SUBJECT <=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLike(String value) {
            addCriterion("MAIL_SUBJECT like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotLike(String value) {
            addCriterion("MAIL_SUBJECT not like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIn(List<String> values) {
            addCriterion("MAIL_SUBJECT in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotIn(List<String> values) {
            addCriterion("MAIL_SUBJECT not in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectBetween(String value1, String value2) {
            addCriterion("MAIL_SUBJECT between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotBetween(String value1, String value2) {
            addCriterion("MAIL_SUBJECT not between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andWriteToIsNull() {
            addCriterion("WRITE_TO is null");
            return (Criteria) this;
        }

        public Criteria andWriteToIsNotNull() {
            addCriterion("WRITE_TO is not null");
            return (Criteria) this;
        }

        public Criteria andWriteToEqualTo(String value) {
            addCriterion("WRITE_TO =", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToNotEqualTo(String value) {
            addCriterion("WRITE_TO <>", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToGreaterThan(String value) {
            addCriterion("WRITE_TO >", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToGreaterThanOrEqualTo(String value) {
            addCriterion("WRITE_TO >=", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToLessThan(String value) {
            addCriterion("WRITE_TO <", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToLessThanOrEqualTo(String value) {
            addCriterion("WRITE_TO <=", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToLike(String value) {
            addCriterion("WRITE_TO like", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToNotLike(String value) {
            addCriterion("WRITE_TO not like", value, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToIn(List<String> values) {
            addCriterion("WRITE_TO in", values, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToNotIn(List<String> values) {
            addCriterion("WRITE_TO not in", values, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToBetween(String value1, String value2) {
            addCriterion("WRITE_TO between", value1, value2, "writeTo");
            return (Criteria) this;
        }

        public Criteria andWriteToNotBetween(String value1, String value2) {
            addCriterion("WRITE_TO not between", value1, value2, "writeTo");
            return (Criteria) this;
        }

        public Criteria andMailFileIsNull() {
            addCriterion("MAIL_FILE is null");
            return (Criteria) this;
        }

        public Criteria andMailFileIsNotNull() {
            addCriterion("MAIL_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andMailFileEqualTo(String value) {
            addCriterion("MAIL_FILE =", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileNotEqualTo(String value) {
            addCriterion("MAIL_FILE <>", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileGreaterThan(String value) {
            addCriterion("MAIL_FILE >", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_FILE >=", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileLessThan(String value) {
            addCriterion("MAIL_FILE <", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileLessThanOrEqualTo(String value) {
            addCriterion("MAIL_FILE <=", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileLike(String value) {
            addCriterion("MAIL_FILE like", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileNotLike(String value) {
            addCriterion("MAIL_FILE not like", value, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileIn(List<String> values) {
            addCriterion("MAIL_FILE in", values, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileNotIn(List<String> values) {
            addCriterion("MAIL_FILE not in", values, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileBetween(String value1, String value2) {
            addCriterion("MAIL_FILE between", value1, value2, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileNotBetween(String value1, String value2) {
            addCriterion("MAIL_FILE not between", value1, value2, "mailFile");
            return (Criteria) this;
        }

        public Criteria andMailFileNameIsNull() {
            addCriterion("MAIL_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMailFileNameIsNotNull() {
            addCriterion("MAIL_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMailFileNameEqualTo(String value) {
            addCriterion("MAIL_FILE_NAME =", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameNotEqualTo(String value) {
            addCriterion("MAIL_FILE_NAME <>", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameGreaterThan(String value) {
            addCriterion("MAIL_FILE_NAME >", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_FILE_NAME >=", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameLessThan(String value) {
            addCriterion("MAIL_FILE_NAME <", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameLessThanOrEqualTo(String value) {
            addCriterion("MAIL_FILE_NAME <=", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameLike(String value) {
            addCriterion("MAIL_FILE_NAME like", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameNotLike(String value) {
            addCriterion("MAIL_FILE_NAME not like", value, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameIn(List<String> values) {
            addCriterion("MAIL_FILE_NAME in", values, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameNotIn(List<String> values) {
            addCriterion("MAIL_FILE_NAME not in", values, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameBetween(String value1, String value2) {
            addCriterion("MAIL_FILE_NAME between", value1, value2, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailFileNameNotBetween(String value1, String value2) {
            addCriterion("MAIL_FILE_NAME not between", value1, value2, "mailFileName");
            return (Criteria) this;
        }

        public Criteria andMailStatusIsNull() {
            addCriterion("MAIL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMailStatusIsNotNull() {
            addCriterion("MAIL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMailStatusEqualTo(Integer value) {
            addCriterion("MAIL_STATUS =", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotEqualTo(Integer value) {
            addCriterion("MAIL_STATUS <>", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusGreaterThan(Integer value) {
            addCriterion("MAIL_STATUS >", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIL_STATUS >=", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusLessThan(Integer value) {
            addCriterion("MAIL_STATUS <", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("MAIL_STATUS <=", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusIn(List<Integer> values) {
            addCriterion("MAIL_STATUS in", values, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotIn(List<Integer> values) {
            addCriterion("MAIL_STATUS not in", values, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_STATUS between", value1, value2, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_STATUS not between", value1, value2, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNull() {
            addCriterion("MAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNotNull() {
            addCriterion("MAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMailTypeEqualTo(Integer value) {
            addCriterion("MAIL_TYPE =", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotEqualTo(Integer value) {
            addCriterion("MAIL_TYPE <>", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThan(Integer value) {
            addCriterion("MAIL_TYPE >", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIL_TYPE >=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThan(Integer value) {
            addCriterion("MAIL_TYPE <", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThanOrEqualTo(Integer value) {
            addCriterion("MAIL_TYPE <=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeIn(List<Integer> values) {
            addCriterion("MAIL_TYPE in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotIn(List<Integer> values) {
            addCriterion("MAIL_TYPE not in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_TYPE between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_TYPE not between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNull() {
            addCriterion("LAST_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNotNull() {
            addCriterion("LAST_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME =", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME <>", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME >", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME >=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThan(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME <", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_SEND_TIME <=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_SEND_TIME in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_SEND_TIME not in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_SEND_TIME between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_SEND_TIME not between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andRandomCodeIsNull() {
            addCriterion("RANDOM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRandomCodeIsNotNull() {
            addCriterion("RANDOM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRandomCodeEqualTo(String value) {
            addCriterion("RANDOM_CODE =", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeNotEqualTo(String value) {
            addCriterion("RANDOM_CODE <>", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeGreaterThan(String value) {
            addCriterion("RANDOM_CODE >", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RANDOM_CODE >=", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeLessThan(String value) {
            addCriterion("RANDOM_CODE <", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeLessThanOrEqualTo(String value) {
            addCriterion("RANDOM_CODE <=", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeLike(String value) {
            addCriterion("RANDOM_CODE like", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeNotLike(String value) {
            addCriterion("RANDOM_CODE not like", value, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeIn(List<String> values) {
            addCriterion("RANDOM_CODE in", values, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeNotIn(List<String> values) {
            addCriterion("RANDOM_CODE not in", values, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeBetween(String value1, String value2) {
            addCriterion("RANDOM_CODE between", value1, value2, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomCodeNotBetween(String value1, String value2) {
            addCriterion("RANDOM_CODE not between", value1, value2, "randomCode");
            return (Criteria) this;
        }

        public Criteria andRandomIdIsNull() {
            addCriterion("RANDOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRandomIdIsNotNull() {
            addCriterion("RANDOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRandomIdEqualTo(String value) {
            addCriterion("RANDOM_ID =", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdNotEqualTo(String value) {
            addCriterion("RANDOM_ID <>", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdGreaterThan(String value) {
            addCriterion("RANDOM_ID >", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdGreaterThanOrEqualTo(String value) {
            addCriterion("RANDOM_ID >=", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdLessThan(String value) {
            addCriterion("RANDOM_ID <", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdLessThanOrEqualTo(String value) {
            addCriterion("RANDOM_ID <=", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdLike(String value) {
            addCriterion("RANDOM_ID like", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdNotLike(String value) {
            addCriterion("RANDOM_ID not like", value, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdIn(List<String> values) {
            addCriterion("RANDOM_ID in", values, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdNotIn(List<String> values) {
            addCriterion("RANDOM_ID not in", values, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdBetween(String value1, String value2) {
            addCriterion("RANDOM_ID between", value1, value2, "randomId");
            return (Criteria) this;
        }

        public Criteria andRandomIdNotBetween(String value1, String value2) {
            addCriterion("RANDOM_ID not between", value1, value2, "randomId");
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

        public Criteria andRelUserIdIsNull() {
            addCriterion("REL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelUserIdIsNotNull() {
            addCriterion("REL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelUserIdEqualTo(Long value) {
            addCriterion("REL_USER_ID =", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdNotEqualTo(Long value) {
            addCriterion("REL_USER_ID <>", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdGreaterThan(Long value) {
            addCriterion("REL_USER_ID >", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REL_USER_ID >=", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdLessThan(Long value) {
            addCriterion("REL_USER_ID <", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdLessThanOrEqualTo(Long value) {
            addCriterion("REL_USER_ID <=", value, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdIn(List<Long> values) {
            addCriterion("REL_USER_ID in", values, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdNotIn(List<Long> values) {
            addCriterion("REL_USER_ID not in", values, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdBetween(Long value1, Long value2) {
            addCriterion("REL_USER_ID between", value1, value2, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelUserIdNotBetween(Long value1, Long value2) {
            addCriterion("REL_USER_ID not between", value1, value2, "relUserId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdIsNull() {
            addCriterion("REL_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdIsNotNull() {
            addCriterion("REL_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdEqualTo(Long value) {
            addCriterion("REL_TRADE_ID =", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdNotEqualTo(Long value) {
            addCriterion("REL_TRADE_ID <>", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdGreaterThan(Long value) {
            addCriterion("REL_TRADE_ID >", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REL_TRADE_ID >=", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdLessThan(Long value) {
            addCriterion("REL_TRADE_ID <", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("REL_TRADE_ID <=", value, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdIn(List<Long> values) {
            addCriterion("REL_TRADE_ID in", values, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdNotIn(List<Long> values) {
            addCriterion("REL_TRADE_ID not in", values, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdBetween(Long value1, Long value2) {
            addCriterion("REL_TRADE_ID between", value1, value2, "relTradeId");
            return (Criteria) this;
        }

        public Criteria andRelTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("REL_TRADE_ID not between", value1, value2, "relTradeId");
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