package homeworks.homework6;

public class Task2 {
    public static void main(String[] args) {
        printLessonsHomeworks(3);
    }

    public static void printLessonsHomeworks(int lessonsNum) {
        for (int i = 1; i <= lessonsNum; i++) {
            if (i < lessonsNum) {
                System.out.println("Это " + i + "-й урок!" + "\n" +
                        "   Я выполнил все домашние задания " + i + "-го урока.");
            } else {
                System.out.println("Это " + i + "-й урок!" + "\n" +
                        "   Я не выполнил домашние задания " + i + "-го урока.");
            }
        }
    }
}
