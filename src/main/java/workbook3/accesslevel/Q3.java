package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Employee {
    public String name;     // 이름
    private int salary;     // 연봉

    // 생성자
    Employee(String name, int salary) {
        this.name = name;       // name을 매개변수 name으로 초기화
        this.salary = salary;   // salary를 매개변수 salary로 초기화
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;   // salary 설정
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        String n1 = sc.next();                  // 이름을 입력받음
        int s1 = sc.nextInt();                  // 연봉을 입력받음

        String n2 = sc.next();                  // 이름을 입력받음
        int s2 = sc.nextInt();                  // 연봉을 입력받음

        int raise = sc.nextInt();               // 증가할 금액

        Employee e1 = new Employee(n1, s1);     // 객체 생성
        Employee e2 = new Employee(n2, s2);     // 객체 생성

        e1.setSalary(e1.getSalary() + raise);   // setSalary() 메서드 실행

        System.out.println(e1.getSalary() + " " + e2.getSalary());  // e1, e2의 getSalary() 메서드 실행 결과를 출력함

        sc.close();                             // 스캐너 닫기
    }
}
