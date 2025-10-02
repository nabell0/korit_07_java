package test_1;

// TODO: Notification 인터페이스를 구현하는 EmailNotification 클래스를 작성하시오.
// send 메서드는 "이메일 발송: [메시지]" 형식으로 출력합니다.
public class EmailNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("이메일 발송 : "+ message);
    }
}
