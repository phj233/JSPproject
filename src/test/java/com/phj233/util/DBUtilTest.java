package com.phj233.util;

import com.phj233.dao.AdminInfoDaoImpl;
import com.phj233.pojo.AdminInfo;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

class DBUtilTest {

    @org.junit.jupiter.api.Test
    void update() {
        Connection conn= DBUtil.getConnect();
        String sql="update userinfo set Uname = ? where Uid = ?";
        new DBUtil();
        if (conn!=null){
            DBUtil.update(sql,"ark",10001);
        } else {
            System.out.println("链接失败");
        }
    }

    @Test
    void select() throws SQLException {
        Connection conn= DBUtil.getConnect();
        String sql="select * from userinfo";
        if (conn!=null){
            new DBUtil();
            DBUtil.select(sql);
        } else {
            System.out.println("链接失败");
        }
    }

    @Test
    void disConnect() {
        new DBUtil().disConnect();
    }

    @Test
    void testAdminFind() throws SQLException {
            AdminInfoDaoImpl infoDao=new AdminInfoDaoImpl();
            String sql="select * from admininfo";
            List<AdminInfo> adminInfoList = infoDao.getAdminInfoList(sql);
            for (AdminInfo admin:adminInfoList
            ) {
                System.out.println(admin);
            }
    }
    @Test
    void testAdminAdd() {
        DBUtil.getConnect();
        System.out.println(new AdminInfoDaoImpl().addAdminInfo(
                new AdminInfo(10010,"phj","pppp","超级管理")));
    }
    @Test
    void testAdmindelete() throws SQLException{
        DBUtil.getConnect();
        System.out.println(new AdminInfoDaoImpl().DeleteAdminInfo(10010));
    }
    @Test
    void testAdminupdate() throws SQLException {
        DBUtil.getConnect();
        System.out.println(new AdminInfoDaoImpl().updateAdmin(
                new AdminInfo("phj233",10086)));
    }
}
