package com.easybuy.web.controlle;

import com.alibaba.fastjson.JSON;
import com.easybuy.entiy.EasyBuyOrder;
import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.entiy.EasyBuyUserAddress;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoMember extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EasyBuyFindAllService<EasyBuyUser> user=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyUserServiceImpl");
        EasyBuyFindAllService<EasyBuyOrder> order=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyFindOrderServiceImpl");
        EasyBuyFindAllService<EasyBuyUserAddress> address=   EasyBuyFindAllServiceFactory.getEasyBuyFindAllServiceImplInstance("com.easybuy.serviceimpl.EasyBuyUserAddressServiceImpl");

        String type=req.getParameter("type");
    String  path="/Jsp/Member_Address.jsp";

   if("address" .equals(type)){
       System.out.println(user.findById(2)+"----"+address.findByUserId(2).get(0));
       req.setAttribute("user",user.findById(2));
       req.setAttribute("address",address.findByUserId(2).get(0));
       path="/Jsp/Member_Address.jsp";
   }else if("order".equals(type)){

       req.setAttribute("orderList",order.findByUserId(2));
                                        path="/Jsp/Member_Order.jsp";
   }else if("user".equals(type)){
       req.setAttribute("user",user.findById(2));
                                        path="/Jsp/Member_User.jsp";
   }else if("collect".equals(type)){
                                        path="/Jsp/Member_Collect.jsp";
   }else if("msg".equals(type)){
                                        path="/Jsp/Member_Msg.jsp";
   }else if("links".equals(type)){
                                        path="/Jsp/Member_Links.jsp";
   }else if("packet".equals(type)){
                                        path="/Jsp/Member_Packet.jsp";
   }else if("money".equals(type)){
                                        path="/Jsp/Member_Money.jsp";
   }else if("member".equals(type)){
                                        path="/Jsp/Member_Member_List.jsp";
   }else if("result".equals(type)){
                                        path="/Jsp/Member_Results.jsp";
   }else if("commission".equals(type)){
                                        path="/Jsp/Member_Commission.jsp";
   }else if("cash".equals(type)){
                                        path="/Jsp/Member_Cash.jsp";
   }





        req.getRequestDispatcher(path).forward(req,resp);






    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
