package immutability;

import java.util.ArrayList;

public class TestImmutable {
    public static void main(String[] args) {
    	// 2.a
        ArrayList<String> employees = new ArrayList<>();
        
        //2.b
        employees.add("Ann");employees.add("Liam");
        
        //2.c
        Department dept = Department.createNewInstance("Argos", "Athlone", 2, employees);
        
        //2.d
        System.out.println("Created: "+dept);
        
        //2.e
        String name      = dept.getName();
        String address   = dept.getAddress();
        int numEmployees = dept.getNumEmployees();
        employees        = dept.getEmployees();
        
        //2.f
        System.out.println("Retrieved: "+name+" "+address+ " "+numEmployees+ " "+employees);
        
        //2.g
        // change what I got back - any affect on the "dept" immutable object?
        name = "Boots";// Strings are immutable so new objects are created in the background => OK
        address = "Galway";
        numEmployees = 3; // simple primitive i.e. value is just copied back
        employees.add("Tom"); // as we only got a copy of the AL back; we are changing that copy    
        
        //2.f
        System.out.println("Any change?: "+dept);
    }    
}
/*
Output:
Created: Department{name=Argos, address=Athlone, numEmployees=2, employees=[Ann, Liam]}
Retrieved: Argos Athlone 2 [Ann, Liam]
Any change?: Department{name=Argos, address=Athlone, numEmployees=2, employees=[Ann, Liam]}
*/

