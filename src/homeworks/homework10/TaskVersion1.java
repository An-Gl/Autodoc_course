package homeworks.homework10;

public class TaskVersion1 {
    public static void main(String[] args) {
        printArrayWithReplacedElements(50);
    }
    //Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
    //Массив от 1 до 10!
    public static void printArrayWithReplacedElements(int arrLength) {
        int[] array = new int[arrLength];
        String[] strArr = new String[arrLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            strArr[i] = String.valueOf(array[i]);
            if (array[i] % 2 == 0) {
                strArr[i] = "Y";
            }
            System.out.print(strArr[i] + " ");
        }
    }
}




