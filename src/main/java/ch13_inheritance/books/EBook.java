package ch13_inheritance.books;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String autor, String title, double fileSize, String format) {
        super(autor, title);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    @Override
    void showInfo() {
        System.out.println("제목 : "+ getTitle()+"\n저자 : "+ getAutor()+"\n파일 크기 : "+fileSize+"MB"+"\n파일 형식 : "+format );
    }
}
