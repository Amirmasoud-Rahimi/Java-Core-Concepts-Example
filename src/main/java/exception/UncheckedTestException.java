package exception;

public class UncheckedTestException extends RuntimeException {
    public UncheckedTestException(String message, Throwable cause) {
        super(message, cause);
    }
}