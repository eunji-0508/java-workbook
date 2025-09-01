package main.java.workbook3.accesslevel;

import java.util.Scanner;

class BankAccount {
    public String accountNo;            // 계좌번호
    private int balance;                // 잔액
    private String password = "1111";   // 비밀번호

    // 생성자
    BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;     // accountNo를 매개변수 accountNo로 초기화
        this.balance = balance;         // balance를 매개변수 balance로 초기화
    }

    public int getBalance(String inputPw) {
        // TODO: 비밀번호가 맞으면 balance 반환, 아니면 -1 반환
        if(password.equals(inputPw)) {   // 비밀번호가 일치할 경우
            return balance;              // balance 반환
        }

        return -1;                       // -1 반환
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        String accNo = sc.next();               // 계좌번호를 입력받음
        int bal = sc.nextInt();                 // 잔액을 입력받음
        BankAccount acc = new BankAccount(accNo, bal);      // 객체 생성

        String cmd1 = sc.next();                // 할 작업을 입력받음
        String pw1 = sc.next();                 // 비밀번호를 입력받음

        if (cmd1.equals("get")) {               // cmd1이 "get"이라면
            int res = acc.getBalance(pw1);      // acc.getBalance(pw1) 결과를 res에 저장함
            System.out.println(res >= 0 ? res : "비밀번호 오류"); // res가 0보다 크거나 같다면 res를 실행, 그렇지 않다면 비밀번호 오류 출력
        }

        String cmd2 = sc.next();                // 할 작업을 입력받음
        String pw2 = sc.next();                 // 비밀번호를 입력받음

        if (cmd2.equals("get")) {               // cmd2이 "get"이라면
            int res = acc.getBalance(pw2);      // acc.getBalance(pw2) 결과를 res에 저장함
            System.out.println(res >= 0 ? res : "비밀번호 오류"); // res가 0보다 크거나 같다면 res를 실행, 그렇지 않다면 비밀번호 오류 출력
        }

        sc.close();                             // 스캐너 닫기
    }
}