package main.java.workbook3.thissuper;

import java.util.Scanner;

// `Building` 클래스와 이를 상속한 `House`와 `Office` 클래스에서 층수와 용도를 필드로 갖고, `showInfo()` 메서드를 오버라이딩.
// `House`에서는 “층수, 주거”를, `Office`에서는 “층수, 업무”를 출력한다. 생성자에서 `super`를 사용
abstract class Building {
    int floors;         // 층수

    // 생성자
    Building(int floors) {
        this.floors = floors;       // floors를 매개변수 floors로 초기화
    }

    abstract void showInfo();       // 추상 메서드
}

class House extends Building {
    House(int floors) {
        // TODO: super() 호출
        super(floors);              // 생성자 체이닝
    }

    @Override
    void showInfo() {
        // TODO: "층수, 주거" 출력
        System.out.println(this.floors + " 주거");
    }
}

class Office extends Building {
    Office(int floors) {
        // TODO: super() 호출
        super(floors);              // 생성자 체이닝
    }

    @Override
    void showInfo() {
        // TODO: "층수, 업무" 출력
        System.out.println(this.floors + " 업무");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        String type1 = sc.next();               // 유형을 입력받음
        int f1 = sc.nextInt();                  // 층수를 입력받음

        String type2 = sc.next();               // 유형을 입력받음
        int f2 = sc.nextInt();                  // 층수를 입력받음

        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);   // type1이 "house"면 new House(f1)이 실행, 아니면 new Office(f1) 실행
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);   // type2가 "house"면 new House(f2)이 실행, 아니면 new Office(f2) 실행

        b1.showInfo();                          // b1 객체의 showInfo() 메서드 실행
        b2.showInfo();                          // b2 객체의 showInfo() 메서드 실행

        sc.close();                             // 스캐너 닫기
    }
}