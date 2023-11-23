// Karina Morandi A00315040
package mase.oop1.code2;

import java.io.IOException;
import java.util.Scanner;

public class CodeAssessment2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        final int EXCEPTIONS = 1, INNER_CLASSES=2, ENUMS = 3, EXIT = 99;  
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")) {
            switch (userChoice()) {
	            case EXCEPTIONS:
	                method1();
	                break;
                case INNER_CLASSES:
                    innerClasses();
                    break;
                case ENUMS:
                    enums();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    System.out.println("BUILD SUCCESSFUL (total time: 10 seconds)");
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown entry!");
                    break;
            }
        }
    }
    
    public static void innerClasses() {
        BookStore bookStore = new BookStore();
        
        Book book = bookStore.getABook("Java Programming", "Joel Murach", true, 5);
        System.out.println("Creating the BookStore class..."); 
        System.out.println("Creating the private inner class object accessible via an interface reference...");
        System.out.println("Number of languages is: " + book.howManyLanguages());
        System.out.println("Is it a best seller? : " + book.isBestSeller());
    }
    public static void enums(){
        Lecturer joeBloggs = Lecturer.AL;
        joeBloggs.setMasters(true);
        joeBloggs.setYearsService(5);
        boolean eligible = isProgression(joeBloggs);
        
        System.out.println(joeBloggs);
        System.out.println("Is this lecturer eligible for progression? : " + eligible);
        
    }
    
    public static boolean isProgression(Lecturer l) {
    	boolean prog = false;
    	switch(l) {
    		case AL:
    			if(l.hasMasters() && l.getYearsService() >= 5) {
    				prog = true;
    			} else if(l.hasPhd() && l.getYearsService() >= 3) {
    				prog = true;
    			}
    			break;
    		case L:
    			if(l.getYearsService() >= 20) {
    				prog = true;
    			}
    			break;
    		default:
    			break;
    	}
    	
		return prog;
    }
    public static void method1() {
       method2();  
    }
    
    public static void method2() {
        try{
        	method3(); 
        } catch (TestException e) {
        	 System.out.println("Caught TestException...");
             System.out.println("The original exception was: "+ e.getCause().toString());
        }
    }
    
    public static void method3() throws TestException {
       try {
    	   throw new IOException("An I/O exception occurred.");
       } catch (IOException ioe) {
    	   throw new TestException(ioe);
       }
    }

    public static int userChoice() {
        System.out.println("\nWhat do you want to do ?");
        System.out.println("1. Exceptions");  
        System.out.println("2. Inner Classes"); 
        System.out.println("3. Enumerations"); 
        System.out.println("99. Exit"); 
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}
