package homeworks.homework20;

import homeworks.homework20.burgerEnum.BurgerSize;
import homeworks.homework20.burgerEnum.Ingredient;
import homeworks.homework20.burgerEnum.MeatType;
import homeworks.homework20.exception.BurgerIngredientException;
import homeworks.homework20.exception.BurgerMeatTypeException;
import homeworks.homework20.exception.BurgerSizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BurgerSizeException, BurgerMeatTypeException, BurgerIngredientException {

        System.out.println("Hello! Let's create your custom burger");
        System.out.println("Select your burger size: 1 - SMALL; 2 - MEDIUM; 3 - LARGE");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        BurgerSize burgerSize = getBurgerSize(size);

        System.out.println("Select your burger meat type: 1 - BEEF; 2 - CHICKEN; 3 - FISH");
        int meatType = scanner.nextInt();
        MeatType burgerMeatType = getBurgerMeatType(meatType);

        System.out.println("Add your burger ingredients: 1 - CHEESE; 2 - TOMATO; 3 - LETTUCE. " +
                "Continue to add if you want more than 0 or x1 of each. " +
                "To finish adding ingredients enter 0");
        List<Ingredient> burgerIngredients = new ArrayList<>();
        boolean isDone = false;
        while (!isDone) {
            int ingredient = scanner.nextInt();
            if (ingredient == 0) {
                isDone = true;
            } else {
                burgerIngredients.add(getBurgerIngredient(ingredient));
            }
        }
        Burger burger = new Burger(burgerSize, burgerMeatType, burgerIngredients);
        burger.displayBurgerInfo();
    }

    private static Ingredient getBurgerIngredient(int ingredient) throws BurgerIngredientException {
        return switch (ingredient) {
            case 1 -> Ingredient.CHEESE;
            case 2 -> Ingredient.TOMATO;
            case 3 -> Ingredient.LETTUCE;
            default -> throw new BurgerIngredientException("Invalid burger ingredient.");
        };
    }

    private static MeatType getBurgerMeatType(int meatType) throws BurgerMeatTypeException {
        return switch (meatType) {
            case 1 -> MeatType.BEEF;
            case 2 -> MeatType.CHICKEN;
            case 3 -> MeatType.FISH;
            default -> throw new BurgerMeatTypeException("Invalid burger meat type.");
        };
    }

    private static BurgerSize getBurgerSize(int size) throws BurgerSizeException {
        return switch (size) {
            case 1 -> BurgerSize.SMALL;
            case 2 -> BurgerSize.MEDIUM;
            case 3 -> BurgerSize.LARGE;
            default -> throw new BurgerSizeException("Invalid burger size.");
        };
    }
}
