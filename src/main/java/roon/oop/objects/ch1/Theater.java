package roon.oop.objects.ch1;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 문제가 많은 코드였음
    // 왜 문제? -> 참조가 길어지는 부분
    // 참조가 길어지면 왜 문제? -> 읽기 안 좋아서..(동시에 많은 사실을 기억하고 있어야 하는 문제 -> 인지적 부담)
    // 다른 이유는? -> 변경 용이성, 읽는 사람과의 의사소통(읽기 쉬운)에 문제가 있다고 함..

    // Customer와 TicketSeller가 Theater의 통제를 받는 수등적인 존재다??
    // 자신의 일은 스스로 처리해야 한다는 일반적인 직관과 벗어난다고 함!
    // 그리고 customer나 ticketSeller가 변경되면 결합되어 있는 Theater도 변경될 수 있다..!

    public void enter(Customer customer) {
        // 개선된 코드!
        // ticketSeller가 직접 처리 하도록 하기 위해 ticketSeller 내부로 로직을 옮김.
        // 이제 ticketOffice에 직접 접근하지 않는다!
        // 왜 캡슐화와 내부로 감추기(은닉)이 함께 사용되는 개념인지 알겠다!!
        ticketSeller.sellTo(customer);
    }

    public static void main(String[] args) {
        var customer1 = new Customer(new Wallet(null, 10L));
        var customer2 = new Customer(new Wallet(new Invitation(ZonedDateTime.now()), 10L));

        var ticketArray = new Ticket[]{new Ticket(1L), new Ticket(2L)};

        var ticketOffice = new TicketOffice(1234L, ticketArray);

        var ticketSeller = new TicketSeller(ticketOffice);
        var theater = new Theater(ticketSeller);

        theater.enter(customer1);
        theater.enter(customer2);

    }
}
