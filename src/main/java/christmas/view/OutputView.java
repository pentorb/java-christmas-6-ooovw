package christmas.view;

import christmas.model.Discount;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {
    public static void printMenu(List<String> orderedMenu, Map<String, Integer> userOrder) {
        System.out.println();
        System.out.println("<주문 메뉴>");

        for (int i = 0; i < orderedMenu.size(); i++) {
            System.out.print(orderedMenu.get(i));
            System.out.printf(" %d개\n", userOrder.get(orderedMenu.get(i)));
        }
    }

    public static void printAmountOfPrice(int price) {
        System.out.println();
        System.out.println("<할인 전 총주문 금액>");

        DecimalFormat priceFormat = new DecimalFormat("###,##0");
        String notDiscountedPrice = priceFormat.format(price);
        System.out.println(notDiscountedPrice + "원");
    }

    public static void printPresent(int discount) {
        System.out.println();
        System.out.println("<증정 메뉴>");

        if (discount == 0) {
            System.out.println("없음");
        }

        if (discount > 0) {
            System.out.println("샴페인 1개");
        }
    }

    public static void printDiscountMessage() {
        System.out.println();
        System.out.println("<혜택 내역>");

        if (Discount.amountOfDiscount == 0) {
            System.out.println("없음");
        }
    }

    public static void printDDayDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("크리스마스 디데이 할인: " + number + "원\n");
        }
    }

    public static void printWeekdayDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("평일 할인: " + number + "원\n");
        }
    }

    public static void printWeekendDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("주말 할인: " + number + "원\n");
        }
    }

    public static void printSpecialDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("특별 할인: " + number + "원\n");
        }
    }

    public static void printPresentDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("증정 이벤트: " + number + "원\n");
        }
    }

    public static void printAmountOfDiscount(int discount) {
        System.out.println();
        System.out.println("<총혜택 금액>");

        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.println(number + "원");
        }

        if (discount == 0) {
            System.out.println(discount + "원");
        }
    }

    public static void printTotalPrice(int price) {
        System.out.println();
        System.out.println("<할인 후 예상 결제 금액>");

        DecimalFormat priceFormat = new DecimalFormat("###,##0");
        String number = priceFormat.format(price);
        System.out.println(number + "원");
    }

    public static void printBadge(String badge) {
        System.out.println();
        System.out.println("<12월 이벤트 배지>");
        System.out.println(badge);
    }

    public static void printWelcome() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public static void printDate(int date) {
        System.out.printf("12월 %d일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!\n", date);
    }
}
