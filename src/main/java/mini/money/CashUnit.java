package mini.money;

public enum CashUnit {
    WON_100(100),
    WON_500(500),
    WON_1000(1000),
    WON_5000(5000),
    WON_10000(10000);

    private int value;

    CashUnit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
