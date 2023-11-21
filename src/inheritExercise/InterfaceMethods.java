package inheritExercise;

interface X{    
    default void dm(){
        System.out.println("X::dm()");
    }
    static void sm(){
        System.out.println("X::sm()");
    }
} 
interface Y{    
    default void dm(){
        System.out.println("Y::dm()");
    }
    static void sm(){
        System.out.println("Y::sm()");
    }
}
public class InterfaceMethods  implements X, Y{
    @Override
    public void dm(){
        System.out.println("InterfaceMethods::dm()");
        X.super.dm();   // X::dm()
        Y.super.dm();   // Y::dm()
    }; 
    public static void main(String[] args) {
        new InterfaceMethods().dm();// InterfaceMethods::dm()

        X.sm(); // X::sm()
        Y.sm(); // Y::sm()
    }
}