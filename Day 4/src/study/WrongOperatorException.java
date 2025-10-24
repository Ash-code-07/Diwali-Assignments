package study;

// Custom checked exception
public class WrongOperatorException extends Exception {
    public WrongOperatorException(String message) {
        super(message);
    }
}
