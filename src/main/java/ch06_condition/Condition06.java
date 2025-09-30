package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05의 코드는
    100초과 / 0미만의 점수가 입력됐을 때 각각 A / F라는 결과값이 나오게됨.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고 안래를 하려면 어떻게
    할수 있나?
    100초과 / 0 미만의 경우 grade 를 x라고 함.

    참고 사항 : 선수학습 하신 분들 중첩 if문을 사용하지 않고 작성.
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>>> ");
        int score = 0;
        String Grade = "";
        score = scanner.nextInt();

        if (score > 100) {      //
            Grade = "X";
        } else if (score > 89) {
            Grade = "A";
        } else if (score > 79) {
            Grade = "B";
        } else if (score > 69) {
            Grade = "C";
        } else if (score > 59) {
            Grade = "D";
        } else if (score < 0) {
            Grade = "X";
        }
        else {
            Grade = "F";
        }
        System.out.println("당신의 점수는 "+ score + "점이고, 학점은 " + Grade +"입니다");
//        if (score > 100 || score <0 ) {      //
//            Grade = "X";
//        } else if (score > 89) {
//            Grade = "A";
//        } else if (score > 79) {
//            Grade = "B";
//        } else if (score > 69) {
//            Grade = "C";
//        } else if (score > 59) {
//            Grade = "D";
//        }
//        else {
//            Grade = "F";
    }
}
