package basics.task3;


public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new MyBankAtm(900_000.00);
        Card myDebitCard = new DebitCard(100_000, "Andre", "3333 4444 5555 6666");
        Card myCreditCard = new CreditCard(100_000, "Andre", "3333 4444 5555 6666", 0.01, 4000);

        try {
            atm.withdraw(myCreditCard, 150_000);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            atm.withdraw(myDebitCard, 150_000);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            atm.withdraw(myCreditCard, 150_000);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
