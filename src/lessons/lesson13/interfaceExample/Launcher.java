package lessons.lesson13.interfaceExample;



public class Launcher {
    public static void main(String[] args) {
        ICar bmw = new Bmw();
        getInfoAboutCar(bmw);
        bmw.getFuel(ICar.OTHER_FUEL_TYPE);
        System.out.println(bmw.partsPrice(5986));
        bmw.otherMethod();

    }

    static void getInfoAboutCar(ICar car) {
        System.out.println("Максимальная скорость автомобиля " + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
