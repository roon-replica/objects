package roon.oop.objects.ch2.domain;

import roon.oop.objects.ch2.domain.discount.PercentDiscountPolicy;
import roon.oop.objects.ch2.domain.discount.SequenceCondition;
import roon.oop.objects.ch2.infra.Storage;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        var customer = Customer.newOne();
        var movie = Movie.newOne("sample movie name", Duration.of(120, "minute"), new Money(10000),
                new PercentDiscountPolicy(0.5, new SequenceCondition(1), new SequenceCondition(2))
        );
        var screening1 = getSampleScreening(movie);
        screening1.reserve(customer, 2);

        var screening2 = getSampleScreening(movie);
        screening2.reserve(customer, 4);

        Storage.putCustomer(customer.getCustomerId(), customer);
        Storage.putMovie(movie.getMovieId(), movie);
        Storage.putScreening(screening1.getScreeningId(), screening1);
        Storage.putScreening(screening2.getScreeningId(), screening2);

        System.out.println(screening1.calculateFee(2));
        System.out.println(screening2.calculateFee(4));
    }

    private static Screening getSampleScreening(Movie movie) {
        var localDateTime = LocalDateTime.of(2022, 10, 3, 22, 00);
        var zoneId = ZoneId.of("Asia/Seoul");
        return new Screening(movie, 1, ZonedDateTime.of(localDateTime, zoneId));
    }

}
