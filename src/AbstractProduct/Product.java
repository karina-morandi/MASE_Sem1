package AbstractProduct;

import java.text.NumberFormat;

public abstract class Product{
    private String code;
    private String description;
    private double price;

    // regular constructors and methods for instance 
    // variables
    
    public Product(){
        code = "";
        description = "";
        price = 0;
    }
    
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
               "Price:       " + this.getFormattedPrice()
                               + "\n";
    }

    // an abstract method
    abstract String getDisplayText(); 
}

