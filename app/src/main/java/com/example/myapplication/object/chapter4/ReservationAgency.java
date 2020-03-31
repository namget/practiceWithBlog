package com.example.myapplication.object.chapter4;

import com.example.myapplication.object.chapter2.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();
        ...

        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    break;
                case PERCENT_DISCOUNT:
                    break;
                    ...
            }
        }
    }
}
