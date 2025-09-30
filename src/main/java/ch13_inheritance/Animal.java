package ch13_inheritance;

public class Animal {
    // 필드 정의
    private String animalName;
    private int animalAge;

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move(){
        System.out.println("움직입니다.");
    }
    // 생성자 기본 생성자 하나 매개변수 생성자 한짜리 두개
    // AllArg 하나 해서 네 개 생성하세요.

    //Getter/Setter 생성.
}
