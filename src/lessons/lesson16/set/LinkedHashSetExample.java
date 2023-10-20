package lessons.lesson16.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    static Set<String> mySet = new LinkedHashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Anna");
        containsMethodExample(mySet, "Alex");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isEmptyMethodExample(mySet);
    }

    static void addMethodExample(Set<String> someSet) {
        someSet.add("Alex");
        someSet.add("Alex");
        someSet.add("Max");
        someSet.add("Igor");
        someSet.add("Anna");
        System.out.println(someSet);
    }

    static void removeMethodExample(Set<String> someSet, String removeObject) {
        System.out.println("Before remove");
        System.out.println(someSet);
        someSet.remove(removeObject);
        System.out.println("After remove");
        System.out.println(someSet);
    }
    static void containsMethodExample(Set<String> someSet, String containsObject) {
        System.out.println("Set contains " + containsObject + " - " + someSet.contains(containsObject));
    }

    static void sizeMethodExample(Set<String> someSet) {
        System.out.println("Set size " + someSet.size());
    }

    static void clearMethodExample(Set<String> someSet) {
        System.out.println("Set size before clear " + someSet.size());
        someSet.clear();
        System.out.println("Set size after clear " + someSet.size());
    }

    static void isEmptyMethodExample(Set<String> someSet) {
        System.out.println("Is set empty " + " - " + someSet.isEmpty());
        someSet.add("Alex");
        someSet.add("Max");
        someSet.add("Igor");
        someSet.add("Anna");
        System.out.println("Set is empty " + " - " + someSet.isEmpty());
    }


}
