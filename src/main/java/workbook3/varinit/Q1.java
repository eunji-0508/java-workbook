package main.java.workbook3.varinit;

// 클래스 `InitDemo`에 두 개의 필드를 선언하고,
// 명시적 초기화로 첫 번째 필드를 10으로, 인스턴스 초기화 블록에서 두 번째 필드를 20으로 초기화한 후 생성자에서 두 값을 더한 결과를 출력하는 프로그램을 작성
class InitDemo {
    int a = 10;             // a를 10으로 초기화
    int b;                  // int형 변수 b

    // 인스턴스 초기화 블록
    {
        b = 20;             // b를 20으로 초기화
    }

    // 기본 생성자
    InitDemo() {
        // TODO: a와 b의 합 출력
        System.out.println(a + b);   // a와 b를 더한 결과를 출력함
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();                             // InitDemo 객체 생성
    }
}
