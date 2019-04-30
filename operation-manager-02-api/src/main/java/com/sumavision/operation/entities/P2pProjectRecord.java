package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class P2pProjectRecord implements Serializable {
    private Long id;

    private Long p2pMerchantId;

    private String projectNo;

    private Integer status;

    private BigDecimal investmentSum;

    private BigDecimal repaymentSum;

    private Long projectOutAccountId;

    private Long projectInAccountId;

    private Long outTradeId;

    private Long inTradeId;

    private Date createTime;

    private Date lastEditTime;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private BigDecimal projectSum;

    private Integer projectType;

    private String projectName;

    private String annualRate;

    private Integer borrowerType;

    private String borrowerUserIdentity;

    private Long borrowerUserId;

    private Integer borrowerIdType;

    private String borrowerIdNumber;

    private String borrowerName;

    private String borrowerEnterpriseName;

    private String borrowerBizLicenseNo;

    private Integer overdueSubrogationSign;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getP2pMerchantId() {
        return p2pMerchantId;
    }

    public void setP2pMerchantId(Long p2pMerchantId) {
        this.p2pMerchantId = p2pMerchantId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getInvestmentSum() {
        return investmentSum;
    }

    public void setInvestmentSum(BigDecimal investmentSum) {
        this.investmentSum = investmentSum;
    }

    public BigDecimal getRepaymentSum() {
        return repaymentSum;
    }

    public void setRepaymentSum(BigDecimal repaymentSum) {
        this.repaymentSum = repaymentSum;
    }

    public Long getProjectOutAccountId() {
        return projectOutAccountId;
    }

    public void setProjectOutAccountId(Long projectOutAccountId) {
        this.projectOutAccountId = projectOutAccountId;
    }

    public Long getProjectInAccountId() {
        return projectInAccountId;
    }

    public void setProjectInAccountId(Long projectInAccountId) {
        this.projectInAccountId = projectInAccountId;
    }

    public Long getOutTradeId() {
        return outTradeId;
    }

    public void setOutTradeId(Long outTradeId) {
        this.outTradeId = outTradeId;
    }

    public Long getInTradeId() {
        return inTradeId;
    }

    public void setInTradeId(Long inTradeId) {
        this.inTradeId = inTradeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
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

    public BigDecimal getProjectSum() {
        return projectSum;
    }

    public void setProjectSum(BigDecimal projectSum) {
        this.projectSum = projectSum;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(String annualRate) {
        this.annualRate = annualRate == null ? null : annualRate.trim();
    }

    public Integer getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(Integer borrowerType) {
        this.borrowerType = borrowerType;
    }

    public String getBorrowerUserIdentity() {
        return borrowerUserIdentity;
    }

    public void setBorrowerUserIdentity(String borrowerUserIdentity) {
        this.borrowerUserIdentity = borrowerUserIdentity == null ? null : borrowerUserIdentity.trim();
    }

    public Long getBorrowerUserId() {
        return borrowerUserId;
    }

    public void setBorrowerUserId(Long borrowerUserId) {
        this.borrowerUserId = borrowerUserId;
    }

    public Integer getBorrowerIdType() {
        return borrowerIdType;
    }

    public void setBorrowerIdType(Integer borrowerIdType) {
        this.borrowerIdType = borrowerIdType;
    }

    public String getBorrowerIdNumber() {
        return borrowerIdNumber;
    }

    public void setBorrowerIdNumber(String borrowerIdNumber) {
        this.borrowerIdNumber = borrowerIdNumber == null ? null : borrowerIdNumber.trim();
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName == null ? null : borrowerName.trim();
    }

    public String getBorrowerEnterpriseName() {
        return borrowerEnterpriseName;
    }

    public void setBorrowerEnterpriseName(String borrowerEnterpriseName) {
        this.borrowerEnterpriseName = borrowerEnterpriseName == null ? null : borrowerEnterpriseName.trim();
    }

    public String getBorrowerBizLicenseNo() {
        return borrowerBizLicenseNo;
    }

    public void setBorrowerBizLicenseNo(String borrowerBizLicenseNo) {
        this.borrowerBizLicenseNo = borrowerBizLicenseNo == null ? null : borrowerBizLicenseNo.trim();
    }

    public Integer getOverdueSubrogationSign() {
        return overdueSubrogationSign;
    }

    public void setOverdueSubrogationSign(Integer overdueSubrogationSign) {
        this.overdueSubrogationSign = overdueSubrogationSign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", p2pMerchantId=").append(p2pMerchantId);
        sb.append(", projectNo=").append(projectNo);
        sb.append(", status=").append(status);
        sb.append(", investmentSum=").append(investmentSum);
        sb.append(", repaymentSum=").append(repaymentSum);
        sb.append(", projectOutAccountId=").append(projectOutAccountId);
        sb.append(", projectInAccountId=").append(projectInAccountId);
        sb.append(", outTradeId=").append(outTradeId);
        sb.append(", inTradeId=").append(inTradeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", projectSum=").append(projectSum);
        sb.append(", projectType=").append(projectType);
        sb.append(", projectName=").append(projectName);
        sb.append(", annualRate=").append(annualRate);
        sb.append(", borrowerType=").append(borrowerType);
        sb.append(", borrowerUserIdentity=").append(borrowerUserIdentity);
        sb.append(", borrowerUserId=").append(borrowerUserId);
        sb.append(", borrowerIdType=").append(borrowerIdType);
        sb.append(", borrowerIdNumber=").append(borrowerIdNumber);
        sb.append(", borrowerName=").append(borrowerName);
        sb.append(", borrowerEnterpriseName=").append(borrowerEnterpriseName);
        sb.append(", borrowerBizLicenseNo=").append(borrowerBizLicenseNo);
        sb.append(", overdueSubrogationSign=").append(overdueSubrogationSign);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}