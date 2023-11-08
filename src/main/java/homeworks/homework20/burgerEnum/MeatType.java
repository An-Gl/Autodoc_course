package homeworks.homework20.burgerEnum;

public enum MeatType {

    BEEF(3.75),
    CHICKEN(2.85),
    FISH(3.15);

    private final double cost;

    public double getCost() {
        return cost;
    }

    MeatType(double cost) {
        this.cost = cost;
    }

}
