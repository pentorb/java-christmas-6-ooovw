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
}
