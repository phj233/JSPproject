/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.mybatis.mappers;

import com.phj233.pojo.Order;
import com.phj233.pojo.OrderGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    Boolean insertOrder(Order order);
    Order selectOrderById(@Param("oid") Integer oid);
    List<Order> selectOrderByUid(@Param("uid") Integer uid);
    Boolean updateOrder(Order order);
    Boolean deleteOrder(@Param("oid") Integer oid);
}
