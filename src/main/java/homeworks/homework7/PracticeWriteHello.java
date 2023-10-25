package homeworks.homework7;

public class PracticeWriteHello {
    public static void main(String[] args) {
        repeatStr(3, "Hello");
    }
    public static String repeatStr(int repeat, String str) {
        for (int i = 1; i <= repeat; i++) {
            System.out.print(str);
        }
        return str;
    }
}




