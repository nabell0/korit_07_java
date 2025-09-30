package test_;

public class main {
    public static void main(String[] args) {
        Book book = new Book("남궁성","자바의 정석");
        book.displayInfo();
        EBook eBook = new EBook("김영한","스프링 부트",20.5);
        eBook.displayInfo();

    }
}
