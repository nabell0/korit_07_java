package test_1;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}
