package lessons.lesson17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilMethodsForCollections {
    public static void main(String[] args) {
        frequencyMethod();
    }

    public static void asListMethod() {
        String[] arr = {"Foo", "baaa", "baz"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
    public static void sortMethod() {
        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue");
        System.out.println("Collection before sort: " + colorList);
        Collections.sort(colorList);
        System.out.println("Collection after sort: " + colorList);

        colorList.sort(Collections.reverseOrder());
        System.out.println("Collection after reverseOrder: " + colorList);

        Collections.reverse(colorList);
        System.out.println("Collection after reverseOrder: " + colorList);
    }

    public static void shuffleMethod() {
        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue", "Green", "Orange");
        System.out.println("Collection before shuffle: " + colorList);
        Collections.shuffle(colorList);
        System.out.println("Collection after sort: " + colorList);
    }

    public static void minMaxMethod() {
        List<Integer> numberList = Arrays.asList(12, 36, 15, 19, 25, 26, 1, 55, 1, 1, 0, 55);
        System.out.println(Collections.max(numberList));
        System.out.println(Collections.min(numberList));
    }

    public static void frequencyMethod() {
        List<Integer> numberList = Arrays.asList(12, 36, 15, 19, 25, 26, 1, 55, 1, 1, 0, 55);
        System.out.println(Collections.frequency(numberList, 1));
    }
}
