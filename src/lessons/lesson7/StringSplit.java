package lessons.lesson7;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hi, my name is Anna";
        String[] textByWords = str.split(" ");
        for (String i: textByWords) {
            System.out.println(i);
        }
        System.out.println(textByWords[textByWords.length - 1]);
        System.out.println(textByWords[0]);
    }
}
