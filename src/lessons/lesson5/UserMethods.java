package lessons.lesson5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UserMethods {
    public static void main(String[] args) {
    sayHello();
    getStrAndPrint("Hello guys");
    getStrAndPrint("Hello, I'm Anna");
    System.out.println(sum(5, 5));
    int res = sum(10, 7);
    System.out.println(res);

    String aboutYou = getNameAndSurname("Anna", "Glovatska", 33);
    System.out.println(aboutYou);

    sumFromConsole();

    int sumOfOrder = 100;
    int finalSum = sumFromConsoleReturned() + sumOfOrder;
    System.out.println(finalSum);
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void getStrAndPrint(String str){
        System.out.println("You enter " + str);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static String getNameAndSurname(String name, String surname, int age){
        return name + " " + surname + " " + age;
    }

    public static void sumFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }

    public static int sumFromConsoleReturned() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;

    }
}
