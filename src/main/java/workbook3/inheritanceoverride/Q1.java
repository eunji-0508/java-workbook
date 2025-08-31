package main.java.workbook3.inheritanceoverride;

// `Animal` 클래스를 정의하여 `eat()` 메서드와 `name` 필드를 포함하고, `Dog` 클래스가 `Animal`을 상속받아 `bark()` 메서드를 추가
// `main`에서 `Dog` 객체를 생성하여 `eat()`과 `bark()`를 호출
class Animal {
    String name;
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public Dog() {
        super.name = "Dog"; // super 키워드 맛보기
    }
    void bark() {
        System.out.println("Barking...");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        dog.eat();
        dog.bark();
    }
}
