package homeworks.homework17;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Harry Potter", 8.7));
        listOfStudents.add(new Student("Ron Weasley", 5.32));
        listOfStudents.add(new Student("Neville Longbottom", 3.1));
        listOfStudents.add(new Student("Hermione Granger", 9.67));
        listOfStudents.add(new Student("Luna Lovegood", 8.98));
        listOfStudents.add(new Student("Draco Malfoy", 7.64));
        listOfStudents.add(new Student("Cedric Diggory", 5.31));

        listOfStudents.sort(new StudentComparatorByAverageGrade());

        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}
