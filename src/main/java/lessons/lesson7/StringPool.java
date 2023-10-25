package lessons.lesson7;

public class StringPool {
    public static void main(String[] args) {
        String name = "Anna";
        String name2 = "Anna";

        String name3 = new String("Anna");
        String name4 = new String("Anna");

        String name5 = new String("Anna").intern();
        String name6 = new String("Anna").intern();

        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name5 == name6);
        System.out.println(name == name6);
    }
}
