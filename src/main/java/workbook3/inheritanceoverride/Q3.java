package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

// `Vehicle` 클래스를 정의하여 `move()` 메서드를 포함시키고, `Car`, `Bike` 클래스가 `Vehicle`을 상속하여 `move()` 메서드를 오버라이딩
// `Vehicle` 타입의 배열을 이용하여 다형성을 확인
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        // TODO: "Car is moving" 출력
        System.out.println("Car is moving");        // Car is moving을 출력함
    }
}

class Bike extends Vehicle {
    void move() {
        // TODO: "Bike is moving" 출력
        System.out.println("Bike is moving");       // Bike is moving을 출력함
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 열기

        Vehicle[] vehicles = new Vehicle[3];        // 배열의 크기가 3인 Vehicle 타입의 배열 vehicles를 생성함
        for (int i = 0; i < 3; i++) {               // i는 0이고, i가 3보다 작을동안 i를 1씩 증가시키며 반복 수행
            String type = sc.next();                // type을 입력받음 (car, bike)

            // type에 입력된 문자열이 "car"와 같다면 true이기 때문에 new Car()를 실행하고, 같지 않다면 new Bike()를 실행함
            // 생성된 객체를 vehivles[i]에 할당함
            vehicles[i] = type.equals("car") ? new Car() : new Bike();
        }

        for (Vehicle v : vehicles) {                // vehicles의 각 요소를 하나씩 꺼내옴 (향상된 for문)
            v.move();                               // v 객체의 move() 메서드를 실행함
        }

        sc.close();                                 // 스캐너 닫기
    }
}