package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.service.EasyBuyFindAllService;
import com.easybuy.utils.MD5;

import java.util.List;

public class EasyBuyUserServiceImpl implements EasyBuyFindAllService<EasyBuyUser> {
    EasyBuyFindAllDao<EasyBuyUser> EBPCD= EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyUserDaoImpl");

    public List<EasyBuyUser> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyUser findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyUser> findByUserId(Integer id) {
        return null;
    }

    public Integer add(EasyBuyUser easyBuyUser) {


            String str= MD5.getInstance().getMD5(easyBuyUser.getPassword());
                easyBuyUser.setPassword(str);


        return EBPCD.add(easyBuyUser);
    }

    public EasyBuyUser login(String name, String pwd) {

        return EBPCD.findByNameAndPwd(name,MD5.getInstance().getMD5(pwd));
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }
}
