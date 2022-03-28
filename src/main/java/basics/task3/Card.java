package basics.task3;


public abstract class Card {

    protected double balance;
    private final String cardHolderName;
    private final String cardNumber;

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;


    }

    public abstract void credit(double creditAmount);

    public void debit(double debitAmount) {
        balance += debitAmount;
    }

}








