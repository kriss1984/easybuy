package com.easybuy.web.controlle;

import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexInitServlet")
public class IndexInitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EasyBuyFindAllService<EasyBuyProductCategory> categorys=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyProductCategoryServiceImpl");
        EasyBuyFindAllService<EasyBuyNews> news=EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyNewsServiceImpl");
        List<EasyBuyProductCategory> list=categorys.findAll();
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
        System.out.println("老刘写的代码");
        //储存 request 作用域
        request.setAttribute("list1",list1);
        request.setAttribute("list2",list2);
        request.setAttribute("list3",list3);
        request.getRequestDispatcher("/Jsp/indexShopList.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
