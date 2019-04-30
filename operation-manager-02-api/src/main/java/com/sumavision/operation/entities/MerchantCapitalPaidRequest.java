package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerchantCapitalPaidRequest implements Serializable {
    private Long id;

    private String requestId;

    private String merchantCode;

    private Long merchantId;

    private Long parentMerchantId;

    private String parentMerchantCode;

    private BigDecimal fund;

    private BigDecimal fee;

    private BigDecimal deductFund;

    private Integer status;

    private Integer isRealtime;

    private Date paidTime;

    private String requestOperator;

    private Date requestTime;

    private String auditingOperator;

    private Date auditingTime;

    private String auditingRemark;

    private String parentAuditingOperator;

    private Date parentAuditingTime;

    private String parentAuditingRemark;

    private Date dealTime;

    private String failReason;

    private Long tradeId;

    private Integer chargeType;

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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getParentMerchantId() {
        return parentMerchantId;
    }

    public void setParentMerchantId(Long parentMerchantId) {
        this.parentMerchantId = parentMerchantId;
    }

    public String getParentMerchantCode() {
        return parentMerchantCode;
    }

    public void setParentMerchantCode(String parentMerchantCode) {
        this.parentMerchantCode = parentMerchantCode == null ? null : parentMerchantCode.trim();
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getDeductFund() {
        return deductFund;
    }

    public void setDeductFund(BigDecimal deductFund) {
        this.deductFund = deductFund;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsRealtime() {
        return isRealtime;
    }

    public void setIsRealtime(Integer isRealtime) {
        this.isRealtime = isRealtime;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
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

    public String getAuditingOperator() {
        return auditingOperator;
    }

    public void setAuditingOperator(String auditingOperator) {
        this.auditingOperator = auditingOperator == null ? null : auditingOperator.trim();
    }

    public Date getAuditingTime() {
        return auditingTime;
    }

    public void setAuditingTime(Date auditingTime) {
        this.auditingTime = auditingTime;
    }

    public String getAuditingRemark() {
        return auditingRemark;
    }

    public void setAuditingRemark(String auditingRemark) {
        this.auditingRemark = auditingRemark == null ? null : auditingRemark.trim();
    }

    public String getParentAuditingOperator() {
        return parentAuditingOperator;
    }

    public void setParentAuditingOperator(String parentAuditingOperator) {
        this.parentAuditingOperator = parentAuditingOperator == null ? null : parentAuditingOperator.trim();
    }

    public Date getParentAuditingTime() {
        return parentAuditingTime;
    }

    public void setParentAuditingTime(Date parentAuditingTime) {
        this.parentAuditingTime = parentAuditingTime;
    }

    public String getParentAuditingRemark() {
        return parentAuditingRemark;
    }

    public void setParentAuditingRemark(String parentAuditingRemark) {
        this.parentAuditingRemark = parentAuditingRemark == null ? null : parentAuditingRemark.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
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
        sb.append(", requestId=").append(requestId);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", parentMerchantId=").append(parentMerchantId);
        sb.append(", parentMerchantCode=").append(parentMerchantCode);
        sb.append(", fund=").append(fund);
        sb.append(", fee=").append(fee);
        sb.append(", deductFund=").append(deductFund);
        sb.append(", status=").append(status);
        sb.append(", isRealtime=").append(isRealtime);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", requestOperator=").append(requestOperator);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", auditingOperator=").append(auditingOperator);
        sb.append(", auditingTime=").append(auditingTime);
        sb.append(", auditingRemark=").append(auditingRemark);
        sb.append(", parentAuditingOperator=").append(parentAuditingOperator);
        sb.append(", parentAuditingTime=").append(parentAuditingTime);
        sb.append(", parentAuditingRemark=").append(parentAuditingRemark);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", failReason=").append(failReason);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}