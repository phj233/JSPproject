package com.phj233.pojo;

import java.util.Date;

public class GoodInfo {
    private Integer gId,gLook;
    private String gName,gClass,gImgurl,gIntro,gBrief;
    private Double gPrice;
    private Integer gAmount;
    private Date gDate;

    public GoodInfo() {
    }

    public GoodInfo(Integer gId, Integer gLook, String gName, String gClass, String gImgurl, String gIntro, String gBrief, Double gPrice, Integer gAmount, Date gDate) {
        this.gId = gId;
        this.gLook = gLook;
        this.gName = gName;
        this.gClass = gClass;
        this.gImgurl = gImgurl;
        this.gIntro = gIntro;
        this.gBrief = gBrief;
        this.gPrice = gPrice;
        this.gAmount = gAmount;
        this.gDate = gDate;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getgLook() {
        return gLook;
    }

    public void setgLook(Integer gLook) {
        this.gLook = gLook;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgClass() {
        return gClass;
    }

    public void setgClass(String gClass) {
        this.gClass = gClass;
    }

    public String getgImgurl() {
        return gImgurl;
    }

    public void setgImgurl(String gImgurl) {
        this.gImgurl = gImgurl;
    }

    public String getgIntro() {
        return gIntro;
    }

    public void setgIntro(String gIntro) {
        this.gIntro = gIntro;
    }

    public String getgBrief() {
        return gBrief;
    }

    public void setgBrief(String gBrief) {
        this.gBrief = gBrief;
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public Integer getgAmount() {
        return gAmount;
    }

    public void setgAmount(Integer gAmount) {
        this.gAmount = gAmount;
    }

    public Date getgDate() {
        return gDate;
    }

    public void setgDate(Date gDate) {
        this.gDate = gDate;
    }

    @Override
    public String toString() {
        return "商品信息{" +
                "gId=" + gId +
                ", gLook=" + gLook +
                ", gName='" + gName + '\'' +
                ", gClass='" + gClass + '\'' +
                ", gImgurl='" + gImgurl + '\'' +
                ", gIntro='" + gIntro + '\'' +
                ", gBrief='" + gBrief + '\'' +
                ", gPrice=" + gPrice +
                ", gAmount=" + gAmount +
                ", gDate=" + gDate +
                '}';
    }
}
