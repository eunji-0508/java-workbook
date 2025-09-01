package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Student {
    private String name;        // 이름

    public void setName(String name) {
        this.name = name;       // name 설정
    }

    public String getName() {
        return name;            // name 반환
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        String n = sc.next();                   // 이름 입력받음
        Student s = new Student();              // 객체 생성

        s.setName(n);                           // setName() 메서드 실행
        System.out.println(s.getName());        // getName() 메서드 실행

        sc.close();                             // 스캐너 닫기
    }
}