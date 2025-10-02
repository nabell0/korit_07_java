package test_1;

// TODO: 제네릭 타입 T를 사용하는 Box 클래스를 작성하시오.
// 필드: private T content
// 생성자: content를 인자로 받아 초기화
// 메서드: public T getContent()
public class Box<T>{
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent(){

        return content;
    }
}
