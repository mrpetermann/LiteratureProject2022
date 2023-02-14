import java.util.Scanner;

//Controller
public class LiteratureLauncher {
    public static void main(String[] a) {
        Book bookA = getBook();
        Book bookB = getBook();

        //Output Book one
        printBook(bookA);
        printBook(bookB);

        //Compare Book objects
        System.out.println("Books are the same: " + bookA.equals(bookB));
    }

    /**
     * Collect user input to build a book
     * @return New book object with info from user
     */
    private static Book getBook() {
        //Variables
        Scanner in = new Scanner(System.in);
        String title, author, publisher, isbn;

        //Prompt Book entry
        System.out.println("Enter title of first book:");
        title = in.nextLine();
        System.out.println("Enter author of first book:");
        author = in.nextLine();
        System.out.println("Enter publisher of the first book:");
        publisher = in.nextLine();

        //Validate ISBN
        do {
            System.out.println("Enter ISBN of the first book:");
            isbn = in.nextLine();
        } while (isbn.length() != 13);

        return new Book(title, author, publisher, isbn);
    }

    /**
     * Output data to the console
     * @param book Book object to be printed
     */
    private static void printBook(Book book) {
        System.out.println(book.getTitleByAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println();
    }
}
