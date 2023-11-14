package christmas.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static christmas.model.Discount.*;

public class DiscountTest {
    @Test
    void 증정_이벤트() {
        Price.amountOfPrice = 120_000;

        receivePresent();
        assertThat(Discount.present).isEqualTo(25_000);
    }

    @Test
    void 평일_할인() {
        Menu.prepareMenu();
        receiveDate(25);
        Order.userOrder.put("티본스테이크", 1);
        Order.userOrder.put("아이스크림", 2);
        Order.userOrder.put("제로콜라", 1);

        addDiscount();

        assertThat(dDayDiscount).isEqualTo(3_400);
        assertThat(weekdayDiscount).isEqualTo(4_046);
        assertThat(weekendDiscount).isEqualTo(0);
        assertThat(specialDiscount).isEqualTo(1_000);
        assertThat(amountOfDiscount).isEqualTo(8_446);
    }

    @Test
    void 주말_할인() {
        dDayDiscount = 0;
        weekdayDiscount = 0;
        weekendDiscount = 0;
        specialDiscount = 0;
        present = 0;

        Menu.prepareMenu();
        receiveDate(23);
        Order.userOrder.put("티본스테이크", 1);
        Order.userOrder.put("아이스크림", 2);
        Order.userOrder.put("제로콜라", 1);

        addDiscount();

        assertThat(dDayDiscount).isEqualTo(3_200);
        assertThat(weekdayDiscount).isEqualTo(0);
        assertThat(weekendDiscount).isEqualTo(2_023);
        assertThat(specialDiscount).isEqualTo(0);
        assertThat(amountOfDiscount).isEqualTo(5_223);
    }
}
