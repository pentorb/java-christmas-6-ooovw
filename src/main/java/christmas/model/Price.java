package christmas.model;

public class Price {
    public static int amountOfPrice;
    public static int totalPrice;

    public static int getPriceOfMenu(String menu) {
        Menu.putNames();
        int priceOfMenu = 0;

        for (int i = 0; i < Menu.constantOfMenu.size(); i++){
            if (menu.equals(Menu.constantOfMenu.get(i).getName())) {
                priceOfMenu = Menu.constantOfMenu.get(i).getPrice();
            }
        }

        return priceOfMenu;
    }

    public static void addPrice() {
        for (int i = 0; i < Order.orderedMenu.size(); i++) {
            int numberOfMenu = Order.userOrder.get(Order.orderedMenu.get(i));
            amountOfPrice += numberOfMenu * getPriceOfMenu(Order.orderedMenu.get(i));
        }
    }

    public static void findTotalPrice() {
        totalPrice = amountOfPrice - Discount.amountOfDiscount;
    }
}
