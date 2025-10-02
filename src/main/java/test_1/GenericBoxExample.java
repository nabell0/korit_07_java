package test_1;


public class GenericBoxExample {
    public static void main(String[] args) {

        // TODO: "Hello World" 문자열을 담는 Box<String> 객체를 생성하고 내용물을 출력하시오.
    Box<String> example1 = new Box("Hello World");
        System.out.println(example1.getContent());
        // TODO: 숫자 123을 담는 Box<Integer> 객체를 생성하고 내용물을 출력하시오.
    Box<Integer> example2 = new Box(123);
        System.out.println(example2.getContent());
    }
}