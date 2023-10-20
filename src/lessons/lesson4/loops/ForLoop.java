package lessons.lesson4.loops;

public class ForLoop {
    public static void main(String[] args) {
        usingForWithArray();
    }
    public static void forLoopExample() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Привет, я Аня");
        }
    }
    public static void forLoopReverse() {
        for (int i = 3; i >= -3; i--) {
            System.out.print(i + " ");
        }
    }

    public static void usingForWithArray() {
        int[] arr = { 5, 7, 8, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
