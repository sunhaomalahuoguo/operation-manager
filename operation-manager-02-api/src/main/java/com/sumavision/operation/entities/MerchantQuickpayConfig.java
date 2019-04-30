package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class MerchantQuickpayConfig implements Serializable {
    private Long id;

    private Long merchantId;

    private String merchantCode;

    private Integer cardBinSwitch;

    private Integer cashierShowSwitch;

    private Date createTime;

    private String fld1;

    private String fld2;

    private String fld3;

    private Integer isSameCard;

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

    public Integer getCardBinSwitch() {
        return cardBinSwitch;
    }

    public void setCardBinSwitch(Integer cardBinSwitch) {
        this.cardBinSwitch = cardBinSwitch;
    }

    public Integer getCashierShowSwitch() {
        return cashierShowSwitch;
    }

    public void setCashierShowSwitch(Integer cashierShowSwitch) {
        this.cashierShowSwitch = cashierShowSwitch;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getIsSameCard() {
        return isSameCard;
    }

    public void setIsSameCard(Integer isSameCard) {
        this.isSameCard = isSameCard;
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
        sb.append(", cardBinSwitch=").append(cardBinSwitch);
        sb.append(", cashierShowSwitch=").append(cashierShowSwitch);
        sb.append(", createTime=").append(createTime);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", isSameCard=").append(isSameCard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}