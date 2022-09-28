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

    private Ticket getTicket() {
        var ret = tickets.get(0);
        tickets.remove(0);  // remove 해도 ret에는 영향없지?

        return ret;
    }

    private void plusEarning(Long price) {
        this.earning += price;
    }

    public void sellTicketTo(Customer customer) {
        plusEarning(customer.buy(getTicket()));

        // 근데 ticketOffice와 customer  사이에 의존성 추가됨!
        // ticketOffice의 자율성은 높였지만 결합도가 상승.
    }

}
