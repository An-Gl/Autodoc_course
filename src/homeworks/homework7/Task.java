package homeworks.homework7;

public class Task {
    public static void main(String[] args) {
        printMaxFromArrayOfRandomNumbers(8, 0, 100);
    }

    public static void printMaxFromArrayOfRandomNumbers(int arrLength,
                                                        int randomLowerBound, int randomUpperBound) {
        //формула если значение верхнего диапазона включается
        //( Math.random() * (b - a + 1) + a;
        int[] array = new int[arrLength];
        int maxInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (randomUpperBound - randomLowerBound + 1) + randomLowerBound);
            if (array[i] > maxInArray) {
                maxInArray = array[i];
            }
            //проверить вcе числа в массиве
            //System.out.print(array[i] + ", ");
        }
        System.out.println("\n" + maxInArray);
    }
}
