package christmas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    public static List<String> orderedMenu = new ArrayList<String>();
    public static List<Integer> orderedCount = new ArrayList<Integer>();

    public static void receiveOrder(String input) {
        List<String> orders = Arrays.asList(input.split(","));

        for (int i = 0; i < orders.size(); i++) {
            List<String> separatedOrders = Arrays.asList(orders.get(i).split("-"));

            orderedMenu.add(separatedOrders.get(0));
            orderedCount.add(Integer.valueOf(separatedOrders.get(1)));
        }
    }
}
