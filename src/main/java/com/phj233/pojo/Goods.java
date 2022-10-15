/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.pojo;

import java.time.LocalDateTime;

/**
 * @projectName: JSPproject
 * @package: com.phj233.pojo
 * @className: Goods
 * @author: phj233
 * @date: 2022/10/15 16:25
 * @version: 1.0
 */
public class Goods {
    private Integer gid;
    private String name;
    private double price;
    private String classify;
    private Integer amount;
    private LocalDateTime date;
    private String img;
    private Integer look;
    private String intro;
    private String brief;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", classify='" + classify + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", img='" + img + '\'' +
                ", look=" + look +
                ", intro='" + intro + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }

    public Goods(Integer gid, String name, double price, String classify, Integer amount, LocalDateTime date, String img, Integer look, String intro, String brief) {
        this.gid = gid;
        this.name = name;
        this.price = price;
        this.classify = classify;
        this.amount = amount;
        this.date = date;
        this.img = img;
        this.look = look;
        this.intro = intro;
        this.brief = brief;
    }
}
