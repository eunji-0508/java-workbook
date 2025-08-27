package main.java.workbook3.varinit;

// `Q2` 클래스에서 static 변수 `count`를 static 초기화 블록에서 5로 초기화하고, `main`에서 이를 출력하는 프로그램을 작성
public class Q2 {
    static int count;           // int 타입의 static 변수 count

    // static 초기화 블록
    static {
        // TODO: count 초기화
        count = 5;              // count를 5로 초기화
    }
    public static void main(String[] args) {
        System.out.println(count);      // count의 값을 출력함
    }
}
