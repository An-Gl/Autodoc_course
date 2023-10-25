package lessons.lesson12.staticMethods;

public class staticMethodsExample {

    static String str = "Hello";
    static void sayHello() {
        System.out.println(str); //str можно использовать только потому что str статическая переменная
    }
}
