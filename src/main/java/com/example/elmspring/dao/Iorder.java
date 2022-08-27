package com.example.elmspring.dao;

import com.example.elmspring.dto.BusinessFood;
import com.example.elmspring.model.order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Iorder {
 public void saveOrder(order order);
 public List<BusinessFood> selOrder(String userId);
 public void removeOrder(String userId);
}
