package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.exception.Validation;

public class InputView {
    public static int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");

        while (true) {
            try {
                String input = Console.readLine();
                Validation.validateNumber(input);
                Validation.validateNumberRange(Integer.parseInt(input));

                return Integer.parseInt(input.trim());
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }
        }
    }

    public static String readOrder() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        while (true) {
            try {
                String input = Console.readLine();
                Validation.validateMenu(input);
                Validation.validateMenuNumber(input);
                Validation.validateDuplicateMenu(input);
                Validation.validateMaximum(input);

                return input.trim();
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }
    }
}
