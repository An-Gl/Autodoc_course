package lessons.lesson13.interfaceExample;

public interface ICar extends IParts, IOther {

    final static  String OTHER_FUEL_TYPE = "Diesel";

    String maxSpeed();
    void drive();
    void brake();

    default void getFuel(String fuelType) {
        System.out.println(fuelType);
    }

    private void utilMethod() {
        //method only for interface usage
    }
}
