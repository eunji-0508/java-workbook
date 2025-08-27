package main.java.workbook3.varinit;

import java.util.Random;

// `RandomInit` 클래스에서 배열을 필드로 선언하고, 인스턴스 초기화 블록에서 배열을 난수로 채운 후 값을 출력하는 프로그램을 작성
class RandomInit {
    int[] arr = new int[5];                         // 크기가 5인 arr 배열

    // 인스턴스 초기화 블록
    {
        // TODO: arr 배열을 난수로 채움
        Random random = new Random();               // 난수를 생성하기 위한 Random 객체 생성

        for (int i = 0; i < arr.length; i++) {      // i는 0이고, i가 arr의 길이보다 작은동안 i를 1씩 증가시키며 반복을 수행함
            arr[i] = random.nextInt(10);      //  0~9 사이의 난수를 arr[i]에 저장함
        }
    }

    // 배열의 요소를 출력하는 메서드
    void printArray() {
        // TODO: arr 요소 출력
        for (int i : arr) {                         // 배열의 요소를 하나씩 꺼내옴 (향상된 for문)
            System.out.print(i + " ");              // i의 값을 출력함
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();          // 기본 생성자를 이용하여 obj 객체 생성
        obj.printArray();                           // obj 객체의 printArray() 메서드를 실행함
    }
}
