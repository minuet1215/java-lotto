package lotto.util;

import java.util.ArrayList;
import java.util.List;

public class StringSeparator {
    public List<Integer> separateInputString(String inputNumbers) {
        List<Integer> numbers = new ArrayList<>();

        for (String c : inputNumbers.split(",")) {
            numbers.add(Integer.parseInt(c));
        }

        return numbers;
    }
}
