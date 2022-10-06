package com.phj233.dao;

import com.phj233.pojo.GoodInfo;
import com.phj233.pojo.UserInfo;

import java.sql.SQLException;
import java.util.List;

public interface UserInfoDao {
    List<UserInfo> getUsersInfoList(String sql) throws SQLException;
    int addUsersInfo(UserInfo userInfo) throws SQLException;

    int updateUsers(UserInfo userInfo) throws SQLException;
    int DeleteUsersInfo(int id) throws SQLException;
}
