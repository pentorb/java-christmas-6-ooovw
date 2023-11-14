package christmas.validation;

import christmas.model.Menu;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationTest {
    @Test
    void 숫자가_아닌_값_예외처리() {
        assertThatThrownBy(() -> Validation.validateNumber("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 날짜_범위를_벗어난_값_예외처리() {
        assertThatThrownBy(() -> Validation.validateNumberRange(33))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 없는_메뉴_예외처리() {
        assertThatThrownBy(() -> Validation.validateMenu("해산물파스타-2,커피-1,초코케이크-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 잘못된_메뉴_개수_예외처리() {
        assertThatThrownBy(() -> Validation.validateMenuNumber("해산물파스타-2,레드와인-1,초코케이크-s"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 중복된_메뉴_예외처리() {
        assertThatThrownBy(() -> Validation.validateDuplicateMenu("해산물파스타-2,레드와인-1,해산물파스타-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 최대_메뉴_개수초과_예외처리() {
        assertThatThrownBy(() -> Validation.validateOutOfRange("해산물파스타-2,레드와인-1,초코케이크-18"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 음료만_주문한_경우_예외처리() {
        Menu.prepareMenu();
        assertThatThrownBy(() -> Validation.validateDrinkOnly("샴페인-2,레드와인-1,제로콜라-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
