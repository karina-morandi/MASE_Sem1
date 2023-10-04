package AbstractProduct;

public class Book extends Product{
    private String author;

    // regular constructor and methods for the Book class

    // implement the abstract method
    @Override
    public String getDisplayText() {
        return super.toString() +
            "Author:      " + author + "\n";
    }
}
