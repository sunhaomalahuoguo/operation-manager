package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class MerAccountTransferConfig implements Serializable {
    private Long id;

    private Long merchantId;

    private String merchantCode;

    private Integer reverseAuditSwitch;

    private BigDecimal singleLimitFund;

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

    public Integer getReverseAuditSwitch() {
        return reverseAuditSwitch;
    }

    public void setReverseAuditSwitch(Integer reverseAuditSwitch) {
        this.reverseAuditSwitch = reverseAuditSwitch;
    }

    public BigDecimal getSingleLimitFund() {
        return singleLimitFund;
    }

    public void setSingleLimitFund(BigDecimal singleLimitFund) {
        this.singleLimitFund = singleLimitFund;
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
        sb.append(", merchantId=").append(merchantId);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", reverseAuditSwitch=").append(reverseAuditSwitch);
        sb.append(", singleLimitFund=").append(singleLimitFund);
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