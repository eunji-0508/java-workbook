package main.java.workbook3.constructor;

import java.util.Scanner;

// `Employee` 클래스에서 이름, 부서, 연봉을 매개변수로 받는 생성자와
// 이름만 받는 생성자,
// 매개변수가 없는 생성자를 작성하여 각각의 객체를 생성하고 정보를 출력하는 프로그램을 작성
class Employee {
    String name;                    // 이름을 나타낼 변수
    String dept;                    // 부서를 나타낼 변수
    int salary;                     // 연봉을 나타낼 변수

    // 기본 생성자
    Employee() {
        this.name = "Unknown";      // Employee 클래스의 name을 Unknown으로 초기화
        this.dept = "Unknown";      // Employee 클래스의 dept를 Unknown으로 초기화
        this.salary = 0;            // Employee 클래스의 salary를 0으로 초기화
    }

    // name, dept, salary를 매개변수로 하는 생성자
    Employee(String name, String dept, int salary) {
        this.name = name;           // Employee 클래스의 name을 매개변수 name으로 초기화
        this.dept = dept;           // Employee 클래스의 dept를 매개변수 dept로 초기화
        this.salary = salary;       // Employee 클래스의 salary를 매개변수 salary로 초기화
    }

    // name을 매개변수로 하는 생성자
    Employee(String name) {
        this.name = name;           // Employee 클래스의 name을 매개변수 name으로 초기화
        this.dept = "Unknown";      // Employee 클래스의 dept를 Unknown으로 초기화
        this.salary = 0;            // Employee 클래스의 salary를 0으로 초기화
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // 스캐너 열기

        String name1 = sc.next();                           // 이름을 입력받음
        String dept1 = sc.next();                           // 부서를 입력받음
        int sal1 = sc.nextInt();                            // 연봉을 입력받음

        String name2 = sc.next();                           // 이름을 입력받음

        Employee e1 = new Employee();                       // 기본 생성자를 이용하여 e1 객체 생성
        Employee e2 = new Employee(name1, dept1, sal1);     // name, dept, salary를 매개변수로 하는 생성자를 이용하여 e2 객체 생성
        Employee e3 = new Employee(name2);                  // name을 매개변수로 하는 생성자를 이용하여 e3 객체 생성

        System.out.println(e1.name + " " + e1.dept + " " + e1.salary);  // e1 객체의 name, dept, salary 값을 출력함
        System.out.println(e2.name + " " + e2.dept + " " + e2.salary);  // e2 객체의 name, dept, salary 값을 출력함
        System.out.println(e3.name + " " + e3.dept + " " + e3.salary);  // e3 객체의 name, dept, salary 값을 출력함

        sc.close();                                         // 스캐너 닫기
    }
}
