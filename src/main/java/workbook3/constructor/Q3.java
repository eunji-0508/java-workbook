package main.java.workbook3.constructor;

import java.util.Scanner;

// `Car` 클래스에서 모델명과 가격을 매개변수로 받는 생성자,
// 가격만 받는 생성자(모델명은 “Unknown”으로),
// 매개변수가 없는 생성자를 작성하고, 객체를 세 종류로 생성하여 출력하는 프로그램을 작성
class Car {
    String model;                   // 모델명을 나타낼 변수
    int price;                      // 가격을 나타낼 변수

    // 기본 생성자
    Car() {
        this.model = "Unknown";     // Car 클래스의 model를 Unknown으로 초기화
        this.price = 0;             // Car 클래스의 price를 0으로 초기화
    }

    // model, price를 매개변수로 하는 생성자
    Car(String model, int price) {
        this.model = model;         // Car 클래스의 model를 매개변수 model로 초기화
        this.price = price;         // Car 클래스의 price를 매개변수 price로 초기화
    }

    // price를 매개변수로 하는 생성자
    Car(int price) {
        this.model = "Unknown";     // Car 클래스의 model를 Unknown으로 초기화
        this.price = price;         // Car 클래스의 price를 매개변수 price로 초기화
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // 스캐너 열기

        String m = sc.next();                               // 모델명을 입력받음

        int p1 = sc.nextInt();                              // 가격을 입력받아 p1 변수에 저장
        int p2 = sc.nextInt();                              // 가격을 입력받아 p2 변수에 저장

        Car c1 = new Car();                                 // 기본 생성자를 이용하여 c1 객체를 생성
        Car c2 = new Car(m, p1);                            // model, price를 매개변수로 하는 생성자를 이용하여 c2 객체를 생성
        Car c3 = new Car(p2);                               // price를 매개변수로 하는 생성자를 이용하여 c3 객체를 생성

        System.out.println(c1.model + " " + c1.price);      // c1 객체의 model, price를 출력함
        System.out.println(c2.model + " " + c2.price);      // c2 객체의 model, price를 출력함
        System.out.println(c3.model + " " + c3.price);      // c3 객체의 model, price를 출력함

        sc.close();                                         // 스캐너 닫기
    }
}