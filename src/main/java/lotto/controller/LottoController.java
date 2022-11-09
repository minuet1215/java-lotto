package lotto.controller;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class LottoController {
    public List<Integer> generateLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public void getLottoDraw() {

    }

//    public int getProfitRate() {
//    }
}
