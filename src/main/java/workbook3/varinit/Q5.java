package main.java.workbook3.varinit;

import java.util.Scanner;

// `InitPerson` 클래스에서 static 초기화 블록, 인스턴스 초기화 블록, 생성자를 이용해 이름(name)과 id를 초기화하고,
// 객체를 3개 생성하여 각각의 값을 출력하는 프로그램을 작성. id는 생성 순서대로 1,2,3을 부여
class InitPerson {
    static int counter = 0;                     // int 타입의 static 변수 counter를 0으로 초기화

    // static 초기화 블록
    static {
        // TODO: "class loaded" 출력
        System.out.println("class loaded");     // class loaded를 출력함
    }

    String name;                                // String 타입의 인스턴스 변수 name
    int id;                                     // int 타입의 인스턴스 변수 id

    // 인스턴스 초기화 블록
    {
        // TODO: id 부여
        id = ++counter;                         // ++counter의 값을 id에 대입함
    }

    // name을 매개변수로 하는 생성자
    InitPerson(String name) {
        // TODO: name 초기화
        this.name = name;                       // name을 매개변수 name으로 초기화
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        String n1 = sc.next();                  // name을 입력받음
        String n2 = sc.next();                  // name을 입력받음
        String n3 = sc.next();                  // name을 입력받음

        InitPerson p1 = new InitPerson(n1);     // name을 매개변수로 하는 생성자를 이용하여 p1 객체 생성
        InitPerson p2 = new InitPerson(n2);     // name을 매개변수로 하는 생성자를 이용하여 p2 객체 생성
        InitPerson p3 = new InitPerson(n3);     // name을 매개변수로 하는 생성자를 이용하여 p3 객체 생성

        System.out.println(p1.name + " " + p1.id);      // p1 객체의 name과 id를 출력함
        System.out.println(p2.name + " " + p2.id);      // p2 객체의 name과 id를 출력함
        System.out.println(p3.name + " " + p3.id);      // p3 객체의 name과 id를 출력함

        sc.close();                             // 스캐너 닫기
    }
}