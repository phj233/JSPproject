package com.phj233.dao;

import com.phj233.pojo.AdminInfo;

import java.sql.SQLException;
import java.util.List;

public interface AdminInfoDao {
    List<AdminInfo> queryAdminInfo(String sql, Object... params);
    int addAdminInfo(AdminInfo adminInfo);
    int updateAdmin(AdminInfo adminInfo);
    int deleteAdminInfo(int id);
}
