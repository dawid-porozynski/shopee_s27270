package com.example.demo;

public class Order {
    private StatusType statusType;
    public Order(StatusType statusType){
        this.statusType=statusType;
    }
    public Order(){

    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }
}
