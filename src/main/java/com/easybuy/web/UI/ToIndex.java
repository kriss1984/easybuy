package com.easybuy.web.UI;

import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;
import com.easybuy.serviceimpl.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToIndex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EasyBuyFindAllService<EasyBuyProductCategory> category=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyProductCategoryServiceImpl");
        EasyBuyFindAllService<EasyBuyNews> news=EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyNewsServiceImpl");

//        EasyBuyFindAllService<EasyBuyProduct> product=EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.daoimpl.EasyBuyFindProductDaoImpl");
        //新闻列表

//        //所有的商品列表
//        List<EasyBuyProduct> productList=product.findAll();
//
//
//
//
//
//
//        List<EasyBuyNews> newsList=news.findAll();
//        //首页左侧 一二三级菜单
        List<EasyBuyProductCategory> list=category.findAll();
        List<EasyBuyProductCategory> list1=new ArrayList<EasyBuyProductCategory>();
        List<EasyBuyProductCategory> list2=new ArrayList<EasyBuyProductCategory>();
        List<EasyBuyProductCategory> list3=new ArrayList<EasyBuyProductCategory>();
        for (EasyBuyProductCategory ss :list){
            if(ss.getType()==1){
                list1.add(ss);
            }
            else if(ss.getType()==2){
                list2.add(ss);
            } else {
                list3.add(ss);
            }








        }

            //储存 request 作用域
        req.setAttribute("list1",list1);
        req.setAttribute("list2",list2);
        req.setAttribute("list3",list3);
//        req.setAttribute("newsList",newsList);

        req.getRequestDispatcher("/Jsp/indexShopList.jsp").forward(req,resp);




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
