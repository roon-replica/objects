package roon.oop.objects.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long earning;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long earning, Ticket... tickets) {
        this.earning = earning;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        var ret = tickets.get(0);
        tickets.remove(0);  // remove 해도 ret에는 영향없지?

        return ret;
    }

    public void minusEarning(Long price) {
        this.earning -= price;
    }

    public void plusEarning(Long price) {
        this.earning += price;
    }

}
