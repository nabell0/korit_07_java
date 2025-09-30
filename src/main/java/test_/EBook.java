package test_;

public class EBook extends Book{
    private double fileSize;


    public EBook(String autor, String title, double fileSize) {
        super(autor, title);
        this.fileSize= fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    void displayInfo() {
        System.out.println("제목 : "+ getTitle()+", 저자 : "+ getAuthor()+", 파일 크기:"+getFileSize()+"MB");
    }
}
