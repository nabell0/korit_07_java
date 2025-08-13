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
        //method 정의 할 때 argument와 parameter 개념을 혼란스러워하는 경우가 있는데,
        //정의 -> 호출이라는 순서라고 생각할 때,
        // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 변수명 으로 이루어져
        // 있기 때문에 '선언'이라고 간주해주면 좋겠습니다.
        // call1() 유형에서 height를 scanner로 받았을 때, 바로 0.01을 곱해서
        // m로 치환했었습니다.
        // 근데 우리는 double bmi부터 긁어왔을 때 , cm  기준일 수도 있기 때문에
        // 추가 작업이 필요.

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
        // Person class의 각 field들에 private을 적용했기 때문에 값을 불러오기 위해서는
        // Getter를 사용해야만 합니다. 하지만 너무 코드가 길어지기 때문에
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble()* 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        double bmi;
         bmi = person.getWeight()/(height * height);

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
        System.out.println(person.getName() + "님의 BMI 지수는 "+ bmi + "으로 " + result +"입니다.");

//        String name = person.getName();   //지역 변수들을
//        double height = person.getHeight();// 선언하고 거기에 값을 대입하여
//        double weight = person.getWeight();   // 사용하도록 하겠습니다.
//        double bmi = weight/(height*height);  // 그러면 여기부터는 위의 코드를 복사할 수 있습니다.


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
        System.out.println("-----call3()-1-검증 부분-----");
        bmiCalc.calcBmi("김일",172,68);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        String name3 = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height3 = scanner.nextDouble()* 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight3 = scanner.nextDouble();
//
//        bmiCalc.calcBmi(name3,height3,weight3);

        // 여기에 Person 객체를 생성해야하는데, 일반적인 방식이 아니라
        // Builder 패턴을 적용한 방식으로 생성해서
        //caclBmi() 메서드의 argument로 집어넣어줘야함.
        Person person = Person.builder()
                .name("김일")
                .height(172)
                .weight(68)
                .build();

//        System.out.println("----객체 생성 후 call3() 활용 방법----");
        Person person1 = new Person("김일",172,68);

        System.out.println("-----call3()-2-검증 부분-----");
        bmiCalc.calcBmi(person);
        System.out.println("----객체 생성 후 call3() 활용 방법----");
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

