package homeworks.homework7;

public class PracticeCapitalizeFirstLetter {
    public static void main(String[] args) {
        String sentence = "Hi, my name is anna! i want to write every word from capital letter";
        String str = capitalize(sentence);
        System.out.println(str);

    }
    public static String capitalize(String str) {
        String[] textByWords = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : textByWords) {
            {
                if (!string.equals("")) {
                    stringBuilder.append(Character.toUpperCase(string.charAt(0)));
                    stringBuilder.append(string.substring(1));
                }
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
