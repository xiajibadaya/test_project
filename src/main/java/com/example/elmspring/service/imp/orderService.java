package com.example.elmspring.service.imp;

import com.example.elmspring.dao.Iorder;
import com.example.elmspring.dto.BusinessFood;
import com.example.elmspring.model.order;
import com.example.elmspring.service.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderService implements IorderService {
    @Autowired
    Iorder iorder;
    @Override
    public void saveOrder(order order){
        iorder.saveOrder(order);
    }
    @Override
    public List<BusinessFood> selOrder(String userId){
        return iorder.selOrder(userId);
    };
    @Override
    public void removeOrder(String userId) {
        iorder.removeOrder(userId);
    }
}
