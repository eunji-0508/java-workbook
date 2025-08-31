package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Employee {
    abstract double getPay(); // TODO: 급여 반환
}

class FullTimeEmployee extends Employee {
    double monthlySalary;     // 월급

    // 생성자
    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double getPay() {
        // TODO: 정규직 급여 계산
        return monthlySalary;   // 월급 그대로 받음
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate, hours;   // 시급, 시간

    // 생성자
    PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double getPay() {
        // TODO: 시간제 급여 계산
        return hourlyRate * hours;  // 시급 * 시간만큼의 급여를 받음
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        // 첫 번째 직원
        String type1 = sc.next();               // 유형을 입력받음 (full, part)

        Employee e1;

        if (type1.equals("full")) {             // 유형이 "full"이라면
            double salary = sc.nextDouble();    // 월급을 입력함
            e1 = new FullTimeEmployee(salary);  // salary를 매개변수로 하는 FullTimeEmployee 객체를 생성하여 e1에 할당함
        } else { // type1 == "part"             // 그렇지 않다면
            double rate = sc.nextDouble();      // 시급을 입력받음
            double h = sc.nextDouble();         // 시간을 입력받음
            e1 = new PartTimeEmployee(rate, h); // rate, h를 매개변수로 하는 PartTimeEmployee 객체를 생성하여 e1에 할당함
        }

        // 두 번째 직원
        String type2 = sc.next();               // 유형을 입력받음 (full, part)

        Employee e2;

        if (type2.equals("full")) {             // 유형이 "full"이라면
            double salary = sc.nextDouble();    // 월급을 입력함
            e2 = new FullTimeEmployee(salary);  // salary를 매개변수로 하는 FullTimeEmployee 객체를 생성하여 e2에 할당함
        } else {                                // 그렇지 않다면
            double rate = sc.nextDouble();      // 시급을 입력받음
            double h = sc.nextDouble();         // 시간을 입력받음
            e2 = new PartTimeEmployee(rate, h); // rate, h를 매개변수로 하는 PartTimeEmployee 객체를 생성하여 e2에 할당함
        }

        System.out.println(e1.getPay());        // e1 객체의 getPay() 메서드를 실행함
        System.out.println(e2.getPay());        // e2 객체의 getPay() 메서드를 실행함

        sc.close();                             // 스캐너 닫기
    }
}
