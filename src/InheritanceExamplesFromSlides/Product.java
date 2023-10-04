package InheritanceExamplesFromSlides;

import java.text.NumberFormat;

public class Product{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product(){
        code = "";
        description = "";
        price = 0;
    }
 // get and set accessors for the code, description, 
    // and price instance variables
        
    public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

    public String getFormattedPrice(){
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

	@Override
    public String toString(){
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    // create public access for the count variable
    public static int getCount(){                              
        return count;
    }
}

