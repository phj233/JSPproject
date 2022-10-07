package com.phj233.dao.impl;
import com.phj233.dao.GoodsinfoDao;
import com.phj233.pojo.GoodsInfo;
import com.phj233.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoodsinfoDaoImpl implements GoodsinfoDao {
    /**
     * 私有方法，从数据库中查询出来的数据转换成GoodsInfo对象
     * @param list 从数据库中查询出来的数据
     * @return GoodsInfo对象的集合
     */
    private List<GoodsInfo> getGoodsList(List<Map<String, Object>> list) {
        List<GoodsInfo> goodsInfoList = new ArrayList<>();
        for(Map<String,Object> map : list){
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setgId((Integer) map.get("gId"));
            goodsInfo.setgName((String) map.get("gName"));
            goodsInfo.setgPrice((Double) map.get("gPrice"));
            goodsInfo.setgClass((String) map.get("gClass"));
            goodsInfo.setgAmount((Integer) map.get("gAmount"));
            goodsInfo.setgDate((LocalDateTime) map.get("gDate"));
            goodsInfo.setgImgurl((String) map.get("gImgurl"));
            goodsInfo.setgLook((Integer) map.get("gLook"));
            goodsInfo.setgIntro((String) map.get("gIntro"));
            goodsInfo.setgBrief((String) map.get("gBrief"));
            goodsInfoList.add(goodsInfo);
        }
        return goodsInfoList;
    }

    /**
     * 根据条件查询商品
     * @param sql SQL语句
     * @param params SQL参数
     * @return 商品信息列表
     */
    @Override
    public List<GoodsInfo> queryGoodsInfo(String sql, Object... params) {
        List<Map<String,Object>> list = DBUtil.query(sql,params);
        return getGoodsList(list);
    }



    @Override
    public int addGoodsInfo(GoodsInfo goodsInfo) {
        String sql="insert into goodsinfo(gId,gLook,gName,gClass,gImgurl,gIntro,gBrief,gPrice,gAmount,gDate) values(?,?,?,?,?,?,?,?,?,?)";
        return DBUtil.update(sql,
                goodsInfo.getgId(), goodsInfo.getgLook(), goodsInfo.getgName(),
                goodsInfo.getgClass(), goodsInfo.getgImgurl(), goodsInfo.getgIntro(),
                goodsInfo.getgBrief(), goodsInfo.getgPrice(), goodsInfo.getgAmount(),
                goodsInfo.getgDate());
    }

    @Override
    public int updateGoods(GoodsInfo goodsInfo) {
        return 0;
    }

    @Override
    public int deleteGoodsInfo(int id) {
        return 0;
    }

}
