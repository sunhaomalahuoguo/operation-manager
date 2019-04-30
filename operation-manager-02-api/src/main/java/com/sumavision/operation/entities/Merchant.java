package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class Merchant implements Serializable {
    private Long id;

    private String merchantCode;

    private String merchantName;

    private String businessLicense;

    private String legalPerson;

    private String address;

    private String password;

    private String zipCode;

    private String contactPerson;

    private String contactTelephone;

    private Integer merchantLevel;

    private Integer status;

    private String signKey;

    private String email;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private String fld6;

    private String fld7;

    private String fld8;

    private String fld9;

    private String fld10;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

    private Long parentId;

    private String fld11;

    private String fld12;

    private String fld13;

    private String fld14;

    private String fld15;

    private Integer signType;

    private String fld16;

    private String fld17;

    private String fld18;

    private String fld19;

    private String fld20;

    private String mobilePhone;

    private String isAgent;

    private Long agentId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone == null ? null : contactTelephone.trim();
    }

    public Integer getMerchantLevel() {
        return merchantLevel;
    }

    public void setMerchantLevel(Integer merchantLevel) {
        this.merchantLevel = merchantLevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSignKey() {
        return signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey == null ? null : signKey.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getFld6() {
        return fld6;
    }

    public void setFld6(String fld6) {
        this.fld6 = fld6 == null ? null : fld6.trim();
    }

    public String getFld7() {
        return fld7;
    }

    public void setFld7(String fld7) {
        this.fld7 = fld7 == null ? null : fld7.trim();
    }

    public String getFld8() {
        return fld8;
    }

    public void setFld8(String fld8) {
        this.fld8 = fld8 == null ? null : fld8.trim();
    }

    public String getFld9() {
        return fld9;
    }

    public void setFld9(String fld9) {
        this.fld9 = fld9 == null ? null : fld9.trim();
    }

    public String getFld10() {
        return fld10;
    }

    public void setFld10(String fld10) {
        this.fld10 = fld10 == null ? null : fld10.trim();
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getFld11() {
        return fld11;
    }

    public void setFld11(String fld11) {
        this.fld11 = fld11 == null ? null : fld11.trim();
    }

    public String getFld12() {
        return fld12;
    }

    public void setFld12(String fld12) {
        this.fld12 = fld12 == null ? null : fld12.trim();
    }

    public String getFld13() {
        return fld13;
    }

    public void setFld13(String fld13) {
        this.fld13 = fld13 == null ? null : fld13.trim();
    }

    public String getFld14() {
        return fld14;
    }

    public void setFld14(String fld14) {
        this.fld14 = fld14 == null ? null : fld14.trim();
    }

    public String getFld15() {
        return fld15;
    }

    public void setFld15(String fld15) {
        this.fld15 = fld15 == null ? null : fld15.trim();
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public String getFld16() {
        return fld16;
    }

    public void setFld16(String fld16) {
        this.fld16 = fld16 == null ? null : fld16.trim();
    }

    public String getFld17() {
        return fld17;
    }

    public void setFld17(String fld17) {
        this.fld17 = fld17 == null ? null : fld17.trim();
    }

    public String getFld18() {
        return fld18;
    }

    public void setFld18(String fld18) {
        this.fld18 = fld18 == null ? null : fld18.trim();
    }

    public String getFld19() {
        return fld19;
    }

    public void setFld19(String fld19) {
        this.fld19 = fld19 == null ? null : fld19.trim();
    }

    public String getFld20() {
        return fld20;
    }

    public void setFld20(String fld20) {
        this.fld20 = fld20 == null ? null : fld20.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(String isAgent) {
        this.isAgent = isAgent == null ? null : isAgent.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", address=").append(address);
        sb.append(", password=").append(password);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", contactPerson=").append(contactPerson);
        sb.append(", contactTelephone=").append(contactTelephone);
        sb.append(", merchantLevel=").append(merchantLevel);
        sb.append(", status=").append(status);
        sb.append(", signKey=").append(signKey);
        sb.append(", email=").append(email);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", fld6=").append(fld6);
        sb.append(", fld7=").append(fld7);
        sb.append(", fld8=").append(fld8);
        sb.append(", fld9=").append(fld9);
        sb.append(", fld10=").append(fld10);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditProcess=").append(lastEditProcess);
        sb.append(", parentId=").append(parentId);
        sb.append(", fld11=").append(fld11);
        sb.append(", fld12=").append(fld12);
        sb.append(", fld13=").append(fld13);
        sb.append(", fld14=").append(fld14);
        sb.append(", fld15=").append(fld15);
        sb.append(", signType=").append(signType);
        sb.append(", fld16=").append(fld16);
        sb.append(", fld17=").append(fld17);
        sb.append(", fld18=").append(fld18);
        sb.append(", fld19=").append(fld19);
        sb.append(", fld20=").append(fld20);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", isAgent=").append(isAgent);
        sb.append(", agentId=").append(agentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}