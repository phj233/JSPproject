package com.phj233.dao.impl;
import com.phj233.dao.UserInfoDao;
import com.phj233.pojo.UserInfo;
import com.phj233.util.DBUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserInfoDaoImpl implements UserInfoDao {
    private List<UserInfo> getUserList(List<Map<String, Object>> list) {
        List<UserInfo> userInfoList = new ArrayList<>();
        for(Map<String,Object> map : list){
            UserInfo userInfo = new UserInfo();
            userInfo.setuId((Integer) map.get("Uid"));
            userInfo.setuName((String) map.get("Uname"));
            userInfo.setuPwd((String) map.get("Upwd"));
            userInfo.setuEmail((String) map.get("Uemail"));
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }
    @Override
    public List<UserInfo> getUsersInfoList(String sql, Object... params) {
        List<Map<String, Object>> list = DBUtil.query(sql, params);
        return getUserList(list);
    }

    @Override
    public int addUsersInfo(UserInfo userInfo) {
        String sql="insert into userinfo(Uid,Uname,Upwd,Uemail) values(?,?,?,?)";
        return DBUtil.update(sql, userInfo.getuId(), userInfo.getuName(), userInfo.getuPwd(), userInfo.getuEmail());
    }

    @Override
    public int updateUsers(UserInfo userInfo)  {
        String sql="update userinfo set Uname = ? where Uid = ?";
        return DBUtil.update(sql,userInfo.getuName(),userInfo.getuId());
    }

    @Override
    public int deleteUsersInfo(int id) {
        String sql="DELETE FROM userinfo WHERE Uid = ?";
        return DBUtil.update(sql,id);
    }
}
