package homeworks.homework30;

import java.util.*;
import java.util.stream.Collectors;


public class Launcher {

    public static void main(String[] args) {

        PersonComparatorByName personComparatorByName = new PersonComparatorByName();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 22));
        personList.add(new Person("Charlie", 28));
        personList.add(new Person("David", 26));

        List<String> personStream = personList.stream()
                .filter(x-> x.getAge() > 25)
                .sorted(personComparatorByName)
                .map(x-> x.getName() + " - " + x.getAge())
                .collect(Collectors.toList());
        personStream.forEach(System.out::println);
    }
}
