package mini.money;

import java.util.ArrayList;
import java.util.List;

public class Money {
    private List<Cash> cashes;
    private Card card;

    public Money() {
        cashes = new ArrayList<>();
    }

    public Money(Card card) {
        cashes = new ArrayList<>();
        this.card = card;
    }

    public void addCash(Cash cash) {
        cashes.add(cash);
    }

    public int getCashSum() {
        int sum = 0;
        for (Cash cash : cashes) {
            sum += cash.getCashUnit().getValue() * cash.getCount();
        }
        return sum;
    }

    public int getCardSum() {
        return card.getBalance();
    }
}
