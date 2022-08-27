package com.example.elmspring.controller;

import com.example.elmspring.model.Business;
import com.example.elmspring.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class BusListController {
    @Autowired
    IBusService busService;
    @RequestMapping("/busList")
    public List<Business> businessList(HttpServletRequest request){
        String Id=request.getParameter("id");

        return busService.selAllBusByTypeId(Long.parseLong(Id));
    }
}
