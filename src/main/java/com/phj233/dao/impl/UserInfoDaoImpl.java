package com.phj233.dao.impl;

import com.phj233.dao.UserInfoDao;
import com.phj233.pojo.GoodInfo;
import com.phj233.pojo.UserInfo;
import com.phj233.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public List<UserInfo> getUsersInfoList(String sql) throws SQLException {
        ResultSet selectRs = DBUtil.select(sql);
        List<UserInfo> userInfos=new ArrayList<>();
        while (selectRs.next()){
            UserInfo userInfo=new UserInfo();
            userInfo.setuId(selectRs.getInt("Uid"));
            userInfo.setuEmail(selectRs.getString("Uemail"));
            userInfo.setuName(selectRs.getString("Uname"));
            userInfo.setuPwd(selectRs.getString("Upwd"));
            userInfos.add(userInfo);
        }
        return userInfos;
    }

    @Override
    public int addUsersInfo(UserInfo userInfo) throws SQLException {
        String sql="insert into userinfo(Uid,Uname,Upwd,Uemail) values(?,?,?,?)";
        return DBUtil.update(sql, userInfo.getuId(), userInfo.getuName(), userInfo.getuPwd(), userInfo.getuEmail());
    }

    @Override
    public int updateUsers(UserInfo userInfo) throws SQLException {
        String sql="update userinfo set Uname = ? where Uid = ?";
        return DBUtil.update(sql,userInfo.getuName(),userInfo.getuId());
    }

    @Override
    public int DeleteUsersInfo(int id) throws SQLException {
        String sql="DELETE FROM userinfo WHERE Uid = "+id;
        return DBUtil.delete(sql);
    }
}
