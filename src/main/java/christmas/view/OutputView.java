package christmas.view;

import christmas.model.Order;

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
}
