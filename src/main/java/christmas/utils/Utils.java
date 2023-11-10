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
        for (int i = 0; i < Order.orderedMenu.size(); i++) {
            if (MenuCategory.dessert.contains(Order.orderedMenu.get(i))) {
                return true;
            }
        }
    }
}
