package ch12_arrays;

/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을때
    String[] 내부 element들의 값
 */
import java.util.Scanner;

public class Array04 {
    // 메서드 정의 영역

    public void printElements(){
        String[] names = {"김일", "김이", "김삼", "김사", "김오", "김육"};

        //method화 하기 위한 과정 #1
        //일단 main에서 해본다
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i]+ " ");
        }
    }
    public void printElements(String[]strArray) {
        //method화 하기 위한 과정 #1
        //일단 main에서 해본다
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }
    public void printElements(int[]strArray) {
        //method화 하기 위한 과정 #1
        //일단 main에서 해본다
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }
//    public static String stdent() {
//        String result = "";
//        Scanner scanner = new Scanner(System.in);
//
//        int human = 0;
//        System.out.print("몇 명의 학생을 등록하시겠습니까?>>>> ");
//        human = scanner.nextInt();
//        scanner.nextLine(); //여기도 베리어
//        String[] names = new String[human];
//        double[] score = new double[human];
//        double sum = 0;
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.print((i + 1) + "번 학생의 이름을 등록하세요>>>");
//            names[i] = scanner.nextLine();
//            System.out.print(names[i] + " 점수를 입력하세요.>>>");
//            score[i] = scanner.nextDouble();
//            scanner.nextLine(); // 바로 위에 nextDouble() 다음에 i++이후 nextLine()이 배치될 예정이라 배리어 위치가 여기.
//            sum += score[i];
//        }
//        System.out.println();
//        // 각 배열의 element를 출력하는 반복문 작성할 필요 -> names 출력 후에 개행이 이루어지고 그다음 score가 출력
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(score[i] + " ");
//        }
//        System.out.println();
//        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");
//
//
//        return result;
// }
 //입력 관련 method 정의
    public void writesElements(String[] strArray){
        // 여기서 스캐너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출한 후 내부에서 입력할 거기 때문에 Scanner를 여기에 import.
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i+1)+"번째 이름을 등록해주세요.>>>>");
           strArray[i]=scanner.nextLine();
        }

    }

    public void writesElements(double[] doublesArray){
        // 여기서 스캐너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출한 후 내부에서 입력할 거기 때문에 Scanner를 여기에 import.
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < doublesArray.length; i++) {
            System.out.print((i+1)+"점수를 등록해주세요.>>>>");
            doublesArray[i]=scanner.nextDouble();
        }

    }
    public void printElements(double[]doublesArray) {
        //method화 하기 위한 과정 #1
        //일단 main에서 해본다
        for (int i = 0; i < doublesArray.length; i++) {
            System.out.print(doublesArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        String[] people = new String[5];
        // 메서드 호출 영역
//        array04.writesElements(people);
//        array04.printElements(people);
        double[] scores = new double[2];
        array04.writesElements(scores);
        array04.printElements(scores);
        //method화 하기 위한 과정 #1
        //일단 main에서 해본다

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이...김육을 출력.
//        array04.printElements();
//
//        //이상의 코드의 문제점은 메서드를 호출했을 때 특정 배열의 element만 출력된다는 점.
//
//        String[] students= {"이일", "이이", "이삼", "이사", "이오"};
//
//        array04.printElements(students);
//        System.out.println();
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        System.out.println();
//        array04.printElements(teachers);
//
//        int[] dates = {2025, 8, 5};
//        array04.printElements(dates);
    }
}
