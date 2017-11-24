package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

public class EasyBuyProductCategoryServiceImpl implements EasyBuyFindAllService<EasyBuyProductCategory> {
    EasyBuyFindAllDao<EasyBuyProductCategory> EBPCD=   EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyFindProductCategoryDaoImpl");

    public List<EasyBuyProductCategory> findAll(){
        return  EBPCD.findAll();
    }

    public EasyBuyProductCategory findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyProductCategory> findByUserId(Integer id) {
        return null;
    }

    public Integer add(EasyBuyProductCategory easyBuyProductCategory) {
        return EBPCD.add(easyBuyProductCategory);
    }

    public EasyBuyProductCategory login(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }

}
