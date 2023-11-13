package christmas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuCategory {
    public static List<String> appetizer = new ArrayList<String>();
    public static List<String> mainDish = new ArrayList<String>();
    public static List<String> dessert = new ArrayList<String>();
    public static List<String> drink = new ArrayList<String>();
    public static int amountOfDessert = 0;
    public static int amountOfMainDish = 0;

    public static void categorizeMenu() {
        appetizer = Arrays.asList(Menu.MUSHROOM_SOUP.getName(), Menu.TAPAS.getName(), Menu.CAESAR_SALAD.getName());
        mainDish = Arrays.asList(Menu.T_BONE_STEAK.getName(), Menu.BARBEQUE_RIB.getName(), Menu.SEAFOOD_PASTA.getName(), Menu.CHRISTMAS_PASTA.getName());
        dessert = Arrays.asList(Menu.CHOCO_CAKE.getName(), Menu.ICE_CREAM.getName());
        drink = Arrays.asList(Menu.ZERO_COKE.getName(), Menu.RED_WINE.getName(), Menu.CHAMPAGNE.getName());
    }

    public static void countDessert() {
        categorizeMenu();
        
        for (int i = 0; i < dessert.size(); i++)
            if (Order.userOrder.containsKey(dessert.get(i))) {
                amountOfDessert += Order.userOrder.get(dessert.get(i));
            }
    }

    public static void countMainDish() {
        for (int i = 0; i < mainDish.size(); i++)
            if (Order.userOrder.containsKey(mainDish.get(i))) {
                amountOfMainDish += Order.userOrder.get(mainDish.get(i));
            }
    }
}
