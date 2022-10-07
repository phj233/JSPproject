package com.phj233.dao;

import com.phj233.pojo.GoodsInfo;

import java.util.List;

public interface GoodsinfoDao {
    List<GoodsInfo> queryGoodsInfo(String sql, Object... params);
    int addGoodsInfo(GoodsInfo goodsInfo);
    int updateGoods(GoodsInfo goodsInfo);
    int deleteGoodsInfo(int id);
}
