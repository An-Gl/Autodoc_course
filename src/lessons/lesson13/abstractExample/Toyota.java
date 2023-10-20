package lessons.lesson13.abstractExample;

public class Toyota extends Car{
    public Toyota(String fuelType) {
        super(fuelType);
    }

    @Override
    String maxSpeed() {
        return "180";
    }

    @Override
    void drive() {
        System.out.println("TOYOTA drive");
    }

    @Override
    void brake() {
        System.out.println("TOYOTA brake");
    }
}
