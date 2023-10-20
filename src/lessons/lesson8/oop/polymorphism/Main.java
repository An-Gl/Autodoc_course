package lessons.lesson8.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(3, 5));
        System.out.println(add(23.5, 5.54));
        System.out.println(add("Anna", 33));
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int add (int a) {
        return a + 10;
    }

    public static double add (double a, double b) {
        return a + b;
    }

    public static String add (String a, int b) {
        return a + " " + b;
    }
}
