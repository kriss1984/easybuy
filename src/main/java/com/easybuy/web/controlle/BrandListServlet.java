package com.easybuy.web.controlle;

import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.serviceimpl.EasyBuyFindProductServiceImpl;
import com.easybuy.serviceimpl.EasyBuyProductCategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BrandListServlet")
public class BrandListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EasyBuyFindProductServiceImpl easyBuyFindProductService=new EasyBuyFindProductServiceImpl();// 查询推荐商品
        List<EasyBuyProduct> listEasy=null;
        List<EasyBuyProduct> list=new ArrayList<EasyBuyProduct>();
         if (request.getParameter("category")!=null) {
            int categoryId=Integer.parseInt(request.getParameter("category"));
             listEasy=easyBuyFindProductService.findAll();//查询推荐商品
             for (int i = 0; i <listEasy.size(); i++) {
                 EasyBuyProduct easyBuyProduct= listEasy.get(i);
                 //easybuy_product_category表 的ID 和easybuy_product的的categoryLevel1Id
                 if (easyBuyProduct.getCategoryLevel1().equals(categoryId)){
                     list.add(listEasy.get(i));
                 }
             }

            request.getSession().setAttribute("listBrand",list);
             response.sendRedirect("Jsp/BrandList.jsp");
         }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
