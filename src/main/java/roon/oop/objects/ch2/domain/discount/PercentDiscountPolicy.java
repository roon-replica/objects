package roon.oop.objects.ch2.domain.discount;

import roon.oop.objects.ch2.domain.Money;
import roon.oop.objects.ch2.domain.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getOriginalMovieFee().multiply(percent);
    }
}
