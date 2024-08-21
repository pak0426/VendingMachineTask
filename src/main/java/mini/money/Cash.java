package mini.money;

public class Cash {
    private CashUnit cashUnit;
    private int count;

    public Cash(CashUnit cashUnit, int count) {
        this.cashUnit = cashUnit;
        this.count = count;
    }

    public CashUnit getCashUnit() {
        return cashUnit;
    }

    public int getCount() {
        return count;
    }
}
