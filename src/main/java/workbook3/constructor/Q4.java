package main.java.workbook3.constructor;

import java.util.Scanner;

// Triangle` 클래스에서 세 변의 길이를 필드로 가지고, 각 변을 매개변수로 받는 생성자와 매개변수가 없는 생성자를 작성
// 기본 생성자에서는 세 변을 모두 1로 초기화한다. 두 객체의 변을 출력하는 프로그램을 작성
class Triangle {
    int a, b, c;                    // 세 변의 길이를 나타내기 위한 a, b, c 변수

    // 기본 생성자
    Triangle() {
        // TODO: 기본 생성자에서 a,b,c 초기화
        this.a = 1;                 // Triangle 클래스의 a를 1로 초기화
        this.b = 1;                 // Triangle 클래스의 b를 1로 초기화
        this.c = 1;                 // Triangle 클래스의 c를 1로 초기화
    }

    // a, b, c를 매개변수로 하는 생성자
    Triangle(int a, int b, int c) {
        // TODO: 매개변수 생성자에서 a,b,c 초기화
        this.a = a;                 // Triangle 클래스의 a를 매개변수 a로 초기화
        this.b = b;                 // Triangle 클래스의 b를 매개변수 a로 초기화
        this.c = c;                 // Triangle 클래스의 c를 매개변수 a로 초기화
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // 스캐너 열기

        int a = sc.nextInt();                                   // 한 변의 길이를 입력받음
        int b = sc.nextInt();                                   // 한 변의 길이를 입력받음
        int c = sc.nextInt();                                   // 한 변의 길이를 입력받음

        Triangle t1 = new Triangle();                           // 기본 생성자를 통해 t1 객체 생성
        Triangle t2 = new Triangle(a, b, c);                    // a, b, c를 매개변수로 하는 생성자를 통해 t2 객체 생성

        System.out.println(t1.a + " " + t1.b + " " + t1.c);     // t1 객체의 a, b, c 값을 출력함
        System.out.println(t2.a + " " + t2.b + " " + t2.c);     // t2 객체의 a, b, c 값을 출력함

        sc.close();                                             // 스캐너 닫기
    }
}
