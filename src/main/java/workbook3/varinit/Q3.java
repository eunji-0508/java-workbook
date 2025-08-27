package main.java.workbook3.varinit;

// `Q3` 클래스에서 static 변수, 인스턴스 변수, static 초기화 블록, 인스턴스 초기화 블록, 생성자의 실행 순서를 출력하는 프로그램을 작성
// 객체를 생성할 때 어떤 순서로 실행되는지 관찰
public class Q3 {
    static int s;       // int 타입의 static 변수 s
    int i;              // int 타입의 인스턴스 변수 i

    // static 초기화 블록
    static {
        System.out.println("static block");         // (static 초기화 블록 실행 시) static block을 출력함
    }

    // 인스턴스 초기화 블록
    {
        System.out.println("instance block");       // (인스턴스 초기화 블록 실행 시) instance block을 출력함
    }

    // 기본 생성자
    Q3() {
        System.out.println("constructor");          // (기본 생성자 실행 시) constructor를 출력함
    }

    public static void main(String[] args) {
        System.out.println("static variable");      // static variable을 출력함

        Q3 obj = new Q3();                          // 기본 생성자를 이용하여 obj 객체를 생성

        System.out.println("instance variable");    // instance variable을 출력함
    }
}
