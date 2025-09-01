package main.java.workbook3.accesslevel;

import java.util.Scanner;

class LibraryBook {
    private String title;       // 제목
    private String author;      // 저자

    // 생성자
    LibraryBook(String title, String author) {
        this.title = title;     // title을 매개변수 title로 초기화
        this.author = author;   // author를 매개변수 author로 초기화
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 시작

        LibraryBook[] books = new LibraryBook[3];       // 배열의 크기가 3인 books 배열 생성

        for (int i = 0; i < 3; i++) {                   // i가 0이고, i가 3보다 작은 동안 i를 1씩 증가시키며 반복 수행
            String t = sc.next();                       // 제목을 입력받음
            String a = sc.next();                       // 저자를 입력받음
            books[i] = new LibraryBook(t, a);           // 객체를 books[i]에 할당함
        }

        for (LibraryBook b : books) {                   // books 배열의 요소에 하나씩 접근함 (향상된 for문)
            System.out.println(b.getTitle() + " " + b.getAuthor()); // 제목과 저자를 출력함
        }

        sc.close();                                      // 스캐너 닫기
    }
}
