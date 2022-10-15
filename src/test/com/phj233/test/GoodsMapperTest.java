/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.test;
import com.phj233.mybatis.mappers.GoodsMapper;
import com.phj233.pojo.Goods;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.List;
/**
 * @projectName: JSPproject
 * @package: com.phj233.test
 * @className: GoodsMapperTest
 * @author: phj233
 * @date: 2022/10/15 16:56
 * @version: 1.0
 */
public class GoodsMapperTest {
    SqlSession sqlSession=SqlSessionUtil.getSqlSession();
    GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);

    @Test
    public void selectAllGoods(){
        List<Goods> res = goodsMapper.selectAllGoods();
        System.out.println(res);
    }
    @Test
    public void insertGoods(){
        Goods goods=new Goods(null,"testProduce",114514,"垃圾",1919,
                LocalDateTime.now(),"test.img", 1,"81","0");
        Boolean res=goodsMapper.insertGoods(goods);
        System.out.println(res);
    }
    @Test
    public void selectGoodsByName(){
        List<Goods> res = goodsMapper.selectGoodsByName("testProduce");
        System.out.println(res);
    }
    @Test
    public void selectGoodsById(){
        Goods res = goodsMapper.selectGoodsById(1);
        System.out.println(res);
    }
    @Test
    public void updateGoods(){
        Goods goods=new Goods(2,"testProduce",114514,"垃圾",1919,
                LocalDateTime.now(),"test.img", 1,"81","0");
        Boolean res=goodsMapper.updateGoods(goods);
    }
    @Test
    public void deleteGoods(){
        int res= goodsMapper.deleteGoods(1);
        System.out.println(res);
    }
}
