package christmas.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BadgeTest {
    @Test
    void 산타_배지() {
        Discount.amountOfDiscount = 20_000;

        Badge.receiveBadge();
        assertThat(Badge.shapeOfBadge).isEqualTo("산타");
    }

    @Test
    void 트리_배지() {
        Discount.amountOfDiscount = 10_000;

        Badge.receiveBadge();
        assertThat(Badge.shapeOfBadge).isEqualTo("트리");
    }

    @Test
    void 스타_배지() {
        Discount.amountOfDiscount = 5_000;

        Badge.receiveBadge();
        assertThat(Badge.shapeOfBadge).isEqualTo("스타");
    }

    @Test
    void 배지_없음() {
        Discount.amountOfDiscount = 0;

        Badge.receiveBadge();
        assertThat(Badge.shapeOfBadge).isEqualTo("없음");
    }
}
