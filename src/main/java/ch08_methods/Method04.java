package ch08_methods;

import java.util.Scanner;

public class Method04 {

    public static String getStar(){
        String result ="";
        Scanner scanner = new Scanner(System.in);
        int rows = 0;       //Method02에는 rowOfStars 썼음  -> 근데 getStar()에서 매개변수를 rows로 써서
        //수정하기 귀찮아서 그냥 이렇게 씁니다.
        int option = 0;
        System.out.print("몇 줄 짜리 별을 생성하시겠습니까? >>>> ");
        rows = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요>>>>");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                for (int i = 0 ; i < rows + 1; i++){
                    for(int j = 0 ; j < i; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < rows; i++) {
                    // 공백을 책임지는 for문
                    for (int j = rows; j < rows-(i+1); j++) {
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for(int i = 0; i < rows ; i++){
                    for(int j = rows; j > i; j--){
                        result +="*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0 ; i <rows ; i++){
                    for (int j = 0; j <i+1; j++){
                        result += " ";
                    }
                    for (int k = rows ; k >i ; k--){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getStar());
    }

}


// Overloading 클래스 생성

