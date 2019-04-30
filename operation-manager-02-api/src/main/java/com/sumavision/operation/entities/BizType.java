package com.sumavision.operation.entities;

import java.io.Serializable;
import java.util.Date;

public class BizType implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private String class1Name;

    private String class2Name;

    private String class3Name;

    private String class1Code;

    private String class2Code;

    private String class3Code;

    private String innerCode;

    private Integer status;

    private Long feeRuleId;

    private String feeGroupCode;

    private Date lastEditTime;

    private String lastEditor;

    private String lastEditProcess;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClass1Name() {
        return class1Name;
    }

    public void setClass1Name(String class1Name) {
        this.class1Name = class1Name == null ? null : class1Name.trim();
    }

    public String getClass2Name() {
        return class2Name;
    }

    public void setClass2Name(String class2Name) {
        this.class2Name = class2Name == null ? null : class2Name.trim();
    }

    public String getClass3Name() {
        return class3Name;
    }

    public void setClass3Name(String class3Name) {
        this.class3Name = class3Name == null ? null : class3Name.trim();
    }

    public String getClass1Code() {
        return class1Code;
    }

    public void setClass1Code(String class1Code) {
        this.class1Code = class1Code == null ? null : class1Code.trim();
    }

    public String getClass2Code() {
        return class2Code;
    }

    public void setClass2Code(String class2Code) {
        this.class2Code = class2Code == null ? null : class2Code.trim();
    }

    public String getClass3Code() {
        return class3Code;
    }

    public void setClass3Code(String class3Code) {
        this.class3Code = class3Code == null ? null : class3Code.trim();
    }

    public String getInnerCode() {
        return innerCode;
    }

    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode == null ? null : innerCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getFeeRuleId() {
        return feeRuleId;
    }

    public void setFeeRuleId(Long feeRuleId) {
        this.feeRuleId = feeRuleId;
    }

    public String getFeeGroupCode() {
        return feeGroupCode;
    }

    public void setFeeGroupCode(String feeGroupCode) {
        this.feeGroupCode = feeGroupCode == null ? null : feeGroupCode.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", class1Name=").append(class1Name);
        sb.append(", class2Name=").append(class2Name);
        sb.append(", class3Name=").append(class3Name);
        sb.append(", class1Code=").append(class1Code);
        sb.append(", class2Code=").append(class2Code);
        sb.append(", class3Code=").append(class3Code);
        sb.append(", innerCode=").append(innerCode);
        sb.append(", status=").append(status);
        sb.append(", feeRuleId=").append(feeRuleId);
        sb.append(", feeGroupCode=").append(feeGroupCode);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", lastEditProcess=").append(lastEditProcess);
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}