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
    private static final int CHRISTMAS = 25;
    private static final int SUNDAY = 7;
    private static final int THURSDAY = 4;
    private static final int START_OF_DISCOUNT = 1000;
    private static final int SPECIAL_DISCOUNT = 1000;
    private static final int DISCOUNT_PER_DAY = 100;
    private static final int DISCOUNT_OF_WEEK = 2023;
    private static final int MINIMUM_PRICE_FOR_PRESENT = 120_000;


    private static void receiveDDayDiscount(int date) {
        if (date <= CHRISTMAS) {
            dDayDiscount = START_OF_DISCOUNT;
            for (int i = 1; i < date; i++) {
                dDayDiscount += DISCOUNT_PER_DAY;
            }
        }

        if (date > CHRISTMAS) {
            dDayDiscount = 0;
        }
    }

    private static void receiveWeekdayDiscount(int date) {
        if ((Utils.getDayOfWeek(date) <= THURSDAY) || (Utils.getDayOfWeek(date) == SUNDAY)) {
            MenuCategory.countDessert();
            weekdayDiscount = DISCOUNT_OF_WEEK * MenuCategory.amountOfDessert;
        }
    }

    private static void receiveWeekendDiscount(int date) {
        if ((Utils.getDayOfWeek(date) > THURSDAY) && (Utils.getDayOfWeek(date) < SUNDAY)) {
            MenuCategory.countMainDish();
            weekendDiscount = DISCOUNT_OF_WEEK * MenuCategory.amountOfMainDish;
        }
    }

    private static void receiveSpecialDiscount(int date) {
        specialDiscount = 0;
        
        if ((Utils.getDayOfWeek(date) == SUNDAY) || (date == CHRISTMAS)) {
            specialDiscount = SPECIAL_DISCOUNT;
        }
    }

    public static void receivePresent() {
        present = 0;

        if (Price.amountOfPrice >= MINIMUM_PRICE_FOR_PRESENT) {
            present = Menu.CHAMPAGNE.getPrice();
        }
    }

    public static void receiveDate(int date) {
        dateOfDay = date;
    }

    public static void addDiscount() {
        receiveDDayDiscount(dateOfDay);
        receiveWeekdayDiscount(dateOfDay);
        receiveWeekendDiscount(dateOfDay);
        receiveSpecialDiscount(dateOfDay);

        amountOfDiscount = dDayDiscount + weekdayDiscount + weekendDiscount + specialDiscount + present;
    }
}
