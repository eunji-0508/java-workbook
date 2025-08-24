package main.java.workbook3.constructor;

import java.util.Scanner;

// `Student` 클래스를 설계하여 기본 생성자와 이름을 매개변수로 받는 생성자를 작성하고, 두 방식으로 객체를 생성하여 이름을 출력하는 프로그램을 작성
class Student {
    String name;                    // 이름을 저장하는 변수

    // 기본 생성자
    Student() {
        // TODO: name 초기화
        this.name = "Unknown";      // name을 “Unknown”으로 초기화 함
    }

    // name을 매개변수로 하는 생성자
    Student(String name) {
        // TODO: name 초기화
        this.name = name;           // name을 매개변수 name의 값으로 초기화 함
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        String name = sc.next();                // name을 입력받음

        Student s1 = new Student();             // 기본 생성자를 이용하여 s1 객체를 생성함
        Student s2 = new Student(name);         // name을 매개변수로 하는 생성자를 이용하여 s2 객체를 생성함

        // TODO: s1.name과 s2.name 출력
        System.out.println(s1.name);            // s1의 name을 출력함
        System.out.println(s2.name);            // s2의 name을 출력함

        sc.close();                             // 스캐너 닫기
    }
}
