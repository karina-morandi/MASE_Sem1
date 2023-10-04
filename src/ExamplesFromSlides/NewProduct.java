package ExamplesFromSlides;

public class NewProduct {
	public static void main(String []args) {
		Printable product = new Product(
		        "java", "Murach's Beginning Java", 49.50);
		product.print();
		
		Product product2 = 
			      new Product("java", "Murach's Beginning Java", 49.50);
			printMultiple(product2, 2);


	}
	
	private static void printMultiple(Printable p, int count){
	    for (int i = 0; i < count; i++)
	        p.print();
	}

}
