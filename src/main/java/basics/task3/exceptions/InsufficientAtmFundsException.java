package basics.task3.exceptions;

public class InsufficientAtmFundsException extends RuntimeException {
    public InsufficientAtmFundsException(String message) {
        super(message);
    }

    public InsufficientAtmFundsException() {
        super();
    }
}
