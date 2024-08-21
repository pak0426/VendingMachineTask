package mini.payment;

import mini.OutputForm;
import mini.money.Card;
import mini.money.Cash;
import mini.money.CashUnit;
import mini.money.Money;
import mini.product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private Product coke;
    private Product water;
    private Product coffee;
    private Money money;

    @BeforeEach
    void setUp() {
        // given
        coke = new Product("콜라", 1100);
        water = new Product("물", 600);
        coffee = new Product("커피", 700);

        Cash cash = new Cash(CashUnit.WON_100, 10);
        Card card = new Card("0000-0000-0000-0000", 1000);

        money = new Money(card);
        money.addCash(cash);
    }

    @Test
    void 현금으로_결제() {
        // when
        OutputForm cokeOutput = Payment.pay(coke, money, PaymentMethod.CASH);
        OutputForm waterOutput = Payment.pay(water, money, PaymentMethod.CASH);
        OutputForm coffeeOutput = Payment.pay(coffee, money, PaymentMethod.CASH);

        // then
        assertFalse(cokeOutput.isResult());
        assertEquals(cokeOutput.getExtra(), 1000);

        assertTrue(waterOutput.isResult());
        assertEquals(waterOutput.getExtra(), 400);

        assertTrue(coffeeOutput.isResult());
        assertEquals(coffeeOutput.getExtra(), 300);
    }

    @Test
    void 카드로_결제() {
        // when
        OutputForm cokeOutput = Payment.pay(coke, money, PaymentMethod.CARD);
        OutputForm waterOutput = Payment.pay(water, money, PaymentMethod.CARD);
        OutputForm coffeeOutput = Payment.pay(coffee, money, PaymentMethod.CARD);

        // then
        assertFalse(cokeOutput.isResult());
        assertEquals(cokeOutput.getExtra(), 1000);

        assertTrue(waterOutput.isResult());
        assertEquals(waterOutput.getExtra(), 400);

        assertTrue(coffeeOutput.isResult());
        assertEquals(coffeeOutput.getExtra(), 300);
    }
}