package javabasic.example12;

public class Person {
    public String name;
    public int age; //인스턴스 변수

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("제 이름은 %s 제 나이는 %d입니다.",name,age);
    }
}
