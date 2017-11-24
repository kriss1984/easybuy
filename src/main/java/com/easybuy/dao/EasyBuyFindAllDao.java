package com.easybuy.dao;

import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUser;
import sun.security.provider.MD5;

import java.util.List;

public interface EasyBuyFindAllDao<T> {
    List<T> findAll();
    T findById(Integer id);
    List<T> findByUserId(Integer id);
    Integer add(T t);

    T findByNameAndPwd(String name,String pwd);
    public List<EasyBuyProduct> findOne(Integer id);
}
