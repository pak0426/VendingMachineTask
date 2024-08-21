package mini.payment;

import mini.OutputForm;
import mini.product.Product;
import mini.money.Money;

public class Payment {
    public static OutputForm pay(Product product, Money money, PaymentMethod paymentMethod) {
        PayClient payClient = paymentMethod.createClient();
        return payClient.pay(product, money);
    }
}
