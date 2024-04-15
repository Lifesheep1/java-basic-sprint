package javabasic;
import javabasic.example12.Person;
import org.w3c.dom.ls.LSOutput;

public class Example12 {
    /**
    * Person 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요. 해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.
    */
    public static void main(String[] args) {
        Person jungmin = new Person("jungmin", 30); //이게 이해가 안됨 어떻게 타입이 Person이 될수가 잇슴?
        System.out.println(jungmin.name);
        System.out.println(jungmin.age);
    }

    }




