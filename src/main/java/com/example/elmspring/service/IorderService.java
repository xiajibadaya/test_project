package com.example.elmspring.service;

import com.example.elmspring.dto.BusinessFood;
import com.example.elmspring.model.order;

import java.util.List;

public interface IorderService {
    public void saveOrder(order order);
    public List<BusinessFood> selOrder(String userId);
    public void removeOrder(String userId);
}
