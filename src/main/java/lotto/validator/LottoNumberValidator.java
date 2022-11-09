package lotto.validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumberValidator {
    public void validateLottoSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void validateLottoNumber(List<Integer> numbers) {
        Set<Integer> checkDuplicated = new HashSet<Integer>();

        for (int number : numbers) {
            if (checkDuplicated.contains(number)) {
                throw new IllegalArgumentException();
            }

            checkDuplicated.add(number);
        }
    }

    public void validateInvalidNumber(List<Integer> numbers) {
        for (int number : numbers) {
            if (!isValidNumber(number)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private boolean isValidNumber(int number) {
        return 1 <= number && number <= 45;
    }

//    public void validateIsNumber(String numbers) {
//         // 콤마(,)를 기준으로 리스트를 구하는 함수 필요
//    }
}
