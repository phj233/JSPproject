package com.phj233.dao.impl;

import com.phj233.pojo.UserInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 未確認の庭師
 */
class UserInfoDaoImplTest {

    //全查
    @Test
    void getUsersInfoListAll() {
        new UserInfoDaoImpl().getUsersInfoList("select * from userinfo").forEach(System.out::println);
    }

    //条件查询
    @Test
    void getUsersInfoList() {
        new UserInfoDaoImpl().getUsersInfoList("select * from userinfo where Uname like ?", "%j%").forEach(System.out::println);
    }
    @Test
    void addUsersInfo() {
    }

    @Test
    void updateUsers() {
    }

    @Test
    void deleteUsersInfo() {
    }
}