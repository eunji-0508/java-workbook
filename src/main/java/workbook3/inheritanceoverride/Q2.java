package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

// `Shape` 클래스에서 `draw()` 메서드를 정의하고, `Circle` 클래스와 `Rectangle` 클래스가 이를 상속받아 각기 다른 그림을 그리는 메시지를 출력하도록 오버라이딩
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        // TODO: "Draw Circle" 출력
        System.out.println("Draw Circle");          // Draw Circle을 출력함
    }
}

class Rectangle extends Shape {
    void draw() {
        // TODO: "Draw Rectangle" 출력
        System.out.println("Draw Rectangle");       // Draw Rectangle을 출력함
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 열기

        Shape[] arr = new Shape[3];                 // 배열의 크기가 3인 Shape형 배열 arr을 만듬
        for (int i = 0; i < 3; i++) {               // i가 0이고, i가 3보다 작을 때까지 i를 1씩 증가시키며 반복을 수행함
            String type = sc.next();                // type을 입력받음 (Circle, Rectangle)
            if (type.equals("circle")) {            // 만약 입력받은 문자열이 "circle"가 같다면
                arr[i] = new Circle();              // arr[i]에 Circle 객체를 생성하여 할당함
            } else {                                // 그렇지 않다면
                arr[i] = new Rectangle();           // arr[i]에 Rectangle 객체를 생성하여 할당함
            }
        }

        for (Shape s : arr) {                       // 배열 arr의 요소들을 하나씩 꺼내옴 (향상된 for문)
            s.draw();                               // s 객체의 draw() 메서드를 실행함
        }

        sc.close();                                 // 스캐너 닫기
    }
}