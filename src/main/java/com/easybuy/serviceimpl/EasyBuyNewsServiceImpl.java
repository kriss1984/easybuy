package com.easybuy.serviceimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.daofactory.EasyBuyFindAllDaoFactory;
import com.easybuy.entiy.EasyBuyNews;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.service.EasyBuyFindAllService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/20.
 */
public class EasyBuyNewsServiceImpl implements EasyBuyFindAllService<EasyBuyNews> {
    /**
     * EasyBuyNews查询数据信息
     */
    EasyBuyFindAllDao<EasyBuyNews> EBPCD= EasyBuyFindAllDaoFactory.getEasyBuyFindAllDaoImplInstance("com.easybuy.daoimpl.EasyBuyNewsImpl");



    public List<EasyBuyNews> findAll() {
        return EBPCD.findAll();
    }

    public EasyBuyNews findById(Integer id) {
        return EBPCD.findById(id);
    }

    public List<EasyBuyNews> findByUserId(Integer id) {
        return EBPCD.findByUserId(id);
    }

    public Integer add(EasyBuyNews easyBuyNews) {
        return EBPCD.add(easyBuyNews);
    }

    public EasyBuyNews login(String name, String pwd) {
        return null;
    }


    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }

}
