package mini.money;

public class Card {
    private String cardNumber;
    private int balance;

    public Card(String cardNumber, int balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }
}
