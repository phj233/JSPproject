package com.phj233.dao;
import com.phj233.pojo.AdminInfo;
import java.util.List;
/**
 * @author phj233
 */
public interface AdminInfoDao {

    //查
    List<AdminInfo> queryAdminInfo(String sql, Object... params);

    //增
    int addAdminInfo(AdminInfo adminInfo);

    //改
    int updateAdminInfo(AdminInfo adminInfo);

    //删
    int deleteAdminInfo(int id);
}
