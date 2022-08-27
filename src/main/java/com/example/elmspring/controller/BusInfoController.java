package com.example.elmspring.controller;

import com.example.elmspring.dao.IBussinessDao;
import com.example.elmspring.dto.BusinessFood;
import com.example.elmspring.dto.BusinessInfo;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.Food;
import com.example.elmspring.model.order;
import com.example.elmspring.service.IBusService;
import com.example.elmspring.service.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BusInfoController {
    @Autowired
    IBusService busService;
    @Autowired
    IorderService orderService;
    @RequestMapping("/businessListInfo")
    public BusinessInfo businessListInfo(HttpServletRequest request){
        String Id=request.getParameter("id");
        Business bs=busService.selBusById(Long.parseLong(Id));
        BusinessInfo bi=new BusinessInfo();
        List<BusinessFood> bfs=new ArrayList<BusinessFood>();
        List<Food> fds=bs.getFds();
        for(Food fd:fds){
            BusinessFood bf = new BusinessFood();
            bf.setId( fd.getId() );
            bf.setName( fd.getName() );
            bf.setImg( fd.getImg() );
            bf.setExplain( fd.getExplain() );
            bf.setPrice( fd.getPrice() );
            bf.setNum(0L);
            bf.setDisplay("display:none");
            bfs.add(bf);
        }

        bi.setFds( bfs );
        bi.setId( bs.getId() );
        bi.setName( bs.getName() );
        bi.setImg( bs.getImg() );
        bi.setStartPrice( bs.getStartPrice() );
        bi.setDeliveryPrice( bs.getDeliveryPrice() );
        bi.setFoodnum(0);

        return bi;

    }
    @RequestMapping("/SaveOrder")
    public String SaveOrder(@RequestBody BusinessInfo bi){
       List<BusinessFood> Lis=bi.getFds();
        for(BusinessFood fd:Lis ){
            Long num = fd.getNum();
            if(num != 0) {
                order order = new order();
                order.setFoodId(fd.getId());
                order.setQuantity(num);
                order.setUserId(bi.getUserId());
              orderService.saveOrder(order);
            }
        }
        return null;
    }
}
