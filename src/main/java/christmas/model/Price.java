package christmas.model;

public class Price {
    public static int amountOfPrice;

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
}
