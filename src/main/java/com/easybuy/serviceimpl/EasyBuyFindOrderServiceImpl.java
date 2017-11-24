package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyOrder;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

public class EasyBuyFindOrderServiceImpl implements EasyBuyFindAllService<EasyBuyOrder> {
    EasyBuyFindAllDao<EasyBuyOrder> EBPCD=   EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyFindOrderDaoImpl");

    public List<EasyBuyOrder> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyOrder findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyOrder> findByUserId(Integer id) {
        return EBPCD.findByUserId(id);
    }

    public Integer add(EasyBuyOrder easyBuyOrder) {
        return EBPCD.add(easyBuyOrder);
    }

    public EasyBuyOrder login(String name, String pwd) {
        return null;
    }


    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }
}

