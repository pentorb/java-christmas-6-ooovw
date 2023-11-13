package christmas.view;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {
    public void printMenu(List<String> orderedMenu, Map<String, Integer> userOrder) {
        System.out.println("<주문 메뉴>");

        for (int i = 0; i < orderedMenu.size(); i++) {
            System.out.println(orderedMenu.get(i));
            System.out.printf(" %d개", userOrder.get(orderedMenu.get(i)));
        }

        System.out.println();
    }

    public void printAmountOfPrice(int price) {
        System.out.println("<할인 전 총주문 금액>");

        DecimalFormat priceFormat = new DecimalFormat("###,##0");
        String notDiscountedPrice = priceFormat.format(price);
        System.out.println(notDiscountedPrice + "원");

        System.out.println();
    }

    public void printPresent(int price) {
        System.out.println("<증정 메뉴>");

        if (price == 0) {
            System.out.println("없음");
        }

        if (price > 0) {
            System.out.println("샴페인 1개");
        }

        System.out.println();
    }

    public void printDiscountMessage() {
        System.out.println("<혜택 내역>\n");
    }

    public void printDDayDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("크리스마스 디데이 할인: " + number + "원\n");
        }
    }

    public void printWeekdayDiscount(int discount) {
        if (discount > 0) {
            DecimalFormat discountFormat = new DecimalFormat("-###,##0");
            String number = discountFormat.format(discount);
            System.out.print("평일 할인: " + number + "원\n");
        }
    }
}
