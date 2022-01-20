package hr.tvz.ele.struc.iznimke.brojevi;

public class PrevelikiBrojException extends RuntimeException {

    public PrevelikiBrojException() {
    }

    public PrevelikiBrojException(String message) {
        super(message);
    }

    public PrevelikiBrojException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrevelikiBrojException(Throwable cause) {
        super(cause);
    }

    public PrevelikiBrojException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
