package ch09_classes.product;

public class product {
    int num;
    String name;

    product(){
    }
    product(int num){
        this.num=num;
    }
    product(String name){
        this.name=name;
    }
    product(int num, String name){
        this.num=num;
        this.name=name;

    }
    void showInfo(){
        System.out.println("\n시리얼 넘버 : "+ num);
        System.out.println("제품 타이틀 : "+ name);
    }
}
