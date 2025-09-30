package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
        for (int i = 0 ; i < 100 ; i++) {
        반복실행문1-a
        for(int j = 0 ; j < 100 ; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for문을 활용하여 1일차 1교시입니다. ~5일차 3교시입니다. 까지 출력
 */
public class Loop05 {
    public static void main(String[] args) {
//       for (int day = 1 ; day < 6 ; day++){
//           for(int lesson = 1; lesson < 4; lesson++){
//               System.out.println(day + "일차" + lesson+"교시 입니다.");
//           }
//           System.out.println();
//       }
//        for (int i = 2; i < 10 ; i++) {
//            for(int j = 1 ; j<10 ; j++){
//                System.out.println(i+ "x" +j + "="+(i*j));
//            }
//        }
    /*
        1 2 3 4 5....10
        11 .... 20
        91 .... 100
     */
//        for (int i = 1; i < 101 ; ++i){
//            if(i % 10 == 1){
//                System.out.println();
//            }
//            System.out.print(i + " ");
//        }


//        for (int i = 1; i < 101 ; i+= 10){
//          System.out.println(i+ " " +(i+1)+ " " +(i+2)+ " " +(i+3)+ " " +(i+4)+ " " +(i+5)+ " " +(i+6)+ " " +(i+7)+ " " +(i+8)+ " " +(i+9));
//        }


        /*
            숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오.
            실행 예
            1부터 몇 까지 더하시겠습니까? >>>> 10
            1부터 10까지의 합은 55입니다.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까?");
        int sum = 0;
        int n;
        n = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i < n+1; i++){
            sum += i;
            if ( i % 2 == 0){
                sumEven += i;
            }
            if (i % 2 == 1) {
                sumOdd += i;

//            }else {
//                sumOdd += i;
//            }
            }

        }
        System.out.println("1부터"+ n + "까지의 합은" + sum + "입니다.");
        System.out.println("1부터"+n+ "까지 중 짝수의 합은 " + sumEven + "입니다.");
        System.out.println("1부터"+n+ "까지 중 홀수의 합은 " + sumOdd + "입니다.");
    }
}
