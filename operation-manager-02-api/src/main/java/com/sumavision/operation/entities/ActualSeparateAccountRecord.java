package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ActualSeparateAccountRecord implements Serializable {
    private Long id;

    private Long tradeId;

    private Long merchantId;

    private Integer debitedRoleType;

    private String debitedRoleCode;

    private Long debitedRoleId;

    private Integer debitedRoleAccountType;

    private Long debitedRoleAccountId;

    private Integer creditedRoleType;

    private String creditedRoleCode;

    private Long creditedRoleId;

    private Integer creditedRoleAccountType;

    private Long creditedRoleAccountId;

    private BigDecimal fund;

    private Integer requestDirection;

    private BigDecimal requestFund;

    private Integer mainAccountFlag;

    private Date createTime;

    private Date lastEditTime;

    private Integer bizFlag;

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

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getDebitedRoleType() {
        return debitedRoleType;
    }

    public void setDebitedRoleType(Integer debitedRoleType) {
        this.debitedRoleType = debitedRoleType;
    }

    public String getDebitedRoleCode() {
        return debitedRoleCode;
    }

    public void setDebitedRoleCode(String debitedRoleCode) {
        this.debitedRoleCode = debitedRoleCode == null ? null : debitedRoleCode.trim();
    }

    public Long getDebitedRoleId() {
        return debitedRoleId;
    }

    public void setDebitedRoleId(Long debitedRoleId) {
        this.debitedRoleId = debitedRoleId;
    }

    public Integer getDebitedRoleAccountType() {
        return debitedRoleAccountType;
    }

    public void setDebitedRoleAccountType(Integer debitedRoleAccountType) {
        this.debitedRoleAccountType = debitedRoleAccountType;
    }

    public Long getDebitedRoleAccountId() {
        return debitedRoleAccountId;
    }

    public void setDebitedRoleAccountId(Long debitedRoleAccountId) {
        this.debitedRoleAccountId = debitedRoleAccountId;
    }

    public Integer getCreditedRoleType() {
        return creditedRoleType;
    }

    public void setCreditedRoleType(Integer creditedRoleType) {
        this.creditedRoleType = creditedRoleType;
    }

    public String getCreditedRoleCode() {
        return creditedRoleCode;
    }

    public void setCreditedRoleCode(String creditedRoleCode) {
        this.creditedRoleCode = creditedRoleCode == null ? null : creditedRoleCode.trim();
    }

    public Long getCreditedRoleId() {
        return creditedRoleId;
    }

    public void setCreditedRoleId(Long creditedRoleId) {
        this.creditedRoleId = creditedRoleId;
    }

    public Integer getCreditedRoleAccountType() {
        return creditedRoleAccountType;
    }

    public void setCreditedRoleAccountType(Integer creditedRoleAccountType) {
        this.creditedRoleAccountType = creditedRoleAccountType;
    }

    public Long getCreditedRoleAccountId() {
        return creditedRoleAccountId;
    }

    public void setCreditedRoleAccountId(Long creditedRoleAccountId) {
        this.creditedRoleAccountId = creditedRoleAccountId;
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public Integer getRequestDirection() {
        return requestDirection;
    }

    public void setRequestDirection(Integer requestDirection) {
        this.requestDirection = requestDirection;
    }

    public BigDecimal getRequestFund() {
        return requestFund;
    }

    public void setRequestFund(BigDecimal requestFund) {
        this.requestFund = requestFund;
    }

    public Integer getMainAccountFlag() {
        return mainAccountFlag;
    }

    public void setMainAccountFlag(Integer mainAccountFlag) {
        this.mainAccountFlag = mainAccountFlag;
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

    public Integer getBizFlag() {
        return bizFlag;
    }

    public void setBizFlag(Integer bizFlag) {
        this.bizFlag = bizFlag;
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
        sb.append(", tradeId=").append(tradeId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", debitedRoleType=").append(debitedRoleType);
        sb.append(", debitedRoleCode=").append(debitedRoleCode);
        sb.append(", debitedRoleId=").append(debitedRoleId);
        sb.append(", debitedRoleAccountType=").append(debitedRoleAccountType);
        sb.append(", debitedRoleAccountId=").append(debitedRoleAccountId);
        sb.append(", creditedRoleType=").append(creditedRoleType);
        sb.append(", creditedRoleCode=").append(creditedRoleCode);
        sb.append(", creditedRoleId=").append(creditedRoleId);
        sb.append(", creditedRoleAccountType=").append(creditedRoleAccountType);
        sb.append(", creditedRoleAccountId=").append(creditedRoleAccountId);
        sb.append(", fund=").append(fund);
        sb.append(", requestDirection=").append(requestDirection);
        sb.append(", requestFund=").append(requestFund);
        sb.append(", mainAccountFlag=").append(mainAccountFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", bizFlag=").append(bizFlag);
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