package christmas.utils;

import christmas.model.MenuCategory;
import christmas.model.Order;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Integer> dessertIndex = new ArrayList<Integer>();

    public static int getDayOfWeek(int date) {
        LocalDate dateOfVisit = LocalDate.of(2023, 12, date);
        DayOfWeek dayOfVisit = dateOfVisit.getDayOfWeek();
        return dayOfVisit.getValue();
    }

    public static boolean isDessert() {
        boolean result = false;

        for (int i = 0; i < Order.orderedMenu.size(); i++) {
            if (MenuCategory.dessert.contains(Order.orderedMenu.get(i))) {
                result = true;
            }
        }
        return result;
    }

    public static void getDessertIndex() {
        for (int i = 0; i < Order.orderedMenu.size(); i++) {
            if (MenuCategory.dessert.contains(Order.orderedMenu.get(i))) {
                dessertIndex.add(i);
            }
        }
    }
}
