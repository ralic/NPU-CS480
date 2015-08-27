package cs480.lab.pkgfinal;

public class InvalidInputException extends Exception {

    private String message;
    private int code;

    public InvalidInputException() {
        this.message = "No Error found";
        this.code = 0;
    }

    public InvalidInputException foundInvalidInputException(String a, int b) {
        this.message = a;
        this.code = b;
        return this;
    }

    @Override
    public String toString() {
        return "**Error**| Code : " + this.code + "| ErrorMessage :" + message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
}
