package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이사이라면 grade는 A
         */
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요>>>>");
        score = scanner.nextInt();
        String Grade="";

        if (score > 89) {
            Grade = "A";
        } else if (score > 79) {
            Grade = "B";
        } else if (score > 69) {
            Grade = "C";
        } else if (score > 59) {
            Grade = "D";
        }
        else {
            Grade = "F";
        }
        System.out.println("당신의 점수는 "+ score + "점이고, 학점은 " + Grade +"입니다");
    }
}
