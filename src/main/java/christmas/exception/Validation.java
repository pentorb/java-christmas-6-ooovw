package christmas.exception;

import christmas.model.Menu;
import christmas.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Validation {
    public static boolean isNumber(String input) {
        try {
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void validateNumber(String input) {
        if (!isNumber(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateNumberRange(int number) {
        if (number < 1 || number > 31) {
            throw new IllegalArgumentException();
        }
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

    public static void validateMenu(String input) {
        if (!isMenu(input)) {
            throw new IllegalArgumentException();
        }
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

    public static void validateMenuNumber(String input) {
        if (!isMenuNumber(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateDuplicateMenu(String input) {
        if (!isDuplicateMenu(input)) {
            throw new IllegalArgumentException();
        }
    }
}
