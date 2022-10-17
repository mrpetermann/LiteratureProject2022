//Controller
public class LiteratureLauncher {
    public static void main(String[] a) {
        Book bookA = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book bookB = new Book("Into the Wild", "Jon Krakauer", "Anchor", "9780385486804");

        System.out.println("Book One:");
        System.out.println(bookA.getTitleByAuthor());
        System.out.println("Publisher: " + bookA.getPublisher());
        System.out.println("ISBN: " + bookA.getIsbn());

        System.out.println();

        System.out.println("Book Two:");
        System.out.println(bookB.getTitleByAuthor());
        System.out.println("Publisher: " + bookB.getPublisher());
        System.out.println("ISBN: " + bookB.getIsbn());
    }
}
