package christmas.model;

import java.util.*;

public class Order {
    public static Map<String, Integer> userOrder = new HashMap<String, Integer>();
    public static List<String> orderedMenu;

    public static void receiveOrder(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));

            userOrder.put(orderInformation.get(0), Integer.valueOf(orderInformation.get(1)));
        }
    }

    public static void arrangeOrder() {
        orderedMenu = new ArrayList<>(userOrder.keySet());
    }
}
