package hr.tvz.ele.struc.iznimke.brojevi;

public class PremaliBrojException extends Exception {

    public PremaliBrojException() {
    }

    public PremaliBrojException(String message) {
        super(message);
    }

    public PremaliBrojException(String message, Throwable cause) {
        super(message, cause);
    }

    public PremaliBrojException(Throwable cause) {
        super(cause);
    }

    public PremaliBrojException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
