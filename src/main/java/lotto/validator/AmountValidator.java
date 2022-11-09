package lotto.validator;

public class AmountValidator {
    public void validateInput(String amount) {
        validateInputAmount(amount);
        validateDivideBy1000(Integer.parseInt(amount));
    }

    public void validateInputAmount(String amount) {
        try {
            Integer.parseInt(amount);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public void validateDivideBy1000(int amount) {
        if (!isDivideBy1000(amount)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isDivideBy1000(int amount) {
        return amount % 1000 == 0;
    }
}