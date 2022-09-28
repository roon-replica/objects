package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // TicketSeller도 로직을 스스로 처리하도록 캡슐화
    public void sellTo(Customer customer){
        ticketOffice.sellTicketTo(customer);
    }
}
