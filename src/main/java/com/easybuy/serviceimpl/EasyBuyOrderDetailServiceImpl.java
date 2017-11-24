package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyOrderDetail;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

public class EasyBuyOrderDetailServiceImpl implements  EasyBuyFindAllService<EasyBuyOrderDetail> {
    EasyBuyFindAllDao<EasyBuyOrderDetail> EBPCD=   EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyOrderDetailDaoImpl");

    public List<EasyBuyOrderDetail> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyOrderDetail findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyOrderDetail> findByUserId(Integer id) {
        return null;
    }

    public Integer add(EasyBuyOrderDetail easyBuyOrderDetail) {
        return EBPCD.add(easyBuyOrderDetail);
    }

    public EasyBuyOrderDetail login(String name, String pwd) {
        return null;
    }


    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }
}
