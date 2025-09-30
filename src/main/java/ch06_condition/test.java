package ch06_condition;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("점수를 입력해주세요 >>> ");
//        int score = 0;
//        score = scanner.nextInt();
//        String grade = "";
//
//        if ((score > 100) || (score < 0)){
//            grade = "X";
//        } else if (score > 89) {
//            grade = "A";
//        } else if (score > 79){
//            grade = "B";
//        } else if (score > 69){
//            grade = "C";
//        } else if (score > 59){
//            grade = "D";
//        } else {
//            grade ="F";
//        }
//        System.out.println("점수는 "+ score +"점 임으로 , 성적은 "+ grade + "입니다.");

//        System.out.print("나이를 알려주세요.>>>> ");
//        int age = 0;
//        age = scanner.nextInt();
//        String pr = "";
//        if (age < 4) {
//            pr = "무료";
//        }else if (age < 13 ) {
//            pr = "5000원";
//        }else if (age < 65) {
//            pr = "10000원";
//        }else {
//            pr = "7000원";
//        }
//        System.out.println(age + "세 임으로 이용료는 "+ pr + "입니다.");
//        int sum = 0;
//        int num1 = 0;
//
//         while (num1 < 1001) {
//             sum += num1;
//         }
//        for (int i = 1; i < 101 ; i+= 10) {
//            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " " + (i + 3) + " " + (i + 4) + " " + (i + 5) + " " + (i + 6) + " " + (i + 7) + " " + (i + 8) + " " + (i + 9));
//        }
        for (int i = 1; i < 32 ; i++){
            if(i % 7 == 1){
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
