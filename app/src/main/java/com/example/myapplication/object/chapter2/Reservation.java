package com.example.myapplication.object.chapter2;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audientCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audientCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audientCount = audientCount;
    }
}
