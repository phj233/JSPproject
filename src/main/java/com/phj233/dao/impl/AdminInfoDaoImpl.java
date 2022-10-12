package com.phj233.dao.impl;

import com.phj233.dao.AdminInfoDao;
import com.phj233.pojo.AdminInfo;
import com.phj233.util.DBUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 未確認の庭師,phj233
 */
public class AdminInfoDaoImpl implements AdminInfoDao {
    /**
     * 私有方法，从数据库中查询出来的数据转换成AdminInfo对象
     * @param sql 用于存放AdminInfo对象的集合
     * @return AdminInfo对象的集合
     */
    public List<AdminInfo> getAdminInfoList(String sql) {
        List<Map<String, Object>> list = DBUtil.query(sql);
        return getAdminsList(list);
    }
    private List<AdminInfo> getAdminsList(List<Map<String, Object>> list) {
        List<AdminInfo> adminInfoList = new ArrayList<>();
        for(Map<String,Object> map : list){
            AdminInfo adminInfo = new AdminInfo();
            adminInfo.setaId((Integer) map.get("aid"));
            adminInfo.setaName((String) map.get("name"));
            adminInfo.setaPwd((String) map.get("password"));
            adminInfo.setaLevel((String) map.get("level"));
            adminInfoList.add(adminInfo);
        }
        return adminInfoList;
    }
    public List<AdminInfo> login(String name, String password){
        String sql = "select * from admininfo where Aname = ? and Apwd = ?";
        List<Map<String,Object>> list = DBUtil.query(sql,name,password);
        return getAdminsList(list);
    }

    /**
     * 全查，条件查
     * @return 商品信息列表
     */
    @Override
    public List<AdminInfo> queryAdminInfo(String sql, Object... params) {
        List<AdminInfo> adminInfoList = new ArrayList<>();
        List<Map<String,Object>> list = DBUtil.query(sql,params);
        return getAdminsList(list);
    }
    public List<AdminInfo> queryAdminInfo() {
        List<AdminInfo> adminInfoList = new ArrayList<>();
        List<Map<String,Object>> list = DBUtil.query("select * from admininfo");
        return getAdminsList(list);
    }


    @Override
    public int addAdminInfo(AdminInfo adminInfo) {
        String sql = "insert into admininfo(aId,aName,aPwd,aLevel) values(?,?,?,?)";
        return DBUtil.update(sql,adminInfo.getaId(),
                adminInfo.getaName(),adminInfo.getaPwd(),
                adminInfo.getaLevel());
    }

    @Override
    public int updateAdminInfo(AdminInfo adminInfo) {
        String sql = "update adminInfo set Aname=?,Apwd=?,Alevel=? where Aid=?";
        return DBUtil.update(sql,
                adminInfo.getaName(),adminInfo.getaPwd(),
                adminInfo.getaLevel(),adminInfo.getaId());
    }

    @Override
    public int deleteAdminInfo(int id) {
        String sql = "delete from adminInfo where Aid=?";
        return DBUtil.update(sql,id);
    }
}
