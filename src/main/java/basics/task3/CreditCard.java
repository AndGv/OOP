package basics.task3;

import basics.task3.exceptions.NotEnoughCreditException;

public class CreditCard extends Card {
    private final double interest;
    private final double credit;


    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;

    }

    @Override
    public void credit(double creditAmount) {
        if (credit + balance < creditAmount) {
            throw new NotEnoughCreditException("Not enough credit");
        }
        balance -= creditAmount;
        balance -= creditAmount * interest;
    }
}
