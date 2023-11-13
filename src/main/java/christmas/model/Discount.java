package christmas.model;

import christmas.utils.Utils;

public class Discount {
    public static int amountOfDiscount;
    public static int dDayDiscount;
    public static int weekdayDiscount;
    public static int weekendDiscount;
    public static int specialDiscount;
    public static int present;
    public static int dateOfDay;


    private static void receiveDDayDiscount(int date) {
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

    private static void receiveWeekdayDiscount(int date) {
        if ((Utils.getDayOfWeek(date) <= 4) || (Utils.getDayOfWeek(date) == 7)) {
            MenuCategory.countDessert();
            weekdayDiscount = 2023 * MenuCategory.amountOfDessert;
        }
    }

    private static void receiveWeekendDiscount(int date) {
        if ((Utils.getDayOfWeek(date) > 4) && (Utils.getDayOfWeek(date) < 7)) {
            MenuCategory.countMainDish();
            weekendDiscount = 2023 * MenuCategory.amountOfMainDish;
        }
    }

    private static void receiveSpecialDiscount(int date) {
        specialDiscount = 0;
        
        if ((Utils.getDayOfWeek(date) == 7) || (date == 25)) {
            specialDiscount = 1000;
        }
    }

    public static void receivePresent() {
        present = 0;

        if (Price.amountOfPrice >= 120_000) {
            present = Menu.CHAMPAGNE.getPrice();
        }
    }

    public static void receiveDiscountOfDate(int date) {
        dateOfDay = date;

        receiveDDayDiscount(date);
        receiveWeekdayDiscount(date);
        receiveWeekendDiscount(date);
        receiveSpecialDiscount(date);
    }

    public static void addDiscount() {
        amountOfDiscount = dDayDiscount + weekdayDiscount + weekendDiscount + specialDiscount + present;
    }
}
