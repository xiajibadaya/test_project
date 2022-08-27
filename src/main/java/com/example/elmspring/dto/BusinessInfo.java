package com.example.elmspring.dto;

import com.example.elmspring.model.Food;

import java.util.List;

public class BusinessInfo {
    private long Id;
    private String Name;
    private String Img;
    private double startPrice;
    private double deliveryPrice;
    private List<BusinessFood> fds;
    private String userId;
    private double ALLprice;
    private int Foodnum;
    private String Foodnumdisplay;
    private double iofoallprice;

    public String getFoodnumdisplay() {
        return Foodnumdisplay;
    }

    public void setFoodnumdisplay(String foodnumdisplay) {
        Foodnumdisplay = foodnumdisplay;
    }

    public double getIofoallprice() {
        return iofoallprice;
    }

    public void setIofoallprice(double iofoallprice) {
        this.iofoallprice = iofoallprice;
    }

    public int getFoodnum() {
        return Foodnum;
    }

    public void setFoodnum(int foodnum) {
        Foodnum = foodnum;
    }

    public double getALLprice() {
        return ALLprice;
    }

    public void setALLprice(double ALLprice) {
        this.ALLprice = ALLprice;
    }

    @Override
    public String toString() {
        return "BusinessInfo{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Img='" + Img + '\'' +
                ", startPrice=" + startPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", fds=" + fds +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public List<BusinessFood> getFds() {
        return fds;
    }

    public void setFds(List<BusinessFood> fds) {
        this.fds = fds;
    }
}
