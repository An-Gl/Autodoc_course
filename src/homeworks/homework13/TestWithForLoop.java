package homeworks.homework13;

public class TestWithForLoop {
    public static void main(String args[]) {

        for (int a = 0; a <= 10; a++) {
            System.out.println("    Я выполняюсь " + a + " раз до break");
            if (a == 2)
                break;
            System.out.println(a);
        }
    }
}

