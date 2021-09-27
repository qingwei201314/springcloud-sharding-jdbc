package com.kevin.entity;

/**
 *  t_order表和实体类
 *  @Author: Kevin Zhang @Date: 2021-9-26 16:14
**/
public class Order {
    private Long orderId;
    private Integer userId;
    private String status;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
