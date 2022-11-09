package lotto;

import lotto.util.StringSeparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class StringSeparateTest {
    StringSeparator stringSeparator = new StringSeparator();

    @DisplayName("구분자(,)로 이루어진 문자열을 리스트로 변환")
    @Test
    void convertStringToList() {
        String inputNumbers = "1,2,3,4,5,6";
        List<Integer> numbers = stringSeparator.separateInputString(inputNumbers);
        assert (numbers).equals(List.of(1, 2, 3, 4, 5, 6));
    }
}