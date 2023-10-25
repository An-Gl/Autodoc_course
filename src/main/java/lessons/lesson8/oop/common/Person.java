package lessons.lesson8.oop.common;

public class Person {

    int year = 1989;
    String name = "Anna";

    public void sayHello() {
        System.out.println("Hello");
    }

    public void aboutPerson() {
        System.out.println("Person name: " + name + " and date of birth " + year);
    }
}
