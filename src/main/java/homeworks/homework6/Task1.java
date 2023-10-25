package homeworks.homework6;

public class Task1 {
    public static void main(String[] args) {
        printPyramid(5,'*');
    }

    public static void printPyramid(int rowQuantity, char symbol) {
        for (int i = 1; i <= rowQuantity; i++) {
            for (int j = i; j < rowQuantity; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(symbol + " ");
            }
            System.out.print("\n");
        }
    }
}
