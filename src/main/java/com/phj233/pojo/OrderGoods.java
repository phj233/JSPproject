/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.pojo;

/**
 * @projectName: JSPproject
 * @package: com.phj233.pojo
 * @className: OrderGoods
 * @author: phj233
 * @date: 2022/10/16 12:12
 * @version: 1.0
 */
public class OrderGoods {
    private Integer id;
    private Integer uid;
    private Integer oid;
    private Integer amount;
    private double price;

    public OrderGoods(Integer id, Integer uid, Integer oid, Integer amount, double price) {
        this.id = id;
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderGoods{" +
                "id=" + id +
                ", uid=" + uid +
                ", oid=" + oid +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
