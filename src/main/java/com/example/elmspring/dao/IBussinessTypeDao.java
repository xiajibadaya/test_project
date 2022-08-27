package com.example.elmspring.dao;
import com.example.elmspring.model.BusinessType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface IBussinessTypeDao {
        public List<BusinessType> selAllBusType();
    }

