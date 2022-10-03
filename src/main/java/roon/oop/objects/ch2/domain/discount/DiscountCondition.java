package roon.oop.objects.ch2.domain.discount;

import roon.oop.objects.ch2.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
