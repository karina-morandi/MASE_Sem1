package InheritanceExamplesFromSlides;

public class Book extends Product {
    private String author;

    public Book(){
        super();  // call constructor of Product 
                  // superclass
        author = "";
        count++;  // update the count variable in the 
                  // Product superclass
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
    
    // override the toString method
    @Override
    public String toString(){
        // call method of Product superclass
        return super.toString() +   
            "Author:      " + author + "\n";
    }
}


//Three versions of the toString method
//The toString method in the Product superclass
//public String toString(){
//    return "Code:        " + code + "\n" +
//           "Description: " + description + "\n" +
//           "Price:       " + this.getFormattedPrice() + "\n";
//}
//The toString method in the Book class
//public String toString(){
//    return super.toString() +
//        "Author:      " + author + "\n";
//}
//The toString method in the Software class
//public String toString(){
//    return super.toString() +
//        "Version:     " + version + "\n";
//}

