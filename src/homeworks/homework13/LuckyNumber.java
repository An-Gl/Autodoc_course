package homeworks.homework13;

public class LuckyNumber {

//    Необходимо написать программу «Счастливое число».
//    Давайте представим, что у нас есть промежуток из 10 чисел, счастливым числом будет являться 3!
//    Нужно написать программу, которая ищет счастливое число!
//    Программа перебирает числа по одному, и когда доходит до 3-го числа — напишет "Вот счастливое число!" и выходит из цикла.
//    При разработке необходимо использовать цикл и условный оператор!

    public static void main(String[] args) {

        getLuckyNumber(fillArrayWithNumbers(10, 1, 10));
    }

    public static int[] fillArrayWithNumbers(int arrLength,
                                             int randomLowerBound, int randomUpperBound) {
        int[] array = new int[arrLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (randomUpperBound - randomLowerBound + 1) + randomLowerBound);
            //проверить вcе числа в созданном массиве
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void getLuckyNumber(int[] array) {
        for (int i : array) {
            if (i == 3) {
                System.out.println("\n" + "Вот счастливое число: " + i);
                break;
            }
        }
    }
}
