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

    private static void calculateBenefit() {
        Price.findPrice();
        Discount.receivePresent();
        Badge.receiveBadge();
    }

    private static void showDiscount() {
        OutputView.printDiscountMessage();
        OutputView.printDDayDiscount(Discount.dDayDiscount);
        OutputView.printWeekdayDiscount(Discount.weekdayDiscount);
        OutputView.printWeekendDiscount(Discount.weekendDiscount);
        OutputView.printSpecialDiscount(Discount.specialDiscount);
        OutputView.printPresentDiscount(Discount.present);
        OutputView.printAmountOfDiscount(Discount.amountOfDiscount);
    }
}
