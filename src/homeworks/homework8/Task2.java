package homeworks.homework8;

public class Task2 {

//Заполнить массив из 10 элементов случайными целыми
// числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.
    public static void main(String[] args) {
        printMaxFromArrayOfRandomNumbers(10, 10, 20);
    }

    public static void printMaxFromArrayOfRandomNumbers(int arrLength,
                                                        int randomLowerBound, int randomUpperBound) {
        //формула если значение верхнего диапазона включается
        //( Math.random() * (b - a + 1) + a;
        int[] array = new int[arrLength];
        int sum = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (randomUpperBound - randomLowerBound + 1) + randomLowerBound);
            sum = sum + array[i];
            //проверить вcе числа в массиве
            //System.out.print(array[i] + ", ");
        }
        average =  sum / arrLength;
        System.out.println("\n" + average);
    }
}