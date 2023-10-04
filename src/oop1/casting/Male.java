package oop1.casting;

class Human {

    @Override
    public String toString() {
        return "Human";
    }
}

public class Male extends Human {

    public void x(){}
    
    @Override
    public String toString() {
        return "Male";
    }

    public static void main(String[] args) {
    	// a.
        Human human = new Human();		// human can refer to Human objects and Male objects
        
        // b.
        Human humanBeing = new Male();	// humanBeing can refer to Human objects and Male objects
        
        // c.
        human = humanBeing;				// human now pointing at a Male object
        //humanBeing = human;			// humanBeing now pointing at the same Male object
        
        // d.
        System.out.println(human.toString());	// Male
        System.out.println(humanBeing); // Male

        // e.
//        human = new Human();
        Male john = (Male)human;		// john now pointing at the Male object
//        john.x();
        // f.
        Male mike =  (Male)humanBeing;	// mike now pointing at the Male object
        
        // g.
        System.out.println(john);		// Male
        System.out.println(mike); 		// Male

        // h.
        human = new Human();			// reassign human to point at a new Human object
        
        // i.
//        john = (Male)human;			// need to downcast
        								// john now pointing at a Human object - ClassCastException

        // j.
        human = john;					// implicit upcast performed; human now refers to a Male object
        System.out.println(human); 		// Male

        // k.
        john = (Male) human;			// explicit downcast required 
        System.out.println("."+john);		// Male
    }
}
