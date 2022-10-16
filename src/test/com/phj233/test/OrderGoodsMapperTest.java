/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
package com.phj233.test;
import com.phj233.mybatis.mappers.OrderGoodsMapper;
import com.phj233.pojo.OrderGoods;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
/**
 * @projectName: JSPproject
 * @package: com.phj233.test
 * @className: OrderGoodsMapperTest
 * @author: phj233
 * @date: 2022/10/16 12:20
 * @version: 1.0
 */
public class OrderGoodsMapperTest {
    SqlSession sqlSession= SqlSessionUtil.getSqlSession();
    OrderGoodsMapper orderGoodsMapper= sqlSession.getMapper(OrderGoodsMapper.class);
    @Test
    public void insertOrderGoods(){
        OrderGoods orderGoods = new OrderGoods(null,9,1,2,114514);
        Boolean res=orderGoodsMapper.insertOrderGoods(orderGoods);
        System.out.println(res);
    }
    @Test
    public void selectOrderGoodsById(){
        OrderGoods res=orderGoodsMapper.selectOrderGoodsById(1);
        System.out.println(res);
    }
    @Test
    public void selectOrderGoodsByUid(){
        List<OrderGoods> res=orderGoodsMapper.selectOrderGoodsByUid(9);
        System.out.println(res);
    }
    @Test
    public void updateOrderGoods(){
        OrderGoods orderGoods = new OrderGoods(1,9,1,1,114514);
        Boolean res=orderGoodsMapper.updateOrderGoods(orderGoods);
        System.out.println(res);
    }
    @Test
    public void deleteOrderGoods(){
        Boolean res=orderGoodsMapper.deleteOrderGoods(3);
        System.out.println(res);
    }

}
