package com.phj233.dao;

import com.phj233.dao.impl.GoodsInfoDaoImpl;
import com.phj233.pojo.GoodInfo;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 未確認の庭師,phj233
 */
class GoodsTest {

    //全查
    @Test
    void queryGoodsInfoAll() {
        List<GoodInfo> list = new GoodsInfoDaoImpl().queryGoodsInfo(
                "select * from goodsinfo");
        list.forEach(System.out::println);
    }
    //条件查询
    @Test
    void queryGoodsInfo() {
        List<GoodInfo> list = new GoodsInfoDaoImpl().queryGoodsInfo(
                "select * from goodsinfo where Gname like ?", "%夫%");
        list.forEach(System.out::println);
    }

    @Test
    void addGoodsInfo() {
        System.out.println(new GoodsInfoDaoImpl().addGoodsInfo(new GoodInfo(){
            {
                setgId(12345);
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
        queryGoodsInfoAll();
    }

    @Test
    void updateGoodsInfo() {
        System.out.println(new GoodsInfoDaoImpl().updateGoodsInfo(new GoodInfo(){
            {
                setgId(12345);
                setgName("hello");
                setgPrice(200.0);
                setgClass("hello");
                setgAmount(200);
                setgDate(LocalDateTime.now());
                setgImgurl("http://hello.jpg");
                setgLook(200);
                setgIntro("hello");
                setgBrief("hello");
            }
        }));
        queryGoodsInfoAll();
    }

    @Test
    void deleteGoodsInfo() {
        System.out.println(new GoodsInfoDaoImpl().deleteGoodsInfo(12345));
        queryGoodsInfoAll();
    }
}