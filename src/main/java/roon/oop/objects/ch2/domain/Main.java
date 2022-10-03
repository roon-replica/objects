package roon.oop.objects.ch2.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer();
        var movie = new Movie("sample movie name", Duration.of(120, "minute"), new Money(10000));
        var screening = getSampleScreening(movie);

        customer.addReservation(
                new Reservation(screening, 2, customer.getCustomerId())
        );

        var reservation1 = customer.getReservations().get(0);
        System.out.println(reservation1);
        System.out.println(reservation1.getTotalFee());
    }

    private static Screening getSampleScreening(Movie movie) {
        var localDateTime = LocalDateTime.of(2022, 10, 3, 22, 00);
        var zoneId = ZoneId.of("Asia/Seoul");
        return new Screening(movie, 1, ZonedDateTime.of(localDateTime, zoneId));
    }
}
