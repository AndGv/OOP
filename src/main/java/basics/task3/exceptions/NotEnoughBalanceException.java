package basics.task3.exceptions;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException(String message) {
        super(message);
    }

    public NotEnoughBalanceException() {
        super();
    }
}
