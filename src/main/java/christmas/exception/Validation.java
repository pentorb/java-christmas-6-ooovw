package christmas.exception;

import christmas.utils.Utils;

public class Validation {
    public static void validateNumber(String input) {
        if (!Utils.isNumber(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateNumberRange(int number) {
        if (number < 1 || number > 31) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateMenu(String input) {
        if (!Utils.isMenu(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateMenuNumber(String input) {
        if (!Utils.isMenuNumber(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateDuplicateMenu(String input) {
        if (!Utils.isDuplicateMenu(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateOutOfRange(String input) {
        if (Utils.isOutOfRange(input)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateDrinkOnly(String input) {
        if (Utils.isDrinkOnly(input)) {
            throw new IllegalArgumentException();
        }
    }
}
