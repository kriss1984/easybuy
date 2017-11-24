package com.easybuy.web.controlle;

import com.alibaba.fastjson.JSON;
import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DoLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        EasyBuyFindAllService<EasyBuyUser> user=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyUserServiceImpl");
        EasyBuyUser boo=user.login( req.getParameter("loginName"),req.getParameter("password"));
        if (boo == null) {
             out.print(JSON.toJSONString("on"));
           } else {
               req.getSession().setAttribute("loginName",boo.getLoginName());
               out.print(JSON.toJSONString(boo));
           }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
