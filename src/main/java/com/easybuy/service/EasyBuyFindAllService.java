package com.easybuy.service;

import com.easybuy.entiy.EasyBuyProduct;

import java.util.List;

public interface EasyBuyFindAllService<T> {
    List<T> findAll();
    T findById(Integer id);
    List<T> findByUserId(Integer id);
    Integer add(T t);
    T login(String name,String pwd);
    public List<EasyBuyProduct> findOne(Integer id);

}
