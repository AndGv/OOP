package basics.task3;

import basics.task3.exceptions.InsufficientAtmFundsException;

public class MyBankAtm implements Atm {

    private double atmBalance;

    public MyBankAtm(double atmBalance) {
        this.atmBalance = atmBalance;
    }

    @Override
    public void withdraw(Card card, double amount) {
        if (atmBalance < amount) {
            throw new InsufficientAtmFundsException("There is not enough funds in the ATM");
        }
        atmBalance -= amount;
        card.credit(amount);
    }
}

