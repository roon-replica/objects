package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Long buy(Ticket ticket){
        if (wallet.hasInvitation()) {
            wallet.setTicket(ticket);
            return 0L;
        } else {
            var price = ticket.getPrice();
            wallet.minusCash(price);
            wallet.setTicket(ticket);
            return price;
        }
    }
}
