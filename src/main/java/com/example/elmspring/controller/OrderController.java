package com.example.elmspring.controller;

import com.example.elmspring.dao.Iorder;
import com.example.elmspring.dto.BusinessFood;
import com.example.elmspring.dto.BusinessInfo;
import com.example.elmspring.model.Business;
import com.example.elmspring.service.IBusService;
import com.example.elmspring.service.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    Iorder iorder;
    @Autowired
    IBusService iBusService;
    @Autowired
    IorderService iorderService;
    @RequestMapping("/Order")
    public BusinessInfo Order(String userId,String bid){
        double ALLprice=0;
        BusinessInfo bi=new BusinessInfo();
        Business business=iBusService.selBusById(Long.parseLong(bid));
        List<BusinessFood> businessFoods=iorder.selOrder(userId);
        for (BusinessFood ds : businessFoods){
            ds.settPrice(ds.getPrice()* ds.getNum());
            ALLprice=ALLprice+ds.getPrice()* ds.getNum();
        }
        bi.setId( business.getId() );
        bi.setName( business.getName() );
        bi.setImg( business.getImg() );
        bi.setStartPrice( business.getStartPrice() );
        bi.setDeliveryPrice( business.getDeliveryPrice() );
        bi.setFds( businessFoods );
        bi.setALLprice(ALLprice+ bi.getDeliveryPrice());
        bi.setFoodnumdisplay("display:none");
        bi.setIofoallprice(0);
        return bi;
    }
}
