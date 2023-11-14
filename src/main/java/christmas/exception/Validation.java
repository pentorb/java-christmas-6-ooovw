package christmas.exception;

import christmas.model.Menu;

import java.util.Arrays;
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

        if (vaildCount == separatedOrder.size()) {
            return true;
        }

        return false;
    }
}
