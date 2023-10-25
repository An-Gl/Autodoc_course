package lessons.lesson6;

import java.util.Scanner;

public class PracticeWordsCount {
    public static void main(String[] args) {
wordCount();
    }

    public static void wordCount() {
        System.out.println("Введите фразу");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("Количество слов в строке: " + count);
    }
}
