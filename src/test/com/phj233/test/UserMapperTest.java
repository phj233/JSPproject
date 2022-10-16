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

class UserMapperTest {
    SqlSession sqlSession= SqlSessionUtil.getSqlSession();
    //通过代理模式创建UserMapper接口的代理实现类对象
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
    @Test
    public void insertUser() {
        User user = new User(null,"2780990934@qq.com","phj233","phj123456",true);
        //提交事务
        int res=userMapper.insertUser(user);
        //sqlSession.commit();
        System.out.println("result:" + res);
    }
    @Test
    public void getUserList(){
        List<User> res = userMapper.getUserList();
        System.out.println(res);
    }
    @Test
    public void getUserAdmin(){
        Boolean res = userMapper.getUserAdminByUsername("phj233");
        System.out.println(res);
    }
    @Test
    public void getUserById(){
        User res = userMapper.getUserById(9);
        System.out.println(res);
    }
    @Test
    public void deleteUser(){
        Boolean res=userMapper.deleteUser(9);
        System.out.println(res);
    }
    @Test
    public void selectUserByName(){
        User res=userMapper.selectUserByName("phj233");
        System.out.println(res);
    }
    @Test
    public void checkLogin(){
        Boolean res=userMapper.checkLogin("2780990934@qq.com","phj123456");
        System.out.println(res);
    }
}