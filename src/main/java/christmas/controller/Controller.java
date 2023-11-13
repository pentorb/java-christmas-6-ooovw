package christmas.controller;

import christmas.model.Badge;
import christmas.model.Discount;
import christmas.model.Order;
import christmas.model.Price;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Controller {
    private static void startPlanner() {
        OutputView.printWelcome();

        Discount.receiveDiscountOfDate(InputView.readDate());
        Order.receiveOrder(InputView.readOrder());
    }
}
