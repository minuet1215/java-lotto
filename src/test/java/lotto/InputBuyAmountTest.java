package lotto;

import lotto.validator.AmountValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputBuyAmountTest {
    @Test
    void 천으로_나누어_떨어지지_않을_경우() {
        int amount = 5001;
        assertThatThrownBy(() -> new AmountValidator().validateDivideBy1000(amount))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
