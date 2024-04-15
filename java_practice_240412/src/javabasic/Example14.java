package javabasic;

import example13.Book;
import javabasic.example12.Person;

public class Example14 {
    /**
     * Person 객체를 두 개 생성하고, 각 객체에 대한 정보를 출력하세요. 이어서 Book 객체를 생성하고, 그 정보를 출력하세요.
     *
     */
    public static void main(String[] args) {
        Person person1 = new Person("jungmin",30);
        Person person2 = new Person("coding", 21);
        person1.introduce();
        person2.introduce();
        Book book = new Book("자바 기초",10000);
        book.printPrice();
        book.printAuthor();
        book.printTitle();
    }
}