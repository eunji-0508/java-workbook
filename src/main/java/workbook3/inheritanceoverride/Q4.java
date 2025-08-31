package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

// `Person` 클래스를 상속받은 `Student` 클래스와 `Teacher` 클래스를 설계,
// 공통 메서드 `introduce()`를 오버라이딩하여 학생과 교사에 맞는 소개를 하도록 구현
class Person {
    String name;                // 이름

    // 생성자
    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, I'm " + name + ".");
    }
}

class Student extends Person {
    Student(String name) {
        super(name); // super() 맛보기
    }

    void introduce() {
        // TODO: 학생 소개 출력
        System.out.println("Hello, I'm " + name + " student.");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name); // super() 맛보기
    }

    void introduce() {
        // TODO: 교사 소개 출력
        System.out.println("Hello, I'm " + name + " teacher.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        String type1 = sc.next();               // 유형을 입력받음 (student, teacher)
        String name1 = sc.next();               // 이름을 입력받음

        String type2 = sc.next();               // 유형을 입력받음 (student, teacher)
        String name2 = sc.next();               // 이름을 입력받음

        // typ1이 "student"랑 일치하면 Student 객체 생성, 일치하지 않으면 Teacher 객체를 생성하여 p1에 할당함
        Person p1 = type1.equals("student") ? new Student(name1) : new Teacher(name1);

        // typ2이 "student"랑 일치하면 Student 객체 생성, 일치하지 않으면 Teacher 객체를 생성하여 p2에 할당함
        Person p2 = type2.equals("student") ? new Student(name2) : new Teacher(name2);

        p1.introduce();                         // p1 객체의 introduce() 메서드를 호출함
        p2.introduce();                         // p2 객체의 introduce() 메서드를 호출함

        sc.close();                             // 스캐너 닫기
    }
}