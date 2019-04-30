package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SupplyAccountRequest implements Serializable {
    private Long id;

    private Long tradeId;

    private Integer type;

    private String merchantCode;

    private String bankCode;

    private Date bankInTime;

    private BigDecimal fund;

    private String remark;

    private Integer status;

    private Date requestTime;

    private String requestOprator;

    private Date auditingTime;

    private String auditingOprator;

    private String auditingRemark;

    private Date dealTime;

    private String dealRemark;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private BigDecimal fee;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public Date getBankInTime() {
        return bankInTime;
    }

    public void setBankInTime(Date bankInTime) {
        this.bankInTime = bankInTime;
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestOprator() {
        return requestOprator;
    }

    public void setRequestOprator(String requestOprator) {
        this.requestOprator = requestOprator == null ? null : requestOprator.trim();
    }

    public Date getAuditingTime() {
        return auditingTime;
    }

    public void setAuditingTime(Date auditingTime) {
        this.auditingTime = auditingTime;
    }

    public String getAuditingOprator() {
        return auditingOprator;
    }

    public void setAuditingOprator(String auditingOprator) {
        this.auditingOprator = auditingOprator == null ? null : auditingOprator.trim();
    }

    public String getAuditingRemark() {
        return auditingRemark;
    }

    public void setAuditingRemark(String auditingRemark) {
        this.auditingRemark = auditingRemark == null ? null : auditingRemark.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealRemark() {
        return dealRemark;
    }

    public void setDealRemark(String dealRemark) {
        this.dealRemark = dealRemark == null ? null : dealRemark.trim();
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

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", type=").append(type);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankInTime=").append(bankInTime);
        sb.append(", fund=").append(fund);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", requestOprator=").append(requestOprator);
        sb.append(", auditingTime=").append(auditingTime);
        sb.append(", auditingOprator=").append(auditingOprator);
        sb.append(", auditingRemark=").append(auditingRemark);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", dealRemark=").append(dealRemark);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", fee=").append(fee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}