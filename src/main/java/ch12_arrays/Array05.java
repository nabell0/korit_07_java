package ch12_arrays;
/*
    메서드를 정의해도 되고 main에 바로하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성.
 */

import java.util.Scanner;

public class Array05 {

    public void writesElements(String[] strArray){
        String[] scores = {"A", "B", "C", "D", "F"};
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i]+ " ");
        }
        System.out.println();
    }
    public void printElements(String[]strArray) {
        String[] names = {"A", "B", "C", "D", "F"};

        for (int i = 0; i < names.length-1; i++) {
            System.out.print(names[i] + "+");
        }
        System.out.println(names[names.length-1]);
    }


    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] scores = new String[5];
        Scanner scanner = new Scanner(System.in);

        array05.writesElements(scores);
        array05.printElements(scores);

    }
}
