package com.easybuy.web.controlle;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DoLoginAllName")
public class DoLoginAllName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        if (request.getSession().getAttribute("loginName")!=null) {
           out.print(JSON.toJSONString(request.getSession().getAttribute("loginName")));//获取到返回信息
        }else{
            out.print(JSON.toJSONString("请登录"));//获取不登录信息返回请登录
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
