/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.control;

import com.alibaba.fastjson2.JSON;
import com.phj233.mybatis.mappers.GoodsMapper;
import com.phj233.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @projectName: JSPproject
 * @package: com.phj233.control
 * @className: GoodsServlet
 * @author: phj233
 * @date: 2022/10/18 8:08
 * @version: 1.0
 */
@WebServlet(name = "GoodsServlet", value = "/goodsinfo")
public class GoodsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/javascript;charset=UTF-8");
        request.getParameter("classify");
        PrintWriter out = response.getWriter();
        String param=request.getParameter("info");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        switch (param){
            case "all":out.println(JSON.toJSONString(goodsMapper.selectAllGoods()));
                break;
            case "classify":out.println(JSON.toJSONString(goodsMapper.selectAllClassify()));
                break;
            default:out.println("kkk");
        }
    }
}