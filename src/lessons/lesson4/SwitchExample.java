package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
switchCondition();
    }
    public static void switchCondition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Вы ввели чило 1");
                break;
            case 2:
                System.out.println("Вы ввели чило 2");
                break;
            case 3:
                System.out.println("Вы ввели чило 3");
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");;
        }
    }
}

