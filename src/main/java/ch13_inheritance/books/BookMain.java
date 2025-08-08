package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석","남궁성");
        String bookTitle = book1.getTitle();
        String bookAuthor = book1.getAutor();
        System.out.println("이 책의 제목은"+ bookTitle+"이 책의 저자는"+ bookAuthor+"입니다.");
        book1.showInfo();

        EBook eBook = new EBook("스프링 입문","이강준",5.2,"EPUB");
        eBook.setFormat("PDF");
        System.out.println("이 전자책의 파일 형식은 "+eBook.getFormat()+"입니다.");
        eBook.showInfo();
    }


}
