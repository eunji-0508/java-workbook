package main.java.workbook3.constructor;

import java.util.Scanner;

// `Complex` 클래스에서 실수부(real)와 허수부(imag)를 필드로 갖고, 기본 생성자와 매개변수 두 개를 받는 생성자를 정의한다.
// 또한 복소수 덧셈 메서드를 구현하여 두 복소수 객체를 더한 결과를 출력하는 프로그램을 작성
class Complex {
    int real;                       // 실수부를 나타낼 변수
    int imag;                       // 허수부를 나타낼 변수

    // TODO: 기본 생성자 생성
    // 기본 생성자
    public Complex() {
    }

    // TODO: 매개변수 생성자 생성
    // real, imag를 매개변수로 하는 생성자
    public Complex(int real, int imag) {
        this.real = real;                   // Complex 클래스의 real을 매개변수 real로 초기화
        this.imag = imag;                   // Complex 클래스의 imag을 매개변수 imag로 초기화
    }

    Complex add(Complex other) {
        // TODO: Complex 각각의 실수부와 허수부끼리 덧셈 후 결과 값을 갖는 새로운 Complex 반환
        real += other.real;                 // real = real + other.real
        imag += other.imag;                 // imag = imag + other.imag

        return new Complex(real, imag);     // real, imag를 이용하여 새로운 Complex 객체 생성
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // 스캐너 열기

        int r1 = sc.nextInt();                              // 실수부를 입력받음
        int i1 = sc.nextInt();                              // 허수부를 입력받음

        int r2 = sc.nextInt();                              // 실수부를 입력받음
        int i2 = sc.nextInt();                              // 허수부를 입력받음

        // TODO: 생성자 작성 후 아래 주석 해제
        Complex c1 = new Complex(r1, i1);                  // real, imag를 매개변수로 하는 생성자를 이용하여 c1 객체 생성
        Complex c2 = new Complex(r2, i2);                  // real, imag를 매개변수로 하는 생성자를 이용하여 c2 객체 생성

        Complex sum = c1.add(c2);                          // c1의 add 메서드를 사용한 결과를 sum 객체에 저장함

        // TODO: sum.real과 sum.imag 출력
        System.out.println(sum.real + " " + sum.imag);      // sum의 real과 imag를 출력함

        sc.close();                                         // 스캐너 닫기
    }
}
