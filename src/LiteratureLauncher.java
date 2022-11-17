import java.util.Scanner;

//Controller
public class LiteratureLauncher {
    public static void main(String[] a) {
        //Variables
        Scanner in = new Scanner(System.in);
        String title, author, publisher, isbn;
        Book bookA = null, bookB = null;

        //Prompt Book one
        System.out.println("Enter title of first book:");
        title = in.nextLine();
        System.out.println("Enter author of first book:");
        author = in.nextLine();
        System.out.println("Enter publisher of the first book:");
        publisher = in.nextLine();
        System.out.println("Enter ISBN of the first book:");
        isbn = in.nextLine();

        //Validate ISBN
        if(isbn.length() == 13)
            bookA = new Book(title, author, publisher, isbn);
        else
            System.out.println("Invalid ISBN");

        //Prompt Book two
        System.out.println("Enter title of second book:");
        title = in.nextLine();
        System.out.println("Enter author of second book:");
        author = in.nextLine();
        System.out.println("Enter publisher of the second book:");
        publisher = in.nextLine();
        System.out.println("Enter ISBN of the second book:");
        isbn = in.nextLine();

        //Validate ISBN
        if(isbn.length() == 13)
            bookB = new Book(title, author, publisher, isbn);
        else
            System.out.println("Invalid ISBN");

        //Output Book one
        if(bookA != null) {
            System.out.println("Book One:");
            System.out.println(bookA.getTitleByAuthor());
            System.out.println("Publisher: " + bookA.getPublisher());
            System.out.println("ISBN: " + bookA.getIsbn());
            System.out.println();
        }

        //Output Book two
        if(bookB != null) {
            System.out.println("Book Two:");
            System.out.println(bookB.getTitleByAuthor());
            System.out.println("Publisher: " + bookB.getPublisher());
            System.out.println("ISBN: " + bookB.getIsbn());
            System.out.println();
        }

        //Compare Book objects
        if(bookA != null && bookB != null)
            System.out.println("Books are the same: " + bookA.equals(bookB));
    }
}
