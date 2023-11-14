package christmas.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static christmas.model.MenuCategory.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MenuCategoryTest {
    @Test
    void 메뉴_분류() {
        categorizeMenu();

        assertThat(appetizer).contains(Menu.MUSHROOM_SOUP.getName(), Menu.TAPAS.getName(), Menu.CAESAR_SALAD.getName());
        assertThat(mainDish).contains(Menu.T_BONE_STEAK.getName(), Menu.BARBEQUE_RIB.getName(), Menu.SEAFOOD_PASTA.getName(), Menu.CHRISTMAS_PASTA.getName());
        assertThat(dessert).contains(Menu.CHOCO_CAKE.getName(), Menu.ICE_CREAM.getName());
        assertThat(drink).contains(Menu.ZERO_COKE.getName(), Menu.RED_WINE.getName(), Menu.CHAMPAGNE.getName());
    }

    @Test
    void 디저트_개수_세기() {
        Menu.prepareMenu();

        Order.userOrder.put("티본스테이크", 1);
        Order.userOrder.put("아이스크림", 2);
        Order.userOrder.put("제로콜라", 4);
        Order.userOrder.put("초코케이크", 5);

        countDessert();

        assertThat(amountOfDessert).isEqualTo(7);
    }

    @Test
    void 메인_개수_세기() {
        Menu.prepareMenu();

        Order.userOrder.put("티본스테이크", 1);
        Order.userOrder.put("해산물파스타", 2);
        Order.userOrder.put("제로콜라", 4);
        Order.userOrder.put("초코케이크", 5);

        countMainDish();

        assertThat(amountOfMainDish).isEqualTo(3);
    }
}
