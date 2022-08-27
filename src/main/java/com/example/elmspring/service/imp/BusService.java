package com.example.elmspring.service.imp;

import com.example.elmspring.dao.IBussinessDao;
import com.example.elmspring.model.Business;
import com.example.elmspring.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service

public class BusService implements IBusService {

    @Autowired
   IBussinessDao iBussinessDao;

    @Override
    public List<Business> selAllBusByTypeId(long typeId){
     return  iBussinessDao.selAllBusByTypeId(typeId);

   }
    @Override
    public Business selBusById(long Id){
        return iBussinessDao.selBusById(Id);
    }
}
