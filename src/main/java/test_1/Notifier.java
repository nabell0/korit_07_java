package test_1;

public class Notifier {
    public static void main(String[] args) {
        // TODO: EmailNotification 객체를 생성하고 "주문이 완료되었습니다." 메시지를 보내시오.
        // TODO: SmsNotification 객체를 생성하고 "배송이 시작되었습니다." 메시지를 보내시오.
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send("주문이 완료되었습니다.");
        SmsNotification smsNotification = new SmsNotification();
        smsNotification.send("배송이 시작되었습니다.");
    }
}