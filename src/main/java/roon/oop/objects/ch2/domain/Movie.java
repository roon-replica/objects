package roon.oop.objects.ch2.domain;

import lombok.Getter;
import lombok.ToString;
import roon.oop.objects.ch2.domain.discount.DiscountPolicy;
import roon.oop.objects.ch2.infra.IdGenerator;

@ToString
@Getter
public class Movie {
    private String movieId;

    private String movieName;
    private Duration runningMinutes;
    private Money fee;
    private DiscountPolicy discountPolicy;

    private Movie(String movieName, Duration runningMinutes, Money fee, DiscountPolicy discountPolicy) {
        this.movieId = IdGenerator.newOne();
        this.movieName = movieName;
        this.runningMinutes = runningMinutes;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public static Movie newOne(String movieName, Duration runningMinutes, Money fee, DiscountPolicy discountPolicy) {
        return new Movie(movieName, runningMinutes, fee, discountPolicy);
    }

    public Money calculateMovieFee(Screening screening) {
        // return fee.subtract(screening.getOriginalMovieFee());
        return fee.subtract(discountPolicy.calculateDiscountAmount(screening));
    }
}
