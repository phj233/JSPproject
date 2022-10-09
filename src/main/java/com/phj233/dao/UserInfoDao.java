package com.phj233.dao;

import com.phj233.pojo.UserInfo;

import java.util.List;

public interface UserInfoDao {
    //查
    List<UserInfo> getUsersInfoList(String sql, Object... params);

    //增
    int addUsersInfo(UserInfo userInfo);

    //改
    int updateUsers(UserInfo userInfo);

    //删
    int deleteUsersInfo(int id);
}
