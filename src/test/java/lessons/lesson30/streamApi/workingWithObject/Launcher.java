package lessons.lesson30.streamApi.workingWithObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Launcher {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("BMW", 2020));
        carList.add(new Car("Toyota", 2008));
        carList.add(new Car("Lamborghini", 2023));
        carList.add(new Car("Lexus", 2006));
        carList.add(new Car("KIA", 2019));

        Stream<Car> carStream = carList.stream()
                .filter(x-> x.getYear() > 2012)
                .filter(x-> !"BMW".equalsIgnoreCase(x.getModel()));
        carStream.forEach(x-> System.out.println(x.getModel()));
    }
}
