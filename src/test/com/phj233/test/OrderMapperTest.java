/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.test;

import com.phj233.mybatis.mappers.GoodsMapper;
import com.phj233.mybatis.mappers.OrderMapper;
import com.phj233.pojo.Order;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @projectName: JSPproject
 * @package: com.phj233.test
 * @className: OrderMapperTest
 * @author: phj233
 * @date: 2022/10/16 11:23
 * @version: 1.0
 */
public class OrderMapperTest {
    SqlSession sqlSession= SqlSessionUtil.getSqlSession();
    OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
    @Test
    public void insertOrder(){
        Order order=new Order(null,9,"clock",LocalDateTime.now(),"12345678911",114514,"1919810");
        Boolean res=orderMapper.insertOrder(order);
        System.out.println(res);
    }
    @Test
    public void selectOrderById(){
        Order res=orderMapper.selectOrderById(1);
        System.out.println(res);
    }
    @Test
    public void selectOrderByUid(){
        List<Order> res=orderMapper.selectOrderByUid(9);
        System.out.println(res);
    }
    @Test
    public void updateOrder(){
        Order order=new Order(1,9,"clock",LocalDateTime.now(),
                "12345678911",114514,"1919810");
        Boolean res=orderMapper.updateOrder(order);
        System.out.println(res);
    }
    @Test
    public void deleteOrder(){
        Boolean res=orderMapper.deleteOrder(1);
        System.out.println(res);
    }
}
