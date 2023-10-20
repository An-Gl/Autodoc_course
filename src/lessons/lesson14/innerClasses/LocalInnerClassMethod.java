package lessons.lesson14.innerClasses;

public class LocalInnerClassMethod {
    int outerSum = 5;
    void someMethodOfOuterClass() {
        int sum = 16;
        class localMethodClass {
            public void print() {
                System.out.println(sum);
                System.out.println(outerSum);
            }
        }
        localMethodClass localMethodClass = new  localMethodClass();
        localMethodClass.print();
    }
}
