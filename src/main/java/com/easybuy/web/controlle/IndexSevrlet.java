package com.easybuy.web.controlle;

import com.alibaba.fastjson.JSON;
import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;
import com.easybuy.web.formbean.IndexSevrletEntiy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20.
 */

public class IndexSevrlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        IndexSevrletEntiy indexEntiy = new IndexSevrletEntiy();//数据集合实列化
        List<EasyBuyProductCategory> listCategory = indexEntiy.getListCategory();//查询EasyBuyProductCategory所有信息
        List<EasyBuyProduct> listProducts = new ArrayList<EasyBuyProduct>();//定义一个商品类别集合

        if (request.getSession().getAttribute("loginName")!=null){
            indexEntiy.setLoginName((String) request.getSession().getAttribute("loginName"));//给请登录赋值
        }
        //-------------------------------初始页面--------------------------------------
        for (int i = 0; i < listCategory.size(); i++) {//循环Category类的
            if (listCategory.get(i).getParentId() == 0) {//Category类的id
                indexEntiy.getListOne().add(listCategory.get(i).getId() + "");
                indexEntiy.getListOne().add(listCategory.get(i).getName());
                String twoName="";
                for (int  k= 0;  k<listCategory.size() ; k++) {//获取二级菜单名字
                    if (listCategory.get(i).getId().equals(listCategory.get(k).getParentId())){
                        indexEntiy.getTwoProductId().add(listCategory.get(k).getParentId()+"");//二级菜单ProductId
                        twoName=twoName.concat(listCategory.get(k).getName()+",");
                    }
                }//获取二级菜单名字
                indexEntiy.getTwoNameCategory().add(twoName);//二级菜单名字
                //-----------------------------------查询商品类别-----------------------
                for (int j = 0; j < indexEntiy.getListProduct().size(); j++) {//循环Product类
                    if (indexEntiy.getListProduct().get(j).getCategoryLevel1().equals(listCategory.get(i).getId())){
                            listProducts.add(indexEntiy.getListProduct().get(j));//存入Product类
                        }//Category类的id==Product类的CategoryLevel1
                }//循环Product类
                //-----------------------------------查询商品类别-----------------------
            }
        }//循环Category类的
        indexEntiy.setListProduct(listProducts);//存入Product类的集合到IndexSevrletEntiy中

        //-------------------------------新闻资讯--------------------------------------
        List<EasyBuyNews> listEasy = new ArrayList<EasyBuyNews>();//定义一个新闻资讯集合
        for (int i = 0; i < 5; i++) {//最新新闻资讯
            EasyBuyNews easyBuyNews = indexEntiy.getListNews().get(i);
            listEasy.add(easyBuyNews);
        }
        indexEntiy.setListNews(listEasy);//存新闻资讯
        //-------------------------------新闻资讯--------------------------------------


        System.out.println(indexEntiy.getLoginName());
        out.print(JSON.toJSONString(indexEntiy));//传集合到index的JS页面添加数据
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
