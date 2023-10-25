package homeworks.homework5;

public class Homework1 {
    public static void main(String[] args) {
        int result = getMinimum(7, 3);
        System.out.println("Меньшее из двух чисел : " + result);
    }

    public static int getMinimum(int num1, int num2) {
        return Math.min(num1, num2);
    }
}
