package com.easybuy.daofactory;


import com.easybuy.dao.EasyBuyFindAllDao;

public class EasyBuyFindAllDaoFactory {
    public  static EasyBuyFindAllDao getEasyBuyFindAllDaoImplInstance(String instanceType){
        EasyBuyFindAllDao ebpcd=null;

        try {
          ebpcd= ((EasyBuyFindAllDao) Class.forName(instanceType).newInstance());
        } catch (Exception e){
            e.printStackTrace();
        }
        return ebpcd;
    }

}
