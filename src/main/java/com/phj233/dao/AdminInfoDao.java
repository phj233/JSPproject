package com.phj233.dao;

import com.phj233.pojo.AdminInfo;

import java.sql.SQLException;
import java.util.List;

public interface AdminInfoDao {
    List<AdminInfo> getAdminInfoList(String sql) throws SQLException;
    int addAdminInfo(AdminInfo adminInfo) throws SQLException;
    int updateAdmin(AdminInfo adminInfo) throws SQLException;
    int DeleteAdminInfo(int id) throws SQLException;
}
