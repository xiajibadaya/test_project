package com.example.elmspring.dto;
import com.example.elmspring.model.*;
import java.util.List;

public class IndexDto {
    List<Business> bus;
    List<BusinessType> fts;

    public List<Business> getBus() {
        return bus;
    }

    public void setBus(List<Business> bus) {
        this.bus = bus;
    }

    public List<BusinessType> getFts() {
        return fts;
    }

    public void setFts(List<BusinessType> fts) {
        this.fts = fts;
    }
}
