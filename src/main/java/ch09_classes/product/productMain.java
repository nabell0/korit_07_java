package ch09_classes.product;

public class productMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 생성
        product product1 = new product();
        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)2번
        product1.num=123456;
        product1.name="Lg엘페드";

        product product2 = new product(9876564);
        product2.name="다이소충전기";

        product product3 = new product("USB-C 케이블");
        product3.num=159357;

        product product4 = new product(951753,"GFlip6");


        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }

}
