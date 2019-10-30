import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BookApp {

    public static void main(String[] args) {
	    getDisplayText();
    }

    private static void getDisplayText() {
        Book myobj = new Book();
        System.out.println("Title: " + myobj.getBookTitle());
        System.out.println("Author: " + myobj.getAuthor());
        System.out.println("description: " + myobj.getDescription());
        System.out.println("price: " + myobj.getPrice());
        System.out.println("Books Requested: " +myobj.getBooksRequested());
        System.out.println("In Stock?: " + myobj.isInStock());

        boolean isInStock = myobj.isInStock();
        double price = myobj.getPrice();
        int booksRequested = myobj.getBooksRequested();

        if(isInStock) {
            System.out.println("Total Price: " + pricing(price, booksRequested));
        } else {
            System.out.println("Not enough books in stock");
        }

    }

    private static double pricing(double price, int booksRequested) {
        double totalPrice = price * booksRequested;
        return totalPrice;

    }





}
