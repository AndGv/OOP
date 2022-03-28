package basics.task3;

import basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    public void credit(double creditAmount) {
        if (balance < creditAmount) {
            throw new NotEnoughBalanceException("Not enough funds");
        }
        balance -= creditAmount;
    }
}
