package christmas.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static christmas.model.Menu.*;

public class MenuTest {
    @Test
    void 메뉴_목록_생성() {
        Menu.prepareMenu();

        assertThat(constantOfMenu).contains(MUSHROOM_SOUP, TAPAS, CAESAR_SALAD, T_BONE_STEAK, BARBEQUE_RIB, SEAFOOD_PASTA, CHRISTMAS_PASTA, CHOCO_CAKE, ICE_CREAM, ZERO_COKE, RED_WINE, CHAMPAGNE);
        assertThat(nameOfMenu).contains("양송이수프", "타파스", "시저샐러드", "티본스테이크", "바비큐립", "해산물파스타", "크리스마스파스타", "초코케이크", "아이스크림", "제로콜라", "레드와인", "샴페인");
    }
}
