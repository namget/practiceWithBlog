package com.example.myapplication.data;

import java.util.List;

public class FoodBookItem {

    // 판매 예정일
    private String dueDate;
    // 판매 반찬
    private List<String> saleFoodList;
    // 판매 시간
    private String saleTime;
    // 판매 수량 글자
    private String saleQtyStr;
    // 판매 수량
    private int saleQtyInt;
    // 금액
    private String price;
    // 각각의 금액 리스트
    private List<String> priceList;
    // 수령시간
    private String receiveTime;
    // 예약여부
    boolean isReservationed = false;
    private String orderRemain;
    private List<Integer> orderRemainList;
    private int orderLimit = 0;
    private String stDate;
    private String stTime;
    private String endDate;
    private String endTime;

    private FoodBookItem(Builder builder) {
        dueDate = builder.dueDate;
        saleFoodList = builder.saleFoodList;
        saleTime = builder.saleTime;
        saleQtyStr = builder.saleQtyStr;
        saleQtyInt = builder.saleQtyInt;
        price = builder.price;
        priceList = builder.priceList;
        receiveTime = builder.receiveTime;
        isReservationed = builder.isReservationed;
        orderRemain = builder.orderRemain;
        orderRemainList = builder.orderRemainList;
        orderLimit = builder.orderLimit;
        stDate = builder.stDate;
        stTime = builder.stTime;
        endDate = builder.endDate;
        endTime = builder.endTime;
    }

    public String getDueDate() {
        return dueDate;
    }

    public List<String> getSaleFoodList() {
        return saleFoodList;
    }

    public String getSaleTime() {
        return saleTime;
    }

    public String getSaleQtyStr() {
        return saleQtyStr;
    }

    public String getPrice() {
        return price;
    }

    public List<String> getPriceList() {
        return priceList;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public boolean isReservationed() {
        return isReservationed;
    }

    public String getOrderRemain() {
        return orderRemain;
    }

    public List<Integer> getOrderRemainList() {
        return orderRemainList;
    }

    public int getSaleQtyInt() {
        return saleQtyInt;
    }

    public int getOrderLimit() {
        return orderLimit;
    }

    public String getStDate() {
        return stDate;
    }

    public String getStTime() {
        return stTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public static class Builder {
        // 판매 예정일
        private String dueDate = null;
        // 판매 반찬
        private List<String> saleFoodList = null;
        // 판매 시간
        private String saleTime = null;
        // 판매 수량
        private String saleQtyStr = null;
        // 판매 수량
        private int saleQtyInt;

        // 금액
        private String price = null;
        // 각각의 금액 리스트
        private List<String> priceList = null;
        // 수령시간
        private String receiveTime = null;
        // 예약여부
        boolean isReservationed = false;
        private String orderRemain = null;
        private List<Integer> orderRemainList; //각각의 반찬의 남아있는 수량
        private int orderLimit = 0;
        private String stDate;
        private String stTime;
        private String endDate;
        private String endTime;


        public Builder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder setSaleFoodList(List<String> saleFoodList) {
            this.saleFoodList = saleFoodList;
            return this;
        }

        public Builder setSaleTime(String saleTime) {
            this.saleTime = saleTime;
            return this;
        }

        public Builder setSaleQtyStr(String saleQtyStr) {
            this.saleQtyStr = saleQtyStr;
            return this;
        }

        public Builder setSaleQtyInt(int saleQtyInt) {
            this.saleQtyInt = saleQtyInt;
            return this;
        }


        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setPriceList(List<String> priceList) {
            this.priceList = priceList;
            return this;
        }

        public Builder setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }

        public Builder setReservationed(boolean isReservationed) {
            this.isReservationed = isReservationed;
            return this;
        }

        public Builder setOrderRemain(String orderRemain) {
            this.orderRemain = orderRemain;
            return this;
        }

        public Builder setOrderRemainList(List<Integer> orderRemainList) {
            this.orderRemainList = orderRemainList;
            return this;
        }


        public Builder setOrderLimit(int orderLimit) {
            this.orderLimit = orderLimit;
            return this;
        }

        public Builder setStDate(String stDate) {
            this.stDate = stDate;
            return this;
        }

        public Builder setStTime(String stTime) {
            this.stTime = stTime;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public FoodBookItem build() {
            return new FoodBookItem(this);
        }
    }
}
