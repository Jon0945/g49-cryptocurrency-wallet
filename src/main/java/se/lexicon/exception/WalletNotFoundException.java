package se.lexicon.exception;

public class WalletNotFoundException extends RuntimeException{
    public WalletNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public WalletNotFoundException(String message) {
        super(message);
    }
}
