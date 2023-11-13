package christmas.exception;

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
}
