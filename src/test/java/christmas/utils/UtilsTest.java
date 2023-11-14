package christmas.utils;

import christmas.model.Menu;
import org.junit.jupiter.api.Test;

import static christmas.utils.Utils.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest {
    @Test
    void 요일에_따른_숫자_반환() {
        assertThat(getDayOfWeek(25)).isEqualTo(1);
    }

    @Test
    void 숫자인_값() {
        assertThat(isNumber("14532")).isTrue();
    }

    @Test
    void 숫자가_아닌_값() {
        assertThat(isNumber("a")).isFalse();
    }

    @Test
    void 메뉴판에_있는_메뉴() {
        Menu.prepareMenu();
        assertThat(isMenu("시저샐러드-10")).isTrue();
    }

    @Test
    void 메뉴판에_없는_메뉴() {
        Menu.prepareMenu();
        assertThat(isMenu("망고샐러드-10")).isFalse();
    }

    @Test
    void 유효한_메뉴_개수() {
        assertThat(isMenuNumber("양송이수프-10")).isTrue();
    }

    @Test
    void 유효하지_않은_메뉴_개수() {
        assertThat(isMenuNumber("양송이수프-L")).isFalse();
    }

    @Test
    void 유효하지_않은_형식() {
        assertThat(isInvalidFormat("해산물파스타=2,레드와인=1,초코케이크=2")).isTrue();
    }

    @Test
    void 중복된_메뉴() {
        assertThat(isDuplicateMenu("해산물파스타-2,레드와인-1,해산물파스타-2")).isTrue();
    }

    @Test
    void 최대_주문개수를_초과() {
        assertThat(isOutOfRange("해산물파스타-2,레드와인-1,양송이수프-18")).isTrue();
    }

    @Test
    void 음료수만_주문한_경우() {
        Menu.prepareMenu();
        assertThat(isDrinkOnly("샴페인-2,레드와인-1,제로콜라-2")).isTrue();
    }
}
