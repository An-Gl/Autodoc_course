package lessons.lesson3.conditional;

public class SimpleExample {
    public static void main(String[] args) {
        simple();
    }
    public static void simple() {
        int num1 = 6;
        int num2 = 7;
        if(num1 == num2){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers aren't equal");
        }
    }
    public static void difficult() {
        int num1 = 6;
        int num2 = 6;
        if (num1 != num2) {
            System.out.println("Numbers aren't equal");
        } else if (num1 > num2) {
            System.out.println("Number1 is bigger than Number2 ");
        } else if (num1 < num2) {
            System.out.println("Number2 is bigger than Number1");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
