package homeworks.homework7;

public class PracticeFirstLetterToUpperCase {
    public static void main(String[] args) {
        System.out.println(replaceFirstLetterToUpperCase("hello its anna"));
    }
    public static String replaceFirstLetterToUpperCase(String text) {
        StringBuilder builder = new StringBuilder(text);
        //выставляем первый символ заглавным, если это буква
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));

        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < text.length(); i++)
            if (Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        return builder.toString();
    }







}
