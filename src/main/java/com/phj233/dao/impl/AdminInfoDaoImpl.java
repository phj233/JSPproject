package com.phj233.dao.impl;

import com.phj233.dao.AdminInfoDao;
import com.phj233.pojo.AdminInfo;
import com.phj233.util.DBUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminInfoDaoImpl implements AdminInfoDao {

    /**
     * 私有方法，将查询结果转换为管理员信息列表
     * @param list 查询结果
     * @return 管理员信息列表
     */
    private List<AdminInfo> getAdminList(List<Map<String, Object>> list) {
        List<AdminInfo> adminInfoList = new ArrayList<>();
        for(Map<String,Object> map : list){
            AdminInfo adminInfo = new AdminInfo();
            adminInfo.setaId((Integer) map.get("aId"));
            adminInfo.setaName((String) map.get("aName"));
            adminInfo.setaPwd((String) map.get("aPwd"));
            adminInfo.setaLevel((String) map.get("aLevel"));
            adminInfoList.add(adminInfo);
        }
        return adminInfoList;
    }

    /**
     * 条件查询
     * @param sql SQL语句
     * @param params 参数
     * @return 管理员列表
     */
    @Override
    public List<AdminInfo> queryAdminInfo(String sql, Object... params) {
        List<Map<String, Object>> list = DBUtil.query(sql, params);
        return getAdminList(list);
    }


    @Override
    public int addAdminInfo(AdminInfo adminInfo) {
        String sql="insert into admininfo(Aid,Aname,Apwd,Alevel) values(?,?,?,?)";
        return DBUtil.update(sql, adminInfo.getaId(), adminInfo.getaName(), adminInfo.getaPwd(), adminInfo.getaLevel());
    }

    @Override
    public int updateAdmin(AdminInfo adminInfo) {
        String sql="update admininfo set Aname = ?,aPwd = ?,aLevel = ? where Aid = ?";
        return DBUtil.update(sql,
                adminInfo.getaName(),adminInfo.getaPwd(),
                adminInfo.getaLevel(),adminInfo.getaId()
        );
    }

    @Override
    public int deleteAdminInfo(int id) {
        String sql="DELETE FROM admininfo WHERE Aid = ?";
        return DBUtil.update(sql,id);
    }

}
