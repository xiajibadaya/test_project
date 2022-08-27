package com.example.elmspring.model;

import java.util.List;

public class Business {
    private long Id;
    private String Name;
    private String Img;
    private double startPrice;
    private double deliveryPrice;
    private List<Food> fds;

    @Override
    public String toString() {
        return "Business{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Img='" + Img + '\'' +
                ", startPrice=" + startPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", fds=" + fds +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }



    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public List<Food> getFds() {
        return fds;
    }

    public void setFds(List<Food> fds) {
        this.fds = fds;
    }
}
