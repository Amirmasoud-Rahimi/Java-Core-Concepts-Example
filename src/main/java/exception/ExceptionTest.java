package exception;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) { // try-catch or throws CheckedTestException
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throwUncheckedException();
    }

    public static void throwCheckedException() throws CheckedTestException {
        System.out.println("throwCheckedException Called!");
        throw new CheckedTestException("checked Exception occurred", new IOException());
    }

    public static void throwUncheckedException() {
        System.out.println("throwUncheckedException Called!");
        throw new UncheckedTestException("unchecked Exception occurred", new IllegalArgumentException());
    }
}