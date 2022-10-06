package com.phj233.pojo;

public class AdminInfo {
    private Integer aId;
    private String aName,aPwd,aLevel;

    public AdminInfo() {
    }

    public AdminInfo(Integer aId, String aName, String aPwd, String aLevel) {
        this.aId = aId;
        this.aName = aName;
        this.aPwd = aPwd;
        this.aLevel = aLevel;
    }

    public AdminInfo(String aName, Integer aId) {
        this.aName=aName;
        this.aId=aId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd;
    }

    public String getaLevel() {
        return aLevel;
    }

    public void setaLevel(String aLevel) {
        this.aLevel = aLevel;
    }

    @Override
    public String toString() {
        return "管理员信息{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPwd='" + aPwd + '\'' +
                ", aLevel='" + aLevel + '\'' +
                '}';
    }
}

