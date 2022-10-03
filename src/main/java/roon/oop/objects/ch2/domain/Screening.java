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

    public Money getOriginalMovieFee() {
        return movie.getFee();
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).multiply(audienceCount);
    }

    public Reservation reserve(Customer customer, int audienceCount) {  // 예매가 여기 있는게 맞나?
        var reservation = new Reservation(this, audienceCount, customer.getCustomerId());
        customer.addReservation(reservation);

        return reservation;
    }

}
