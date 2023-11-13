package christmas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Menu {

    MUSHROOM_SOUP("애피타이저", "양송이수프", 6_000),
    TAPAS("애피타이저", "타파스", 5_500),
    CAESAR_SALAD("애피타이저", "시저샐러드", 8_000),
    T_BONE_STEAK("메인", "티본스테이크", 55_000),
    BARBEQUE_RIB("메인", "바비큐립", 54_000),
    SEAFOOD_PASTA("메인", "해산물파스타", 35_000),
    CHRISTMAS_PASTA("메인", "크리스마스파스타", 25_000),
    CHOCO_CAKE("디저트", "초코케이크", 15_000),
    ICE_CREAM("디저트", "아이스크림", 5_000),
    ZERO_COKE("음료", "제로콜라", 3_000),
    RED_WINE("음료", "레드와인", 60_000),
    CHAMPAGNE("음료", "샴페인", 25_000);

    public static List<Menu> constantOfMenu = new ArrayList<>();

    private String category;
    private String name;
    private int price;

    Menu(String category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return  name;
    }

    public int getPrice() {
        return price;
    }

    public static void putNames(){
        constantOfMenu = Arrays.asList(MUSHROOM_SOUP, TAPAS, CAESAR_SALAD, T_BONE_STEAK, BARBEQUE_RIB, SEAFOOD_PASTA, CHRISTMAS_PASTA, CHOCO_CAKE, ICE_CREAM, ZERO_COKE, RED_WINE, CHAMPAGNE);
    }
}
