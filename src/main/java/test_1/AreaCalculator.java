package test_1;

public class AreaCalculator {
    public static void main(String[] args) {
        // TODO: 반지름이 10인 원(Circle) 객체를 생성하고 넓이를 출력하시오.
        // TODO: 가로가 5, 세로가 8인 사각형(Rectangle) 객체를 생성하고 넓이를 출력하시오.
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(8);
        rectangle.setWidth(5);
        rectangle.calculateArea();
    }
}