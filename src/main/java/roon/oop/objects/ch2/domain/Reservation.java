package roon.oop.objects.ch2.domain;

import lombok.ToString;
import roon.oop.objects.ch2.infra.IdGenerator;

import java.time.ZonedDateTime;

@ToString
public class Reservation {
    private String reservationId;
    private Screening screening;
    private int audienceCount;
    private String customerId;

    // private Money totalFee; // customer의 예약 정보로 계산할 수 있어서 필요없는 필드일듯

    private ZonedDateTime createdAt;
    private ZonedDateTime modifiedAt;

    public Reservation(Screening screening, int audienceCount, String customerId) {
        this.reservationId = IdGenerator.newOne();
        this.screening = screening;
        this.audienceCount = audienceCount;
        this.customerId = customerId;

        var now = ZonedDateTime.now();
        this.createdAt = now;
        this.modifiedAt = now;
    }

    public Money getTotalFee() {
        return Money.of(screening.getMovieFee().multiply(this.audienceCount));
    }
}
