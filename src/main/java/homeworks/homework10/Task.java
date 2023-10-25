package homeworks.homework10;

public class Task {
    //Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
    //Массив от 1 до 10!
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArrayWithReplacedElements(array);
    }

    public static void printArrayWithReplacedElements(int[] array) {
        String[] strArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strArr[i] = String.valueOf(array[i]);
            if (array[i] % 2 == 0) {
                strArr[i] = "Y";
            }
            System.out.print(strArr[i] + " ");
        }
    }
}
