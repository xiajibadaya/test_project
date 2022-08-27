package com.example.elmspring.model;

public class order {
    private Long orderId;
    private Long foodId;
    private Long quantity;
    private String userId;

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", foodId=" + foodId +
                ", quantity=" + quantity +
                ", userId='" + userId + '\'' +
                '}';
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
