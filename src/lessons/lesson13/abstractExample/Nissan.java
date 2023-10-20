package lessons.lesson13.abstractExample;

public class Nissan extends Car {

    public Nissan(String fuelType) {
        super(fuelType);
    }

    @Override
    String maxSpeed() {
        return "160";
    }

    @Override
    void drive() {
        System.out.println("NISSAN drive");
    }

    @Override
    void brake() {
        System.out.println("NISSAN brake");
    }
}
