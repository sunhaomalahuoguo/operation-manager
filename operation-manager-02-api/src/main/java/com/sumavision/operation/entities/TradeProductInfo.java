package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class TradeProductInfo implements Serializable {
    private Long id;

    private Long tradeId;

    private String productId;

    private String productInfo;

    private String price;

    private String userPay;

    private Integer quantity;

    private String unit;

    private String providerId;

    private String providerCode;

    private String bizType;

    private String outerBizCode;

    private String outerRuleCode;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getUserPay() {
        return userPay;
    }

    public void setUserPay(String userPay) {
        this.userPay = userPay == null ? null : userPay.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId == null ? null : providerId.trim();
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode == null ? null : providerCode.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getOuterBizCode() {
        return outerBizCode;
    }

    public void setOuterBizCode(String outerBizCode) {
        this.outerBizCode = outerBizCode == null ? null : outerBizCode.trim();
    }

    public String getOuterRuleCode() {
        return outerRuleCode;
    }

    public void setOuterRuleCode(String outerRuleCode) {
        this.outerRuleCode = outerRuleCode == null ? null : outerRuleCode.trim();
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor == null ? null : lastEditor.trim();
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
        sb.append(", tradeId=").append(tradeId);
        sb.append(", productId=").append(productId);
        sb.append(", productInfo=").append(productInfo);
        sb.append(", price=").append(price);
        sb.append(", userPay=").append(userPay);
        sb.append(", quantity=").append(quantity);
        sb.append(", unit=").append(unit);
        sb.append(", providerId=").append(providerId);
        sb.append(", providerCode=").append(providerCode);
        sb.append(", bizType=").append(bizType);
        sb.append(", outerBizCode=").append(outerBizCode);
        sb.append(", outerRuleCode=").append(outerRuleCode);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
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