package ch07_loops;

import java.util.Scanner;

/*
    Scanner 를 이용한 별찍기

    몇 줄의 별을 생성하시겠습니까? >>>> 3

    *
    **
    ***
    로 만들어질 수 있도록 작성
    다 한후에

    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
     int row= 0;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>>>");
        row = scanner.nextInt();
//        for (int i = 0; i < row ; i++){
//            for(int j = 0; j < i + 1 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < row ; i++){
            for (int j = row; j-i > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        // 선생님 풀이
//        for (int i = 0 ; i < row ; i++){
//            for ( int j = row ; j - i > 0 ; j--){
//                System.out.println("*");
//            }
//        }
    }
}
