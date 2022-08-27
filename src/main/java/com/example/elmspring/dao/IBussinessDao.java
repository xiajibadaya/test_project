package com.example.elmspring.dao;

import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBussinessDao {


        public List<Business> selAllBus();
        public List<Business> selAllBusByTypeId(long typeId);
        public Business selBusById(long Id);


}
