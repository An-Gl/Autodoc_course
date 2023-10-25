package lessons.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        equalsIgnoreCaseMethods();
        lastIndexOfMethod();
        valueOfMethod();
    }

    public static void equalsIgnoreCaseMethods() {
        String str = "Hello, my name is Anna";
        if(str.equals("Hello, my name is ANNA")){
            System.out.println("OK");
        } else {
            System.out.println("Failed");
        }

        if(str.equalsIgnoreCase("Hello, my name is ANNA")){
            System.out.println("OK with ignore case");
        } else {
            System.out.println("Failed");
        }
    }
    public static void lastIndexOfMethod() {
        String str = "Hello, my name is Alex";
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
    }
    public static void valueOfMethod() {
        int num = 56234;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }
}
