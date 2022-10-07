package com.phj233.dao.impl;

import com.phj233.pojo.AdminInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 未確認の庭師
 */
class AdminInfoDaoImplTest {

    @Test
    void queryAdminInfoAll() {
        List<AdminInfo> list = new AdminInfoDaoImpl().queryAdminInfo("select * from admininfo");
        list.forEach(System.out::println);
    }

    //条件查询
    @Test
    void queryAdminInfo() {
        List<AdminInfo> list = new AdminInfoDaoImpl().queryAdminInfo("select * from admininfo where aid = ?", 10001);
        list.forEach(System.out::println);
    }

    @Test
    void addAdminInfo() {
    }

    @Test
    void updateAdmin() {
    }

    @Test
    void deleteAdminInfo() {
    }
}