package christmas.controller;

import christmas.model.Badge;
import christmas.model.Discount;
import christmas.model.Order;
import christmas.model.Price;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Controller {
    public static void runPlanner() {
        startPlanner();
        calculateBenefit();
        showDetail();
    }

    private static void startPlanner() {
        OutputView.printWelcome();

        Discount.receiveDate(InputView.readDate());
        Order.receiveOrder(InputView.readOrder());
    }

    private static void calculateBenefit() {
        Price.addPrice();
        Discount.receivePresent();
        Discount.addDiscount();
        Badge.receiveBadge();

        Price.findTotalPrice();
    }

    private static void showDetail() {
        OutputView.printDate(Discount.dateOfDay);

        OutputView.printMenu(Order.orderedMenu, Order.userOrder);
        OutputView.printAmountOfPrice(Price.amountOfPrice);
        OutputView.printPresent(Price.amountOfPrice);

        showDiscount();
        OutputView.printTotalPrice(Price.totalPrice);
        OutputView.printBadge(Badge.shapeOfBadge);
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
