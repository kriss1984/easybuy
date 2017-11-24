package com.easybuy.web.formbean;

import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.servicefactory.EasyBuyFindAllServiceFactory;
import com.easybuy.serviceimpl.EasyBuyFindProductServiceImpl;
import com.easybuy.serviceimpl.EasyBuyNewsServiceImpl;
import com.easybuy.serviceimpl.EasyBuyProductCategoryServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/20.
 */
public class IndexSevrletEntiy {
    private EasyBuyProductCategoryServiceImpl easyBuyProductCategoryService = new EasyBuyProductCategoryServiceImpl();//实列化工具类
    private EasyBuyNewsServiceImpl easyBuyNewsServiceImpl=new EasyBuyNewsServiceImpl();//新闻资讯
    private EasyBuyFindProductServiceImpl easyBuyFindProductService=new EasyBuyFindProductServiceImpl();// 查询推荐商品
    private List<EasyBuyProductCategory> listCategory = easyBuyProductCategoryService.findAll();//查询所有数据
    private List<String> listOne=new ArrayList<String>();//一级菜单
    private List<String> listTwo=new ArrayList<String>();//二级菜单
    private List<String> listThree=new ArrayList<String>();//三级菜单
    private List<EasyBuyNews> listNews=easyBuyNewsServiceImpl.findAll();//查询新闻资讯
    private List<EasyBuyProduct> listProduct=easyBuyFindProductService.findAll();//商品信息
    private List<String> twoNameCategory=new ArrayList<String>();//获取二级菜单名字
    private List<String> twoProductId=new ArrayList<String>();//获取二级菜单Product编号
    private String loginName="请登录";

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public List<String> getTwoProductId() {
        return twoProductId;
    }

    public void setTwoProductId(List<String> twoProductId) {
        this.twoProductId = twoProductId;
    }

    public List<String> getTwoNameCategory() {
        return twoNameCategory;
    }

    public void setTwoNameCategory(List<String> twoNameCategory) {
        this.twoNameCategory = twoNameCategory;
    }

    public EasyBuyFindProductServiceImpl getEasyBuyFindProductService() {
        return easyBuyFindProductService;
    }

    public void setEasyBuyFindProductService(EasyBuyFindProductServiceImpl easyBuyFindProductService) {
        this.easyBuyFindProductService = easyBuyFindProductService;
    }

    public List<EasyBuyProduct> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<EasyBuyProduct> listProduct) {
        this.listProduct = listProduct;
    }

    public IndexSevrletEntiy() {
    }

    public EasyBuyNewsServiceImpl getEasyBuyNewsServiceImpl() {
        return easyBuyNewsServiceImpl;
    }

    public void setEasyBuyNewsServiceImpl(EasyBuyNewsServiceImpl easyBuyNewsServiceImpl) {
        this.easyBuyNewsServiceImpl = easyBuyNewsServiceImpl;
    }

    public List<EasyBuyNews> getListNews() {
        return listNews;
    }

    public void setListNews(List<EasyBuyNews> listNews) {
        this.listNews = listNews;
    }

    public List<String> getListOne() {
        return listOne;
    }

    public void setListOne(List<String> listOne) {
        this.listOne = listOne;
    }

    public List<String> getListTwo() {
        return listTwo;
    }

    public void setListTwo(List<String> listTwo) {
        this.listTwo = listTwo;
    }

    public List<String> getListThree() {
        return listThree;
    }

    public void setListThree(List<String> listThree) {
        this.listThree = listThree;
    }

    public EasyBuyProductCategoryServiceImpl getEasyBuyProductCategoryService() {
        return easyBuyProductCategoryService;
    }

    public void setEasyBuyProductCategoryService(EasyBuyProductCategoryServiceImpl easyBuyProductCategoryService) {
        this.easyBuyProductCategoryService = easyBuyProductCategoryService;
    }

    public List<EasyBuyProductCategory> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<EasyBuyProductCategory> listCategory) {
        this.listCategory = listCategory;
    }
}
