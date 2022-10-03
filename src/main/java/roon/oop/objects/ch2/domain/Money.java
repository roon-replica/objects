package roon.oop.objects.ch2.domain;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
// value type.
public class Money {
    private BigDecimal amount;

    public static final Money ZERO = Money.of(BigDecimal.ZERO);

    public Money(long amount) {
        this.amount = new BigDecimal(amount);
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money multiply(double count) {
        return Money.of(amount.multiply(BigDecimal.valueOf(count)));
    }

    public static Money of(BigDecimal amount) {
        return new Money(amount);
    }

    public Money subtract(Money amount) {
        return Money.of(this.amount.subtract(amount.amount));
    }
}
