public class PraktikumException extends RuntimeException {
    long code;

    public PraktikumException(String message, long code) {
        super(message);
        this.code = code;
    }

    public PraktikumException(String message, Throwable cause, long code) {
        super(message, cause);
        this.code = code;
    }

    public PraktikumException(Throwable cause, long code) {
        super(cause);
        this.code = code;
    }

    public PraktikumException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace,
            long code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
