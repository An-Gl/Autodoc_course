package lessons.lesson16.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    static Set<String> mySet = new HashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Anna");
        containsMethodExample(mySet, "Alex");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isEmptyMethodExample(mySet);
        howToGetSet(mySet, 1);
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
        System.out.println("Set is empty " + someSet.isEmpty());
        someSet.add("Alex");
        someSet.add("Max");
        someSet.add("Igor");
        someSet.add("Anna");
        System.out.println("Set is empty  " + someSet.isEmpty());
    }

    static void howToGetSet(Set<String> someSet, int element) {
        List<String> myList = new ArrayList<>(someSet);
        System.out.println("This list from set " + myList.get(element));
    }


}
