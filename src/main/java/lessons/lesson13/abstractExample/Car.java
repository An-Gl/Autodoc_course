package lessons.lesson13.abstractExample;

abstract class Car {

    private String fuelType;
    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    abstract String maxSpeed();
    abstract void drive();
    abstract void brake();

    void getFuel() {
        System.out.println(this.fuelType);
    }
}
