package homeworks.homework13;

public class LuckyNumberV0 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if (i < 3) continue;
            System.out.println("Вот счастливое число: " + i);
            break;
        }
    }
}

