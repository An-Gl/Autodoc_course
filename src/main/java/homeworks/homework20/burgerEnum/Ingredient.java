package homeworks.homework20.burgerEnum;

public enum Ingredient {
    CHEESE(1.15),
    TOMATO(0.75),
    LETTUCE(0.90);

    private final double cost;

    public double getCost() {
        return cost;
    }

    Ingredient(double cost) {
        this.cost = cost;
    }

}
