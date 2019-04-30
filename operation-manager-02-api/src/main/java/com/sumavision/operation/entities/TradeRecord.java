package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeRecord implements Serializable {
    private Long id;

    private String tradeCode;

    private Integer bizType;

    private String tradeUser;

    private Date tradeStartTime;

    private Date tradeEndTime;

    private Date fiscalDate;

    private BigDecimal tradeSum;

    private String tradeLoc;

    private String tradeProcess;

    private String orderId;

    private Integer status;

    private Integer fiscalStatus;

    private Integer checkStatus;

    private Integer manualAdjustStatus;

    private Date manualAdjustTime;

    private Date manualAdjustFiscalDate;

    private Long adjustLogId;

    private String operatorCode;

    private String exceptionRec;

    private String merInfo;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

    private String verifyCode;

    private String accountId;

    private String providerId;

    private String bankCode;

    private String bankAccount;

    private String bankSn;

    private Long userId;

    private Long destUserId;

    private Long destAccountId;

    private BigDecimal accountPay;

    private String remark;

    private String tradeDesc;

    private Integer timeoutFlg;

    private String passThrough;

    private Integer isRepayFlg;

    private Integer settlementStatus;

    private Integer refundStatus;

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

    private String merBizFld;

    private BigDecimal merFund;

    private Integer isRealtimeRefund;

    private Integer bankCardType;

    private Long settlementTradeId;

    private String merSignature;

    private Long payType;

    private String failureInfo;

    private Integer chargeType;

    private BigDecimal tradeFee;

    private Integer requestChannelType;

    private Integer feeChannelType;

    private Long bizUserId;

    private String fld11;

    private String fld12;

    private String fld13;

    private String fld14;

    private String fld15;

    private String channelRequestId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getTradeUser() {
        return tradeUser;
    }

    public void setTradeUser(String tradeUser) {
        this.tradeUser = tradeUser == null ? null : tradeUser.trim();
    }

    public Date getTradeStartTime() {
        return tradeStartTime;
    }

    public void setTradeStartTime(Date tradeStartTime) {
        this.tradeStartTime = tradeStartTime;
    }

    public Date getTradeEndTime() {
        return tradeEndTime;
    }

    public void setTradeEndTime(Date tradeEndTime) {
        this.tradeEndTime = tradeEndTime;
    }

    public Date getFiscalDate() {
        return fiscalDate;
    }

    public void setFiscalDate(Date fiscalDate) {
        this.fiscalDate = fiscalDate;
    }

    public BigDecimal getTradeSum() {
        return tradeSum;
    }

    public void setTradeSum(BigDecimal tradeSum) {
        this.tradeSum = tradeSum;
    }

    public String getTradeLoc() {
        return tradeLoc;
    }

    public void setTradeLoc(String tradeLoc) {
        this.tradeLoc = tradeLoc == null ? null : tradeLoc.trim();
    }

    public String getTradeProcess() {
        return tradeProcess;
    }

    public void setTradeProcess(String tradeProcess) {
        this.tradeProcess = tradeProcess == null ? null : tradeProcess.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFiscalStatus() {
        return fiscalStatus;
    }

    public void setFiscalStatus(Integer fiscalStatus) {
        this.fiscalStatus = fiscalStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getManualAdjustStatus() {
        return manualAdjustStatus;
    }

    public void setManualAdjustStatus(Integer manualAdjustStatus) {
        this.manualAdjustStatus = manualAdjustStatus;
    }

    public Date getManualAdjustTime() {
        return manualAdjustTime;
    }

    public void setManualAdjustTime(Date manualAdjustTime) {
        this.manualAdjustTime = manualAdjustTime;
    }

    public Date getManualAdjustFiscalDate() {
        return manualAdjustFiscalDate;
    }

    public void setManualAdjustFiscalDate(Date manualAdjustFiscalDate) {
        this.manualAdjustFiscalDate = manualAdjustFiscalDate;
    }

    public Long getAdjustLogId() {
        return adjustLogId;
    }

    public void setAdjustLogId(Long adjustLogId) {
        this.adjustLogId = adjustLogId;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    public String getExceptionRec() {
        return exceptionRec;
    }

    public void setExceptionRec(String exceptionRec) {
        this.exceptionRec = exceptionRec == null ? null : exceptionRec.trim();
    }

    public String getMerInfo() {
        return merInfo;
    }

    public void setMerInfo(String merInfo) {
        this.merInfo = merInfo == null ? null : merInfo.trim();
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

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId == null ? null : providerId.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankSn() {
        return bankSn;
    }

    public void setBankSn(String bankSn) {
        this.bankSn = bankSn == null ? null : bankSn.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDestUserId() {
        return destUserId;
    }

    public void setDestUserId(Long destUserId) {
        this.destUserId = destUserId;
    }

    public Long getDestAccountId() {
        return destAccountId;
    }

    public void setDestAccountId(Long destAccountId) {
        this.destAccountId = destAccountId;
    }

    public BigDecimal getAccountPay() {
        return accountPay;
    }

    public void setAccountPay(BigDecimal accountPay) {
        this.accountPay = accountPay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTradeDesc() {
        return tradeDesc;
    }

    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc == null ? null : tradeDesc.trim();
    }

    public Integer getTimeoutFlg() {
        return timeoutFlg;
    }

    public void setTimeoutFlg(Integer timeoutFlg) {
        this.timeoutFlg = timeoutFlg;
    }

    public String getPassThrough() {
        return passThrough;
    }

    public void setPassThrough(String passThrough) {
        this.passThrough = passThrough == null ? null : passThrough.trim();
    }

    public Integer getIsRepayFlg() {
        return isRepayFlg;
    }

    public void setIsRepayFlg(Integer isRepayFlg) {
        this.isRepayFlg = isRepayFlg;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
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

    public String getMerBizFld() {
        return merBizFld;
    }

    public void setMerBizFld(String merBizFld) {
        this.merBizFld = merBizFld == null ? null : merBizFld.trim();
    }

    public BigDecimal getMerFund() {
        return merFund;
    }

    public void setMerFund(BigDecimal merFund) {
        this.merFund = merFund;
    }

    public Integer getIsRealtimeRefund() {
        return isRealtimeRefund;
    }

    public void setIsRealtimeRefund(Integer isRealtimeRefund) {
        this.isRealtimeRefund = isRealtimeRefund;
    }

    public Integer getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(Integer bankCardType) {
        this.bankCardType = bankCardType;
    }

    public Long getSettlementTradeId() {
        return settlementTradeId;
    }

    public void setSettlementTradeId(Long settlementTradeId) {
        this.settlementTradeId = settlementTradeId;
    }

    public String getMerSignature() {
        return merSignature;
    }

    public void setMerSignature(String merSignature) {
        this.merSignature = merSignature == null ? null : merSignature.trim();
    }

    public Long getPayType() {
        return payType;
    }

    public void setPayType(Long payType) {
        this.payType = payType;
    }

    public String getFailureInfo() {
        return failureInfo;
    }

    public void setFailureInfo(String failureInfo) {
        this.failureInfo = failureInfo == null ? null : failureInfo.trim();
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public Integer getRequestChannelType() {
        return requestChannelType;
    }

    public void setRequestChannelType(Integer requestChannelType) {
        this.requestChannelType = requestChannelType;
    }

    public Integer getFeeChannelType() {
        return feeChannelType;
    }

    public void setFeeChannelType(Integer feeChannelType) {
        this.feeChannelType = feeChannelType;
    }

    public Long getBizUserId() {
        return bizUserId;
    }

    public void setBizUserId(Long bizUserId) {
        this.bizUserId = bizUserId;
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

    public String getChannelRequestId() {
        return channelRequestId;
    }

    public void setChannelRequestId(String channelRequestId) {
        this.channelRequestId = channelRequestId == null ? null : channelRequestId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeCode=").append(tradeCode);
        sb.append(", bizType=").append(bizType);
        sb.append(", tradeUser=").append(tradeUser);
        sb.append(", tradeStartTime=").append(tradeStartTime);
        sb.append(", tradeEndTime=").append(tradeEndTime);
        sb.append(", fiscalDate=").append(fiscalDate);
        sb.append(", tradeSum=").append(tradeSum);
        sb.append(", tradeLoc=").append(tradeLoc);
        sb.append(", tradeProcess=").append(tradeProcess);
        sb.append(", orderId=").append(orderId);
        sb.append(", status=").append(status);
        sb.append(", fiscalStatus=").append(fiscalStatus);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", manualAdjustStatus=").append(manualAdjustStatus);
        sb.append(", manualAdjustTime=").append(manualAdjustTime);
        sb.append(", manualAdjustFiscalDate=").append(manualAdjustFiscalDate);
        sb.append(", adjustLogId=").append(adjustLogId);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", exceptionRec=").append(exceptionRec);
        sb.append(", merInfo=").append(merInfo);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditProcess=").append(lastEditProcess);
        sb.append(", verifyCode=").append(verifyCode);
        sb.append(", accountId=").append(accountId);
        sb.append(", providerId=").append(providerId);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", bankSn=").append(bankSn);
        sb.append(", userId=").append(userId);
        sb.append(", destUserId=").append(destUserId);
        sb.append(", destAccountId=").append(destAccountId);
        sb.append(", accountPay=").append(accountPay);
        sb.append(", remark=").append(remark);
        sb.append(", tradeDesc=").append(tradeDesc);
        sb.append(", timeoutFlg=").append(timeoutFlg);
        sb.append(", passThrough=").append(passThrough);
        sb.append(", isRepayFlg=").append(isRepayFlg);
        sb.append(", settlementStatus=").append(settlementStatus);
        sb.append(", refundStatus=").append(refundStatus);
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
        sb.append(", merBizFld=").append(merBizFld);
        sb.append(", merFund=").append(merFund);
        sb.append(", isRealtimeRefund=").append(isRealtimeRefund);
        sb.append(", bankCardType=").append(bankCardType);
        sb.append(", settlementTradeId=").append(settlementTradeId);
        sb.append(", merSignature=").append(merSignature);
        sb.append(", payType=").append(payType);
        sb.append(", failureInfo=").append(failureInfo);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", tradeFee=").append(tradeFee);
        sb.append(", requestChannelType=").append(requestChannelType);
        sb.append(", feeChannelType=").append(feeChannelType);
        sb.append(", bizUserId=").append(bizUserId);
        sb.append(", fld11=").append(fld11);
        sb.append(", fld12=").append(fld12);
        sb.append(", fld13=").append(fld13);
        sb.append(", fld14=").append(fld14);
        sb.append(", fld15=").append(fld15);
        sb.append(", channelRequestId=").append(channelRequestId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}