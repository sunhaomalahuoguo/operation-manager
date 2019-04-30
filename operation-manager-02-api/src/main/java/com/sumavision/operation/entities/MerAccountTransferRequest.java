package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerAccountTransferRequest implements Serializable {
    private Long id;

    private String requestId;

    private Long merchantId;

    private String merchantCode;

    private Integer outAccountType;

    private Integer inAccountType;

    private String projectNo;

    private BigDecimal fund;

    private Integer status;

    private String requestOprator;

    private Date requestTime;

    private String dealOpeator;

    private Date dealTime;

    private String failureInfo;

    private String auditingRemark;

    private String merInfo;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public Integer getOutAccountType() {
        return outAccountType;
    }

    public void setOutAccountType(Integer outAccountType) {
        this.outAccountType = outAccountType;
    }

    public Integer getInAccountType() {
        return inAccountType;
    }

    public void setInAccountType(Integer inAccountType) {
        this.inAccountType = inAccountType;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRequestOprator() {
        return requestOprator;
    }

    public void setRequestOprator(String requestOprator) {
        this.requestOprator = requestOprator == null ? null : requestOprator.trim();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getDealOpeator() {
        return dealOpeator;
    }

    public void setDealOpeator(String dealOpeator) {
        this.dealOpeator = dealOpeator == null ? null : dealOpeator.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getFailureInfo() {
        return failureInfo;
    }

    public void setFailureInfo(String failureInfo) {
        this.failureInfo = failureInfo == null ? null : failureInfo.trim();
    }

    public String getAuditingRemark() {
        return auditingRemark;
    }

    public void setAuditingRemark(String auditingRemark) {
        this.auditingRemark = auditingRemark == null ? null : auditingRemark.trim();
    }

    public String getMerInfo() {
        return merInfo;
    }

    public void setMerInfo(String merInfo) {
        this.merInfo = merInfo == null ? null : merInfo.trim();
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

    public String getFld5() {
        return fld5;
    }

    public void setFld5(String fld5) {
        this.fld5 = fld5 == null ? null : fld5.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestId=").append(requestId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", outAccountType=").append(outAccountType);
        sb.append(", inAccountType=").append(inAccountType);
        sb.append(", projectNo=").append(projectNo);
        sb.append(", fund=").append(fund);
        sb.append(", status=").append(status);
        sb.append(", requestOprator=").append(requestOprator);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", dealOpeator=").append(dealOpeator);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", failureInfo=").append(failureInfo);
        sb.append(", auditingRemark=").append(auditingRemark);
        sb.append(", merInfo=").append(merInfo);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}