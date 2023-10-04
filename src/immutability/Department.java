package immutability;

import java.util.ArrayList;

final class Department{ // all methods are final
    // private final instance variables
    private final String name, address; // String is immutable
    private final int numEmployees;
    private final ArrayList<String> employees;
    
    // private constructor
    private Department(String name, String address, int numEmployees, ArrayList<String> employees){
        this.name           = name;
        this.address        = address;
        this.numEmployees   = numEmployees;
        this.employees      = new ArrayList<String>(employees); // store a copy of the reference
    }
    
    // factory method to create a Department
    public static Department createNewInstance(String name, String address, 
            int numEmployees, ArrayList<String> employees){
        return new Department(name, address, numEmployees, employees);
    }
    
    // no 'set' methods, only 'get' methods
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getNumEmployees(){
        return numEmployees;
    }
    public ArrayList<String> getEmployees(){
        return new ArrayList<String>(employees);  // return a copy of the reference
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", address=" + address + ", numEmployees=" + numEmployees + ", employees=" + employees + '}';
    }
    
}
 //1. The next line generates the error:
 //   - "compiler error: cannot inherit from Department" as Department is final
//class SportsDepartment extends Department{ 
//    SportsDepartment(){
//        // 2. The next line generates the error:
//        //    - Department constructor is not visible
//        super("", "", 2, new ArrayList<String>());
//    }
//}
