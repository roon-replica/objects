package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet){
        this.wallet = wallet;
    }

    public boolean isInvited(){
        return wallet.hasInvitation();
    }


}
