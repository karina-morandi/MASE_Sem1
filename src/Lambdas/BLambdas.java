package Lambdas;

import java.util.function.Predicate;

public class BLambdas {
	
	public static void main (String [] args) {
		
		BLambdas b1 = new BLambdas();
		b1.predicate();

		System.out.println(check(4, n -> n%2 == 0));
		System.out.println(check(7, n -> n%2 == 0));

	     System.out.println(check("Mr. Joe Bloggs", s -> s.startsWith("Mr.")));// true
	     System.out.println(check("Ms. Joe Bloggs", s -> s.startsWith("Mr.")));// false

		
	} // end of main
	
	public static <T> boolean check (T v, Predicate <T> t) {
		return t.test(v);
	}
	
	public void predicate() {
		Evaluate <Integer> ei = i -> i < 0;
		System.out.println("Is it negative? " + ei.checkIfNegative(-1));
		System.out.println("Is it negative? " + ei.checkIfNegative(+1));
		
		Predicate <Integer> pi = i -> i < 0;
		System.out.println("Is it negative? " + pi.test(-1));
		System.out.println("Is it negative? " + pi.test(+1));
	}
}
