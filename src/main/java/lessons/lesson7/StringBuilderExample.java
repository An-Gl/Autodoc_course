package lessons.lesson7;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "0123456789";
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println(stringBuilder.substring(3));
        System.out.println(stringBuilder.substring(4,8));
        System.out.println(stringBuilder.replace(3,5, "ABCDE"));

        stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        stringBuilder.reverse();

        System.out.println(stringBuilder.delete(5,9));
        System.out.println(stringBuilder.deleteCharAt(1));
        System.out.println(stringBuilder.insert(1, "ONE"));
    }
}
