package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyOrder;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

public class EasyBuyFindProductServiceImpl implements EasyBuyFindAllService<EasyBuyProduct>  {
    EasyBuyFindAllDao<EasyBuyProduct> EBPCD=   EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyFindProductDaoImpl");

    public List<EasyBuyProduct> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyProduct findById(Integer id) {
        return EBPCD.findById(id);
    }
    public List<EasyBuyProduct> findByUserId(Integer id) {
        return EBPCD.findByUserId(id);
    }

    public Integer add(EasyBuyProduct easyBuyProduct) {
        return EBPCD.add(easyBuyProduct);
    }

    public EasyBuyProduct login(String name, String pwd) {
        return null;
    }


    public List<EasyBuyProduct> findOne(Integer id) {
        return EBPCD.findOne(id);
    }
}
