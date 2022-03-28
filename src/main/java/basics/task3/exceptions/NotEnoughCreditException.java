package basics.task3.exceptions;

public class NotEnoughCreditException extends RuntimeException {
    public NotEnoughCreditException(String message) {
        super(message);
    }

    public NotEnoughCreditException() {
        super();
    }
}
