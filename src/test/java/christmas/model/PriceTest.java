package christmas.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceTest {
    @Test
    void 메뉴_가격_계산() {
        Menu.prepareMenu();

        Order.userOrder.put("티본스테이크", 1);
        Order.userOrder.put("아이스크림", 2);
        Order.userOrder.put("제로콜라", 1);
        Order.orderedMenu = new ArrayList<>(Order.userOrder.keySet());

        Price.addPrice();

        assertThat(Price.amountOfPrice).isEqualTo(68_000);
    }

    @Test
    void 할인_후_예상_결제금액_구하기() {
        Price.amountOfPrice = 68_000;
        Discount.amountOfDiscount = 10_000;
        Discount.present = 0;

        Price.findTotalPrice();

        assertThat(Price.totalPrice).isEqualTo((58_000));
    }
}
