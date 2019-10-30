public class Book {

    //class variables
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private int booksRequested;
    private boolean isInStock;

    //getters and setters
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public int getBooksRequested() {
        return booksRequested;
    }

    public void setBooksRequested(int booksRequested) {
        this.booksRequested = booksRequested;
    }

    //default constructor
     Book() {
        bookTitle = "To Kill a Mockingbird";
        author = "Harper Lee";
        description = "explore race relations in the American South in the first half of the 20th century.";
        price = 10.25;
        isInStock = true;
        booksRequested = 5;
    }

    public Book(String titleBook, String authorBook, String descriptionBook, double priceBook, boolean isInStockBook, int booksRequestedBook ) {
         bookTitle = titleBook;
         author = authorBook;
         description = descriptionBook;
         price = priceBook;
         isInStock = isInStockBook;
         booksRequested = booksRequestedBook;

    }



}
