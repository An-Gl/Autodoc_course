package lessons.lesson14.exeption;

public class CustomException extends Exception{

    private int details;

    public CustomException(int details, String message) {
        super(message);
        this.details = details;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "details=" + details + " " +
                getMessage() +
                '}';
    }
}
