/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.test;

import com.phj233.mybatis.mappers.UserMapper;
import com.phj233.pojo.User;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class UserMapperTest {

    @Test
    public void testInsertUser() {
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        User user = new User(null,"2780990934@qq.com","phj233","phj123456",true);
        //提交事务
        int res=userMapper.insertUser(user);
        //sqlSession.commit();
        System.out.println("result:" + res);
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.deleteUser();
        System.out.println(res);
    }
    @Test
    public void getUserList(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> res = userMapper.getUserList();
        System.out.println(res);
    }
    @Test
    public void getUserAdmin(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Boolean res = userMapper.getUserAdmin(9);
        System.out.println(res);
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User res = userMapper.getUserById(9);
        System.out.println(res);
    }
}