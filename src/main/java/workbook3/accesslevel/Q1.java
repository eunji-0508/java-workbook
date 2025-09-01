package main.java.workbook3.accesslevel;

import java.util.Scanner;

// `Account` 클래스에서 잔액(balance)을 private으로 선언하고, 입금과 출금을 위한 public 메서드를 작성하여 잔액을 안전하게 조작하는 프로그램을 작성
class Account {
    private int balance;            // 잔액

    // 생성자
    Account(int balance) {
        this.balance = balance;     // balance를 매개변수 balance로 초기화
    }

    public void deposit(int amount) {
        // TODO: balance 증가
        balance += amount;          // balance = balance + amount
    }

    public void withdraw(int amount) {
        // TODO: balance 감소
        if (balance >= amount) {
            balance -= amount;          // balance = balance = amount
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        int bal = sc.nextInt();                 // 잔액을 입력받음
        String cmd1 = sc.next();                // 어떤 작업을 할 건지 입력받음
        int amt1 = sc.nextInt();                // 금액을 입력받음

        String cmd2 = sc.next();                // 어떤 작업을 할 건지 입력받음
        int amt2 = sc.nextInt();                // 금액을 입력받음

        Account acc = new Account(bal);         // 객체 생성

        if (cmd1.equals("deposit")) {           // cmd1이 "deposit"라면
            acc.deposit(amt1);                  // acc 객체의 deposit() 메서드 실행
        } else {                                // 그렇지 않다면
            acc.withdraw(amt1);                 // acc 객체의 withdraw() 메서드 실행
        }

        if (cmd2.equals("deposit")) {           // cmd2이 "deposit"라면
            acc.deposit(amt2);                  // acc 객체의 deposit() 메서드 실행
        } else {                                // 그렇지 않다면
            acc.withdraw(amt2);                 // acc 객체의 withdraw() 메서드 실행
        }

        System.out.println(acc.getBalance());   // acc 객체의 getBalance() 메서드 실행

        sc.close();                             // 스캐너 닫기
    }
}