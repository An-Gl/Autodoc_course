package lessons.lesson13.continueExample;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i = 0; i <= 7; i++) {
            System.out.println("я выполнился " + i + " раз перед continue");
            if (i > 2) continue;
            System.out.println("    " + i + " я выполнюсь до continue");
        }
    }
}
