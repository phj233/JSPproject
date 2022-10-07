package com.phj233.dao;
import com.phj233.pojo.GoodInfo;
import com.phj233.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GoodsinfoDaoImpl implements GoodsinfoDao{
    @Override
    public List<GoodInfo> getGoodsInfoList(String sql) throws SQLException {
        ResultSet selectRs = DBUtil.select(sql);
        List<GoodInfo> goodInfos=new ArrayList<>();
        while (selectRs.next()){
            GoodInfo goodInfo=new GoodInfo();
            goodInfo.setgId(selectRs.getInt("Gid"));
            goodInfo.setgName(selectRs.getString("Gname"));
            goodInfo.setgPrice(selectRs.getDouble("Gprice"));
            goodInfo.setgAmount(selectRs.getInt("Gamount"));
            goodInfo.setgIntro(selectRs.getString("Gintro"));
            goodInfo.setgLook(selectRs.getInt("Glook"));
            goodInfo.setgDate((LocalDateTime) selectRs.getObject("Gdate"));
            goodInfo.setgImgurl(selectRs.getString("Gimgurl"));
            goodInfo.setgClass(selectRs.getString("Gclass"));
            goodInfo.setgBrief(selectRs.getString("Gbrief"));
            goodInfos.add(goodInfo);
        }
        return goodInfos;
    }

    @Override
    public int addGoodsInfo(GoodInfo goodInfo) throws SQLException {
        String sql="insert into goodsinfo(gId,gLook,gName,gClass,gImgurl,gIntro,gBrief,gPrice,gAmount,gDate) values(?,?,?,?,?,?,?,?,?,?)";
        return DBUtil.update(sql,
                goodInfo.getgId(),goodInfo.getgLook(),goodInfo.getgName(),
                goodInfo.getgClass(),goodInfo.getgImgurl(),goodInfo.getgIntro(),
                goodInfo.getgBrief(),goodInfo.getgPrice(),goodInfo.getgAmount(),
                goodInfo.getgDate());
    }

    @Override
    public int updateGoods(GoodInfo goodInfo) throws SQLException {
        String sql = "update goodsinfo set Gname = ? where Gid = ?";
        return DBUtil.update(sql, goodInfo.getgName(), goodInfo.getgId());
    }
    @Override
    public int DeleteGoodsInfo(int id) throws SQLException {
        String sql="DELETE FROM goodsinfo WHERE Gid = "+id;
        return DBUtil.delete(sql);
    }
}
