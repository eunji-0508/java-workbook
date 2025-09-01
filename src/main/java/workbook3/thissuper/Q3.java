package main.java.workbook3.thissuper;

import java.util.Scanner;

// `Animal` 클래스에서 이름을 필드로 갖고, `Dog` 클래스가 이를 상속받으며 생성자에서 `super`를 사용해 부모의 생성자를 호출
// `Dog` 객체 생성 시 부모 생성자와 자식 생성자가 모두 호출되는지 확인
class Animal {
    String name;            // 이름

    // 생성자
    Animal(String name) {
        System.out.println("Animal constructor");   // Animal constructor를 출력함
        this.name = name;                           // name을 매개변수 name의 값으로 초기화
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);                                // 부모 생성자를 호출함
        System.out.println("Dog constructor");      // Dog constructor를 출력함
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 시작

        String n = sc.next();                       // 이름을 입력받음
        Dog dog = new Dog(n);                       // n을 이용하여 Dog 객체를 생성함

        System.out.println(dog.name);               // dog 객체의 name을 출력함

        sc.close();                                 // 스캐너 닫기
    }
}