package ExamplesFromSlides;

public class Book extends Product implements Printable{
    private String author;

    public Book(String code, String description,
    double price, String author){
        super(code, description, price);
        this.author = author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    // implement the Printable interface
    public void print()  {
        System.out.println("Code:\t" + super.getCode());
        System.out.println(
            "Title:\t" + super.getDescription());
        System.out.println("Author:\t" + this.author);
        System.out.println(
            "Price:\t" + super.getFormattedPrice());
    }
}
