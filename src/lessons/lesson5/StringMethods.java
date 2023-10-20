package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMethod();
        trimMethod();
        endsWithMethod();
        caseMethods();
        equalsMethods();
        containsMethod();
        charAtMethod();
        toCharArrayMethod();
        indexOfMethod();
        substringMethod();
        replaceMethod();
    }

    public static void lengthMethod() {
        String name = "Alex Alex";
        System.out.println(name.length());
    }

    public static void concatMethod() {
        String text1 = "Hello ";
        String text2 = "world";
        String result = text1.concat(text2);
        System.out.println(result);
    }

    public static void trimMethod() {
        String str = "             My name is Anna          ".trim();
        String str2 = "             My name is Anna          ";
        System.out.println(str);
        System.out.println(str2);
    }

    public static void endsWithMethod() {
        String str = "My name is Anna";
        boolean ends1 = str.endsWith("Anna");
        boolean ends2 = str.endsWith("Max");
        System.out.println(ends1);
        System.out.println(ends2);
    }

    public static void caseMethods() {
        String str = "My name is Anna";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();
        System.out.println(toUpper);
        System.out.println(toLower);
    }

    public static void equalsMethods() {
        String str = "My name is Anna";
        String str2 = "My name is Anna";
        String str3 = "My name is Anna   ";

        boolean resultOfCompare = str.equals(str2);
        boolean resultOfCompare2 = str.equals(str3);

        System.out.println(resultOfCompare);
        System.out.println(resultOfCompare2);
    }

    public static void containsMethod() {
        String str = "My name is Anna";
        String str2 = "Anna";
        boolean resultOfContains = str.contains(str2);
        System.out.println(resultOfContains);
    }

    public static void charAtMethod() {
        String str = "My name is Anna";
        char result = str.charAt(4);
        System.out.println(result);
    }

    public static void toCharArrayMethod() {
        String str = "My name is Anna";
        char[] result = str.toCharArray();
        for (Character r : result) {
            System.out.print(r + " ");
        }
    }

    public  static void indexOfMethod() {
        String str = "My name is Anna";
        System.out.println(" ");
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("Anna"));
        System.out.println(str.indexOf("fdsjhgs"));
    }
    public  static void substringMethod() {
        String str = "My name is Anna";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 7));
    }

    public  static void replaceMethod() {
        String str = "My name is Anna";
        String replacedStr = str.replace("Anna", "Olga");
        System.out.println(replacedStr);
    }
}
