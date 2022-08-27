package com.example.elmspring.service;

import com.example.elmspring.model.Business;

import java.util.List;

public interface IBusService {
    public List<Business> selAllBusByTypeId(long typeId);
    public Business selBusById(long Id);
}
