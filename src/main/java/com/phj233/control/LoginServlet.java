/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.control;
import com.phj233.impl.IsLoginImpl;
import com.phj233.mybatis.mappers.GoodsMapper;
import com.phj233.pojo.Goods;
import com.phj233.service.IsLogin;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("name");
        String passwd=request.getParameter("passwd");
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> allClassify=goodsMapper.selectAllClassify();
        IsLogin login = new IsLoginImpl();
        if (login.userLogin(name,passwd)){
            HttpSession session = request.getSession();
            session.setAttribute("username", name);
            session.setAttribute("classifyList",allClassify);
            response.sendRedirect("index.html");
        }else response.sendRedirect("/jsp/login.jsp");



    }
}
