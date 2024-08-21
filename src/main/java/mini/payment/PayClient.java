package mini.payment;

import mini.OutputForm;
import mini.product.Product;
import mini.money.Money;

public interface PayClient {
    OutputForm pay(Product product, Money money);
}
