package com.example.elmspring.service.imp;

import com.example.elmspring.dao.IBussinessDao;
import com.example.elmspring.dao.IBussinessTypeDao;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;
import com.example.elmspring.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService implements IIndexService {
    @Autowired
    IBussinessTypeDao bussinessTypeDao;
    @Autowired
    IBussinessDao bussinessDao;

    @Override
    public List<BusinessType> selAllBusType() {

        return bussinessTypeDao.selAllBusType();
    }
    @Override
    public List<Business> selAllBus() {

        return bussinessDao.selAllBus();
    }

}
