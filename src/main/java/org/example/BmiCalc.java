package org.example;

import java.util.Scanner;

public class BmiCalc {
    public void calcBmi(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble()* 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//        double bmi;
//        bmi = weight/(height*height);
//        String result = "";

//        if(bmi<18.5){
//            result = "저체중";
//        } else if (bmi<23){
//            result = "정상";
//        } else if (bmi<25){
//            result = "비만전단계";
//        } else if (bmi<30) {
//            result = "비만 1단계";
//        } else if (bmi < 35) {
//            result= "비만 2단계";
//        }else {
//            result = "비만 3단계";
//        }
//        System.out.println(name + "님의 BMI 지수는 "+ bmi + "으로 " + result +"입니다.");
    }
    public void calcBmi(String name, double height, double weight){

//        double bmi;
//        bmi = weight/((height*0.01)*(height*0.01));
//        String result = "";
//
//        if(bmi<18.5){
//            result = "저체중";
//        } else if (bmi<23){
//            result = "정상";
//        } else if (bmi<25){
//            result = "비만전단계";
//        } else if (bmi<30) {
//            result = "비만 1단계";
//        } else if (bmi < 35) {
//            result= "비만 2단계";
//        }else {
//            result = "비만 3단계";
//        }
//        System.out.println(name + "님의 BMI 지수는 "+ bmi + "으로 " + result +"입니다.");
    }

    public void calcBmi(Person person){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble()* 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi;
        bmi = weight/(height * height);

        String result = "";

        if(bmi<18.5){
            result = "저체중";
        } else if (bmi<23){
            result = "정상";
        } else if (bmi<25){
            result = "비만전단계";
        } else if (bmi<30) {
            result = "비만 1단계";
        } else if (bmi < 35) {
            result= "비만 2단계";
        }else {
            result = "비만 3단계";
        }
        System.out.println(name + "님의 BMI 지수는 "+ bmi + "으로 " + result +"입니다.");

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble()* 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//        scanner.nextLine();
//        double bmi;
//        bmi = weight/(height*height);
//        String result = "";
//
//        if(bmi<18.5){
//           result = "저체중";
//        } else if (bmi<23){
//             result = "정상";
//        } else if (bmi<25){
//            result = "비만전단계";
//        } else if (bmi<30) {
//            result = "비만 1단계";
//        } else if (bmi < 35) {
//           result= "비만 2단계";
//        }else {
//           result = "비만 3단계";
//        }
//        System.out.println(name + "님의 BMI 지수는 "+ bmi + "으로 " + result +"입니다.");
        BmiCalc bmiCalc = new BmiCalc();
//        bmiCalc.calcBmi();

//        bmiCalc.calcBmi("김일",172,68);
        Person person = Person.builder()
                .name("김일")
                .height(172)
                .weight(68)
                .build();

        Person person1 = new Person("김일",172,68);

        bmiCalc.calcBmi(person);
        bmiCalc.calcBmi(person1);


    }
        /*
            실행 예
            이름을 입력하세요 >>> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg)를 입력하세요 >>>> 68
            김일 님의 BMI  지수는 23.0으로 과체중입니다.
         */
}

