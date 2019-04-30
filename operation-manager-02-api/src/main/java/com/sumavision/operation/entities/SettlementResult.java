package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class SettlementResult implements Serializable {
    private Long id;

    private Long merchantId;

    private Integer bizType;

    private Date settlementTime;

    private Date settlementPeriodBegin;

    private Date settlementPeriodEnd;

    private Integer status;

    private String remark;

    private Long tradeId;

    private String fld1;

    private String fld2;

    private String fld3;

    private Integer payType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public Date getSettlementPeriodBegin() {
        return settlementPeriodBegin;
    }

    public void setSettlementPeriodBegin(Date settlementPeriodBegin) {
        this.settlementPeriodBegin = settlementPeriodBegin;
    }

    public Date getSettlementPeriodEnd() {
        return settlementPeriodEnd;
    }

    public void setSettlementPeriodEnd(Date settlementPeriodEnd) {
        this.settlementPeriodEnd = settlementPeriodEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
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

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", bizType=").append(bizType);
        sb.append(", settlementTime=").append(settlementTime);
        sb.append(", settlementPeriodBegin=").append(settlementPeriodBegin);
        sb.append(", settlementPeriodEnd=").append(settlementPeriodEnd);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", payType=").append(payType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}