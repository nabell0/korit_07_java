package ch10_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent student1 = new UnivStudent();
        UnivStudent student2 = new UnivStudent("김이");
        UnivStudent student3 = new UnivStudent(5);
        UnivStudent student4 = new UnivStudent("김사",4);
        UnivStudent student5 = new UnivStudent("김오",2,1.0);

        //대입
        student1.name="김일";
        student1.grade=1;
        student1.score=3.3;
        student2.grade=3;
        student2.score=-30;
        student3.name="김삼";
        student3.score=2.7;
        student4.score=3.8;

        student1.setName("김일");
        student2.setName("김이");
        student3.setName("김삼");
        student4.setName("김사");
        student5.setName("김오");

        student1.setGrade(1);
        student2.setGrade(3);
        student3.setGrade(5);
//        System.out.println(student3.getGrade());
        student3.setGrade(2);
        student4.setGrade(4);
        student5.setGrade(2);

        student1.setScore(3.3);
        student2.setScore(-30);
        student2.setScore(4);
        student3.setScore(2.7);
        student4.setScore(3.8);
        student5.setScore(1.0);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
//        student1.showInfo();
//        student2.showInfo();
//        student2.setScore(student2.score);
//        student2.setScore(4);
//        student3.showInfo();
//        student3.setGrade(student3.grade);
//        student3.setGrade(2);
//        student4.showInfo();
//        student5.showInfo();

    }

}
