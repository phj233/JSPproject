/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.control;

import com.alibaba.fastjson2.JSON;
import com.phj233.impl.IsLoginImpl;
import com.phj233.impl.IsRegisterImpl;
import com.phj233.pojo.User;
import com.phj233.service.IsLogin;
import com.phj233.service.IsRegister;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @projectName: JSPproject
 * @package: com.phj233.control
 * @className: RegisterServlet
 * @author: phj233
 * @date: 2022/10/20 8:27
 * @version: 1.0
 */
@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers"," Content-Type");
        String name=request.getParameter("regName");
        String passwd=request.getParameter("regPasswd");
        String email=request.getParameter("regEmail");
        PrintWriter out = response.getWriter();
        IsRegister register=new IsRegisterImpl();
        User user=new User(null,name,passwd,email,null);
        if (register.userRegister(user)) out.print(JSON.toJSONString(user));
    }
}
