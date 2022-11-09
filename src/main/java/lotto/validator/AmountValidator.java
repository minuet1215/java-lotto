package lotto.validator;

public class AmountValidator {
    public void validateInputAmount(String amount) {
        try {
            Integer.parseInt(amount);
        } catch (Exception e) {
            System.out.println("[ERROR]");
        }
    }

    public void validateDivideBy1000(int amount) {
        if (isDivideBy1000(amount)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isDivideBy1000(int amount) {
        if (amount % 1000 != 0) {
            return true;
        }
        return false;
    }
}

