/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.service.impl;

import com.phj233.dao.impl.AdminInfoDaoImpl;
import com.phj233.dao.impl.UserInfoDaoImpl;
import com.phj233.pojo.AdminInfo;
import com.phj233.pojo.UserInfo;
import com.phj233.service.IsRegist;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: JSPproject
 * @package: com.phj233.service.impl
 * @className: IsRegistImpl
 * @author: phj233
 * @date: 2022/10/11 8:38
 * @version: 1.0
 */
public class IsRegistImpl implements IsRegist {
    @Override
    public Boolean adminRegist(String name, String passwd,String level) {
        List<AdminInfo> list = new AdminInfoDaoImpl().queryAdminInfo(
                "select * from admininfo where Aname = ?", name);
        List<Object> adminInfo =new ArrayList<>();
        adminInfo.add(name);
        adminInfo.add(passwd);
        if (!list.equals(adminInfo)){
            new AdminInfoDaoImpl().updateAdminInfo(new AdminInfo() {
                {
                    setaId(12345);
                    setaName(name);
                    setaPwd(passwd);
                    setaLevel(level);
                }
            });
            return true;
        }else return false;
    }

    @Override
    public Boolean userRegist(String name, String passwd,String email) {
        List<UserInfo> list = new UserInfoDaoImpl().getUsersInfoList(
                "select * from userinfo where Uname = ?", name);
        List<Object> userInfo =new ArrayList<>();
        userInfo.add(name);
        userInfo.add(passwd);
        userInfo.add(email);
        if (!list.equals(userInfo)){
            new UserInfoDaoImpl().addUsersInfo(new UserInfo(){
                {
                    setuId(12345);
                    setuName(name);
                    setuPwd(passwd);
                    setuEmail(email);
                }
            });
            return true;
        }else return false;
    }
}
