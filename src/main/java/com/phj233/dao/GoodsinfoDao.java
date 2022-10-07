package com.phj233.dao;

import com.phj233.pojo.GoodInfo;

import java.sql.SQLException;
import java.util.List;

public interface GoodsinfoDao {
    List<GoodInfo> getGoodsInfoList(String sql) throws SQLException;
    int addGoodsInfo(GoodInfo goodInfo) throws SQLException;
    int updateGoods(GoodInfo goodInfo) throws SQLException;
    int DeleteGoodsInfo(int id) throws SQLException;
}
