package lessons.lesson7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Random {
    public static void main(String[] args) {
    //[0,1) - включительно, 1 исключая
        //randomDefault();
        //randomCustom();
        //randomCustom2();
        //randomCustom3();
        //если необходимо вызвать несколько методов класса запись сканнера такая
        //Scanner scanner = new Scanner(System.in);
        //String str1 = scanner.next();
        //String str2 = scanner.nextLine();

        // если нужно использовать только один метод из класса запись  сканнера может быть таким
        //String str = new Scanner(System.in).nextLine();

        IntStream a = new java.util.Random().ints(0, 5);
        System.out.println(a.toString());
    }
    public static void randomDefault() {
        double a = Math.random();
        System.out.println(a);
    }
    public static void randomCustom() {
        //(Math.random() * (b - a)) + a;
        //[0, 3) - (Math.random() * (3 - 0)) + 0;
        double random = Math.random() * 3;
        System.out.println(random);
    }

    public static void randomCustom2() {
        //(Math.random() * (b - a)) + a;
        //[2, 3) - (Math.random() * (3 - 2)) + 2 -> Math.random() * 1 + 2 -> Math.random() + 2;
        double random = Math.random() + 2;
        System.out.println(random);
    }
    public static void randomCustom3() {
        //(Math.random() * (b - a)) + a;
        //[0, 3) - (Math.random() * (3 - 0)) + 0;
        // int [0, 2]
        int random = (int) (Math.random() * 3);
        System.out.println(random);
    }

}
