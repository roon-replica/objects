- 학습 자료: Objects - 코드로 이해하는 객체지향 (조영호 저)

- 이 책은 객체지향이라는 하나의 프로그래밍 패러다임을 가르칠 뿐이라고 함.

### 학습 전략
- 우선 책을 안 보고 개선해보고, 책 방식대로 개선해보기. 그리고 나서 두 버전을 비교.

### 깨달음
- 자신의 문제를 스스로 관리하도록 코딩하면 확실히 쉽게 이해됨.
  - 예를 들어, 이 코드만 봐도 수정 전보다 더 직관적. <br/>
     ```java 
     public void sellTo(Customer customer){
        ticketOffice.plusEarning(customer.buy(ticketOffice.getTicket()));
     }
     ```
  - 결합도도 줄어들었고, 변경 용이성 높아짐. 
    - 예를 들어 Customer가 지갑이 아닌 가방을 소지하도록 변경하고 싶으면 Customer 내부만 변경하면 됨.




