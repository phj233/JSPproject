package com.phj233.util;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

class DBUtilTest {

    @org.junit.jupiter.api.Test
    void update() {
        Connection conn = DBUtil.getConnect();
        String sql = "update userinfo set Uname = ? where Uid = ?";
        new DBUtil();
        if (conn != null) {
            DBUtil.update(sql, "ark", 10001);
        } else {
            System.out.println("链接失败");
        }
    }

    @Test
    void select() {
        if (DBUtil.getConnect() != null) {
            DBUtil.AllSelect("userinfo");
        } else {
            System.out.println("链接失败");
        }
    }

    @Test
    void disConnect() {
        new DBUtil().disConnect();
    }
}

