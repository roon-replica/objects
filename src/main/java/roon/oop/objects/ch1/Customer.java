package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    // Customer도 로직을 스스로 처리하도록 캡슐화
    public Long buy(Ticket ticket){
        // wallet도 자율적인 존재로 개선.
        return wallet.keep(ticket);
    }
}
