/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.mybatis.mappers;

import com.phj233.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @projectName: JSPproject
 * @package: com.phj233.mybatis.mapper
 * @className: UserMapper
 * @author: phj233
 * @date: 2022/10/13 11:51
 * @version: 1.0
 */
public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser(User user);
    int updateUser();
    int deleteUser();
    List<User> getUserList();
    User getUserById(@Param("uid") int uid);
    Boolean getUserAdmin(@Param("uid") int uid);
    User selectUserById();
    User selectUserByName(String username);
    User checkLogin(String username, String password);
    User checkLoginByMap(Map<String, Object> map);
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

}