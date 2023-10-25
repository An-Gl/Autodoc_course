package lessons.lesson3.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner1.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner1.nextInt();
        int result = number1 + number2;
        System.out.println("Enter your name");
        String name = scanner2.nextLine();
        System.out.println(name + " " + result);
    }
}
