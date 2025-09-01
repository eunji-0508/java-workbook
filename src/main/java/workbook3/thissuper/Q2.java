package main.java.workbook3.thissuper;

import java.util.Scanner;

// 두 개의 생성자를 가진 클래스 `Box`를 설계한다. 기본 생성자는 다른 생성자를 호출하여 가로, 세로, 높이를 모두 1로 초기화
// `main`에서 기본 생성자와 매개변수 생성자를 통해 객체를 생성하고 크기를 출력
class Box {
    int width, height, depth;   // 가로, 세로, 높이

    // 기본 생성자
    Box() {
        // TODO: 매개변수 생성자 호출하여 1,1,1로 초기화
        this(1, 1, 1);      // 생성자 체이닝을 위해 this를 사용함
    }

    // 생성자
    Box(int w, int h, int d) {
        // TODO: 멤버 초기화
        this.width = w;              // width를 매개변수 w의 값으로 초기화
        this.height = h;             // height를 매개변수 h의 값으로 초기화
        this.depth = d;              // depth를 매개변수 d의 값으로 초기화
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        int w = sc.nextInt();                   // 가로를 입력받음
        int h = sc.nextInt();                   // 세로를 입력받음
        int d = sc.nextInt();                   // 높이를 입력받음

        Box b1 = new Box();                     // 기본 생성자를 이용하여 객체를 생성
        Box b2 = new Box(w, h, d);              // 매개변수를 포함하는 생성자를 이용하여 객체를 생성

        System.out.println(b1.width + " " + b1.height + " " + b1.depth);    // b1 객체의 width, height, depth를 출력함
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);    // b2 객체의 width, height, depth를 출력함

        sc.close();                             // 스캐너 닫기
    }
}