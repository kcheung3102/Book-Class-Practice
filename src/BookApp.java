public class BookApp {

    public static void main(String[] args) {
	getDisplayText();
    }

    private static void getDisplayText() {
        Book myobj = new Book();
        System.out.println("Title: " + myobj.getBookTitle());
        System.out.println("Author: " + myobj.getAuthor());
        System.out.println("description: " + myobj.getDescription());
    }
}
