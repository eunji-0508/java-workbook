package main.java.workbook3.constructor;

import java.util.Scanner;

class Point {
    int x, y;               // x 좌표, y 좌표를 나타낼 변수

    // 기본 생성자
    Point() {
        // TODO: 기본 생성자에서 x,y 초기화
        this.x = 0;         // x를 0으로 초기화 함
        this.y = 0;         // y를 0으로 초기화 함
    }

    // x와 y를 매개변수로 하는 생성자
    Point(int x, int y) {
        // TODO: 매개변수 생성자에서 x,y 초기화
        this.x = x;         // x를 매개변수 x로 초기화 함
        this.y = y;         // y를 매개변수 y로 초기화 함
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 열기

        int x = sc.nextInt();                       // x 좌표 값을 입력받음
        int y = sc.nextInt();                       // y 좌표 값을 입력받음

        Point p1 = new Point();                     // 기본 생성자를 이용하여 p1 객체를 생성함
        Point p2 = new Point(x, y);                 // x와 y를 매개변수로 하는 생성자를 이용하여 p2 객체를 생성함

        System.out.println(p1.x + " " + p1.y);      // p1.x의 값과 p1.y의 값을 출력함
        System.out.println(p2.x + " " + p2.y);      // p2.x의 값과 p2.y의 값을 출력함

        sc.close();                                 // 스캐너 닫기
    }
}
