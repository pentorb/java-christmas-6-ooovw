package christmas.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {
    @Test
    void 입력값으로부터_주문_받고_주문목록_생성() {
        Order.receiveOrder("해산물파스타-2,레드와인-1,초코케이크-3");

        assertThat(Order.userOrder).containsKey("해산물파스타");
        assertThat(Order.userOrder).containsKey("레드와인");
        assertThat(Order.userOrder).containsKey("초코케이크");

        assertThat(Order.userOrder.get("해산물파스타")).isEqualTo(2);
        assertThat(Order.userOrder.get("레드와인")).isEqualTo(1);
        assertThat(Order.userOrder.get("초코케이크")).isEqualTo(3);

        assertThat(Order.orderedMenu).contains("해산물파스타", "레드와인", "초코케이크");
    }
}
