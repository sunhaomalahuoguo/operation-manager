package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class MerchantBankFee implements Serializable {
    private Long id;

    private Long merchantId;

    private String merchantCode;

    private String bankCode;

    private Long payTypeId;

    private Integer method;

    private BigDecimal rate;

    private BigDecimal fixFee;

    private BigDecimal minFee;

    private BigDecimal maxFee;

    private BigDecimal limitFixRateFund;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private BigDecimal lowerLimit;

    private BigDecimal upperLimit;

    private Integer limitLayer;

    private Integer layerMethod;

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

    public Long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Long payTypeId) {
        this.payTypeId = payTypeId;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getFixFee() {
        return fixFee;
    }

    public void setFixFee(BigDecimal fixFee) {
        this.fixFee = fixFee;
    }

    public BigDecimal getMinFee() {
        return minFee;
    }

    public void setMinFee(BigDecimal minFee) {
        this.minFee = minFee;
    }

    public BigDecimal getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(BigDecimal maxFee) {
        this.maxFee = maxFee;
    }

    public BigDecimal getLimitFixRateFund() {
        return limitFixRateFund;
    }

    public void setLimitFixRateFund(BigDecimal limitFixRateFund) {
        this.limitFixRateFund = limitFixRateFund;
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

    public BigDecimal getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public BigDecimal getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(BigDecimal upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Integer getLimitLayer() {
        return limitLayer;
    }

    public void setLimitLayer(Integer limitLayer) {
        this.limitLayer = limitLayer;
    }

    public Integer getLayerMethod() {
        return layerMethod;
    }

    public void setLayerMethod(Integer layerMethod) {
        this.layerMethod = layerMethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", method=").append(method);
        sb.append(", rate=").append(rate);
        sb.append(", fixFee=").append(fixFee);
        sb.append(", minFee=").append(minFee);
        sb.append(", maxFee=").append(maxFee);
        sb.append(", limitFixRateFund=").append(limitFixRateFund);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", lowerLimit=").append(lowerLimit);
        sb.append(", upperLimit=").append(upperLimit);
        sb.append(", limitLayer=").append(limitLayer);
        sb.append(", layerMethod=").append(layerMethod);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}