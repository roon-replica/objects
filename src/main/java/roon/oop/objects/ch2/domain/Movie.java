package roon.oop.objects.ch2.domain;

import lombok.Getter;
import lombok.ToString;
import roon.oop.objects.ch2.infra.IdGenerator;

@ToString
@Getter
public class Movie {
    private String movieId;

    private String movieName;
    private int runningMinutes;
    private Money fee;

    public Movie(String movieName, int runningMinutes, Money fee) {
        this.movieId = IdGenerator.newOne();
        this.movieName = movieName;
        this.runningMinutes = runningMinutes;
        this.fee = fee;
    }



}
