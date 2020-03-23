package com.example.myapplication.object.chapter2;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreend;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreend) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreend = whenScreend;
    }

    // reserve는 Reservation의 인스턴스
    // audienceCount는 인원수
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(cusomer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calcuateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public Movie getMovie() {
        return movie;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }


}
