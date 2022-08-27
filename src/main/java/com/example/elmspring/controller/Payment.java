package com.example.elmspring.controller;

import com.example.elmspring.dao.Iorder;
import com.example.elmspring.service.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment {
@Autowired
    IorderService iorderService;
@Autowired
    Iorder iorder;
    @RequestMapping("/pay")
    public String pay(String userId){
        System.out.println(userId);
        iorder.removeOrder(userId);
//        iorderService.removeOrder(userId);
        return "ok";
    }
}
