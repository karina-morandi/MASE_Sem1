package Exceptions;

public class MyException extends Exception{
    public MyException(){
    }
    
    public MyException(Throwable cause){
	    super(cause);
    }
}
