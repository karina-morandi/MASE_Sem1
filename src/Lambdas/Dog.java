package Lambdas;

import java.util.function.Predicate;
//interface Predicate<T>
//  boolean test(T t)

public class Dog {
	private int age;
	private String name;
	private boolean hasFur;
	
	Dog(int age, String name, boolean hasFur) {
		this.age = age;
		this.name = name;
		this.hasFur = hasFur;
	}

	boolean isFurry() { 
		return hasFur;
	}
}