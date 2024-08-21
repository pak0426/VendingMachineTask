package mini.payment;

import mini.OutputForm;
import mini.product.Product;
import mini.money.Money;

public class CashPayClient implements PayClient {
    @Override
    public OutputForm pay(Product product, Money money) {
        int extra = money.getCashSum() - product.getPrice();
        if (extra > 0) {
            return new OutputForm(true, extra, "현금 결제 완료. 거스름 돈 = " + extra);
        }
        else {
            return new OutputForm(false, money.getCardSum(), "현금이 부족합니다.");
        }
    }
}
