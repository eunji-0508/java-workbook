package main.java.workbook3.thissuper;

import java.util.Scanner;

// `Person` 클래스에서 `this`를 사용하여 이름과 나이를 초기화,
// `printInfo()` 메서드에서 `this`를 사용해 필드를 출력하는 프로그램을 작성
class Person {
    String name;            // 이름
    int age;                // 나이

    // 생성자
    Person(String name, int age) {
        // TODO: this 사용해 초기화
        this.name = name;   // name을 매개변수 name의 값으로 초기화
        this.age = age;     // age를 매개변수 age의 값으로 초기화
    }

    void printInfo() {
        // TODO: this를 사용하여 필드 출력
        System.out.println(this.name + " " + this.age);     // name과 age를 출력함
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 시작

        String n = sc.next();                       // 이름을 입력받음
        int a = sc.nextInt();                       // 나이를 입력받음

        Person p = new Person(n, a);                // 매개변수로 n, a를 이용한 객체를 생성하여 p에 할당함
        p.printInfo();                              // p 객체의 printInfo() 메서드를 호출함

        sc.close();                                 // 스캐너 닫기
    }
}