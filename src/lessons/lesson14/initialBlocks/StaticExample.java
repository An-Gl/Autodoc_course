package lessons.lesson14.initialBlocks;

public class StaticExample {
    static String name;
    static int age;
    static boolean isWork;

    static {
        name = "Anna";
        age = 33;
        isWork = true;
    }

    public StaticExample() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWork() {
        return isWork;
    }
}

