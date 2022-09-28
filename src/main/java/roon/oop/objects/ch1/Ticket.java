package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class Ticket {
    private Long price;

    public Ticket(Long price){
        this.price = price;
    }
}
