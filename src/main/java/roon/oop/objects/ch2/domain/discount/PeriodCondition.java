package roon.oop.objects.ch2.domain.discount;

import roon.oop.objects.ch2.domain.Screening;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;

public class PeriodCondition implements DiscountCondition {
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private DayOfWeek dayOfWeek;

    public PeriodCondition(ZonedDateTime startAt, ZonedDateTime endAt, DayOfWeek dayOfWeek) {
        this.startAt = startAt;
        this.endAt = endAt;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        var screenStartAt = screening.getStartAt();
        return screenStartAt.getDayOfWeek().equals(dayOfWeek) &&
                startAt.isBefore(screenStartAt) &&
                endAt.isAfter(screenStartAt);
    }
}
