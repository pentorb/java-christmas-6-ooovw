package christmas.utils;

import christmas.model.MenuCategory;
import christmas.model.Order;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Utils {

    public static int getDayOfWeek(int date) {
        LocalDate dateOfVisit = LocalDate.of(2023, 12, date);
        DayOfWeek dayOfVisit = dateOfVisit.getDayOfWeek();
        return dayOfVisit.getValue();
    }

    public static boolean isDessert() {
        boolean result = false;

        for (int i = 0; i < MenuCategory.dessert.size(); i++)
            if (Order.userOrder.containsKey(MenuCategory.dessert.get(i))) {
                result = true;
            }
        return result;
    }

    public static boolean isMainDish() {
        boolean result = false;

        for (int i = 0; i < MenuCategory.mainDish.size(); i++) {
            if (Order.userOrder.containsKey(MenuCategory.mainDish.get(i))) {
                result = true;
            }
        }
        return result;
    }
}
