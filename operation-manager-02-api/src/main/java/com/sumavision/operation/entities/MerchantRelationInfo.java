package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerchantRelationInfo implements Serializable {
    private Long id;

    private Long merchantId;

    private String websiteName;

    private String domainName;

    private String merchantProvince;

    private String merchantCity;

    private String email;

    private String fax;

    private Integer merchantLevel;

    private String lpCredentialsNo;

    private Date lpCredentialsEffectiveDate;

    private String licenseScope;

    private Date licenseEffectiveDate;

    private String organizationNo;

    private String shareholderName;

    private String shCredentialsNo;

    private Date shCredentialsEffectiveDate;

    private String invoicePerson;

    private String invoiceAddress;

    private String bankCode;

    private String bankProvince;

    private String bankCity;

    private String bankAccount;

    private String bankAccountName;

    private BigDecimal deposit;

    private BigDecimal establishExpense;

    private Date effectDate;

    private Date closingDate;

    private String salesStaff;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

    private String fld6;

    private String fld7;

    private String fld8;

    private String fld9;

    private String fld10;

    private String invoicePersonEmail;

    private Integer expirationWarningSign;

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

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName == null ? null : websiteName.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getMerchantProvince() {
        return merchantProvince;
    }

    public void setMerchantProvince(String merchantProvince) {
        this.merchantProvince = merchantProvince == null ? null : merchantProvince.trim();
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity == null ? null : merchantCity.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public Integer getMerchantLevel() {
        return merchantLevel;
    }

    public void setMerchantLevel(Integer merchantLevel) {
        this.merchantLevel = merchantLevel;
    }

    public String getLpCredentialsNo() {
        return lpCredentialsNo;
    }

    public void setLpCredentialsNo(String lpCredentialsNo) {
        this.lpCredentialsNo = lpCredentialsNo == null ? null : lpCredentialsNo.trim();
    }

    public Date getLpCredentialsEffectiveDate() {
        return lpCredentialsEffectiveDate;
    }

    public void setLpCredentialsEffectiveDate(Date lpCredentialsEffectiveDate) {
        this.lpCredentialsEffectiveDate = lpCredentialsEffectiveDate;
    }

    public String getLicenseScope() {
        return licenseScope;
    }

    public void setLicenseScope(String licenseScope) {
        this.licenseScope = licenseScope == null ? null : licenseScope.trim();
    }

    public Date getLicenseEffectiveDate() {
        return licenseEffectiveDate;
    }

    public void setLicenseEffectiveDate(Date licenseEffectiveDate) {
        this.licenseEffectiveDate = licenseEffectiveDate;
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo == null ? null : organizationNo.trim();
    }

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName == null ? null : shareholderName.trim();
    }

    public String getShCredentialsNo() {
        return shCredentialsNo;
    }

    public void setShCredentialsNo(String shCredentialsNo) {
        this.shCredentialsNo = shCredentialsNo == null ? null : shCredentialsNo.trim();
    }

    public Date getShCredentialsEffectiveDate() {
        return shCredentialsEffectiveDate;
    }

    public void setShCredentialsEffectiveDate(Date shCredentialsEffectiveDate) {
        this.shCredentialsEffectiveDate = shCredentialsEffectiveDate;
    }

    public String getInvoicePerson() {
        return invoicePerson;
    }

    public void setInvoicePerson(String invoicePerson) {
        this.invoicePerson = invoicePerson == null ? null : invoicePerson.trim();
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress == null ? null : invoiceAddress.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getEstablishExpense() {
        return establishExpense;
    }

    public void setEstablishExpense(BigDecimal establishExpense) {
        this.establishExpense = establishExpense;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getSalesStaff() {
        return salesStaff;
    }

    public void setSalesStaff(String salesStaff) {
        this.salesStaff = salesStaff == null ? null : salesStaff.trim();
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

    public String getInvoicePersonEmail() {
        return invoicePersonEmail;
    }

    public void setInvoicePersonEmail(String invoicePersonEmail) {
        this.invoicePersonEmail = invoicePersonEmail == null ? null : invoicePersonEmail.trim();
    }

    public Integer getExpirationWarningSign() {
        return expirationWarningSign;
    }

    public void setExpirationWarningSign(Integer expirationWarningSign) {
        this.expirationWarningSign = expirationWarningSign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", websiteName=").append(websiteName);
        sb.append(", domainName=").append(domainName);
        sb.append(", merchantProvince=").append(merchantProvince);
        sb.append(", merchantCity=").append(merchantCity);
        sb.append(", email=").append(email);
        sb.append(", fax=").append(fax);
        sb.append(", merchantLevel=").append(merchantLevel);
        sb.append(", lpCredentialsNo=").append(lpCredentialsNo);
        sb.append(", lpCredentialsEffectiveDate=").append(lpCredentialsEffectiveDate);
        sb.append(", licenseScope=").append(licenseScope);
        sb.append(", licenseEffectiveDate=").append(licenseEffectiveDate);
        sb.append(", organizationNo=").append(organizationNo);
        sb.append(", shareholderName=").append(shareholderName);
        sb.append(", shCredentialsNo=").append(shCredentialsNo);
        sb.append(", shCredentialsEffectiveDate=").append(shCredentialsEffectiveDate);
        sb.append(", invoicePerson=").append(invoicePerson);
        sb.append(", invoiceAddress=").append(invoiceAddress);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankProvince=").append(bankProvince);
        sb.append(", bankCity=").append(bankCity);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", deposit=").append(deposit);
        sb.append(", establishExpense=").append(establishExpense);
        sb.append(", effectDate=").append(effectDate);
        sb.append(", closingDate=").append(closingDate);
        sb.append(", salesStaff=").append(salesStaff);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditProcess=").append(lastEditProcess);
        sb.append(", fld6=").append(fld6);
        sb.append(", fld7=").append(fld7);
        sb.append(", fld8=").append(fld8);
        sb.append(", fld9=").append(fld9);
        sb.append(", fld10=").append(fld10);
        sb.append(", invoicePersonEmail=").append(invoicePersonEmail);
        sb.append(", expirationWarningSign=").append(expirationWarningSign);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}