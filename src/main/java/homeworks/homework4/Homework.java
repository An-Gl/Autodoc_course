package homeworks.homework4;

public class Homework {
    public static void main(String[] args) {
        multiplicationTable();
        //whileLoop();
    }

    public static void multiplicationTable() {
        int num = 1;
        for (int j = 1; j <= 10; j++) {
            System.out.print("\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
            num++;
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i *= 2;
        }
    }
}

