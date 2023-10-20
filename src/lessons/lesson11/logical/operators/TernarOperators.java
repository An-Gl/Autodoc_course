package lessons.lesson11.logical.operators;

public class TernarOperators {

    public static void main(String[] args) {
        simpleOperator("How are you?");
        ternarOperator("How are you?");
    }
    public static void simpleOperator(String str) {
        char lastCrar = str.charAt(str.length() - 1);
        if(lastCrar == '?') {
            System.out.println("question");
        } else {
            System.out.println("No question");
        }
    }

    public static void ternarOperator(String str) {
        var lastChar = str.charAt(str.length() - 1);
        String result = lastChar == '?' ? "question" : "No question";
        System.out.println(result);
    }
}
