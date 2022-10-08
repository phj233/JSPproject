package com.phj233.dao.impl;

import com.phj233.dao.AdminInfoDao;
import com.phj233.pojo.AdminInfo;
import com.phj233.util.DBUtil_;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 未確認の庭師,phj233
 */
public class AdminInfoDaoImpl implements AdminInfoDao {
    /**
     * 私有方法，从数据库中查询出来的数据转换成AdminInfo对象
     * @param adminInfoList 用于存放AdminInfo对象的集合
     * @param list 从数据库中查询出来的数据
     * @return AdminInfo对象的集合
     */
    private List<AdminInfo> getAdminsList(List<AdminInfo> adminInfoList, List<Map<String, Object>> list) {
        for(Map<String,Object> map : list){
            AdminInfo adminInfo = new AdminInfo();
            adminInfo.setaId((Integer) map.get("Aid"));
            adminInfo.setaName((String) map.get("Aname"));
            adminInfo.setaPwd((String) map.get("Apwd"));
            adminInfo.setaLevel((String) map.get("Alevel"));
            adminInfoList.add(adminInfo);
        }
        return adminInfoList;
    }

    /**
     * 全查，条件查
     * @return 商品信息列表
     */
    @Override
    public List<AdminInfo> queryAdminInfo(String sql, Object... params) {
        List<AdminInfo> adminInfoList = new ArrayList<>();
        List<Map<String,Object>> list = DBUtil_.query(sql,params);
        return getAdminsList(adminInfoList, list);
    }


    @Override
    public int addAdminInfo(AdminInfo adminInfo) {
        String sql = "insert into admininfo(aId,aName,aPwd,aLevel) values(?,?,?,?)";
        return DBUtil_.update(sql,adminInfo.getaId(),
                adminInfo.getaName(),adminInfo.getaPwd(),
                adminInfo.getaLevel());
    }

    @Override
    public int updateAdminInfo(AdminInfo adminInfo) {
        String sql = "update adminInfo set Aname=?,Apwd=?,Alevel=? where Aid=?";
        return DBUtil_.update(sql,
                adminInfo.getaName(),adminInfo.getaPwd(),
                adminInfo.getaLevel(),adminInfo.getaId());
    }

    @Override
    public int deleteAdminInfo(int id) {
        String sql = "delete from adminInfo where gid=?";
        return DBUtil_.update(sql,id);
    }
}
