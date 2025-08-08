package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
//    Bank person1 = new Bank();
//    Bank person2 = new Bank(1234);
//    Bank person3 = new Bank(2345,"홍길동");
//    Bank person4 = new Bank(3456,"김사",2000);
//    Bank person5 = new Bank(4567,"김오",3000,123);
//
//    person1.setAccountNum(234);
//    person1.setAccountHolder("김일");
//    person1.setBalance(500);
//    person2.setAccountHolder("김이");

        Bank bank1 = new Bank(123456,"홍길동", 100000,1234);
        Bank bank2 = new Bank(456,"신사임당", 500000,1234);
//        bank1.showAccountInfo();
//        bank2.showAccountInfo();

       bank1.depsit(50000,1234);
       bank1.withdraw(200000,1234);
       bank1.withdraw(100000,1234);
        System.out.println();
        bank2.withdraw(100000,1234);
        bank2.depsit(200000,1234);

        System.out.println();
        System.out.println("최종 계좌 정보");
        bank1.showAccountInfo();
        bank2.showAccountInfo();

        //잔액이 마이너스인 계좌 객체를 생성
        Bank bank4 = new Bank(13579,"김사",-3000,789456);
        bank4.showAccountInfo();

    }
}
