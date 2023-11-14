package christmas.controller;

import christmas.model.*;
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
        Menu.prepareMenu();

        Discount.receiveDate(InputView.readDate());
        Order.receiveOrder(InputView.readOrder());
    }

    private static void calculateBenefit() {
        Price.addPrice();
        Discount.receivePresent();
        Discount.addDiscount();
        Badge.receiveBadge();

        if (Price.amountOfPrice < 10_000) {
            Discount.present = 0;
            Discount.dDayDiscount =0;
            Discount.weekdayDiscount = 0;
            Discount.weekendDiscount = 0;
            Discount.specialDiscount = 0;
            Discount.amountOfDiscount = 0;
        }

        Price.findTotalPrice();
    }

    private static void showDetail() {
        OutputView.printDate(Discount.dateOfDay);

        OutputView.printMenu(Order.orderedMenu, Order.userOrder);
        OutputView.printAmountOfPrice(Price.amountOfPrice);
        OutputView.printPresent(Discount.present);

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
