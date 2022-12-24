package exception;

public class TooMuchException extends RuntimeException{
    public TooMuchException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
