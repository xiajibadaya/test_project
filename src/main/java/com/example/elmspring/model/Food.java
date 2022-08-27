package com.example.elmspring.model;

public class Food {
    public Long id;
    public String name;
    public String explain;
    public String img;
    public double price;
    public Business business;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExplain() {
        return explain;
    }

    public String getImg() {
        return img;
    }

    public double getPrice() {
        return price;
    }

    public Business getBusiness() {
        return business;
    }
}
