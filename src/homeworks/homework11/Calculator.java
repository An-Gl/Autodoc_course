package homeworks.homework11;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Ошибка, вам необходимо ввести целое число. Повторите ввод");
            return getInt();
        }
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ операции: \n'+' - прибавить\n'-' - отнять" +
                "\n'*' - умножить\n'/' - разделить");
        String operation;
        if (scanner.hasNextLine()) {
            operation = scanner.nextLine();
        } else {
            System.out.println("Вы ввели несуществующую операцию. Повторите ввод");
            return getOperation();
        }
        switch (operation) {
            case "+":
                return '+';
            case "-":
                return '-';
            case "*":
                return '*';
            case "/":
                return '/';
            default:
                System.out.println("Неправильный код операции. Повторите ввод");
                return getOperation();
        }
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("На 0 делить нельзя. Введите другое число");
                    return -0;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.println("Ошибка. Повторите ввод");
                return calc(num1, num2, operation);
        }
    }
}
