package mini;

public class OutputForm {
    private boolean result;
    private String message;
    private int extra;

    public OutputForm(boolean result, int extra, String message) {
        this.result = result;
        this.extra = extra;
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public int getExtra() {
        return extra;
    }
}
