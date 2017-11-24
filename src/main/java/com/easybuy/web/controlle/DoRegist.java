package com.easybuy.web.controlle;

import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoRegist extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EasyBuyFindAllService<EasyBuyUser> user=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyUserServiceImpl");
        EasyBuyUser ebu=new EasyBuyUser();
        ebu.setLoginName(req.getParameter("loginName"));
        ebu.setEmail(req.getParameter("email"));
        ebu.setPassword(req.getParameter("password"));
        ebu.setMobile(req.getParameter("mobile"));
        ebu.setType(new Integer( req.getParameter("types")));

         int result = user.add(ebu);

         if (result==1){
             resp.getWriter().print(1);
         }else {
             resp.getWriter().print(-1);
         }



    }
}
