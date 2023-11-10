package christmas.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Order {
    public static Map<String, Integer> userOrder = new HashMap<String, Integer>();

    public static void receiveOrder(String input) {
        List<String> separatedOrder = Arrays.asList(input.split(","));

        for (int i = 0; i < separatedOrder.size(); i++) {
            List<String> orderInformation = Arrays.asList(separatedOrder.get(i).split("-"));

            userOrder.put(orderInformation.get(0), Integer.valueOf(orderInformation.get(1)));
        }
    }
}
