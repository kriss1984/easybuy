package com.easybuy.web.controlle;

import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;
import com.easybuy.serviceimpl.EasyBuyFindProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EasyBuyFindAllService<EasyBuyProduct> easyBuyFindAllService =EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyFindProductServiceImpl");
        List<EasyBuyProduct> listProduct = new ArrayList<EasyBuyProduct>();
        if (request.getParameter("productId") != null) {
       ;//获取product的ID
            listProduct = easyBuyFindAllService.findOne( Integer.parseInt( request.getParameter("productId")));//获取product的集合
            request.getSession().setAttribute("listProduct",listProduct);//存一条数据的集合
            response.sendRedirect("Jsp/Product.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
