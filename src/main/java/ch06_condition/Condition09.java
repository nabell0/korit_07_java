package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        //논리연산자 풀이
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String leapYear = "";

        if((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0)) {
            leapYear = "윤년입니다.";
        }else {
            leapYear = "윤년이아닙니다.";
        }
        System.out.println(year + "년은" + leapYear);
    }
}
