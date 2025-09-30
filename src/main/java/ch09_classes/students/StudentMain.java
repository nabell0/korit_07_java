package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
       Student student1 = new Student();
       //객체의 필드에 값을 대입하는 방법
        student1.studentCode=2025001;
        student1.name = "김일";
        student1.score = 4.5;

        Student student2 = new Student(2025002);
        student2.name = "김이";
        student2.score=100;

        Student student3 = new Student("김삼");
        student3.score = 95.8;
        student3.studentCode=2025003;

        Student student4 = new Student(2025004,"김사");
        student4.score=4.0;

        Student student5 = new Student(2025005,"김오",80.7);

        //두번째 객체 어떤 생성자 쓸지,
    }
}
