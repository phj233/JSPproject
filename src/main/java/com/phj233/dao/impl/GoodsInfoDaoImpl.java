package com.phj233.dao.impl;

import com.phj233.dao.GoodsInfoDao_;
import com.phj233.pojo.GoodInfo;
import com.phj233.util.DBUtil_;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 未確認の庭師
 */
public class GoodsInfoDaoImpl implements GoodsInfoDao_ {
    /**
     * 私有方法，从数据库中查询出来的数据转换成GoodsInfo对象
     * @param goodsInfoList 用于存放GoodsInfo对象的集合
     * @param list 从数据库中查询出来的数据
     * @return GoodsInfo对象的集合
     */
    private List<GoodInfo> getGoodsList(List<GoodInfo> goodsInfoList, List<Map<String, Object>> list) {
        for(Map<String,Object> map : list){
            GoodInfo goodsInfo = new GoodInfo();
            goodsInfo.setgId((Integer) map.get("Gid"));
            goodsInfo.setgName((String) map.get("Gname"));
            goodsInfo.setgPrice((Double) map.get("Gprice"));
            goodsInfo.setgClass((String) map.get("Gclass"));
            goodsInfo.setgAmount((Integer) map.get("Gamount"));
            goodsInfo.setgDate((LocalDateTime) map.get("Gdate"));
            goodsInfo.setgImgurl((String) map.get("Gimgurl"));
            goodsInfo.setgLook((Integer) map.get("Glook"));
            goodsInfo.setgIntro((String) map.get("Gintro"));
            goodsInfo.setgBrief((String) map.get("Gbrief"));
            goodsInfoList.add(goodsInfo);
        }
        return goodsInfoList;
    }

    /**
     * 全查，条件查
     * @return 商品信息列表
     */
    @Override
    public List<GoodInfo> queryGoodsInfo(String sql, Object... params) {
        List<GoodInfo> goodsInfoList = new ArrayList<>();
        List<Map<String,Object>> list = DBUtil_.query(sql,params);
        return getGoodsList(goodsInfoList, list);
    }

    @Override
    public int addGoodsInfo(GoodInfo goodsInfo) {
        String sql = "insert into goodsinfo(gid,gname,gprice,gclass,gamount,gdate,gimgurl,glook,gintro,gbrief) values(?,?,?,?,?,?,?,?,?,?)";
        return DBUtil_.update(sql,goodsInfo.getgId(),
                goodsInfo.getgName(),goodsInfo.getgPrice(),
                goodsInfo.getgClass(),goodsInfo.getgAmount(),
                goodsInfo.getgDate(),goodsInfo.getgImgurl(),
                goodsInfo.getgLook(),goodsInfo.getgIntro(),
                goodsInfo.getgBrief());
    }

    @Override
    public int updateGoodsInfo(GoodInfo goodsInfo) {
        String sql = "update goodsinfo set name=?,price=?,classify=?,amount=?,date=?,img_url=?,look=?,intro=?,brief=? where gid=?";
        return DBUtil_.update(sql,
                goodsInfo.getgName(),goodsInfo.getgPrice(),
                goodsInfo.getgClass(),goodsInfo.getgAmount(),
                goodsInfo.getgDate(),goodsInfo.getgImgurl(),
                goodsInfo.getgLook(),goodsInfo.getgIntro(),
                goodsInfo.getgBrief(),goodsInfo.getgId());
    }

    @Override
    public int deleteGoodsInfo(int id) {
        String sql = "delete from goodsinfo where gid=?";
        return DBUtil_.update(sql,id);
    }
}
