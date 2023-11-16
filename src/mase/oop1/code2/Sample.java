// Karina Morandi A00315040
package mase.oop1.code2;

import java.util.Scanner;

public class Sample {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        final int INNER_CLASSES=1, ENUMS = 2, EXCEPTIONS = 3, EXIT = 99;  
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")) {
            switch (userChoice()) {
                case INNER_CLASSES:
                    innerClasses();
                    break;
                case ENUMS:
                    enums();
                    break;
                case EXCEPTIONS:
                    someMethod();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown entry!");
                    break;
            }
        }
    }
    
    public static void innerClasses() {
        // Inner Classes code goes here...
        System.out.println("Inner Classes...");  
    }
    public static void enums(){
        // Enums code goes here...
        System.out.println("Enums...");  
    }
    public static void someMethod() {
        // Exceptions code goes here...
        System.out.println("Exceptions...");  
    }

    public static int userChoice() {
        System.out.println("\nWhat do you want to do ?");
        System.out.println("1. Inner Classes");  
        System.out.println("2. Exums"); 
        System.out.println("3. Exceptions"); 
        System.out.println("99. Exit"); 
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}
