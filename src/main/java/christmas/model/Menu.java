package christmas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Menu {
    MUSHROOM_SOUP("양송이수프", 6_000),
    TAPAS("타파스", 5_500),
    CAESAR_SALAD("시저샐러드", 8_000),
    T_BONE_STEAK("티본스테이크", 55_000),
    BARBEQUE_RIB("바비큐립", 54_000),
    SEAFOOD_PASTA("해산물파스타", 35_000),
    CHRISTMAS_PASTA("크리스마스파스타", 25_000),
    CHOCO_CAKE("초코케이크", 15_000),
    ICE_CREAM("아이스크림", 5_000),
    ZERO_COKE("제로콜라", 3_000),
    RED_WINE("레드와인", 60_000),
    CHAMPAGNE("샴페인", 25_000);

    public static List<Menu> constantOfMenu = new ArrayList<>();
    public static List<String> nameOfMenu = new ArrayList<>();

    private String name;
    private int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return  name;
    }

    public int getPrice() {
        return price;
    }

    public static void prepareMenu() {
        putNames();
        arrangeNameOfMenu();
        MenuCategory.categorizeMenu();
    }

    public static void putNames(){
        constantOfMenu = Arrays.asList(MUSHROOM_SOUP, TAPAS, CAESAR_SALAD, T_BONE_STEAK, BARBEQUE_RIB, SEAFOOD_PASTA, CHRISTMAS_PASTA, CHOCO_CAKE, ICE_CREAM, ZERO_COKE, RED_WINE, CHAMPAGNE);
    }

    private static void arrangeNameOfMenu() {
        for (int i = 0; i < Menu.constantOfMenu.size(); i++) {
            nameOfMenu.add(Menu.constantOfMenu.get(i).getName());
        }
    }
}
