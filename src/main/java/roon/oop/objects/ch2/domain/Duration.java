package roon.oop.objects.ch2.domain;

public class Duration {
    private int amount;
    private String unit;

    private Duration(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public static Duration of(int amount, String unit) {
        return new Duration(amount, unit);
    }
}
