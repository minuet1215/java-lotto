package lotto.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void printLottoInfo(Lotto lotto) {
        System.out.println(sorted(lotto.numbers));
    }

    private List<Integer> sorted(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}
