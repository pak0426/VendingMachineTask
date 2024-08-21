package mini.payment;

public enum PaymentMethod {
    CASH {
        @Override
        public PayClient createClient() {
            return new CashPayClient();
        }
    },
    CARD {
        @Override
        public PayClient createClient() {
            return new CardPayClient();
        }
    };

    public abstract PayClient createClient();
}
