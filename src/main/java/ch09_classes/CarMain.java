package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        //필드에 값 대입
        myCar.color="빨강";
        myCar.speed=160;
        // 메서드 호출
        myCar.drive();
        myCar.displayInfo();
        // 객체 생성2
        Car yourcar = new Car();
        // 필드에 값 대입
        yourcar.color="노랑";
        yourcar.speed=180;
        //메서드 호출
        yourcar.brake();
        yourcar.displayInfo();

        System.out.println(myCar);
        System.out.println(yourcar);
    }
}
