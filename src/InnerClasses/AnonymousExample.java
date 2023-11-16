package InnerClasses;

class SomeClass {
    void a(){
        System.out.println("SomeClass::a");
    }
    void b(){
        System.out.println("SomeClass::b");
    }
}

// "An anonymous class is a local class without a name." 
// "When a local class is used only once, consider using anonymous class syntax, 
//  which places the definition and use of the class in exactly the same place. "
//  Ref: http://docstore.mik.ua/orelly/java-ent/jnut/ch03_12.htm

// After you compile this file, the following classes are created in the following file structure:
//     .../innerclasses/AnonymousExample.class
//     .../innerclasses/AnonymousExample$1.class (this is the first anonymous inner class; based on Contents)
//     .../innerclasses/AnonymousExample$2.class (this is the second anonymous inner class; based on SomeClass)
//     .../innerclasses/SomeClass.class

public class AnonymousExample {
    public static void main(String []args){
        // 1. anonymous class implements the interface (the class created extends from Object and 
        // implements the interface in question)
        //    ref: http://stackoverflow.com/questions/5848510/how-can-an-anonymous-class-to-extends-or-implements
        Contents contents = new Contents(){
            @Override
            public int value(){
                return 80;
            }
        };
        System.out.println(contents.value());  // "80"
        
        // 2. anonymous class is extending from SomeClass and 
        //    overriding b()
        SomeClass sc = new SomeClass(){
            @Override
            void b(){
                System.out.println("anonymous::b");
            }
            void c(){
                System.out.println("anonymous::c");
            }
            
        };
        sc.a();         // "SomeClass::a"
        sc.b();         // "anonymous::b"
//        sc.c();       // cannot access c() as sc is a SomeClass reference i.e. restricted to the SomeClass interface!
    }
}


