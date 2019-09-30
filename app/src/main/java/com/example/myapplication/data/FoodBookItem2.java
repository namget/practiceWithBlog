package com.example.myapplication.data;


public class FoodBookItem2 {

    // 판매 예정일
    String dueDate;
    // 판매 반찬
    String saleFood;
    // 판매 시간
    String saleTime;
    // 판매 수량
    String saleQty;
    // 금액
    String price;
    // 수령시간
    String receiveTime;

    // 예약여부
    boolean isReservationed;



    int orderRemain;
    int orderLimit;
    public String stDate;
    public String stTime;
    public String endDate;
    public String endTime;

    public FoodBookItem2() {
        this(null, null, null, null, null, null, false, 0, 0);
    }

    public FoodBookItem2(String dueDate, String saleFood, String saleTime, String saleQty, String price, String receiveTime, boolean isReservationed, int orderRemain, int orderLimit) {
        this.dueDate = dueDate;
        this.saleFood = saleFood;
        this.saleTime = saleTime;
        this.saleQty = saleQty;
        this.price = price;
        this.receiveTime = receiveTime;
        this.isReservationed = isReservationed;
        this.orderRemain = orderRemain;
    }

    public FoodBookItem2(String dueDate, String saleFood, String saleTime, String saleQty, String price, String receiveTime, boolean isReservationed, int orderRemain, String stDate, String stTime, String endDate, String endTime) {
        this.dueDate = dueDate;
        this.saleFood = saleFood;
        this.saleTime = saleTime;
        this.saleQty = saleQty;
        this.price = price;
        this.receiveTime = receiveTime;
        this.isReservationed = isReservationed;
        this.orderRemain = orderRemain;
        this.stDate = stDate;
        this.stTime = stTime;
        this.endDate = endDate;
        this.endTime = endTime;
    }

    public int getOrderRemain() {
        return orderRemain;
    }

    public void setOrderRemain(int orderRemain) {
        this.orderRemain = orderRemain;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getSaleFood() {
        return saleFood;
    }

    public void setSaleFood(String saleFood) {
        this.saleFood = saleFood;
    }

    public String getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(String saleTime) {
        this.saleTime = saleTime;
    }

    public String getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(String saleQty) {
        this.saleQty = saleQty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public boolean isReservationed() {
        return isReservationed;
    }

    public void setReservationed(boolean reservationed) {
        isReservationed = reservationed;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getStTime() {
        return stTime;
    }

    public void setStTime(String stTime) {
        this.stTime = stTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(int orderLimit) {
        this.orderLimit = orderLimit;
    }

    @Override
    public String toString() {
        return "FoodBookItem2{" +
                "dueDate='" + dueDate + '\'' +
                ", saleFood='" + saleFood + '\'' +
                ", saleTime='" + saleTime + '\'' +
                ", saleQty='" + saleQty + '\'' +
                ", price='" + price + '\'' +
                ", receiveTime='" + receiveTime + '\'' +
                ", isReservationed=" + isReservationed +
                '}';
    }
}