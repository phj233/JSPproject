package com.phj233.dao;

import com.phj233.pojo.GoodInfo;
import com.phj233.pojo.UserInfo;

import java.sql.SQLException;
import java.util.List;

public interface UserInfoDao {
    List<UserInfo> getUsersInfoList(String sql, Object... params);
    int addUsersInfo(UserInfo userInfo);

    int updateUsers(UserInfo userInfo);
    int deleteUsersInfo(int id);
}
