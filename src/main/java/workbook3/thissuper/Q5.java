package main.java.workbook3.thissuper;

import java.util.Scanner;

// `Vehicle` 클래스와 이를 상속한 `Car` 클래스에서, `Car` 생성자에서 `super`를 사용하여 `Vehicle`의 생성자를 호출하고,
// `toString()` 메서드를 오버라이딩하여 부모 정보와 자식 정보를 모두 반환하는 프로그램을 작성
class Vehicle {
    String model;               // 모델명
    int year;                   // 연식

    // 생성자
    Vehicle(String model, int year) {
        this.model = model;     // model를 매개변수 model로 초기화
        this.year = year;       // year를 매개변수 year로 초기화
    }

    public String toString() {
        return "Model: " + model + ", Year: " + year;   // 출력
    }
}

class Car extends Vehicle {
    String fuel;                // 연료 타입

    // 생성자
    Car(String model, int year, String fuel) {
        // TODO: super() 호출 및 fuel 초기화
        super(model, year);     // 생성자 체이닝
        this.fuel = fuel;       // fuel를 매개변수 fuel로 초기화
    }

    @Override
    public String toString() {
        // TODO: super 키워드 활용해서 Model, Year 정보와 함께 Fuel: " + fuel 출력
        return super.toString() + ", Fuel: " + this.fuel;   // 출력
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 시작

        String model = sc.next();                   // 모델명 입력받음
        int year = sc.nextInt();                    // 연식을 입력받음
        String fuel = sc.next();                    // 연료 타입을 입력받음

        Car car = new Car(model, year, fuel);       // model, year, fuel를 이용하여 Car 객체를 생성
        System.out.println(car.toString());         // car의 toString() 메서드를 실행함

        sc.close();                                 // 스캐너 닫기
    }
}
