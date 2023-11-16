package ExceptionsLab;

import java.io.EOFException;
import java.io.IOException;

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
		try {
			throw new IOException();
		} catch(IOException e){
			System.out.println("Exception caugth");			
		} finally {
			System.out.println("Finally...");
		}
	}
	
	public static void b() {
		try {
			return;
		} catch(EOFException e){
			System.out.println("Exception caugth");			
		} finally {
			System.out.println("Finally...");
		}
	}
	
	public static void c() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("Exception caught " + e.toString());
		}finally {
			System.out.println("Finally...");
		}
		
	}
	
	public static void d() {
		
	}
	
	public static void e() {
		
	}

}