package main.java.workbook3.thissuper;

import java.util.Scanner;

// `Employee` 클래스의 `printInfo()` 메서드를 `Manager` 클래스에서 오버라이딩하여,
// `super`를 사용해 부모의 `printInfo()`를 호출하고 추가 정보를 출력하는 프로그램을 작성
class Employee {
    String name, dept;      // 이름, 부서
    int salary;             // 연봉

    // 생성자
    Employee(String name, String dept, int salary) {
        this.name = name;       // name을 매개변수 name 값으로 초기화
        this.dept = dept;       // dept를 매개변수 dept 값으로 초기화
        this.salary = salary;   // salary를 매개변수 salary 값으로 초기화
    }

    void printInfo() {
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary);  // name, dept, salary를 출력함
    }
}

class Manager extends Employee {
    String team;                // 팀

    // 생성자
    Manager(String name, String dept, int salary, String team) {
        // TODO: super() 호출 및 team 초기화
        super(name, dept, salary);      // 부모 클래스 생성자 호출
        this.team = team;               // team을 매개변수 team의 값으로 초기화
    }

    @Override
    void printInfo() {
        // TODO: super.printInfo() 호출 후 팀 정보 출력
        super.printInfo();                              // 부모 클래스의 printInfo() 메서드를 호출
        System.out.println(", team: " + this.team);       // team을 출력함
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 열기

        String n = sc.next();                           // 이름을 입력받음
        String d = sc.next();                           // 부서를 입력받음
        int s = sc.nextInt();                           // 연봉을 입력받음

        String t = sc.next();                           // 팀을 입력받음

        Manager m = new Manager(n, d, s, t);            // n, d, s, t를 이용하여 Manager 객체를 생성
        m.printInfo();                                  // m 객체의 printInfo() 메서드를 실행함

        sc.close();                                     // 스캐너 닫기
    }
}
