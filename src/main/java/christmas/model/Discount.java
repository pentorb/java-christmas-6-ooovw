package christmas.model;

import christmas.utils.Utils;

public class Discount {
    public static int amountOfDiscount;
    public static int dDayDiscount;
    public static int weekdayDiscount;
    public static int weekendDiscount;
    public static int specialDiscount;
    public static int present;


    private void receiveDDayDiscount(int date) {
        if (date <= 25) {
            dDayDiscount = 1000;
            for (int i = 1; i < date; i++) {
                dDayDiscount += 100;
            }
        }

        if (date > 25) {
            dDayDiscount = 0;
        }
    }

    private void receiveWeekdayDiscount(int date) {
        if ((Utils.getDayOfWeek(date) <= 4) || (Utils.getDayOfWeek(date) == 7)) {
            MenuCategory.countDessert();
            weekdayDiscount = 2023 * MenuCategory.amountOfDessert;
        }
    }
}
