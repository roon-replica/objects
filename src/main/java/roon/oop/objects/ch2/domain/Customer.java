package roon.oop.objects.ch2.domain;

import lombok.Getter;
import roon.oop.objects.ch2.infra.IdGenerator;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {
    private String customerId;
    private List<Reservation> reservations = new ArrayList<>();

    public Customer() {
        this.customerId = IdGenerator.newOne();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
