package com.easybuy.servicefactory;

import com.easybuy.service.EasyBuyFindAllService;

public class EasyBuyFindAllServiceFactory {
    public  static EasyBuyFindAllService getEasyBuyFindAllServiceImplInstance(String instanceType){
        EasyBuyFindAllService ebpcd=null;

        try {
            ebpcd= ((EasyBuyFindAllService) Class.forName(instanceType).newInstance());
        } catch (Exception e){
            e.printStackTrace();
        }
        return ebpcd;
    }
}
