package com.sumavision.operation.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountBalFrzRecord implements Serializable {
    private Long id;

    private Long associateId;

    private Long accountId;

    private BigDecimal sum;

    private Integer opType;

    private Date opTime;

    private String opLoc;

    private String opUser;

    private String opProcess;

    private Integer status;

    private String remark;

    private String fld1;

    private String fld2;

    private String fld3;

    private String tableName;

    private Long tableKey;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssociateId() {
        return associateId;
    }

    public void setAssociateId(Long associateId) {
        this.associateId = associateId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public String getOpLoc() {
        return opLoc;
    }

    public void setOpLoc(String opLoc) {
        this.opLoc = opLoc == null ? null : opLoc.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public String getOpProcess() {
        return opProcess;
    }

    public void setOpProcess(String opProcess) {
        this.opProcess = opProcess == null ? null : opProcess.trim();
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Long getTableKey() {
        return tableKey;
    }

    public void setTableKey(Long tableKey) {
        this.tableKey = tableKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", associateId=").append(associateId);
        sb.append(", accountId=").append(accountId);
        sb.append(", sum=").append(sum);
        sb.append(", opType=").append(opType);
        sb.append(", opTime=").append(opTime);
        sb.append(", opLoc=").append(opLoc);
        sb.append(", opUser=").append(opUser);
        sb.append(", opProcess=").append(opProcess);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", tableName=").append(tableName);
        sb.append(", tableKey=").append(tableKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}