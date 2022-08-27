package com.example.elmspring.service;

import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;

import java.util.List;

public interface IIndexService {
    public List<BusinessType> selAllBusType();
    public List<Business> selAllBus();
}
