package christmas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuCategory {
    public static List<String> appetizer = new ArrayList<String>();
    public static List<String> mainDish = new ArrayList<String>();
    public static List<String> dessert = new ArrayList<String>();
    public static List<String> drink = new ArrayList<String>();

    public static void categorizeMenu() {
        appetizer = Arrays.asList(Menu.MUSHROOM_SOUP.getName(), Menu.TAPAS.getName(), Menu.CAESAR_SALAD.getName());
        mainDish = Arrays.asList(Menu.T_BONE_STEAK.getName(), Menu.BARBEQUE_RIB.getName(), Menu.SEAFOOD_PASTA.getName(), Menu.CHRISTMAS_PASTA.getName());
        dessert = Arrays.asList(Menu.CHOCO_CAKE.getName(), Menu.ICE_CREAM.getName());
        drink = Arrays.asList(Menu.ZERO_COKE.getName(), Menu.RED_WINE.getName(), Menu.CHAMPAGNE.getName());
    }
}
