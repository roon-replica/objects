package roon.oop.objects.ch1;

import java.util.Objects;

public class Wallet {
    private Long cash; // 현금
    private Invitation invitation;
    private Ticket ticket;  // 티켓 가격만큼의 현금이 있거나 초대장 있으면 티켓으로 바꿀 수 있는 구조라고 함.

    public Wallet(Long cash) {
        this(null, cash);
    }

    public Wallet(Invitation invitation, Long cash) {
        this.invitation = invitation;
        this.cash = cash;
    }

    private boolean hasInvitation() {
        return !Objects.isNull(invitation);
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusCash(Long cost) {
        this.cash -= cost;
    }


    public Long keep(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            var price = ticket.getPrice();
            minusCash(price);
            setTicket(ticket);
            return price;
        }
    }

}
