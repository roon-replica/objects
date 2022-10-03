package roon.oop.objects.ch2.domain;

import lombok.Getter;
import lombok.ToString;
import roon.oop.objects.ch2.infra.IdGenerator;

import java.time.ZonedDateTime;

@ToString
@Getter
public class Screening {
    private String screeningId;

    private Movie movie;
    private int sequence;
    private ZonedDateTime startAt;

    public Screening(Movie movie, int sequence, ZonedDateTime startAt) {
        this.screeningId = IdGenerator.newOne();
        this.movie = movie;
        this.sequence = sequence;
        this.startAt = startAt;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        var reservation = new Reservation(this, audienceCount, customer.getCustomerId());
        customer.addReservation(reservation);

        return reservation;
    }

}
