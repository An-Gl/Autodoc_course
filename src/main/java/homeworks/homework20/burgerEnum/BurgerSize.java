package homeworks.homework20.burgerEnum;

public enum BurgerSize {
    SMALL(5.00),
    MEDIUM(7.25),
    LARGE(9.50);


    private final double cost;

    public double getCost() {
        return cost;
    }

    BurgerSize(double cost) {
        this.cost = cost;
    }

}