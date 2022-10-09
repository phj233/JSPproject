package com.phj233.dao;
import com.phj233.dao.impl.UserInfoDaoImpl;
import com.phj233.pojo.UserInfo;
import org.junit.jupiter.api.Test;

/**
 * @author 未確認の庭師，phj233
 */
class UserInfoTest {

    //全查
    @Test
    void getUsersInfoListAll() {
        new UserInfoDaoImpl().getUsersInfoList(
                "select * from userinfo").forEach(System.out::println);
    }

    //条件查询
    @Test
    void getUsersInfoList() {
        new UserInfoDaoImpl().getUsersInfoList(
                "select * from userinfo where Upwd like ?", "%6%").forEach(System.out::println);
    }

    //新增管理员信息
    @Test
    void addUsersInfo() {
        System.out.println(new UserInfoDaoImpl().addUsersInfo(new UserInfo(){
            {
                setuId(12345);
                setuName("testUser");
                setuPwd("test");
                setuEmail("test@test.com");
            }
        }));
        getUsersInfoListAll();
    }

    //修改管理员信息
    @Test
    void updateUsers() {
        System.out.println(new UserInfoDaoImpl().updateUsers(new UserInfo(){
            {
                setuName("testUser2");
                setuId(12345);
            }
        }));
        getUsersInfoListAll();
    }

    //删除用户信息
    @Test
    void deleteUsersInfo() {
        System.out.println(new UserInfoDaoImpl().deleteUsersInfo(12345));
        getUsersInfoListAll();
    }
}