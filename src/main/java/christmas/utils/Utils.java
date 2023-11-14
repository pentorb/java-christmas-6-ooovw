package christmas.utils;

import christmas.model.Menu;
import christmas.model.MenuCategory;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Utils {
    private static final int YEAR_OF_EVENT = 2023;
    private static final int MONTH_OF_EVENT = 12;
    private static final int MAXIMUM_ORDER = 20;

    public static int getDayOfWeek(int date) {
        LocalDate dateOfVisit = LocalDate.of(YEAR_OF_EVENT, MONTH_OF_EVENT, date);
        DayOfWeek dayOfVisit = dateOfVisit.getDayOfWeek();
        return dayOfVisit.getValue();
    }

    public static boolean isNumber(String input) {
        try {
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isMenu(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        int vaildCount = 0;

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            if (Menu.nameOfMenu.contains(orderInformation.get(0))) {
                vaildCount += 1;
            }
        }

        if (vaildCount == separatedOrder.size()) {
            return true;
        }

        return false;
    }

    public static boolean isMenuNumber(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        int vaildCount = 0;

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            String numberOfMenu = orderInformation.get(1);

            if (isNumber(numberOfMenu) && Integer.parseInt(numberOfMenu) >= 1) {
                vaildCount += 1;
            }
        }

        if (vaildCount == separatedOrder.size()) {
            return true;
        }

        return false;
    }

    public static boolean isInvalidFormat(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));

        for (int i = 0; i < separatedOrder.size(); i++) {
            if (!separatedOrder.get(i).contains("-")) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean isDuplicateMenu(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        List<String> orders = new ArrayList<>();

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            orders.add(orderInformation.get(0));
        }

        HashSet<String> uniqueOrder = new HashSet<>(orders);

        if (separatedOrder.size() == uniqueOrder.size()) {
            return false;
        }

        return true;
    }

    public static boolean isOutOfRange(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        int orders = 0;

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            orders += Integer.parseInt(orderInformation.get(1));
        }

        if (orders > MAXIMUM_ORDER) {
            return true;
        }

        return false;
    }

    public static boolean isDrinkOnly(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        int amountOfDrink = 0;

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            if (MenuCategory.drink.contains(orderInformation.get(0))) {
                amountOfDrink += 1;
            }
        }

        if (amountOfDrink == separatedOrder.size()) {
            return true;
        }

        return false;
    }
}
