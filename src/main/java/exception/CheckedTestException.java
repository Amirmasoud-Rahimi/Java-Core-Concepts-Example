package exception;

public class CheckedTestException extends Exception {
    public CheckedTestException(String message, Throwable cause) {
        super(message, cause);
    }
}