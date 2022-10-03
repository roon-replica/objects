package roon.oop.objects.ch2.domain;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
// value type.
public class Money {
    private BigDecimal amount;

    public Money(long amount) {
        this.amount = new BigDecimal(amount);
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal multiply(int count) {
        return amount.multiply(BigDecimal.valueOf(count));
    }

    public static Money of(BigDecimal amount) {
        return new Money(amount);
    }
}
