package test_;

public class Book {
    private String title;
    private String author;

    public Book(String autor, String title) {
        this.author = autor;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void displayInfo(){
        System.out.println("제목 : "+ getTitle()+","+ "저자 : "+ getAuthor());
    }
}
