package roon.oop.objects.ch1;

import lombok.Getter;

@Getter
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }

    public void earn(Long price) {
        ticketOffice.plusEarning(price);
    }
}
