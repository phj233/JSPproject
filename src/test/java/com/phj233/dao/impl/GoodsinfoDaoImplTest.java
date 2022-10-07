package com.phj233.dao.impl;

import com.phj233.pojo.GoodsInfo;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author 未確認の庭師
 * @date 2022/10/7 14:28
 */class GoodsinfoDaoImplTest {

     //全查
    @Test
    void queryGoodsInfoAll() {
        new GoodsinfoDaoImpl().queryGoodsInfo("select * from goodsinfo").forEach(System.out::println);
    }
     //条件查询
    @Test
    void queryGoodsInfo() {
        List<GoodsInfo> list = new GoodsinfoDaoImpl().queryGoodsInfo(
                "select * from goods_info where name like ?", "%test%");
        list.forEach(System.out::println);
    }

    @Test
    void addGoodsInfo() {
        System.out.println(new GoodsinfoDaoImpl().addGoodsInfo(new GoodsInfo(){
            {
                setgId(807200010);
                setgName("test");
                setgPrice(100.0);
                setgClass("test");
                setgAmount(100);
                setgDate(LocalDateTime.now());
                setgImgurl("http://test.jpg");
                setgLook(100);
                setgIntro("test");
                setgBrief("test");
            }
        }));
    }

    @Test
    void updateGoods() {
    }

    @Test
    void deleteGoodsInfo() {
    }
}