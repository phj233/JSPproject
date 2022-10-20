/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.impl;

import com.phj233.mybatis.mappers.UserMapper;
import com.phj233.pojo.User;
import com.phj233.service.IsRegister;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @projectName: JSPproject
 * @package: com.phj233.impl
 * @className: IsRegisterImpl
 * @author: phj233
 * @date: 2022/10/20 8:30
 * @version: 1.0
 */
public class IsRegisterImpl implements IsRegister {
    SqlSession sqlSession= SqlSessionUtil.getSqlSession();
    UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
    @Override
    public Boolean userRegister(User user) {
        return userMapper.insertUser(user);
    }
}
