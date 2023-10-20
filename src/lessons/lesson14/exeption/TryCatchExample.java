package lessons.lesson14.exeption;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) throws IOException {
        //writeSmth();
        writeSmthWithThrows();
    }

    public static void writeSmth() {
        try {
            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.write("smth");
            fileWriter.close();
            fileWriter.write("smth more");
        } catch (IOException e) {
            System.err.println("err. open stream");
        } finally {
            System.out.println("я выполнюсь всегда");
        }
        System.out.println("программа работает дальше");
    }

    public static void writeSmthWithThrows() throws IOException {

            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.write("smth");
            fileWriter.close();
            fileWriter.write("smth more");
                System.out.println("программа работает дальше");
    }
}
