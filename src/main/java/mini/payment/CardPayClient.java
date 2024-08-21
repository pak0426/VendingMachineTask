package mini.payment;

import mini.OutputForm;
import mini.product.Product;
import mini.money.Money;

public class CardPayClient implements PayClient {
    @Override
    public OutputForm pay(Product product, Money money) {
        int extra = money.getCashSum() - product.getPrice();
        if (extra > 0) {
            return new OutputForm(true, extra, "카드 결제 완료. 남은 금액 = " + extra);
        }
        else {
            return new OutputForm(false, money.getCashSum(), "카드 잔액이 부족합니다.");
        }
    }
}
