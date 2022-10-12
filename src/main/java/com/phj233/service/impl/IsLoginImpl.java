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
import com.phj233.service.IsLogin;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: JSPproject
 * @package: com.phj233.service.impl
 * @className: IsLoginImpl
 * @author: phj233
 * @date: 2022/10/10 15:38
 * @version: 1.0
 */
public class IsLoginImpl implements IsLogin {
    @Override
    public Boolean adminLogin(String name, String passwd) {
        List<AdminInfo> list = new AdminInfoDaoImpl().queryAdminInfo();
        for (AdminInfo adminInfo : list){
            if(adminInfo.getaName().equals(name) && adminInfo.getaPwd().equals(passwd)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean userLogin(String name, String passwd,String email) {
        List<UserInfo> list = new UserInfoDaoImpl().getUsersInfoList();
        for (UserInfo userInfo : list) {
            if ((userInfo.getuEmail().equals(email) || userInfo.getuName().equals(name)) && userInfo.getuPwd().equals(passwd)) {
                return true;
            }
        }
        return false;
    }
}
