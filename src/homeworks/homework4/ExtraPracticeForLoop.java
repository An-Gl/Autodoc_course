package homeworks.homework4;

import java.util.Scanner;

public class ExtraPracticeForLoop {
    public static void main(String[] args) {
        printSum();
    }

    //Напишите программу, где пользователь вводит любое
    // целое положительное число. А программа суммирует все числа
    // от 1 до введенного пользователем числа.
    public static void printSum() {
        System.out.println("Введите любое целое число");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
