package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class PayType implements Serializable {
    private Long id;

    private Long code;

    private String name;

    private String description;

    private String fld1;

    private String fld2;

    private String fld3;

    private String fld4;

    private String fld5;

    private String fld6;

    private String fld7;

    private String fld8;

    private String fld9;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

    private Long parentId;

    private Integer hasChild;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getHasChild() {
        return hasChild;
    }

    public void setHasChild(Integer hasChild) {
        this.hasChild = hasChild;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", fld1=").append(fld1);
        sb.append(", fld2=").append(fld2);
        sb.append(", fld3=").append(fld3);
        sb.append(", fld4=").append(fld4);
        sb.append(", fld5=").append(fld5);
        sb.append(", fld6=").append(fld6);
        sb.append(", fld7=").append(fld7);
        sb.append(", fld8=").append(fld8);
        sb.append(", fld9=").append(fld9);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditProcess=").append(lastEditProcess);
        sb.append(", parentId=").append(parentId);
        sb.append(", hasChild=").append(hasChild);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}