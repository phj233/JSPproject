package com.phj233.dao;

import com.phj233.pojo.GoodInfo;

import java.util.List;

/**
 * @author 未確認の庭師
 */
public interface GoodsInfoDao {

    //查
    List<GoodInfo> queryGoodsInfo(String sql, Object... params);

    //增
    int addGoodsInfo(GoodInfo goodsInfo);

    //改
    int updateGoodsInfo(GoodInfo goodsInfo);

    //删
    int deleteGoodsInfo(int id);
}
