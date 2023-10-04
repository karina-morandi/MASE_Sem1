package ExamplesFromSlides;

import java.text.NumberFormat;

public class Product implements Printable{
private String code;
private String description;
private double price;

public Product(String code, String description, double price){
    this.code = code;
    this.description = description;
    this.price = price;
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

@Override
public void print() {
	System.out.println("Code:          " + code);
    System.out.println(
        "Description:   " + description);
    System.out.println(
        "Price:         $" + 
        this.getFormattedPrice());
}

protected double getFormattedPrice() {
	return price;
}

}