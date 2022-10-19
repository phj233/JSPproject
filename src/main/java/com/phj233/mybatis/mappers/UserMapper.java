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
    Boolean updateUser(User user);
    Boolean deleteUser(@Param("uid") int uid);
    List<User> getUserList();
    User getUserById(@Param("uid") int uid);
    User getUser(@Param("info") String info);
    Boolean getUserAdminByEmail(@Param("email") String email);
    Boolean getUserAdminByUsername(@Param("username") String username);
    User selectUserByName(@Param("username")String username);
    Boolean checkLogin(@Param("username") String username, @Param("password") String password);

}