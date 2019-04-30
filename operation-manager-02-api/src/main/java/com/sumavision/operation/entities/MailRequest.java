package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MailRequest implements Serializable {
    private BigDecimal id;

    private String mailTo;

    private String mailFrom;

    private Integer isRetry;

    private Integer retryTimes;

    private BigDecimal retryPeriod;

    private String mailContent;

    private String mailSubject;

    private String writeTo;

    private String mailFile;

    private String mailFileName;

    private Integer mailStatus;

    private Integer mailType;

    private Date lastSendTime;

    private String randomCode;

    private String randomId;

    private Date requestTime;

    private Long relUserId;

    private Long relTradeId;

    private String remark;

    private String lastEditor;

    private Date lastEditTime;

    private String lastEditProcess;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo == null ? null : mailTo.trim();
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom == null ? null : mailFrom.trim();
    }

    public Integer getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(Integer isRetry) {
        this.isRetry = isRetry;
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public BigDecimal getRetryPeriod() {
        return retryPeriod;
    }

    public void setRetryPeriod(BigDecimal retryPeriod) {
        this.retryPeriod = retryPeriod;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent == null ? null : mailContent.trim();
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject == null ? null : mailSubject.trim();
    }

    public String getWriteTo() {
        return writeTo;
    }

    public void setWriteTo(String writeTo) {
        this.writeTo = writeTo == null ? null : writeTo.trim();
    }

    public String getMailFile() {
        return mailFile;
    }

    public void setMailFile(String mailFile) {
        this.mailFile = mailFile == null ? null : mailFile.trim();
    }

    public String getMailFileName() {
        return mailFileName;
    }

    public void setMailFileName(String mailFileName) {
        this.mailFileName = mailFileName == null ? null : mailFileName.trim();
    }

    public Integer getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
    }

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
    }

    public Date getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(Date lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode == null ? null : randomCode.trim();
    }

    public String getRandomId() {
        return randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId == null ? null : randomId.trim();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Long getRelUserId() {
        return relUserId;
    }

    public void setRelUserId(Long relUserId) {
        this.relUserId = relUserId;
    }

    public Long getRelTradeId() {
        return relTradeId;
    }

    public void setRelTradeId(Long relTradeId) {
        this.relTradeId = relTradeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor == null ? null : lastEditor.trim();
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getLastEditProcess() {
        return lastEditProcess;
    }

    public void setLastEditProcess(String lastEditProcess) {
        this.lastEditProcess = lastEditProcess == null ? null : lastEditProcess.trim();
    }

    public String getFld1() {
        return fld1;
    }

    public void setFld1(String fld1) {
        this.fld1 = fld1 == null ? null : fld1.trim();
    }

    public String getFld2() {
        return fld2;
    }

    public void setFld2(String fld2) {
        this.fld2 = fld2 == null ? null : fld2.trim();
    }

    public String getFld3() {
        return fld3;
    }

    public void setFld3(String fld3) {
        this.fld3 = fld3 == null ? null : fld3.trim();
    }

    public String getFld4() {
        return fld4;
    }

    public void setFld4(String fld4) {
        this.fld4 = fld4 == null ? null : fld4.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mailTo=").append(mailTo);
        sb.append(", mailFrom=").append(mailFrom);
        sb.append(", isRetry=").append(isRetry);
        sb.append(", retryTimes=").append(retryTimes);
        sb.append(", retryPeriod=").append(retryPeriod);
        sb.append(", mailContent=").append(mailContent);
        sb.append(", mailSubject=").append(mailSubject);
        sb.append(", writeTo=").append(writeTo);
        sb.append(", mailFile=").append(mailFile);
        sb.append(", mailFileName=").append(mailFileName);
        sb.append(", mailStatus=").append(mailStatus);
        sb.append(", mailType=").append(mailType);
        sb.append(", lastSendTime=").append(lastSendTime);
        sb.append(", randomCode=").append(randomCode);
        sb.append(", randomId=").append(randomId);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", relUserId=").append(relUserId);
        sb.append(", relTradeId=").append(relTradeId);
        sb.append(", remark=").append(remark);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditProcess=").append(lastEditProcess);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}