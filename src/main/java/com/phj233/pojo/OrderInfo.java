package com.phj233.pojo;

import java.util.Date;

public class OrderInfo {
    private Integer oId,aId,uId; //订单id 订单处理人  订单订购人id
    private Date oDate; //订单日期
    private String oState,orecName,orecAdr,orecTel;
    //订单发货状态 订单收货人 订单地址  订单电话
    private Double oTotalPrice; //订单总价

    public OrderInfo() {
    }

    public OrderInfo(Integer oId, Integer aId, Integer uId, Date oDate, String oState, String orecName, String orecAdr, String orecTel, Double oTotalPrice) {
        this.oId = oId;
        this.aId = aId;
        this.uId = uId;
        this.oDate = oDate;
        this.oState = oState;
        this.orecName = orecName;
        this.orecAdr = orecAdr;
        this.orecTel = orecTel;
        this.oTotalPrice = oTotalPrice;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public String getoState() {
        return oState;
    }

    public void setoState(String oState) {
        this.oState = oState;
    }

    public String getOrecName() {
        return orecName;
    }

    public void setOrecName(String orecName) {
        this.orecName = orecName;
    }

    public String getOrecAdr() {
        return orecAdr;
    }

    public void setOrecAdr(String orecAdr) {
        this.orecAdr = orecAdr;
    }

    public String getOrecTel() {
        return orecTel;
    }

    public void setOrecTel(String orecTel) {
        this.orecTel = orecTel;
    }

    public Double getoTotalPrice() {
        return oTotalPrice;
    }

    public void setoTotalPrice(Double oTotalPrice) {
        this.oTotalPrice = oTotalPrice;
    }

    @Override
    public String toString() {
        return "订单信息{" +
                "oId=" + oId +
                ", aId=" + aId +
                ", uId=" + uId +
                ", oDate=" + oDate +
                ", oState='" + oState + '\'' +
                ", orecName='" + orecName + '\'' +
                ", orecAdr='" + orecAdr + '\'' +
                ", orecTel='" + orecTel + '\'' +
                ", oTotalPrice=" + oTotalPrice +
                '}';
    }
}
