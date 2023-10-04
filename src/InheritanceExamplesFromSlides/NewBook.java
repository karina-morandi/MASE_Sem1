package InheritanceExamplesFromSlides;

public class NewBook {
	public static void main(String [] args) {
		Book b = new Book();
		b.setCode("java");
		b.setDescription("Murach's Beginning Java");
		b.setPrice(49.50);
		b.setAuthor("Steelman");

		Software s = new Software();
		s.setCode("txtp");
		s.setDescription("TextPad");
		s.setPrice(27.00);
		s.setVersion("4.7.3");

		Product p;
		p = b;
		System.out.println(p.toString());  // calls toString from 
		                                   // the Book class
		p = s;
		System.out.println(p.toString());  // calls toString from 
		                                   // the Software class

		Book b1= new Book();
		b1.setCode("java");
		b1.setDescription("Murach's Beginning Java");
		b1.setAuthor("Andrea Steelman");
		b1.setPrice(49.50);

		Product p1 = b1;            // cast Book object to a
		                          // Product object
		p1.setDescription("Test"); // OK - method in Product class
		//p.setAuthor("Test");    // not OK - method not in 
		                          // Product class

		b1 = (Book) p1;             // cast the Product object back 
		                          // to a Book object
		b1.setAuthor("Test");      // OK - method in Book class

		Product p2 = new Product();
		Book b2 = (Book) p2;    // will throw ClassCastException
		                        // because p2 is a Product object 
		                        // not a Book object

	}
}
