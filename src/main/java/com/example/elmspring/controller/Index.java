package com.example.elmspring.controller;
import com.example.elmspring.dto.IndexDto;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;
import com.example.elmspring.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class Index {
    @Autowired
    IIndexService indexService;
    @GetMapping("/Index")
    public IndexDto Index(){
        List<Business> bus=indexService.selAllBus();
        List<BusinessType> fts=indexService.selAllBusType();
        IndexDto indexDto=new IndexDto();
        indexDto.setBus(bus);
        indexDto.setFts(fts);
        return indexDto;
    }
    @GetMapping("/selAllBusType")
    @ResponseBody
    public List<BusinessType> selAllBusType(){
        return indexService.selAllBusType();
    }
    @GetMapping("/selAllBus")
    @ResponseBody
    public List<Business> selAllBus(){
        return indexService.selAllBus();
    }
}