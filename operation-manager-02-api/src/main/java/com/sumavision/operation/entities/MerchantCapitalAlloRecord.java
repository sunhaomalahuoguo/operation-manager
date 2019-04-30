package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerchantCapitalAlloRecord implements Serializable {
    private Long id;

    private String alloNo;

    private Long merchantId;

    private Integer status;

    private String requestOperator;

    private Date requestTime;

    private String confirmOperator;

    private Date confirmTime;

    private Date dealTime;

    private Integer totalCount;

    private BigDecimal totalSum;

    private Integer validCount;

    private BigDecimal validSum;

    private BigDecimal validFee;

    private BigDecimal validDeductSum;

    private Integer secceedCount;

    private BigDecimal secceedSum;

    private BigDecimal secceedFee;

    private Integer chargeType;

    private Integer alloType;

    private String failReason;

    private String fld1;

    private String fld2;

    private String fld3;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlloNo() {
        return alloNo;
    }

    public void setAlloNo(String alloNo) {
        this.alloNo = alloNo == null ? null : alloNo.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRequestOperator() {
        return requestOperator;
    }

    public void setRequestOperator(String requestOperator) {
        this.requestOperator = requestOperator == null ? null : requestOperator.trim();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getConfirmOperator() {
        return confirmOperator;
    }

    public void setConfirmOperator(String confirmOperator) {
        this.confirmOperator = confirmOperator == null ? null : confirmOperator.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public Integer getValidCount() {
        return validCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
    }

    public BigDecimal getValidSum() {
        return validSum;
    }

    public void setValidSum(BigDecimal validSum) {
        this.validSum = validSum;
    }

    public BigDecimal getValidFee() {
        return validFee;
    }

    public void setValidFee(BigDecimal validFee) {
        this.validFee = validFee;
    }

    public BigDecimal getValidDeductSum() {
        return validDeductSum;
    }

    public void setValidDeductSum(BigDecimal validDeductSum) {
        this.validDeductSum = validDeductSum;
    }

    public Integer getSecceedCount() {
        return secceedCount;
    }

    public void setSecceedCount(Integer secceedCount) {
        this.secceedCount = secceedCount;
    }

    public BigDecimal getSecceedSum() {
        return secceedSum;
    }

    public void setSecceedSum(BigDecimal secceedSum) {
        this.secceedSum = secceedSum;
    }

    public BigDecimal getSecceedFee() {
        return secceedFee;
    }

    public void setSecceedFee(BigDecimal secceedFee) {
        this.secceedFee = secceedFee;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getAlloType() {
        return alloType;
    }

    public void setAlloType(Integer alloType) {
        this.alloType = alloType;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", alloNo=").append(alloNo);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", status=").append(status);
        sb.append(", requestOperator=").append(requestOperator);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", confirmOperator=").append(confirmOperator);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", totalSum=").append(totalSum);
        sb.append(", validCount=").append(validCount);
        sb.append(", validSum=").append(validSum);
        sb.append(", validFee=").append(validFee);
        sb.append(", validDeductSum=").append(validDeductSum);
        sb.append(", secceedCount=").append(secceedCount);
        sb.append(", secceedSum=").append(secceedSum);
        sb.append(", secceedFee=").append(secceedFee);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", alloType=").append(alloType);
        sb.append(", failReason=").append(failReason);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}