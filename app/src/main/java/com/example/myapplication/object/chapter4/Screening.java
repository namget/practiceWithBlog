package com.example.myapplication.object.chapter4;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreend;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public LocalDateTime getWhenScreend() {
        return whenScreend;
    }

    public void setWhenScreend(LocalDateTime whenScreend) {
        this.whenScreend = whenScreend;
    }
}
