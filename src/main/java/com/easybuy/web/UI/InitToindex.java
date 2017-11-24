package com.easybuy.web.UI;

import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InitToindex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EasyBuyFindAllService<EasyBuyNews> news=EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyNewsServiceImpl");
        List<EasyBuyNews> newsList=news.findAll();


        req.setAttribute("newsList",newsList);

        req.getRequestDispatcher("/Jsp/Index.jsp").forward(req,resp);




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
