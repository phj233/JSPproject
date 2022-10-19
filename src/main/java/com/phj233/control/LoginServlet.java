/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.control;
import com.alibaba.fastjson2.JSON;
import com.oracle.webservices.internal.api.message.ContentType;
import com.phj233.impl.IsLoginImpl;
import com.phj233.pojo.User;
import com.phj233.service.IsLogin;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers"," Content-Type");
        String name=request.getParameter("name");
        String passwd=request.getParameter("passwd");
        PrintWriter out = response.getWriter();
        IsLogin login = new IsLoginImpl();
        User user = login.getUser(name);
        if (login.userLogin(name, passwd)) {
            System.out.println(JSON.toJSONString(user));
            out.print(JSON.toJSONString(user));
        } else {
            out.print("{status:0}");
        }



    }
}
