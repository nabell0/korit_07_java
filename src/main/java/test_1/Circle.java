package test_1;

// TODO: Shape을 상속받고, 반지름(radius)을 필드로 가지는 Circle 클래스를 작성하시오.
// calculateArea() 메서드를 오버라이딩하여 원의 넓이를 계산하시오. (원주율 = 3.14)
public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double pi = 3.14;
        double width1 = radius*radius*pi;
        System.out.println("원의 넓이 : " +width1);
    }
}
