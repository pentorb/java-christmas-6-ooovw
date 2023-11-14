package christmas.utils;

import christmas.model.Menu;
import christmas.model.MenuCategory;
import christmas.model.Order;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Utils {

    public static int getDayOfWeek(int date) {
        LocalDate dateOfVisit = LocalDate.of(2023, 12, date);
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

        if (vaildCount == separatedOrder.size()) { //메뉴 형식이 예시와 다를 경우 false를 반환하게됨
            return true;
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
            return true;
        }

        return false;
    }

    public static boolean isMaximum(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));
        int orders = 0;

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));
            orders += Integer.parseInt(orderInformation.get(1));
        }

        if (orders <= 20) {
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
