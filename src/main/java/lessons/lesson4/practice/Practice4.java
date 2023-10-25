package lessons.lesson4.practice;

public class Practice4 {
    public static void main(String[] args) {
        pracriceWithWhile();
        pracriceWithFor();
    }

    public static void pracriceWithWhile() {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i *= 2;
        }
    }
    public static void pracriceWithFor() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }
}
