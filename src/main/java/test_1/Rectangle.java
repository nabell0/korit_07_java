package test_1;

// TODO: Shape을 상속받고, 가로(width)와 세로(height)를 필드로 가지는 Rectangle 클래스를 작성하시오.
// calculateArea() 메서드를 오버라이딩하여 사각형의 넓이를 계산하시오.
public class Rectangle extends Shape{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double width2 = width*height;
        System.out.println("사각형의 넓이 : "+width2);
    }
}
