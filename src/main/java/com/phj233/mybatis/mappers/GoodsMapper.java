/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.mybatis.mappers;
import com.phj233.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    Boolean insertGoods(Goods goods);
    List<Goods> selectAllGoods();
    List<Goods> selectGoodsByName(@Param("name") String name);
    Goods selectGoodsById(@Param("gid") Integer gid);
    Boolean updateGoods(Goods goods);
    int deleteGoods(@Param("gid") Integer gid);
}
