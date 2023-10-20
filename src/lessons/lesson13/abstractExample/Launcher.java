package lessons.lesson13.abstractExample;

import lessons.lesson13.interfaceExample.IParts;

public class Launcher {
    public static void main(String[] args) {
        Car toyota = new Toyota("Diesel");
        getInfoAboutCar(toyota);
        toyota.getFuel();
        Car bmw = new Bmw();
        getInfoAboutCar(bmw);
        bmw.getFuel();
        Car nissan = new Nissan("Diesel");
        getInfoAboutCar(nissan);

    }
    static void getInfoAboutCar(Car car) {
        System.out.println("Максимальная скорость автомобиля " + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
