package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUserAddress;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/20.
 */
public class EasyBuyUserAddressServiceImpl implements EasyBuyFindAllService<EasyBuyUserAddress> {
    EasyBuyFindAllDao<EasyBuyUserAddress> EBPCD=EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyUserAddressImpl");
    public List<EasyBuyUserAddress> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyUserAddress findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyUserAddress> findByUserId(Integer id) {
        return EBPCD.findByUserId(id);
    }

    public Integer add(EasyBuyUserAddress easyBuyUserAddress) {
        return EBPCD.add(easyBuyUserAddress);
    }

    public EasyBuyUserAddress login(String name, String pwd) {
        return null;
    }


    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }
}
