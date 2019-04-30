package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class IffyTradeRequest implements Serializable {
    private Long id;

    private Long tradeId;

    private String requestData;

    private String reason;

    private Integer status;

    private String description;

    private String remark;

    private Date createDate;

    private String lastEditor;

    private Date lastEditTime;

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

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData == null ? null : requestData.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor == null ? null : lastEditor.trim();
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
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
        sb.append(", requestData=").append(requestData);
        sb.append(", reason=").append(reason);
        sb.append(", status=").append(status);
        sb.append(", description=").append(description);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditTime=").append(lastEditTime);
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