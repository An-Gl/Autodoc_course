package homeworks.homework4;

public class ExampleBreakOperator {
    public static void main(String[] args) {
        int i = 1;
        int a = 3;
        while (i <= 5) {// цикл должен выполниться 5 раз
            System.out.println(i + ": цикл выполняется!");
            if (i == a)
                break;
            i++;
        }
    }
}
