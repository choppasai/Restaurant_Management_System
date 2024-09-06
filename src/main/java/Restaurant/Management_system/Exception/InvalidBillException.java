package Restaurant.Management_system.Exception;

public class InvalidBillException extends Exception{
    private String message;
    public InvalidBillException(String message){
        super(message);
    }
}
