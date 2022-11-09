package lotto.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LottoBuyer {
    int consumptionAmount;
    List<Lotto> lottoTickets = new ArrayList<>();

    public LottoBuyer(int consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public void addTicket(Lotto lottoTicket) {
        lottoTickets.add(lottoTicket);
    }

    public List<Lotto> getLottoTickets() {
        return this.lottoTickets;
    }

    public int getLottoTicketsNumber() {
        return this.lottoTickets.size();
    }

    public void test() {
    }

    public void printLottoInfos() {
        Iterator<Lotto> seek = lottoTickets.iterator();
        Lotto lotto;
        while (seek.hasNext()) {
            lotto = seek.next();
            lotto.printLottoInfo(lotto);
        }
    }
}
