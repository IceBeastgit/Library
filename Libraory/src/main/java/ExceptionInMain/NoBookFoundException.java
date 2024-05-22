package ExceptionInMain;

public class NoBookFoundException extends RuntimeException {
    public NoBookFoundException(String s) {
        super(s);
    }
}
