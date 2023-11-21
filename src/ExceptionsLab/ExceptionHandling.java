package ExceptionsLab;

import java.io.EOFException;
import java.io.IOException;

import Exceptions.MyException;

class A{
    void process() throws IOException{
        throw new IOException();
    }
}
class B extends A{
	void process(){
        System.out.println("B");
  }
}

public class ExceptionHandling {
	
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
		e();
	}
	
	public static void a(){
    	// Show that finally is executed regardless of whether an Exception occurs in the try block:
    	//		a) comment out the "throw new Exception();" line. Output is:
    	//				finally...
    	//		b) uncomment the "throw new Exception();" line.  Output is:
    	//				Exception caught
    	//				finally...
        try{
            throw new Exception();
        } catch(Exception e){
            System.out.println("Exception caught");
        }finally{
            System.out.println("finally...");
        }
    }
    public static void b(){
    	// Show that finally is executed even when you �return� from the try block.
        try{
        	return;
        } catch(Exception e){
            System.out.println("Exception caught");
        }finally{
            System.out.println("finally...");
        }
    }
    public static void c(){
    	// Show that finally is executed even when you �return� from the exception handler.
        try{
            throw new Exception();  // BAD CODING - throwing an exception when there is no error!
        } catch(Exception e){
            System.out.println("Exception caught : "+e.toString());
            return;
        }finally{
            System.out.println("finally...");
        }
    }    
    public static void d(){
    	// To demonstrate that the (checked) exceptions you are trying to catch must 
    	// be thrown in the try block.
        /*
         * This will not compile as the *checked* " exception IOException is never thrown 
         * in the body of the corresponding try statement".
         * If I change it to catching "Exception" it will compile as there are *unchecked* exceptions
         * that are subclasses of Exception that could be thrown by the system e.g. IndexOutOfBoundsException
         */
        try{
//        } catch(IOException ioe){ // error "never thrown in try block..."
//     } catch(NoSuchMethodException nsme){ // error "never thrown in try block..."
//        } catch(ClassNotFoundException cnfe){ // error "never thrown in try block..."

        } catch(Exception e){  //ok
//        } catch(RuntimeException e){  //ok
            System.out.println("Exception caught");
        }
    }
    public static void e(){
        try{
    		throw new IOException();
        } catch(Exception e){
            System.out.println("Exception caught");
        }finally{
            System.out.println("finally...");
        }
        System.out.println("After try block...");
    }
    public static void f() throws Exception{
        throw new Exception();
    }
    
    // In this example, the nested checked4() method throws a *checked* exception. 
    // We are assuming that main() is the only method in the stack trace that can handle
    // the exception. The implication here is that all the methods in the stack trace 
    // between checked4() and main() must declare that checked exception until we reach 
    // main(), where the exception is caught/handled.
    public static void checked1() throws ClassNotFoundException{
    	checked2();
    }
    public static void checked2() throws ClassNotFoundException{
    	checked3();
    }
    public static void checked3() throws ClassNotFoundException{
    	checked4();
    }
    public static void checked4() throws ClassNotFoundException{
        throw new ClassNotFoundException(); // checked exception
    }

    // In this example, the nested method unchecked4() throws an *unchecked* 
    // RuntimeException. Note that none of the methods until main() 
    // needed to catch the exception or declare in their signatures 
    // that they were throwing it - this can lead to more succinct code.
    public static void unchecked1() {
    	unchecked2();
    }
    public static void unchecked2() {
    	unchecked3();
    }
    public static void unchecked3() {
    	unchecked4();
    }
    public static void unchecked4() {        
        throw new RuntimeException();
    }
    
    public static void x(){
        y();
    }

    public static void y() {
        try{
            z();
        } catch (MyException e){
            System.out.println("Caught MyException...");
            System.out.println("The original exception was: "
                    + e.getCause().toString());
        }
    }

    public static void z() throws MyException{
        try{
            throw new IOException("An I/O exception occurred.");
        } catch (IOException ioe){
            throw new MyException(ioe);
        }
    }
    
}
/*
    public MyException(Throwable cause){
	super(cause);
    }
*/