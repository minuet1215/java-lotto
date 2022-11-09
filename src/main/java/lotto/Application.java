package lotto;

import camp.nextstep.edu.missionutils.Console;
import lotto.controller.LottoController;
import lotto.model.Lotto;
import lotto.model.LottoBuyer;
import lotto.util.StringSeparator;
import lotto.validator.AmountValidator;

import java.util.List;


public class Application {
    static AmountValidator amountValidator = new AmountValidator();
    static LottoController lottoController = new LottoController();
    static StringSeparator stringSeparator = new StringSeparator();

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String inputBuyAmount = Console.readLine();
        amountValidator.validateInput(inputBuyAmount);
        int buyNumber = Integer.parseInt(inputBuyAmount) / 1000;

        LottoBuyer lottoBuyer = new LottoBuyer(buyNumber);

        System.out.println(buyNumber + "개를 구매했습니다.");

        for (int i = 0; i < buyNumber; i++) {
            Lotto lotto = new Lotto(lottoController.generateLottoNumbers());
            lottoBuyer.addTicket(lotto);
        }

        lottoBuyer.printLottoInfos();
        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> lottoWinningNumbers = stringSeparator.separateInputString(Console.readLine());
        System.out.println(lottoWinningNumbers);

        System.out.println("보너스 번호를 입력해 주세요.");
        int lottoBonusNumber = Integer.parseInt(Console.readLine());
        System.out.println(lottoBonusNumber);
    }
}
