package com.phj233.test;

import com.phj233.dao.AdminInfoDaoImpl;
import com.phj233.pojo.AdminInfo;
import com.phj233.util.DBUtil;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

class AdminTest {
    @Test
    void testAdminFind() throws SQLException {
        AdminInfoDaoImpl infoDao=new AdminInfoDaoImpl();
        String sql="select * from admininfo";
        List<AdminInfo> adminInfoList = infoDao.getAdminInfoList(sql);
        for (AdminInfo admin:adminInfoList){
            System.out.println(admin);
        }
    }
    @Test
    void testAdminAdd() {
        System.out.println(new AdminInfoDaoImpl().addAdminInfo(
                new AdminInfo(10013,"phj233","pppp","超管")));
        DBUtil.AllSelect("admininfo");
    }
    @Test
    void testAdmindelete() {
        System.out.println(new AdminInfoDaoImpl().DeleteAdminInfo(10013));
        DBUtil.AllSelect("admininfo");
    }
    @Test
    void testAdminupdate() {
        System.out.println(new AdminInfoDaoImpl().updateAdmin(
                new AdminInfo("phj33",10086)));
        DBUtil.AllSelect("admininfo");
    }
    @Test
    void testAdminselect() throws SQLException {
        System.out.println(new AdminInfoDaoImpl().selectAdmininfo("10001"));
    }
}

