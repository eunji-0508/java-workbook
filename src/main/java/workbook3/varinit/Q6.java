package main.java.workbook3.varinit;

import java.util.Scanner;

// `BankAccount` 클래스에서 잔액(balance)을 필드로 선언하고, 생성자에서 초기 잔액을 설정하며, static 초기화 블록에서 은행 이름을 출력
// 또한 인스턴스 초기화 블록에서 계좌 개설 메시지를 출력. 두 개의 계좌를 생성하고 잔액을 출력하는 프로그램을 작성
class BankAccount {
    // static 초기화 블록
    static {
        // TODO: 은행 이름 출력
        System.out.println("Bank Opened");      // Bank Opened를 출력함

    }

    // 인스턴스 초기화 블록
    {
        // TODO: 계좌 개설 메시지 출력
        System.out.println("Account Created");  // Account Created를 출력함 (계좌 개설 메시지)
    }

    int balance;                                // int 타입의 인스턴스 변수 balance(잔액)

    // balance를 매개변수로 하는 생성자
    BankAccount(int balance) {
        this.balance = balance;                 // balance를 매개변수 balance로 초기화
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        int b1 = sc.nextInt();                  // 초기 잔액을 입력받음
        int b2 = sc.nextInt();                  // 초기 잔액을 입력받음

        BankAccount a1 = new BankAccount(b1);   // balance를 매개변수로 하는 생성자를 이용하여 a1 객체 생성
        BankAccount a2 = new BankAccount(b2);   // balance를 매개변수로 하는 생성자를 이용하여 a2 객체 생성

        System.out.println(a1.balance);         // a1 객체의 balance를 출력함
        System.out.println(a2.balance);         // a2 객체의 balance를 출력함

        sc.close();                             // 스캐너 닫기
    }
}